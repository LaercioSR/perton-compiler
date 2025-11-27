import generated.PertonBaseListener;
import generated.PertonParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Listener responsável por traduzir a árvore sintática do Perton para código C.
 * Utiliza um Mapa para armazenar a tradução de cada nó filho e compor o nó pai.
 */
public class PertonToCListener extends PertonBaseListener {
    private Map<ParseTree, String> translationMap = new HashMap<>();

    private String finalProgramCode = "";

    private String get(ParseTree node) {
        if (node == null) {
            return "";
        }
        return translationMap.getOrDefault(node, "");
    }

    private void set(ParseTree node, String code) {
        translationMap.put(node, code);
    }

    public String getCCode() {
        return finalProgramCode;
    }

    @Override
    public void exitProgram(PertonParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append("#include <stdio.h>\n");
        sb.append("#include <stdlib.h>\n");
        sb.append("#include <string.h>\n\n");

        for (ParseTree child : ctx.children) {
            if (child instanceof PertonParser.MainContext) {
                continue;

                        }if (child instanceof TerminalNode) {
                continue;

                        }sb.append(get(child)).append("\n");
        }

        sb.append("\n").append(get(ctx.main()));

        finalProgramCode = sb.toString();

    }

    @Override
    public void exitFuncaoPrincipal(PertonParser.FuncaoPrincipalContext ctx) {

        StringBuilder sb = new StringBuilder();
        sb.append("int main() ");
        sb.append(get(ctx.block()));
        set(ctx, sb.toString());
    }

    @Override
    public void exitDeclaracaoFuncao(PertonParser.DeclaracaoFuncaoContext ctx) {
        String tipo = get(ctx.type());
        String nome = ctx.ID().getText();
        String params = ctx.params() != null ? get(ctx.params()) : "";
        String bloco = get(ctx.block());

        set(ctx, tipo + " " + nome + "(" + params + ") " + bloco);
    }

