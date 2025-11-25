// Generated from /Users/laerciorios/Projects/cc-unifacs/perton/src/main/antlr/Perton.g4 by ANTLR 4.13.2
package org.perton.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PertonParser}.
 */
public interface PertonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PertonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PertonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PertonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PertonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaracaoVar}
	 * labeled alternative in {@link PertonParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVar(PertonParser.DeclaracaoVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoVar}
	 * labeled alternative in {@link PertonParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVar(PertonParser.DeclaracaoVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TipoInt}
	 * labeled alternative in {@link PertonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTipoInt(PertonParser.TipoIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TipoInt}
	 * labeled alternative in {@link PertonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTipoInt(PertonParser.TipoIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TipoFloat}
	 * labeled alternative in {@link PertonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTipoFloat(PertonParser.TipoFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TipoFloat}
	 * labeled alternative in {@link PertonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTipoFloat(PertonParser.TipoFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TipoString}
	 * labeled alternative in {@link PertonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTipoString(PertonParser.TipoStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TipoString}
	 * labeled alternative in {@link PertonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTipoString(PertonParser.TipoStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaracaoFuncao}
	 * labeled alternative in {@link PertonParser#function}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(PertonParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoFuncao}
	 * labeled alternative in {@link PertonParser#function}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(PertonParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parametros}
	 * labeled alternative in {@link PertonParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParametros(PertonParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parametros}
	 * labeled alternative in {@link PertonParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParametros(PertonParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parametro}
	 * labeled alternative in {@link PertonParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParametro(PertonParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parametro}
	 * labeled alternative in {@link PertonParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParametro(PertonParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncaoPrincipal}
	 * labeled alternative in {@link PertonParser#main}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoPrincipal(PertonParser.FuncaoPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncaoPrincipal}
	 * labeled alternative in {@link PertonParser#main}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoPrincipal(PertonParser.FuncaoPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoCodigo}
	 * labeled alternative in {@link PertonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlocoCodigo(PertonParser.BlocoCodigoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoCodigo}
	 * labeled alternative in {@link PertonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlocoCodigo(PertonParser.BlocoCodigoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAssignment}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssignment(PertonParser.StmtAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAssignment}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssignment(PertonParser.StmtAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(PertonParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(PertonParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhile(PertonParser.StmtWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhile(PertonParser.StmtWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFor(PertonParser.StmtForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFor(PertonParser.StmtForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtDoWhile}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtDoWhile(PertonParser.StmtDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtDoWhile}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtDoWhile(PertonParser.StmtDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtRead}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtRead(PertonParser.StmtReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtRead}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtRead(PertonParser.StmtReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtWrite}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtWrite(PertonParser.StmtWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtWrite}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtWrite(PertonParser.StmtWriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtExpression}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtExpression(PertonParser.StmtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtExpression}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtExpression(PertonParser.StmtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturn(PertonParser.StmtReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturn(PertonParser.StmtReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtBlock}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(PertonParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtBlock}
	 * labeled alternative in {@link PertonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(PertonParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link PertonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(PertonParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link PertonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(PertonParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Retorno}
	 * labeled alternative in {@link PertonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(PertonParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Retorno}
	 * labeled alternative in {@link PertonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(PertonParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condicional}
	 * labeled alternative in {@link PertonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(PertonParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condicional}
	 * labeled alternative in {@link PertonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(PertonParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopWhile}
	 * labeled alternative in {@link PertonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopWhile(PertonParser.LoopWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopWhile}
	 * labeled alternative in {@link PertonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopWhile(PertonParser.LoopWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopFor}
	 * labeled alternative in {@link PertonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopFor(PertonParser.LoopForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopFor}
	 * labeled alternative in {@link PertonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopFor(PertonParser.LoopForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitDecl}
	 * labeled alternative in {@link PertonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitDecl(PertonParser.ForInitDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitDecl}
	 * labeled alternative in {@link PertonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitDecl(PertonParser.ForInitDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitAssign}
	 * labeled alternative in {@link PertonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitAssign(PertonParser.ForInitAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitAssign}
	 * labeled alternative in {@link PertonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitAssign(PertonParser.ForInitAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitExpr}
	 * labeled alternative in {@link PertonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitExpr(PertonParser.ForInitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitExpr}
	 * labeled alternative in {@link PertonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitExpr(PertonParser.ForInitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitEmpty}
	 * labeled alternative in {@link PertonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitEmpty(PertonParser.ForInitEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitEmpty}
	 * labeled alternative in {@link PertonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitEmpty(PertonParser.ForInitEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateAssign}
	 * labeled alternative in {@link PertonParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateAssign(PertonParser.ForUpdateAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateAssign}
	 * labeled alternative in {@link PertonParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateAssign(PertonParser.ForUpdateAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateExpr}
	 * labeled alternative in {@link PertonParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateExpr(PertonParser.ForUpdateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateExpr}
	 * labeled alternative in {@link PertonParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateExpr(PertonParser.ForUpdateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopDoWhile}
	 * labeled alternative in {@link PertonParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopDoWhile(PertonParser.LoopDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopDoWhile}
	 * labeled alternative in {@link PertonParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopDoWhile(PertonParser.LoopDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Leitura}
	 * labeled alternative in {@link PertonParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(PertonParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Leitura}
	 * labeled alternative in {@link PertonParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(PertonParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Escrita}
	 * labeled alternative in {@link PertonParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(PertonParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Escrita}
	 * labeled alternative in {@link PertonParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(PertonParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringFormatada}
	 * labeled alternative in {@link PertonParser#formatString}.
	 * @param ctx the parse tree
	 */
	void enterStringFormatada(PertonParser.StringFormatadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringFormatada}
	 * labeled alternative in {@link PertonParser#formatString}.
	 * @param ctx the parse tree
	 */
	void exitStringFormatada(PertonParser.StringFormatadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PertonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PertonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PertonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PertonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PertonParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(PertonParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PertonParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(PertonParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PertonParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(PertonParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PertonParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(PertonParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PertonParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(PertonParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PertonParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(PertonParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PertonParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(PertonParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PertonParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(PertonParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PertonParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PertonParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PertonParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PertonParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PertonParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PertonParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PertonParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PertonParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unario}
	 * labeled alternative in {@link PertonParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnario(PertonParser.UnarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unario}
	 * labeled alternative in {@link PertonParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnario(PertonParser.UnarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Primario}
	 * labeled alternative in {@link PertonParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimario(PertonParser.PrimarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Primario}
	 * labeled alternative in {@link PertonParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimario(PertonParser.PrimarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumeroInteiro}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumeroInteiro(PertonParser.NumeroInteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumeroInteiro}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumeroInteiro(PertonParser.NumeroInteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumeroDecimal}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumeroDecimal(PertonParser.NumeroDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumeroDecimal}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumeroDecimal(PertonParser.NumeroDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Texto}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTexto(PertonParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Texto}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTexto(PertonParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variavel}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(PertonParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variavel}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(PertonParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChamadaFuncao}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(PertonParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChamadaFuncao}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(PertonParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressaoParenteses}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoParenteses(PertonParser.ExpressaoParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressaoParenteses}
	 * labeled alternative in {@link PertonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoParenteses(PertonParser.ExpressaoParentesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListaExpressoes}
	 * labeled alternative in {@link PertonParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterListaExpressoes(PertonParser.ListaExpressoesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListaExpressoes}
	 * labeled alternative in {@link PertonParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitListaExpressoes(PertonParser.ListaExpressoesContext ctx);
}