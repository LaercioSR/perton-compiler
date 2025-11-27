package org.perton;

import org.antlr.v4.runtime.tree.ParseTree;
import org.perton.generated.PertonBaseListener;
import org.perton.generated.PertonParser;

import java.util.*;

public class PertonSemanticListener extends PertonBaseListener {

    private final List<String> semanticErrors = new ArrayList<>();
    private final Stack<Map<String, String>> symbolScopes = new Stack<>();
    private final Map<ParseTree, String> nodeTypes = new HashMap<>();

    public boolean hasErrors() {
        return !semanticErrors.isEmpty();
    }

    public List<String> getErrors() {
        return semanticErrors;
    }

    private void addError(String message, int line) {
        semanticErrors.add("Erro na linha " + line + ": " + message);
    }

    private String resolveVariableType(String varName) {
        for (int i = symbolScopes.size() - 1; i >= 0; i--) {
            if (symbolScopes.get(i).containsKey(varName)) {
                return symbolScopes.get(i).get(varName);
            }
        }
        return null;
    }

    @Override
    public void enterProgram(PertonParser.ProgramContext ctx) {
        symbolScopes.push(new HashMap<>());
    }

    @Override
    public void exitProgram(PertonParser.ProgramContext ctx) {
        symbolScopes.pop();
    }

    @Override
    public void enterDeclaracaoFuncao(PertonParser.DeclaracaoFuncaoContext ctx) {
        symbolScopes.push(new HashMap<>());
    }

    @Override
    public void exitDeclaracaoFuncao(PertonParser.DeclaracaoFuncaoContext ctx) {
        symbolScopes.pop();
    }

    @Override
    public void exitParametro(PertonParser.ParametroContext ctx) {
        String type = ctx.type().getText();
        String name = ctx.ID().getText();
        if (symbolScopes.peek().containsKey(name)) {
            addError("Parâmetro duplicado: '" + name + "'", ctx.start.getLine());
        } else {
            symbolScopes.peek().put(name, type);
        }
    }

    @Override
    public void enterFuncaoPrincipal(PertonParser.FuncaoPrincipalContext ctx) {
        symbolScopes.push(new HashMap<>());
    }

    @Override
    public void exitFuncaoPrincipal(PertonParser.FuncaoPrincipalContext ctx) {
        symbolScopes.pop();
    }

    @Override
    public void enterBlocoCodigo(PertonParser.BlocoCodigoContext ctx) {
        symbolScopes.push(new HashMap<>());
    }

    @Override
    public void exitBlocoCodigo(PertonParser.BlocoCodigoContext ctx) {
        symbolScopes.pop();
    }

    @Override
    public void exitDeclaracaoVar(PertonParser.DeclaracaoVarContext ctx) {
        String typeName = ctx.type().getText();
        String varName = ctx.ID().getText();

        if (symbolScopes.peek().containsKey(varName)) {
            addError("Variável '" + varName + "' já declarada neste escopo.", ctx.start.getLine());
        } else {
            symbolScopes.peek().put(varName, typeName);
        }

        if (ctx.expression() != null) {
            String exprType = nodeTypes.get(ctx.expression());
            checkTypeCompatibility(typeName, exprType, varName, ctx.start.getLine());
        }
    }

    @Override
    public void exitAtribuicao(PertonParser.AtribuicaoContext ctx) {
        String varName = ctx.ID().getText();
        String varType = resolveVariableType(varName);

        if (varType == null) {
            addError("Variável '" + varName + "' não foi declarada.", ctx.start.getLine());
        } else {
            String exprType = nodeTypes.get(ctx.expression());
            checkTypeCompatibility(varType, exprType, varName, ctx.start.getLine());
        }
    }

    private void checkTypeCompatibility(String targetType, String exprType, String varName, int line) {
        if (exprType == null || targetType == null || "error".equals(exprType)) {
            return;
        }

        if (!targetType.equals(exprType)) {
            if (targetType.equals("float") && exprType.equals("int")) {
                return;
            }
            addError("Tipo incompatível para '" + varName + "'. Esperado: " + targetType + ", Encontrado: " + exprType, line);
        }
    }

    @Override
    public void exitNumeroInteiro(PertonParser.NumeroInteiroContext ctx) {
        nodeTypes.put(ctx, "int");
    }

    @Override
    public void exitNumeroDecimal(PertonParser.NumeroDecimalContext ctx) {
        nodeTypes.put(ctx, "float");
    }