    @Override
    public void exitParametros(PertonParser.ParametrosContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.param().size(); i++) {
            sb.append(get(ctx.param(i)));
            if (i < ctx.param().size() - 1) {
                sb.append(", ");
            }
        }
        set(ctx, sb.toString());
    }

    @Override
    public void exitParametro(PertonParser.ParametroContext ctx) {
        set(ctx, get(ctx.type()) + " " + ctx.ID().getText());
    }

    @Override
    public void exitBlocoCodigo(PertonParser.BlocoCodigoContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");

        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode) {
                continue;

                        }sb.append("    ").append(get(child)).append("\n");
        }

        if (ctx.getParent() instanceof PertonParser.FuncaoPrincipalContext) {
            sb.append("    return 0;\n");
        }

        sb.append("}");
        set(ctx, sb.toString());
    }

    @Override
    public void exitTipoInt(PertonParser.TipoIntContext ctx) {
        set(ctx, "int");
    }

    @Override
    public void exitTipoFloat(PertonParser.TipoFloatContext ctx) {
        set(ctx, "float");
    }

    @Override
    public void exitTipoString(PertonParser.TipoStringContext ctx) {
        set(ctx, "char*");
    }

    @Override
    public void exitDeclaracaoVar(PertonParser.DeclaracaoVarContext ctx) {
        String tipo = get(ctx.type());
        String nome = ctx.ID().getText();
        StringBuilder sb = new StringBuilder();
        sb.append(tipo).append(" ").append(nome);

        if (ctx.expression() != null) {
            sb.append(" = ").append(get(ctx.expression()));
        }
        sb.append(";");
        set(ctx, sb.toString());
    }

    @Override
    public void exitStmtAssignment(PertonParser.StmtAssignmentContext ctx) {
        set(ctx, get(ctx.assignment()));
    }

    @Override
    public void exitStmtIf(PertonParser.StmtIfContext ctx) {
        set(ctx, get(ctx.ifStatement()));
    }

    @Override
    public void exitStmtWhile(PertonParser.StmtWhileContext ctx) {
        set(ctx, get(ctx.whileStatement()));
    }

    @Override
    public void exitStmtFor(PertonParser.StmtForContext ctx) {
        set(ctx, get(ctx.forStatement()));
    }

    @Override
    public void exitStmtDoWhile(PertonParser.StmtDoWhileContext ctx) {
        set(ctx, get(ctx.doWhileStatement()));
    }

    @Override
    public void exitStmtRead(PertonParser.StmtReadContext ctx) {
        set(ctx, get(ctx.readStatement()));
    }

    @Override
    public void exitStmtWrite(PertonParser.StmtWriteContext ctx) {
        set(ctx, get(ctx.writeStatement()));
    }

    @Override
    public void exitStmtBlock(PertonParser.StmtBlockContext ctx) {
        set(ctx, get(ctx.block()));
    }

    @Override
    public void exitStmtExpression(PertonParser.StmtExpressionContext ctx) {
        set(ctx, get(ctx.expression()) + ";");
    }

    @Override
    public void exitStmtReturn(PertonParser.StmtReturnContext ctx) {
        set(ctx, get(ctx.returnStatement()));
    }

    @Override
    public void exitAtribuicao(PertonParser.AtribuicaoContext ctx) {
        set(ctx, ctx.ID().getText() + " = " + get(ctx.expression()) + ";");
    }

    @Override
    public void exitCondicional(PertonParser.CondicionalContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("if (").append(get(ctx.expression())).append(") ");
        sb.append(get(ctx.statement(0)));
        if (ctx.ELSE() != null) {
            sb.append(" else ").append(get(ctx.statement(1)));
        }
        set(ctx, sb.toString());
    }

    @Override
    public void exitLoopWhile(PertonParser.LoopWhileContext ctx) {
        set(ctx, "while (" + get(ctx.expression()) + ") " + get(ctx.statement()));
    }

    @Override
    public void exitLoopDoWhile(PertonParser.LoopDoWhileContext ctx) {
        set(ctx, "do " + get(ctx.statement()) + " while (" + get(ctx.expression()) + ");");
    }

    @Override
    public void exitLoopFor(PertonParser.LoopForContext ctx) {

        String init = get(ctx.forInit());
        if (init.endsWith(";")) {
            init = init.substring(0, init.length() - 1);
        }

        String cond = ctx.expression() != null ? get(ctx.expression()) : "";
        String update = ctx.forUpdate() != null ? get(ctx.forUpdate()) : "";

        set(ctx, "for (" + init + "; " + cond + "; " + update + ") " + get(ctx.statement()));
    }

    @Override
    public void exitForInitDecl(PertonParser.ForInitDeclContext ctx) {
        set(ctx, get(ctx.varDeclaration()));
    }

    @Override
    public void exitForInitAssign(PertonParser.ForInitAssignContext ctx) {
        set(ctx, get(ctx.assignment()));
    }

    @Override
    public void exitForInitExpr(PertonParser.ForInitExprContext ctx) {
        set(ctx, get(ctx.expression()));
    }

    @Override
    public void exitForInitEmpty(PertonParser.ForInitEmptyContext ctx) {
        set(ctx, "");
    }

    @Override
    public void exitForUpdateAssign(PertonParser.ForUpdateAssignContext ctx) {
        set(ctx, ctx.ID().getText() + " = " + get(ctx.expression()));
    }

    @Override
    public void exitForUpdateExpr(PertonParser.ForUpdateExprContext ctx) {
        set(ctx, get(ctx.expression()));
    }

    @Override
    public void exitLeitura(PertonParser.LeituraContext ctx) {

        String fmt = ctx.formatString().getText();
        String id = ctx.ID().getText();
        set(ctx, "scanf(" + fmt + ", &" + id + ");");
    }

    @Override
    public void exitEscrita(PertonParser.EscritaContext ctx) {

        StringBuilder sb = new StringBuilder();
        sb.append("printf(").append(ctx.formatString().getText());
        for (PertonParser.ExpressionContext expr : ctx.expression()) {
            sb.append(", ").append(get(expr));
        }
        sb.append(");");
        set(ctx, sb.toString());
    }

    @Override
    public void exitRetorno(PertonParser.RetornoContext ctx) {
        String val = ctx.expression() != null ? get(ctx.expression()) : "";
        set(ctx, "return " + val + ";");
    }

    private void propagateExpression(ParseTree ctx) {
        if (ctx.getChildCount() == 1) {
            set(ctx, get(ctx.getChild(0)));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof TerminalNode) {
                sb.append(" ").append(child.getText()).append(" ");
            } else {
                sb.append(get(child));
            }
        }
        set(ctx, sb.toString().trim());
    }

    @Override
    public void exitExpression(PertonParser.ExpressionContext ctx) {
        propagateExpression(ctx);
    }

    @Override
    public void exitLogicalOrExpression(PertonParser.LogicalOrExpressionContext ctx) {
        propagateExpression(ctx);
    }

    @Override
    public void exitLogicalAndExpression(PertonParser.LogicalAndExpressionContext ctx) {
        propagateExpression(ctx);
    }

    @Override
    public void exitEqualityExpression(PertonParser.EqualityExpressionContext ctx) {
        propagateExpression(ctx);
    }

    @Override
    public void exitRelationalExpression(PertonParser.RelationalExpressionContext ctx) {
        propagateExpression(ctx);
    }

    @Override
    public void exitAdditiveExpression(PertonParser.AdditiveExpressionContext ctx) {
        propagateExpression(ctx);
    }

    @Override
    public void exitMultiplicativeExpression(PertonParser.MultiplicativeExpressionContext ctx) {
        propagateExpression(ctx);
    }

    @Override
    public void exitUnario(PertonParser.UnarioContext ctx) {
        String op = ctx.getChild(0).getText();
        String expr = get(ctx.unaryExpression());
        set(ctx, op + expr);
    }

    @Override
    public void exitPrimario(PertonParser.PrimarioContext ctx) {

        set(ctx, get(ctx.getChild(0)));
    }

    @Override
    public void exitNumeroInteiro(PertonParser.NumeroInteiroContext ctx) {
        set(ctx, ctx.getText());
    }

    @Override
    public void exitNumeroDecimal(PertonParser.NumeroDecimalContext ctx) {
        set(ctx, ctx.getText());
    }

    @Override
    public void exitTexto(PertonParser.TextoContext ctx) {
        set(ctx, ctx.getText());
    }

    @Override
    public void exitVariavel(PertonParser.VariavelContext ctx) {
        set(ctx, ctx.getText());
    }

    @Override
    public void exitExpressaoParenteses(PertonParser.ExpressaoParentesesContext ctx) {
        set(ctx, "(" + get(ctx.expression()) + ")");
    }

    @Override
    public void exitChamadaFuncao(PertonParser.ChamadaFuncaoContext ctx) {
        String nome = ctx.ID().getText();
        String args = ctx.exprList() != null ? get(ctx.exprList()) : "";
        set(ctx, nome + "(" + args + ")");
    }

    @Override
    public void exitListaExpressoes(PertonParser.ListaExpressoesContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.expression().size(); i++) {
            sb.append(get(ctx.expression(i)));
            if (i < ctx.expression().size() - 1) {
                sb.append(", ");
            }
        }
        set(ctx, sb.toString());
    }
}
