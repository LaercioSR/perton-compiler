// Generated from Perton.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PertonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_INT=1, T_FLOAT=2, T_STRING=3, VOID=4, MAIN=5, IF=6, ELSE=7, WHILE=8, 
		DO=9, FOR=10, SCANF=11, PRINTF=12, RETURN=13, OP_OR=14, OP_AND=15, OP_EQ=16, 
		OP_NE=17, OP_LT=18, OP_GT=19, OP_LE=20, OP_GE=21, OP_PLUS=22, OP_MINUS=23, 
		OP_MULT=24, OP_DIV=25, OP_MOD=26, OP_NOT=27, OP_ASSIGN=28, LPAREN=29, 
		RPAREN=30, LBRACE=31, RBRACE=32, SEMICOLON=33, COMMA=34, AMP=35, INT=36, 
		FLOAT=37, STRING=38, ID=39, WS=40, LINE_COMMENT=41, BLOCK_COMMENT=42;
	public static final int
		RULE_program = 0, RULE_varDeclaration = 1, RULE_type = 2, RULE_function = 3, 
		RULE_params = 4, RULE_param = 5, RULE_main = 6, RULE_block = 7, RULE_statement = 8, 
		RULE_assignment = 9, RULE_returnStatement = 10, RULE_ifStatement = 11, 
		RULE_whileStatement = 12, RULE_forStatement = 13, RULE_forInit = 14, RULE_forUpdate = 15, 
		RULE_doWhileStatement = 16, RULE_readStatement = 17, RULE_writeStatement = 18, 
		RULE_formatString = 19, RULE_expression = 20, RULE_logicalOrExpression = 21, 
		RULE_logicalAndExpression = 22, RULE_equalityExpression = 23, RULE_relationalExpression = 24, 
		RULE_additiveExpression = 25, RULE_multiplicativeExpression = 26, RULE_unaryExpression = 27, 
		RULE_primaryExpression = 28, RULE_exprList = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varDeclaration", "type", "function", "params", "param", "main", 
			"block", "statement", "assignment", "returnStatement", "ifStatement", 
			"whileStatement", "forStatement", "forInit", "forUpdate", "doWhileStatement", 
			"readStatement", "writeStatement", "formatString", "expression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"primaryExpression", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'string'", "'void'", "'main'", "'if'", "'else'", 
			"'while'", "'do'", "'for'", "'scanf'", "'printf'", "'return'", "'||'", 
			"'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'!'", "'='", "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_INT", "T_FLOAT", "T_STRING", "VOID", "MAIN", "IF", "ELSE", "WHILE", 
			"DO", "FOR", "SCANF", "PRINTF", "RETURN", "OP_OR", "OP_AND", "OP_EQ", 
			"OP_NE", "OP_LT", "OP_GT", "OP_LE", "OP_GE", "OP_PLUS", "OP_MINUS", "OP_MULT", 
			"OP_DIV", "OP_MOD", "OP_NOT", "OP_ASSIGN", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMICOLON", "COMMA", "AMP", "INT", "FLOAT", "STRING", "ID", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Perton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PertonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PertonParser.EOF, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					varDeclaration();
					}
					break;
				case 2:
					{
					setState(61);
					function();
					}
					break;
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			main();
			setState(68);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVarContext extends VarDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PertonParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(PertonParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclaracaoVarContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterDeclaracaoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitDeclaracaoVar(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDeclaration);
		int _la;
		try {
			_localctx = new DeclaracaoVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			type();
			setState(71);
			match(ID);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(72);
				match(OP_ASSIGN);
				setState(73);
				expression();
				}
			}

			setState(76);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoFloatContext extends TypeContext {
		public TerminalNode T_FLOAT() { return getToken(PertonParser.T_FLOAT, 0); }
		public TipoFloatContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterTipoFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitTipoFloat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoStringContext extends TypeContext {
		public TerminalNode T_STRING() { return getToken(PertonParser.T_STRING, 0); }
		public TipoStringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterTipoString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitTipoString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoIntContext extends TypeContext {
		public TerminalNode T_INT() { return getToken(PertonParser.T_INT, 0); }
		public TipoIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterTipoInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitTipoInt(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INT:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T_INT);
				}
				break;
			case T_FLOAT:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T_FLOAT);
				}
				break;
			case T_STRING:
				_localctx = new TipoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(T_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoFuncaoContext extends FunctionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PertonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public DeclaracaoFuncaoContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitDeclaracaoFuncao(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			_localctx = new DeclaracaoFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			type();
			setState(84);
			match(ID);
			setState(85);
			match(LPAREN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				setState(86);
				params();
				}
			}

			setState(89);
			match(RPAREN);
			setState(90);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParamsContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PertonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PertonParser.COMMA, i);
		}
		public ParametrosContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitParametros(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			_localctx = new ParametrosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			param();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				param();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParamContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PertonParser.ID, 0); }
		public ParametroContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitParametro(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			_localctx = new ParametroContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			type();
			setState(101);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoPrincipalContext extends MainContext {
		public TerminalNode VOID() { return getToken(PertonParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(PertonParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncaoPrincipalContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterFuncaoPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitFuncaoPrincipal(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		try {
			_localctx = new FuncaoPrincipalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(VOID);
			setState(104);
			match(MAIN);
			setState(105);
			match(LPAREN);
			setState(106);
			match(RPAREN);
			setState(107);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoCodigoContext extends BlockContext {
		public TerminalNode LBRACE() { return getToken(PertonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PertonParser.RBRACE, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlocoCodigoContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterBlocoCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitBlocoCodigo(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			_localctx = new BlocoCodigoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LBRACE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1033619128142L) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_INT:
				case T_FLOAT:
				case T_STRING:
					{
					setState(110);
					varDeclaration();
					}
					break;
				case IF:
				case WHILE:
				case DO:
				case FOR:
				case SCANF:
				case PRINTF:
				case RETURN:
				case OP_MINUS:
				case OP_NOT:
				case LPAREN:
				case LBRACE:
				case INT:
				case FLOAT:
				case STRING:
				case ID:
					{
					setState(111);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtReadContext extends StatementContext {
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public StmtReadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtRead(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StmtReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtReturn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtBlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtBlock(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtWhileContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StmtWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtWhile(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtWriteContext extends StatementContext {
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public StmtWriteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtWrite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtExpressionContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public StmtExpressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtDoWhileContext extends StatementContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public StmtDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtDoWhile(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAssignmentContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StmtAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtAssignment(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtForContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StmtForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtFor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStmtIf(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StmtAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				assignment();
				}
				break;
			case 2:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				ifStatement();
				}
				break;
			case 3:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				whileStatement();
				}
				break;
			case 4:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				forStatement();
				}
				break;
			case 5:
				_localctx = new StmtDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				doWhileStatement();
				}
				break;
			case 6:
				_localctx = new StmtReadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				readStatement();
				}
				break;
			case 7:
				_localctx = new StmtWriteContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				writeStatement();
				}
				break;
			case 8:
				_localctx = new StmtExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				expression();
				setState(127);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new StmtReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				returnStatement();
				}
				break;
			case 10:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(PertonParser.ID, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(PertonParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public AtribuicaoContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitAtribuicao(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			_localctx = new AtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(134);
			match(OP_ASSIGN);
			setState(135);
			expression();
			setState(136);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(PertonParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetornoContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitRetorno(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStatement);
		int _la;
		try {
			_localctx = new RetornoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(RETURN);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1031471628288L) != 0)) {
				{
				setState(139);
				expression();
				}
			}

			setState(142);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(PertonParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PertonParser.ELSE, 0); }
		public CondicionalContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitCondicional(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			_localctx = new CondicionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IF);
			setState(145);
			match(LPAREN);
			setState(146);
			expression();
			setState(147);
			match(RPAREN);
			setState(148);
			statement();
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(149);
				match(ELSE);
				setState(150);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopWhileContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(PertonParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopWhileContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterLoopWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitLoopWhile(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			_localctx = new LoopWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(WHILE);
			setState(154);
			match(LPAREN);
			setState(155);
			expression();
			setState(156);
			match(RPAREN);
			setState(157);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopForContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(PertonParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public LoopForContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterLoopFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitLoopFor(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStatement);
		int _la;
		try {
			_localctx = new LoopForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FOR);
			setState(160);
			match(LPAREN);
			setState(161);
			forInit();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1031471628288L) != 0)) {
				{
				setState(162);
				expression();
				}
			}

			setState(165);
			match(SEMICOLON);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1031471628288L) != 0)) {
				{
				setState(166);
				forUpdate();
				}
			}

			setState(169);
			match(RPAREN);
			setState(170);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	 
		public ForInitContext() { }
		public void copyFrom(ForInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitExprContext extends ForInitContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public ForInitExprContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterForInitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitForInitExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitEmptyContext extends ForInitContext {
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public ForInitEmptyContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterForInitEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitForInitEmpty(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitAssignContext extends ForInitContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForInitAssignContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterForInitAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitForInitAssign(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitDeclContext extends ForInitContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ForInitDeclContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterForInitDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitForInitDecl(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forInit);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ForInitDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				varDeclaration();
				}
				break;
			case 2:
				_localctx = new ForInitAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				assignment();
				}
				break;
			case 3:
				_localctx = new ForInitExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				expression();
				setState(175);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new ForInitEmptyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
	 
		public ForUpdateContext() { }
		public void copyFrom(ForUpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateAssignContext extends ForUpdateContext {
		public TerminalNode ID() { return getToken(PertonParser.ID, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(PertonParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateAssignContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterForUpdateAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitForUpdateAssign(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateExprContext extends ForUpdateContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateExprContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterForUpdateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitForUpdateExpr(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forUpdate);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ForUpdateAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID);
				setState(181);
				match(OP_ASSIGN);
				setState(182);
				expression();
				}
				break;
			case 2:
				_localctx = new ForUpdateExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	 
		public DoWhileStatementContext() { }
		public void copyFrom(DoWhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopDoWhileContext extends DoWhileStatementContext {
		public TerminalNode DO() { return getToken(PertonParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PertonParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public LoopDoWhileContext(DoWhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterLoopDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitLoopDoWhile(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_doWhileStatement);
		try {
			_localctx = new LoopDoWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(DO);
			setState(187);
			statement();
			setState(188);
			match(WHILE);
			setState(189);
			match(LPAREN);
			setState(190);
			expression();
			setState(191);
			match(RPAREN);
			setState(192);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadStatementContext extends ParserRuleContext {
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
	 
		public ReadStatementContext() { }
		public void copyFrom(ReadStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeituraContext extends ReadStatementContext {
		public TerminalNode SCANF() { return getToken(PertonParser.SCANF, 0); }
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public FormatStringContext formatString() {
			return getRuleContext(FormatStringContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PertonParser.COMMA, 0); }
		public TerminalNode AMP() { return getToken(PertonParser.AMP, 0); }
		public TerminalNode ID() { return getToken(PertonParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public LeituraContext(ReadStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitLeitura(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_readStatement);
		try {
			_localctx = new LeituraContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SCANF);
			setState(195);
			match(LPAREN);
			setState(196);
			formatString();
			setState(197);
			match(COMMA);
			setState(198);
			match(AMP);
			setState(199);
			match(ID);
			setState(200);
			match(RPAREN);
			setState(201);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteStatementContext extends ParserRuleContext {
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
	 
		public WriteStatementContext() { }
		public void copyFrom(WriteStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscritaContext extends WriteStatementContext {
		public TerminalNode PRINTF() { return getToken(PertonParser.PRINTF, 0); }
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public FormatStringContext formatString() {
			return getRuleContext(FormatStringContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PertonParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PertonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PertonParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EscritaContext(WriteStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitEscrita(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_writeStatement);
		int _la;
		try {
			_localctx = new EscritaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(PRINTF);
			setState(204);
			match(LPAREN);
			setState(205);
			formatString();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				expression();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(RPAREN);
			setState(214);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormatStringContext extends ParserRuleContext {
		public FormatStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatString; }
	 
		public FormatStringContext() { }
		public void copyFrom(FormatStringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringFormatadaContext extends FormatStringContext {
		public TerminalNode STRING() { return getToken(PertonParser.STRING, 0); }
		public StringFormatadaContext(FormatStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterStringFormatada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitStringFormatada(this);
		}
	}

	public final FormatStringContext formatString() throws RecognitionException {
		FormatStringContext _localctx = new FormatStringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formatString);
		try {
			_localctx = new StringFormatadaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			logicalOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(PertonParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(PertonParser.OP_OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			logicalAndExpression();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(221);
				match(OP_OR);
				setState(222);
				logicalAndExpression();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(PertonParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(PertonParser.OP_AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			equalityExpression();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(229);
				match(OP_AND);
				setState(230);
				equalityExpression();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(PertonParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(PertonParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(PertonParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(PertonParser.OP_NE, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			relationalExpression();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_EQ || _la==OP_NE) {
				{
				{
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==OP_EQ || _la==OP_NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				relationalExpression();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> OP_LT() { return getTokens(PertonParser.OP_LT); }
		public TerminalNode OP_LT(int i) {
			return getToken(PertonParser.OP_LT, i);
		}
		public List<TerminalNode> OP_GT() { return getTokens(PertonParser.OP_GT); }
		public TerminalNode OP_GT(int i) {
			return getToken(PertonParser.OP_GT, i);
		}
		public List<TerminalNode> OP_LE() { return getTokens(PertonParser.OP_LE); }
		public TerminalNode OP_LE(int i) {
			return getToken(PertonParser.OP_LE, i);
		}
		public List<TerminalNode> OP_GE() { return getTokens(PertonParser.OP_GE); }
		public TerminalNode OP_GE(int i) {
			return getToken(PertonParser.OP_GE, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			additiveExpression();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) {
				{
				{
				setState(245);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				additiveExpression();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> OP_PLUS() { return getTokens(PertonParser.OP_PLUS); }
		public TerminalNode OP_PLUS(int i) {
			return getToken(PertonParser.OP_PLUS, i);
		}
		public List<TerminalNode> OP_MINUS() { return getTokens(PertonParser.OP_MINUS); }
		public TerminalNode OP_MINUS(int i) {
			return getToken(PertonParser.OP_MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			multiplicativeExpression();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_PLUS || _la==OP_MINUS) {
				{
				{
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==OP_PLUS || _la==OP_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(254);
				multiplicativeExpression();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> OP_MULT() { return getTokens(PertonParser.OP_MULT); }
		public TerminalNode OP_MULT(int i) {
			return getToken(PertonParser.OP_MULT, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(PertonParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(PertonParser.OP_DIV, i);
		}
		public List<TerminalNode> OP_MOD() { return getTokens(PertonParser.OP_MOD); }
		public TerminalNode OP_MOD(int i) {
			return getToken(PertonParser.OP_MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			unaryExpression();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) {
				{
				{
				setState(261);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				unaryExpression();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioContext extends UnaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimarioContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitPrimario(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnarioContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode OP_NOT() { return getToken(PertonParser.OP_NOT, 0); }
		public TerminalNode OP_MINUS() { return getToken(PertonParser.OP_MINUS, 0); }
		public UnarioContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitUnario(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryExpression);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_MINUS:
			case OP_NOT:
				_localctx = new UnarioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				_la = _input.LA(1);
				if ( !(_la==OP_MINUS || _la==OP_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(269);
				unaryExpression();
				}
				break;
			case LPAREN:
			case INT:
			case FLOAT:
			case STRING:
			case ID:
				_localctx = new PrimarioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(PertonParser.ID, 0); }
		public VariavelContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitVariavel(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroDecimalContext extends PrimaryExpressionContext {
		public TerminalNode FLOAT() { return getToken(PertonParser.FLOAT, 0); }
		public NumeroDecimalContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterNumeroDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitNumeroDecimal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroInteiroContext extends PrimaryExpressionContext {
		public TerminalNode INT() { return getToken(PertonParser.INT, 0); }
		public NumeroInteiroContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterNumeroInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitNumeroInteiro(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaFuncaoContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(PertonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ChamadaFuncaoContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitChamadaFuncao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoParentesesContext extends PrimaryExpressionContext {
		public TerminalNode LPAREN() { return getToken(PertonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PertonParser.RPAREN, 0); }
		public ExpressaoParentesesContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterExpressaoParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitExpressaoParenteses(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextoContext extends PrimaryExpressionContext {
		public TerminalNode STRING() { return getToken(PertonParser.STRING, 0); }
		public TextoContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitTexto(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primaryExpression);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new NumeroInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(INT);
				}
				break;
			case 2:
				_localctx = new NumeroDecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(FLOAT);
				}
				break;
			case 3:
				_localctx = new TextoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new VariavelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(ID);
				}
				break;
			case 5:
				_localctx = new ChamadaFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(ID);
				setState(278);
				match(LPAREN);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1031471628288L) != 0)) {
					{
					setState(279);
					exprList();
					}
				}

				setState(282);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new ExpressaoParentesesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(LPAREN);
				setState(284);
				expression();
				setState(285);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	 
		public ExprListContext() { }
		public void copyFrom(ExprListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpressoesContext extends ExprListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PertonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PertonParser.COMMA, i);
		}
		public ListaExpressoesContext(ExprListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).enterListaExpressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PertonListener ) ((PertonListener)listener).exitListaExpressoes(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exprList);
		int _la;
		try {
			_localctx = new ListaExpressoesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expression();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(290);
				match(COMMA);
				setState(291);
				expression();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u012a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"K\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002R\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003X\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004`\b\u0004\n\u0004\f\u0004c\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007q\b\u0007\n\u0007\f\u0007t\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0084\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0003\n\u008d\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0098\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a4\b\r\u0001\r\u0001\r\u0003"+
		"\r\u00a8\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b3\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b9\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00d1\b\u0012\n\u0012"+
		"\f\u0012\u00d4\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u00e0\b\u0015\n\u0015\f\u0015\u00e3\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u00e8\b\u0016\n\u0016\f\u0016\u00eb\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00f0\b\u0017\n\u0017"+
		"\f\u0017\u00f3\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u00f8\b\u0018\n\u0018\f\u0018\u00fb\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0100\b\u0019\n\u0019\f\u0019\u0103\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0108\b\u001a\n\u001a\f\u001a\u010b"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0110\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0119\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0120\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0125\b\u001d\n\u001d\f\u001d\u0128\t\u001d\u0001"+
		"\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0005\u0001"+
		"\u0000\u0010\u0011\u0001\u0000\u0012\u0015\u0001\u0000\u0016\u0017\u0001"+
		"\u0000\u0018\u001a\u0002\u0000\u0017\u0017\u001b\u001b\u0134\u0000@\u0001"+
		"\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004Q\u0001\u0000\u0000"+
		"\u0000\u0006S\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000\nd\u0001"+
		"\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000"+
		"\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000"+
		"\u0000\u0014\u008a\u0001\u0000\u0000\u0000\u0016\u0090\u0001\u0000\u0000"+
		"\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u009f\u0001\u0000\u0000"+
		"\u0000\u001c\u00b2\u0001\u0000\u0000\u0000\u001e\u00b8\u0001\u0000\u0000"+
		"\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00c2\u0001\u0000\u0000\u0000"+
		"$\u00cb\u0001\u0000\u0000\u0000&\u00d8\u0001\u0000\u0000\u0000(\u00da"+
		"\u0001\u0000\u0000\u0000*\u00dc\u0001\u0000\u0000\u0000,\u00e4\u0001\u0000"+
		"\u0000\u0000.\u00ec\u0001\u0000\u0000\u00000\u00f4\u0001\u0000\u0000\u0000"+
		"2\u00fc\u0001\u0000\u0000\u00004\u0104\u0001\u0000\u0000\u00006\u010f"+
		"\u0001\u0000\u0000\u00008\u011f\u0001\u0000\u0000\u0000:\u0121\u0001\u0000"+
		"\u0000\u0000<?\u0003\u0002\u0001\u0000=?\u0003\u0006\u0003\u0000><\u0001"+
		"\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CD\u0003\f\u0006\u0000DE\u0005\u0000\u0000"+
		"\u0001E\u0001\u0001\u0000\u0000\u0000FG\u0003\u0004\u0002\u0000GJ\u0005"+
		"\'\u0000\u0000HI\u0005\u001c\u0000\u0000IK\u0003(\u0014\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LM\u0005!\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NR\u0005\u0001\u0000"+
		"\u0000OR\u0005\u0002\u0000\u0000PR\u0005\u0003\u0000\u0000QN\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\u0005"+
		"\u0001\u0000\u0000\u0000ST\u0003\u0004\u0002\u0000TU\u0005\'\u0000\u0000"+
		"UW\u0005\u001d\u0000\u0000VX\u0003\b\u0004\u0000WV\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\u001e\u0000"+
		"\u0000Z[\u0003\u000e\u0007\u0000[\u0007\u0001\u0000\u0000\u0000\\a\u0003"+
		"\n\u0005\u0000]^\u0005\"\u0000\u0000^`\u0003\n\u0005\u0000_]\u0001\u0000"+
		"\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"de\u0003\u0004\u0002\u0000ef\u0005\'\u0000\u0000f\u000b\u0001\u0000\u0000"+
		"\u0000gh\u0005\u0004\u0000\u0000hi\u0005\u0005\u0000\u0000ij\u0005\u001d"+
		"\u0000\u0000jk\u0005\u001e\u0000\u0000kl\u0003\u000e\u0007\u0000l\r\u0001"+
		"\u0000\u0000\u0000mr\u0005\u001f\u0000\u0000nq\u0003\u0002\u0001\u0000"+
		"oq\u0003\u0010\b\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005 \u0000"+
		"\u0000v\u000f\u0001\u0000\u0000\u0000w\u0084\u0003\u0012\t\u0000x\u0084"+
		"\u0003\u0016\u000b\u0000y\u0084\u0003\u0018\f\u0000z\u0084\u0003\u001a"+
		"\r\u0000{\u0084\u0003 \u0010\u0000|\u0084\u0003\"\u0011\u0000}\u0084\u0003"+
		"$\u0012\u0000~\u007f\u0003(\u0014\u0000\u007f\u0080\u0005!\u0000\u0000"+
		"\u0080\u0084\u0001\u0000\u0000\u0000\u0081\u0084\u0003\u0014\n\u0000\u0082"+
		"\u0084\u0003\u000e\u0007\u0000\u0083w\u0001\u0000\u0000\u0000\u0083x\u0001"+
		"\u0000\u0000\u0000\u0083y\u0001\u0000\u0000\u0000\u0083z\u0001\u0000\u0000"+
		"\u0000\u0083{\u0001\u0000\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083"+
		"}\u0001\u0000\u0000\u0000\u0083~\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0011\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\'\u0000\u0000\u0086\u0087\u0005\u001c"+
		"\u0000\u0000\u0087\u0088\u0003(\u0014\u0000\u0088\u0089\u0005!\u0000\u0000"+
		"\u0089\u0013\u0001\u0000\u0000\u0000\u008a\u008c\u0005\r\u0000\u0000\u008b"+
		"\u008d\u0003(\u0014\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005!\u0000\u0000\u008f\u0015\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"\u0006\u0000\u0000\u0091\u0092\u0005\u001d\u0000\u0000\u0092\u0093\u0003"+
		"(\u0014\u0000\u0093\u0094\u0005\u001e\u0000\u0000\u0094\u0097\u0003\u0010"+
		"\b\u0000\u0095\u0096\u0005\u0007\u0000\u0000\u0096\u0098\u0003\u0010\b"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009a\u0005\b\u0000\u0000"+
		"\u009a\u009b\u0005\u001d\u0000\u0000\u009b\u009c\u0003(\u0014\u0000\u009c"+
		"\u009d\u0005\u001e\u0000\u0000\u009d\u009e\u0003\u0010\b\u0000\u009e\u0019"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\n\u0000\u0000\u00a0\u00a1\u0005"+
		"\u001d\u0000\u0000\u00a1\u00a3\u0003\u001c\u000e\u0000\u00a2\u00a4\u0003"+
		"(\u0014\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005!\u0000"+
		"\u0000\u00a6\u00a8\u0003\u001e\u000f\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005\u001e\u0000\u0000\u00aa\u00ab\u0003\u0010\b\u0000"+
		"\u00ab\u001b\u0001\u0000\u0000\u0000\u00ac\u00b3\u0003\u0002\u0001\u0000"+
		"\u00ad\u00b3\u0003\u0012\t\u0000\u00ae\u00af\u0003(\u0014\u0000\u00af"+
		"\u00b0\u0005!\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0005!\u0000\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u001d\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\'\u0000\u0000\u00b5\u00b6\u0005\u001c\u0000\u0000\u00b6\u00b9\u0003("+
		"\u0014\u0000\u00b7\u00b9\u0003(\u0014\u0000\u00b8\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u001f\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005\t\u0000\u0000\u00bb\u00bc\u0003\u0010\b\u0000"+
		"\u00bc\u00bd\u0005\b\u0000\u0000\u00bd\u00be\u0005\u001d\u0000\u0000\u00be"+
		"\u00bf\u0003(\u0014\u0000\u00bf\u00c0\u0005\u001e\u0000\u0000\u00c0\u00c1"+
		"\u0005!\u0000\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u000b"+
		"\u0000\u0000\u00c3\u00c4\u0005\u001d\u0000\u0000\u00c4\u00c5\u0003&\u0013"+
		"\u0000\u00c5\u00c6\u0005\"\u0000\u0000\u00c6\u00c7\u0005#\u0000\u0000"+
		"\u00c7\u00c8\u0005\'\u0000\u0000\u00c8\u00c9\u0005\u001e\u0000\u0000\u00c9"+
		"\u00ca\u0005!\u0000\u0000\u00ca#\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"\f\u0000\u0000\u00cc\u00cd\u0005\u001d\u0000\u0000\u00cd\u00d2\u0003&"+
		"\u0013\u0000\u00ce\u00cf\u0005\"\u0000\u0000\u00cf\u00d1\u0003(\u0014"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005\u001e\u0000\u0000\u00d6\u00d7\u0005!\u0000\u0000"+
		"\u00d7%\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005&\u0000\u0000\u00d9\'"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0003*\u0015\u0000\u00db)\u0001\u0000"+
		"\u0000\u0000\u00dc\u00e1\u0003,\u0016\u0000\u00dd\u00de\u0005\u000e\u0000"+
		"\u0000\u00de\u00e0\u0003,\u0016\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2+\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e9\u0003.\u0017\u0000\u00e5\u00e6"+
		"\u0005\u000f\u0000\u0000\u00e6\u00e8\u0003.\u0017\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea-\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00f1\u00030\u0018"+
		"\u0000\u00ed\u00ee\u0007\u0000\u0000\u0000\u00ee\u00f0\u00030\u0018\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2/\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f9\u00032\u0019\u0000\u00f5\u00f6\u0007\u0001\u0000\u0000\u00f6\u00f8"+
		"\u00032\u0019\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa1\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fc\u0101\u00034\u001a\u0000\u00fd\u00fe\u0007\u0002\u0000"+
		"\u0000\u00fe\u0100\u00034\u001a\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u01023\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0104\u0109\u00036\u001b\u0000\u0105\u0106"+
		"\u0007\u0003\u0000\u0000\u0106\u0108\u00036\u001b\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a5\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0007\u0004"+
		"\u0000\u0000\u010d\u0110\u00036\u001b\u0000\u010e\u0110\u00038\u001c\u0000"+
		"\u010f\u010c\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u01107\u0001\u0000\u0000\u0000\u0111\u0120\u0005$\u0000\u0000\u0112\u0120"+
		"\u0005%\u0000\u0000\u0113\u0120\u0005&\u0000\u0000\u0114\u0120\u0005\'"+
		"\u0000\u0000\u0115\u0116\u0005\'\u0000\u0000\u0116\u0118\u0005\u001d\u0000"+
		"\u0000\u0117\u0119\u0003:\u001d\u0000\u0118\u0117\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u0120\u0005\u001e\u0000\u0000\u011b\u011c\u0005\u001d\u0000\u0000"+
		"\u011c\u011d\u0003(\u0014\u0000\u011d\u011e\u0005\u001e\u0000\u0000\u011e"+
		"\u0120\u0001\u0000\u0000\u0000\u011f\u0111\u0001\u0000\u0000\u0000\u011f"+
		"\u0112\u0001\u0000\u0000\u0000\u011f\u0113\u0001\u0000\u0000\u0000\u011f"+
		"\u0114\u0001\u0000\u0000\u0000\u011f\u0115\u0001\u0000\u0000\u0000\u011f"+
		"\u011b\u0001\u0000\u0000\u0000\u01209\u0001\u0000\u0000\u0000\u0121\u0126"+
		"\u0003(\u0014\u0000\u0122\u0123\u0005\"\u0000\u0000\u0123\u0125\u0003"+
		"(\u0014\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127;\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u001a>@JQWapr\u0083\u008c\u0097\u00a3\u00a7\u00b2\u00b8\u00d2\u00e1"+
		"\u00e9\u00f1\u00f9\u0101\u0109\u010f\u0118\u011f\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}