    @Override
    public void exitTexto(PertonParser.TextoContext ctx) {
        nodeTypes.put(ctx, "string");
    }

    @Override
    public void exitVariavel(PertonParser.VariavelContext ctx) {
        String varName = ctx.ID().getText();
        String type = resolveVariableType(varName);
        if (type == null) {
            addError("Uso de variável não declarada: " + varName, ctx.start.getLine());
            nodeTypes.put(ctx, "error");
        } else {
            nodeTypes.put(ctx, type);
        }
    }

    @Override
    public void exitChamadaFuncao(PertonParser.ChamadaFuncaoContext ctx) {
        nodeTypes.put(ctx, "int");
    }

    @Override
    public void exitExpressaoParenteses(PertonParser.ExpressaoParentesesContext ctx) {
        nodeTypes.put(ctx, nodeTypes.get(ctx.expression()));
    }

    @Override
    public void exitPrimario(PertonParser.PrimarioContext ctx) {
        String childType = nodeTypes.get(ctx.primaryExpression());
        nodeTypes.put(ctx, childType != null ? childType : "error");
    }

    @Override
    public void exitUnario(PertonParser.UnarioContext ctx) {
        nodeTypes.put(ctx, nodeTypes.get(ctx.unaryExpression()));
    }

    @Override
    public void exitAdditiveExpression(PertonParser.AdditiveExpressionContext ctx) {
        inferNumericResult(ctx, ctx.multiplicativeExpression());
    }

    @Override
    public void exitMultiplicativeExpression(PertonParser.MultiplicativeExpressionContext ctx) {
        inferNumericResult(ctx, ctx.unaryExpression());
    }

    private void inferNumericResult(ParseTree parentCtx, List<? extends ParseTree> operands) {
        if (operands.isEmpty()) {
            return;
        }
        String resultType = nodeTypes.get(operands.get(0));

        for (int i = 1; i < operands.size(); i++) {
            String nextType = nodeTypes.get(operands.get(i));
            if ("error".equals(resultType) || "error".equals(nextType)) {
                resultType = "error"; 
            }else if ("string".equals(resultType) || "string".equals(nextType)) {
                resultType = "string"; 
            }else if ("float".equals(resultType) || "float".equals(nextType)) {
                resultType = "float"; 
            }else {
                resultType = "int";
            }
        }
        nodeTypes.put(parentCtx, resultType);
    }

    @Override
    public void exitRelationalExpression(PertonParser.RelationalExpressionContext ctx) {
        inferBooleanResult(ctx, ctx.additiveExpression());
    }

    @Override
    public void exitEqualityExpression(PertonParser.EqualityExpressionContext ctx) {
        inferBooleanResult(ctx, ctx.relationalExpression());
    }

    @Override
    public void exitLogicalAndExpression(PertonParser.LogicalAndExpressionContext ctx) {
        inferBooleanResult(ctx, ctx.equalityExpression());
    }

    @Override
    public void exitLogicalOrExpression(PertonParser.LogicalOrExpressionContext ctx) {
        inferBooleanResult(ctx, ctx.logicalAndExpression());
    }

    private void inferBooleanResult(ParseTree parentCtx, List<? extends ParseTree> operands) {
        if (operands.size() == 1) {
            nodeTypes.put(parentCtx, nodeTypes.get(operands.get(0))); 
        }else {
            nodeTypes.put(parentCtx, "int");
        }
    }

    @Override
    public void exitExpression(PertonParser.ExpressionContext ctx) {
        nodeTypes.put(ctx, nodeTypes.get(ctx.logicalOrExpression()));
    }

    @Override
    public void exitCondicional(PertonParser.CondicionalContext ctx) {
        validateCondition(ctx.expression(), ctx.start.getLine(), "if");
    }

    @Override
    public void exitLoopWhile(PertonParser.LoopWhileContext ctx) {
        validateCondition(ctx.expression(), ctx.start.getLine(), "while");
    }

    @Override
    public void exitLoopDoWhile(PertonParser.LoopDoWhileContext ctx) {
        validateCondition(ctx.expression(), ctx.start.getLine(), "do-while");
    }

    private void validateCondition(PertonParser.ExpressionContext ctx, int line, String stmtName) {
        String type = nodeTypes.get(ctx);
        if ("string".equals(type)) {
            addError("Condição do '" + stmtName + "' inválida (string).", line);
        }
    }
}
