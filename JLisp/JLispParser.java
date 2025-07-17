// Generated from JLisp.g4 by ANTLR 4.2

  import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JLispParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, SIMPLE_PUNC=13, A_OPERATOR=14, L_OPERATOR=15, 
		NIL=16, T=17, WSP=18, REAL=19, E=20, INT=21, LC=22, UC=23, DIGIT=24, LP=25, 
		RP=26, IF=27, MAX=28, EXPT=29, LOOP=30, BREAK=31, SETF=32, QUOTE=33, PRINT=34, 
		READ=35, PROGN=36, WS=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'--h'", "'--i'", "'--execute'", "'--interprete'", "'--help'", 
		"'--compile'", "'.'", "'\"'", "'--e'", "'--gbytecode'", "'--c'", "'--g'", 
		"SIMPLE_PUNC", "A_OPERATOR", "L_OPERATOR", "NIL", "T", "WSP", "REAL", 
		"'E'", "INT", "LC", "UC", "DIGIT", "'('", "')'", "'if'", "MAX", "EXPT", 
		"LOOP", "BREAK", "SETF", "QUOTE", "PRINT", "READ", "PROGN", "WS"
	};
	public static final int
		RULE_program = 0, RULE_comands = 1, RULE_help = 2, RULE_compile = 3, RULE_interprete = 4, 
		RULE_execute = 5, RULE_genBytecode = 6, RULE_sexpr = 7, RULE_atom = 8, 
		RULE_num_atom = 9, RULE_decimal = 10, RULE_real = 11, RULE_racional = 12, 
		RULE_epart = 13, RULE_string = 14, RULE_symb_atom = 15, RULE_symbol = 16, 
		RULE_init_symbol = 17, RULE_special_symbol = 18, RULE_list = 19, RULE_list_body = 20, 
		RULE_break_expr = 21, RULE_aritm_expr = 22, RULE_logic_expr = 23, RULE_cond_expr = 24, 
		RULE_if_statement = 25, RULE_condition = 26, RULE_true_cond = 27, RULE_false_cond = 28, 
		RULE_loop_statement = 29, RULE_macro_expr = 30, RULE_macro_expt = 31, 
		RULE_macro_max = 32, RULE_macro_setf = 33, RULE_macro_quote = 34, RULE_macro_print = 35, 
		RULE_macro_read = 36, RULE_macro_progn = 37, RULE_alpha = 38;
	public static final String[] ruleNames = {
		"program", "comands", "help", "compile", "interprete", "execute", "genBytecode", 
		"sexpr", "atom", "num_atom", "decimal", "real", "racional", "epart", "string", 
		"symb_atom", "symbol", "init_symbol", "special_symbol", "list", "list_body", 
		"break_expr", "aritm_expr", "logic_expr", "cond_expr", "if_statement", 
		"condition", "true_cond", "false_cond", "loop_statement", "macro_expr", 
		"macro_expt", "macro_max", "macro_setf", "macro_quote", "macro_print", 
		"macro_read", "macro_progn", "alpha"
	};

	@Override
	public String getGrammarFileName() { return "JLisp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  int numOps = 1; //numero de operaciones, comienza en 1 porque al menos se carga el argumento del main
	  HashMap<String,VarInfo> memory = new HashMap<String, VarInfo>(); //mapea el ID con el numero para la variable local
	  int localVarNum = 1; // cantidad de variables locales.
	  boolean comand=false;

	public JLispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case 8:
			case SIMPLE_PUNC:
			case A_OPERATOR:
			case L_OPERATOR:
			case NIL:
			case T:
			case REAL:
			case INT:
			case LC:
			case UC:
			case DIGIT:
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); sexpr();
				}
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 9:
			case 10:
			case 11:
			case 12:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); comands();
				comand=true;
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

	public static class ComandsContext extends ParserRuleContext {
		public CompileContext compile() {
			return getRuleContext(CompileContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public InterpreteContext interprete() {
			return getRuleContext(InterpreteContext.class,0);
		}
		public GenBytecodeContext genBytecode() {
			return getRuleContext(GenBytecodeContext.class,0);
		}
		public HelpContext help() {
			return getRuleContext(HelpContext.class,0);
		}
		public ComandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterComands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitComands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitComands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandsContext comands() throws RecognitionException {
		ComandsContext _localctx = new ComandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comands);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case 1:
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); help();
				}
				break;
			case 6:
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); compile();
				}
				break;
			case 10:
			case 12:
				enterOuterAlt(_localctx, 3);
				{
				setState(86); genBytecode();
				}
				break;
			case 2:
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87); interprete();
				}
				break;
			case 3:
			case 9:
				enterOuterAlt(_localctx, 5);
				{
				setState(88); execute();
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

	public static class HelpContext extends ParserRuleContext {
		public HelpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterHelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitHelp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitHelp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelpContext help() throws RecognitionException {
		HelpContext _localctx = new HelpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_help);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==5) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CompileContext extends ParserRuleContext {
		public CompileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterCompile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitCompile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitCompile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompileContext compile() throws RecognitionException {
		CompileContext _localctx = new CompileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==6 || _la==11) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class InterpreteContext extends ParserRuleContext {
		public InterpreteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interprete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterInterprete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitInterprete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitInterprete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpreteContext interprete() throws RecognitionException {
		InterpreteContext _localctx = new InterpreteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interprete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==4) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExecuteContext extends ParserRuleContext {
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==9) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class GenBytecodeContext extends ParserRuleContext {
		public GenBytecodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genBytecode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterGenBytecode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitGenBytecode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitGenBytecode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenBytecodeContext genBytecode() throws RecognitionException {
		GenBytecodeContext _localctx = new GenBytecodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_genBytecode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==10 || _la==12) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SexprContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public AtomContext b;
		public ListContext a;
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterSexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitSexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitSexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexprContext sexpr() throws RecognitionException {
		SexprContext _localctx = new SexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sexpr);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case 8:
			case SIMPLE_PUNC:
			case A_OPERATOR:
			case L_OPERATOR:
			case NIL:
			case T:
			case REAL:
			case INT:
			case LC:
			case UC:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); ((SexprContext)_localctx).b = atom();
				((SexprContext)_localctx).type = ((SexprContext)_localctx).b.type;
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); ((SexprContext)_localctx).a = list();
				((SexprContext)_localctx).type = ((SexprContext)_localctx).a.type;
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

	public static class AtomContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public Num_atomContext a;
		public Symb_atomContext b;
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Num_atomContext num_atom() {
			return getRuleContext(Num_atomContext.class,0);
		}
		public Symb_atomContext symb_atom() {
			return getRuleContext(Symb_atomContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case REAL:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); ((AtomContext)_localctx).a = num_atom();
				((AtomContext)_localctx).type = ((AtomContext)_localctx).a.type;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); string();
				((AtomContext)_localctx).type = EnumType.STRING;
				}
				break;
			case SIMPLE_PUNC:
			case A_OPERATOR:
			case L_OPERATOR:
			case NIL:
			case T:
			case LC:
			case UC:
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(115); ((AtomContext)_localctx).b = symb_atom();
				((AtomContext)_localctx).type = ((AtomContext)_localctx).b.type;
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

	public static class Num_atomContext extends ParserRuleContext {
		public EnumType type;
		public RacionalContext racional() {
			return getRuleContext(RacionalContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public Num_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterNum_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitNum_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitNum_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_atomContext num_atom() throws RecognitionException {
		Num_atomContext _localctx = new Num_atomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_num_atom);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); decimal();
				((Num_atomContext)_localctx).type = EnumType.INT;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); real();
				((Num_atomContext)_localctx).type = EnumType.FRACTION;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); racional();
				((Num_atomContext)_localctx).type = EnumType.FLOAT;
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JLispParser.INT, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(INT);
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

	public static class RealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(JLispParser.REAL, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(REAL);
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

	public static class RacionalContext extends ParserRuleContext {
		public DecimalContext decimal(int i) {
			return getRuleContext(DecimalContext.class,i);
		}
		public EpartContext epart() {
			return getRuleContext(EpartContext.class,0);
		}
		public List<DecimalContext> decimal() {
			return getRuleContexts(DecimalContext.class);
		}
		public RacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_racional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterRacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitRacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitRacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RacionalContext racional() throws RecognitionException {
		RacionalContext _localctx = new RacionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_racional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); decimal();
			setState(136); match(7);
			setState(137); decimal();
			setState(139);
			_la = _input.LA(1);
			if (_la==E) {
				{
				setState(138); epart();
				}
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

	public static class EpartContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public TerminalNode E() { return getToken(JLispParser.E, 0); }
		public EpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterEpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitEpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitEpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpartContext epart() throws RecognitionException {
		EpartContext _localctx = new EpartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_epart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(E);
			setState(142); decimal();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(JLispParser.DIGIT, i);
		}
		public List<TerminalNode> UC() { return getTokens(JLispParser.UC); }
		public TerminalNode UC(int i) {
			return getToken(JLispParser.UC, i);
		}
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public List<TerminalNode> DIGIT() { return getTokens(JLispParser.DIGIT); }
		public TerminalNode LC(int i) {
			return getToken(JLispParser.LC, i);
		}
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public List<TerminalNode> LC() { return getTokens(JLispParser.LC); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(8);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WSP) | (1L << LC) | (1L << UC) | (1L << DIGIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WSP) | (1L << LC) | (1L << UC) | (1L << DIGIT))) != 0) );
			setState(150); match(8);
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

	public static class Symb_atomContext extends ParserRuleContext {
		public EnumType type;
		public SymbolContext symbol;
		public Special_symbolContext p;
		public Special_symbolContext special_symbol() {
			return getRuleContext(Special_symbolContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Symb_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symb_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterSymb_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitSymb_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitSymb_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Symb_atomContext symb_atom() throws RecognitionException {
		Symb_atomContext _localctx = new Symb_atomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_symb_atom);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case SIMPLE_PUNC:
			case A_OPERATOR:
			case L_OPERATOR:
			case LC:
			case UC:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); ((Symb_atomContext)_localctx).symbol = symbol();

				                    if(memory.get((((Symb_atomContext)_localctx).symbol!=null?_input.getText(((Symb_atomContext)_localctx).symbol.start,((Symb_atomContext)_localctx).symbol.stop):null))!=null)
				                        ((Symb_atomContext)_localctx).type = memory.get((((Symb_atomContext)_localctx).symbol!=null?_input.getText(((Symb_atomContext)_localctx).symbol.start,((Symb_atomContext)_localctx).symbol.stop):null)).getEnumType();
				                  
				}
				break;
			case NIL:
			case T:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); ((Symb_atomContext)_localctx).p = special_symbol();
				((Symb_atomContext)_localctx).type = ((Symb_atomContext)_localctx).p.type;
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

	public static class SymbolContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(JLispParser.INT); }
		public Init_symbolContext init_symbol(int i) {
			return getRuleContext(Init_symbolContext.class,i);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
		}
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public TerminalNode INT(int i) {
			return getToken(JLispParser.INT, i);
		}
		public List<Init_symbolContext> init_symbol() {
			return getRuleContexts(Init_symbolContext.class);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_symbol);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIMPLE_PUNC) | (1L << A_OPERATOR) | (1L << L_OPERATOR))) != 0)) {
				{
				setState(160); init_symbol();
				}
			}

			{
			setState(163); alpha();
			}
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(167);
					switch (_input.LA(1)) {
					case LC:
					case UC:
					case DIGIT:
						{
						setState(164); alpha();
						}
						break;
					case INT:
						{
						setState(165); match(INT);
						}
						break;
					case SIMPLE_PUNC:
					case A_OPERATOR:
					case L_OPERATOR:
						{
						setState(166); init_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Init_symbolContext extends ParserRuleContext {
		public TerminalNode A_OPERATOR() { return getToken(JLispParser.A_OPERATOR, 0); }
		public TerminalNode SIMPLE_PUNC() { return getToken(JLispParser.SIMPLE_PUNC, 0); }
		public TerminalNode L_OPERATOR() { return getToken(JLispParser.L_OPERATOR, 0); }
		public Init_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterInit_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitInit_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitInit_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_symbolContext init_symbol() throws RecognitionException {
		Init_symbolContext _localctx = new Init_symbolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_init_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIMPLE_PUNC) | (1L << A_OPERATOR) | (1L << L_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Special_symbolContext extends ParserRuleContext {
		public EnumType type;
		public TerminalNode NIL() { return getToken(JLispParser.NIL, 0); }
		public TerminalNode T() { return getToken(JLispParser.T, 0); }
		public Special_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterSpecial_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitSpecial_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitSpecial_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_symbolContext special_symbol() throws RecognitionException {
		Special_symbolContext _localctx = new Special_symbolContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_special_symbol);
		try {
			setState(178);
			switch (_input.LA(1)) {
			case NIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); match(NIL);
				((Special_symbolContext)_localctx).type = EnumType.NIL;
				}
				break;
			case T:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); match(T);
				((Special_symbolContext)_localctx).type = EnumType.T;
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

	public static class ListContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public List_bodyContext l;
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public List_bodyContext list_body() {
			return getRuleContext(List_bodyContext.class,0);
		}
		public TerminalNode LP() { return getToken(JLispParser.LP, 0); }
		public TerminalNode RP() { return getToken(JLispParser.RP, 0); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(LP);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(181); match(WSP);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(188);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A_OPERATOR) | (1L << L_OPERATOR) | (1L << WSP) | (1L << IF) | (1L << MAX) | (1L << EXPT) | (1L << LOOP) | (1L << BREAK) | (1L << SETF) | (1L << QUOTE) | (1L << PRINT) | (1L << READ) | (1L << PROGN))) != 0)) {
				{
				setState(187); ((ListContext)_localctx).l = list_body();
				}
			}

			setState(190); match(RP);
			((ListContext)_localctx).type = ((ListContext)_localctx).l.type;
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

	public static class List_bodyContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public Aritm_exprContext a;
		public Logic_exprContext l;
		public Macro_exprContext m;
		public Break_exprContext b;
		public Macro_exprContext macro_expr() {
			return getRuleContext(Macro_exprContext.class,0);
		}
		public Break_exprContext break_expr() {
			return getRuleContext(Break_exprContext.class,0);
		}
		public Aritm_exprContext aritm_expr() {
			return getRuleContext(Aritm_exprContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public List_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterList_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitList_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitList_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_bodyContext list_body() throws RecognitionException {
		List_bodyContext _localctx = new List_bodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_body);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); ((List_bodyContext)_localctx).a = aritm_expr();
				((List_bodyContext)_localctx).type = ((List_bodyContext)_localctx).a.type;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); ((List_bodyContext)_localctx).l = logic_expr();
				((List_bodyContext)_localctx).type = ((List_bodyContext)_localctx).l.type;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199); cond_expr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200); ((List_bodyContext)_localctx).m = macro_expr();
				((List_bodyContext)_localctx).type = ((List_bodyContext)_localctx).m.type;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203); ((List_bodyContext)_localctx).b = break_expr();
				((List_bodyContext)_localctx).type = ((List_bodyContext)_localctx).b.type;
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

	public static class Break_exprContext extends ParserRuleContext {
		public EnumType type=EnumType.V;
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode BREAK() { return getToken(JLispParser.BREAK, 0); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public Break_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterBreak_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitBreak_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitBreak_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_exprContext break_expr() throws RecognitionException {
		Break_exprContext _localctx = new Break_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_break_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(208); match(WSP);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214); match(BREAK);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(215); match(WSP);
				}
				}
				setState(220);
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

	public static class Aritm_exprContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public SexprContext sexpr;
		public List<SexprContext> se = new ArrayList<SexprContext>();
		public List<SexprContext> sexpr() {
			return getRuleContexts(SexprContext.class);
		}
		public TerminalNode A_OPERATOR() { return getToken(JLispParser.A_OPERATOR, 0); }
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public SexprContext sexpr(int i) {
			return getRuleContext(SexprContext.class,i);
		}
		public Aritm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritm_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterAritm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitAritm_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitAritm_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritm_exprContext aritm_expr() throws RecognitionException {
		Aritm_exprContext _localctx = new Aritm_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_aritm_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(A_OPERATOR);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(224);
				switch (_input.LA(1)) {
				case WSP:
					{
					setState(222); match(WSP);
					}
					break;
				case 8:
				case SIMPLE_PUNC:
				case A_OPERATOR:
				case L_OPERATOR:
				case NIL:
				case T:
				case REAL:
				case INT:
				case LC:
				case UC:
				case DIGIT:
				case LP:
					{
					setState(223); ((Aritm_exprContext)_localctx).sexpr = sexpr();
					((Aritm_exprContext)_localctx).se.add(((Aritm_exprContext)_localctx).sexpr);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << SIMPLE_PUNC) | (1L << A_OPERATOR) | (1L << L_OPERATOR) | (1L << NIL) | (1L << T) | (1L << WSP) | (1L << REAL) | (1L << INT) | (1L << LC) | (1L << UC) | (1L << DIGIT) | (1L << LP))) != 0) );

			                                                 for(int i = 0; i < ((Aritm_exprContext)_localctx).se.size(); i++){
			                                                       if(((Aritm_exprContext)_localctx).se.get(i).type==EnumType.FLOAT){
			                                                            ((Aritm_exprContext)_localctx).type = EnumType.FLOAT;
			                                                            break;
			                                                        }
			                                                       }
			                                                numOps++;
			                                               
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

	public static class Logic_exprContext extends ParserRuleContext {
		public EnumType type=EnumType.T;
		public List<SexprContext> sexpr() {
			return getRuleContexts(SexprContext.class);
		}
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public SexprContext sexpr(int i) {
			return getRuleContext(SexprContext.class,i);
		}
		public TerminalNode L_OPERATOR() { return getToken(JLispParser.L_OPERATOR, 0); }
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitLogic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitLogic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logic_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(L_OPERATOR);
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(233);
				switch (_input.LA(1)) {
				case WSP:
					{
					setState(231); match(WSP);
					}
					break;
				case 8:
				case SIMPLE_PUNC:
				case A_OPERATOR:
				case L_OPERATOR:
				case NIL:
				case T:
				case REAL:
				case INT:
				case LC:
				case UC:
				case DIGIT:
				case LP:
					{
					setState(232); sexpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << SIMPLE_PUNC) | (1L << A_OPERATOR) | (1L << L_OPERATOR) | (1L << NIL) | (1L << T) | (1L << WSP) | (1L << REAL) | (1L << INT) | (1L << LC) | (1L << UC) | (1L << DIGIT) | (1L << LP))) != 0) );
			numOps++;
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

	public static class Cond_exprContext extends ParserRuleContext {
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Cond_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterCond_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitCond_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitCond_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_exprContext cond_expr() throws RecognitionException {
		Cond_exprContext _localctx = new Cond_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cond_expr);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); if_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); loop_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JLispParser.IF, 0); }
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public False_condContext false_cond() {
			return getRuleContext(False_condContext.class,0);
		}
		public True_condContext true_cond() {
			return getRuleContext(True_condContext.class,0);
		}
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(243); match(WSP);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249); match(IF);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(250); match(WSP);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256); condition();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(257); match(WSP);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263); true_cond();
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(264); match(WSP);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(271);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << SIMPLE_PUNC) | (1L << A_OPERATOR) | (1L << L_OPERATOR) | (1L << NIL) | (1L << T) | (1L << REAL) | (1L << INT) | (1L << LC) | (1L << UC) | (1L << DIGIT) | (1L << LP))) != 0)) {
				{
				setState(270); false_cond();
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(273); match(WSP);
				}
				}
				setState(278);
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

	public static class ConditionContext extends ParserRuleContext {
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); sexpr();
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

	public static class True_condContext extends ParserRuleContext {
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public True_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterTrue_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitTrue_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitTrue_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_condContext true_cond() throws RecognitionException {
		True_condContext _localctx = new True_condContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_true_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); sexpr();
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

	public static class False_condContext extends ParserRuleContext {
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public False_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterFalse_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitFalse_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitFalse_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final False_condContext false_cond() throws RecognitionException {
		False_condContext _localctx = new False_condContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_false_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); sexpr();
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

	public static class Loop_statementContext extends ParserRuleContext {
		public List<SexprContext> sexpr() {
			return getRuleContexts(SexprContext.class);
		}
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode LOOP() { return getToken(JLispParser.LOOP, 0); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public SexprContext sexpr(int i) {
			return getRuleContext(SexprContext.class,i);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loop_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(285); match(WSP);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291); match(LOOP);
			setState(294); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(294);
					switch (_input.LA(1)) {
					case WSP:
						{
						setState(292); match(WSP);
						}
						break;
					case 8:
					case SIMPLE_PUNC:
					case A_OPERATOR:
					case L_OPERATOR:
					case NIL:
					case T:
					case REAL:
					case INT:
					case LC:
					case UC:
					case DIGIT:
					case LP:
						{
						setState(293); sexpr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(296); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(298); match(WSP);
				}
				}
				setState(303);
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

	public static class Macro_exprContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public Macro_setfContext b;
		public Macro_printContext a;
		public Macro_prognContext p;
		public Macro_readContext r;
		public Macro_exptContext e;
		public Macro_maxContext m;
		public Macro_exptContext macro_expt() {
			return getRuleContext(Macro_exptContext.class,0);
		}
		public Macro_readContext macro_read() {
			return getRuleContext(Macro_readContext.class,0);
		}
		public Macro_prognContext macro_progn() {
			return getRuleContext(Macro_prognContext.class,0);
		}
		public Macro_printContext macro_print() {
			return getRuleContext(Macro_printContext.class,0);
		}
		public Macro_maxContext macro_max() {
			return getRuleContext(Macro_maxContext.class,0);
		}
		public Macro_setfContext macro_setf() {
			return getRuleContext(Macro_setfContext.class,0);
		}
		public Macro_quoteContext macro_quote() {
			return getRuleContext(Macro_quoteContext.class,0);
		}
		public Macro_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterMacro_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitMacro_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitMacro_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_exprContext macro_expr() throws RecognitionException {
		Macro_exprContext _localctx = new Macro_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_macro_expr);
		try {
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); ((Macro_exprContext)_localctx).b = macro_setf();
				((Macro_exprContext)_localctx).type = ((Macro_exprContext)_localctx).b.type;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307); ((Macro_exprContext)_localctx).a = macro_print();
				((Macro_exprContext)_localctx).type = ((Macro_exprContext)_localctx).a.type;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310); ((Macro_exprContext)_localctx).p = macro_progn();
				((Macro_exprContext)_localctx).type = ((Macro_exprContext)_localctx).p.type;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313); macro_quote();
				((Macro_exprContext)_localctx).type = EnumType.STRING;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316); ((Macro_exprContext)_localctx).r = macro_read();
				((Macro_exprContext)_localctx).type = ((Macro_exprContext)_localctx).r.type;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319); ((Macro_exprContext)_localctx).e = macro_expt();
				((Macro_exprContext)_localctx).type = ((Macro_exprContext)_localctx).e.type;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(322); ((Macro_exprContext)_localctx).m = macro_max();
				((Macro_exprContext)_localctx).type = ((Macro_exprContext)_localctx).m.type;
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

	public static class Macro_exptContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public SexprContext a;
		public SexprContext b;
		public List<SexprContext> sexpr() {
			return getRuleContexts(SexprContext.class);
		}
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode EXPT() { return getToken(JLispParser.EXPT, 0); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public SexprContext sexpr(int i) {
			return getRuleContext(SexprContext.class,i);
		}
		public Macro_exptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_expt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterMacro_expt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitMacro_expt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitMacro_expt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_exptContext macro_expt() throws RecognitionException {
		Macro_exptContext _localctx = new Macro_exptContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_macro_expt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(327); match(WSP);
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333); match(EXPT);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(334); match(WSP);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340); ((Macro_exptContext)_localctx).a = sexpr();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(341); match(WSP);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347); ((Macro_exptContext)_localctx).b = sexpr();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(348); match(WSP);
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                                                      if(((Macro_exptContext)_localctx).a.type==EnumType.FLOAT || ((Macro_exptContext)_localctx).b.type==EnumType.FLOAT)
			                                                        ((Macro_exptContext)_localctx).type = EnumType.FLOAT; 
			                                                       numOps++;  
			                                                  
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

	public static class Macro_maxContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public SexprContext sexpr;
		public List<SexprContext> s = new ArrayList<SexprContext>();
		public List<SexprContext> sexpr() {
			return getRuleContexts(SexprContext.class);
		}
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public TerminalNode MAX() { return getToken(JLispParser.MAX, 0); }
		public SexprContext sexpr(int i) {
			return getRuleContext(SexprContext.class,i);
		}
		public Macro_maxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_max; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterMacro_max(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitMacro_max(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitMacro_max(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_maxContext macro_max() throws RecognitionException {
		Macro_maxContext _localctx = new Macro_maxContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_macro_max);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(356); match(WSP);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362); match(MAX);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(363); match(WSP);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(371); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(371);
					switch (_input.LA(1)) {
					case WSP:
						{
						setState(369); match(WSP);
						}
						break;
					case 8:
					case SIMPLE_PUNC:
					case A_OPERATOR:
					case L_OPERATOR:
					case NIL:
					case T:
					case REAL:
					case INT:
					case LC:
					case UC:
					case DIGIT:
					case LP:
						{
						setState(370); ((Macro_maxContext)_localctx).sexpr = sexpr();
						((Macro_maxContext)_localctx).s.add(((Macro_maxContext)_localctx).sexpr);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(373); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(375); match(WSP);
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                                                     for(int i = 0; i < ((Macro_maxContext)_localctx).s.size(); i++){
			                                                       if(((Macro_maxContext)_localctx).s.get(i).type==EnumType.FLOAT){
			                                                            ((Macro_maxContext)_localctx).type = EnumType.FLOAT;
			                                                            break;
			                                                        }
			                                                       }
			                                                      numOps++; 
			                                                   
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

	public static class Macro_setfContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public SymbolContext symbol;
		public SexprContext e;
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode SETF() { return getToken(JLispParser.SETF, 0); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Macro_setfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_setf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterMacro_setf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitMacro_setf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitMacro_setf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_setfContext macro_setf() throws RecognitionException {
		Macro_setfContext _localctx = new Macro_setfContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_macro_setf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(383); match(WSP);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389); match(SETF);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(390); match(WSP);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396); ((Macro_setfContext)_localctx).symbol = symbol();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(397); match(WSP);
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403); ((Macro_setfContext)_localctx).e = sexpr();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(404); match(WSP);
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                                                  if(memory.get((((Macro_setfContext)_localctx).symbol!=null?_input.getText(((Macro_setfContext)_localctx).symbol.start,((Macro_setfContext)_localctx).symbol.stop):null))==null)
			                                                     memory.put((((Macro_setfContext)_localctx).symbol!=null?_input.getText(((Macro_setfContext)_localctx).symbol.start,((Macro_setfContext)_localctx).symbol.stop):null),new VarInfo(((Macro_setfContext)_localctx).e.type,++localVarNum));
			                                                   else
			                                                     memory.put((((Macro_setfContext)_localctx).symbol!=null?_input.getText(((Macro_setfContext)_localctx).symbol.start,((Macro_setfContext)_localctx).symbol.stop):null),new VarInfo(((Macro_setfContext)_localctx).e.type,memory.get((((Macro_setfContext)_localctx).symbol!=null?_input.getText(((Macro_setfContext)_localctx).symbol.start,((Macro_setfContext)_localctx).symbol.stop):null)).getNum()));
			                                                    ((Macro_setfContext)_localctx).type = ((Macro_setfContext)_localctx).e.type;
			                                                  
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

	public static class Macro_quoteContext extends ParserRuleContext {
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode QUOTE() { return getToken(JLispParser.QUOTE, 0); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public Macro_quoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterMacro_quote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitMacro_quote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitMacro_quote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_quoteContext macro_quote() throws RecognitionException {
		Macro_quoteContext _localctx = new Macro_quoteContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_macro_quote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(412); match(WSP);
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418); match(QUOTE);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(419); match(WSP);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(425); string();
				}
				break;

			case 2:
				{
				setState(426); sexpr();
				}
				break;
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(429); match(WSP);
				}
				}
				setState(434);
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

	public static class Macro_printContext extends ParserRuleContext {
		public EnumType type;
		public SexprContext a;
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(JLispParser.PRINT, 0); }
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public Macro_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterMacro_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitMacro_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitMacro_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_printContext macro_print() throws RecognitionException {
		Macro_printContext _localctx = new Macro_printContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_macro_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(435); match(WSP);
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441); match(PRINT);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(442); match(WSP);
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448); ((Macro_printContext)_localctx).a = sexpr();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(449); match(WSP);
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                                                                      ((Macro_printContext)_localctx).type = ((Macro_printContext)_localctx).a.type;
			                                                                    
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

	public static class Macro_readContext extends ParserRuleContext {
		public EnumType type=EnumType.INT;
		public Token READ;
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode READ() { return getToken(JLispParser.READ, 0); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public Macro_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterMacro_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitMacro_read(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitMacro_read(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_readContext macro_read() throws RecognitionException {
		Macro_readContext _localctx = new Macro_readContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_macro_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(457); match(WSP);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463); ((Macro_readContext)_localctx).READ = match(READ);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(464); match(WSP);
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                                                    if(memory.get((((Macro_readContext)_localctx).READ!=null?((Macro_readContext)_localctx).READ.getText():null)) == null)
			                                                    { //adiciona var read una vez y deja espacio para dos variables locales
			                                                      memory.put((((Macro_readContext)_localctx).READ!=null?((Macro_readContext)_localctx).READ.getText():null), new VarInfo(localVarNum));
			                                                      localVarNum++;
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

	public static class Macro_prognContext extends ParserRuleContext {
		public EnumType type;
		public SexprContext a;
		public List<SexprContext> sexpr() {
			return getRuleContexts(SexprContext.class);
		}
		public List<TerminalNode> WSP() { return getTokens(JLispParser.WSP); }
		public TerminalNode PROGN() { return getToken(JLispParser.PROGN, 0); }
		public TerminalNode WSP(int i) {
			return getToken(JLispParser.WSP, i);
		}
		public SexprContext sexpr(int i) {
			return getRuleContext(SexprContext.class,i);
		}
		public Macro_prognContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_progn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterMacro_progn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitMacro_progn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitMacro_progn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_prognContext macro_progn() throws RecognitionException {
		Macro_prognContext _localctx = new Macro_prognContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_macro_progn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WSP) {
				{
				{
				setState(472); match(WSP);
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478); match(PROGN);
			setState(481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(481);
				switch (_input.LA(1)) {
				case WSP:
					{
					setState(479); match(WSP);
					}
					break;
				case 8:
				case SIMPLE_PUNC:
				case A_OPERATOR:
				case L_OPERATOR:
				case NIL:
				case T:
				case REAL:
				case INT:
				case LC:
				case UC:
				case DIGIT:
				case LP:
					{
					setState(480); ((Macro_prognContext)_localctx).a = sexpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << SIMPLE_PUNC) | (1L << A_OPERATOR) | (1L << L_OPERATOR) | (1L << NIL) | (1L << T) | (1L << WSP) | (1L << REAL) | (1L << INT) | (1L << LC) | (1L << UC) | (1L << DIGIT) | (1L << LP))) != 0) );
			((Macro_prognContext)_localctx).type = ((Macro_prognContext)_localctx).a.type;
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

	public static class AlphaContext extends ParserRuleContext {
		public TerminalNode UC() { return getToken(JLispParser.UC, 0); }
		public TerminalNode DIGIT() { return getToken(JLispParser.DIGIT, 0); }
		public TerminalNode LC() { return getToken(JLispParser.LC, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JLispListener ) ((JLispListener)listener).exitAlpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JLispVisitor ) return ((JLispVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC) | (1L << UC) | (1L << DIGIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u01ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\5\2"+
		"U\n\2\3\3\3\3\3\3\3\3\3\3\5\3\\\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0084"+
		"\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u008e\n\16\3\17\3\17\3"+
		"\17\3\20\3\20\6\20\u0095\n\20\r\20\16\20\u0096\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00a1\n\21\3\22\5\22\u00a4\n\22\3\22\3\22\3\22\3"+
		"\22\7\22\u00aa\n\22\f\22\16\22\u00ad\13\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\5\24\u00b5\n\24\3\25\3\25\7\25\u00b9\n\25\f\25\16\25\u00bc\13\25\3"+
		"\25\5\25\u00bf\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d1\n\26\3\27\7\27\u00d4\n\27\f"+
		"\27\16\27\u00d7\13\27\3\27\3\27\7\27\u00db\n\27\f\27\16\27\u00de\13\27"+
		"\3\30\3\30\3\30\6\30\u00e3\n\30\r\30\16\30\u00e4\3\30\3\30\3\31\3\31\3"+
		"\31\6\31\u00ec\n\31\r\31\16\31\u00ed\3\31\3\31\3\32\3\32\5\32\u00f4\n"+
		"\32\3\33\7\33\u00f7\n\33\f\33\16\33\u00fa\13\33\3\33\3\33\7\33\u00fe\n"+
		"\33\f\33\16\33\u0101\13\33\3\33\3\33\7\33\u0105\n\33\f\33\16\33\u0108"+
		"\13\33\3\33\3\33\7\33\u010c\n\33\f\33\16\33\u010f\13\33\3\33\5\33\u0112"+
		"\n\33\3\33\7\33\u0115\n\33\f\33\16\33\u0118\13\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\7\37\u0121\n\37\f\37\16\37\u0124\13\37\3\37\3\37\3\37"+
		"\6\37\u0129\n\37\r\37\16\37\u012a\3\37\7\37\u012e\n\37\f\37\16\37\u0131"+
		"\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\5 \u0148\n \3!\7!\u014b\n!\f!\16!\u014e\13!\3!\3!\7!\u0152\n!\f!\16!"+
		"\u0155\13!\3!\3!\7!\u0159\n!\f!\16!\u015c\13!\3!\3!\7!\u0160\n!\f!\16"+
		"!\u0163\13!\3!\3!\3\"\7\"\u0168\n\"\f\"\16\"\u016b\13\"\3\"\3\"\7\"\u016f"+
		"\n\"\f\"\16\"\u0172\13\"\3\"\3\"\6\"\u0176\n\"\r\"\16\"\u0177\3\"\7\""+
		"\u017b\n\"\f\"\16\"\u017e\13\"\3\"\3\"\3#\7#\u0183\n#\f#\16#\u0186\13"+
		"#\3#\3#\7#\u018a\n#\f#\16#\u018d\13#\3#\3#\7#\u0191\n#\f#\16#\u0194\13"+
		"#\3#\3#\7#\u0198\n#\f#\16#\u019b\13#\3#\3#\3$\7$\u01a0\n$\f$\16$\u01a3"+
		"\13$\3$\3$\7$\u01a7\n$\f$\16$\u01aa\13$\3$\3$\5$\u01ae\n$\3$\7$\u01b1"+
		"\n$\f$\16$\u01b4\13$\3%\7%\u01b7\n%\f%\16%\u01ba\13%\3%\3%\7%\u01be\n"+
		"%\f%\16%\u01c1\13%\3%\3%\7%\u01c5\n%\f%\16%\u01c8\13%\3%\3%\3&\7&\u01cd"+
		"\n&\f&\16&\u01d0\13&\3&\3&\7&\u01d4\n&\f&\16&\u01d7\13&\3&\3&\3\'\7\'"+
		"\u01dc\n\'\f\'\16\'\u01df\13\'\3\'\3\'\3\'\6\'\u01e4\n\'\r\'\16\'\u01e5"+
		"\3\'\3\'\3(\3(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLN\2\n\4\2\3\3\7\7\4\2\b\b\r\r\4\2\4\4\6\6\4\2"+
		"\5\5\13\13\4\2\f\f\16\16\4\2\24\24\30\32\3\2\17\21\3\2\30\32\u020c\2T"+
		"\3\2\2\2\4[\3\2\2\2\6]\3\2\2\2\b_\3\2\2\2\na\3\2\2\2\fc\3\2\2\2\16e\3"+
		"\2\2\2\20m\3\2\2\2\22x\3\2\2\2\24\u0083\3\2\2\2\26\u0085\3\2\2\2\30\u0087"+
		"\3\2\2\2\32\u0089\3\2\2\2\34\u008f\3\2\2\2\36\u0092\3\2\2\2 \u00a0\3\2"+
		"\2\2\"\u00a3\3\2\2\2$\u00ae\3\2\2\2&\u00b4\3\2\2\2(\u00b6\3\2\2\2*\u00d0"+
		"\3\2\2\2,\u00d5\3\2\2\2.\u00df\3\2\2\2\60\u00e8\3\2\2\2\62\u00f3\3\2\2"+
		"\2\64\u00f8\3\2\2\2\66\u0119\3\2\2\28\u011b\3\2\2\2:\u011d\3\2\2\2<\u0122"+
		"\3\2\2\2>\u0147\3\2\2\2@\u014c\3\2\2\2B\u0169\3\2\2\2D\u0184\3\2\2\2F"+
		"\u01a1\3\2\2\2H\u01b8\3\2\2\2J\u01ce\3\2\2\2L\u01dd\3\2\2\2N\u01e9\3\2"+
		"\2\2PU\5\20\t\2QR\5\4\3\2RS\b\2\1\2SU\3\2\2\2TP\3\2\2\2TQ\3\2\2\2U\3\3"+
		"\2\2\2V\\\5\6\4\2W\\\5\b\5\2X\\\5\16\b\2Y\\\5\n\6\2Z\\\5\f\7\2[V\3\2\2"+
		"\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\5\3\2\2\2]^\t\2\2\2^\7\3"+
		"\2\2\2_`\t\3\2\2`\t\3\2\2\2ab\t\4\2\2b\13\3\2\2\2cd\t\5\2\2d\r\3\2\2\2"+
		"ef\t\6\2\2f\17\3\2\2\2gh\5\22\n\2hi\b\t\1\2in\3\2\2\2jk\5(\25\2kl\b\t"+
		"\1\2ln\3\2\2\2mg\3\2\2\2mj\3\2\2\2n\21\3\2\2\2op\5\24\13\2pq\b\n\1\2q"+
		"y\3\2\2\2rs\5\36\20\2st\b\n\1\2ty\3\2\2\2uv\5 \21\2vw\b\n\1\2wy\3\2\2"+
		"\2xo\3\2\2\2xr\3\2\2\2xu\3\2\2\2y\23\3\2\2\2z{\5\26\f\2{|\b\13\1\2|\u0084"+
		"\3\2\2\2}~\5\30\r\2~\177\b\13\1\2\177\u0084\3\2\2\2\u0080\u0081\5\32\16"+
		"\2\u0081\u0082\b\13\1\2\u0082\u0084\3\2\2\2\u0083z\3\2\2\2\u0083}\3\2"+
		"\2\2\u0083\u0080\3\2\2\2\u0084\25\3\2\2\2\u0085\u0086\7\27\2\2\u0086\27"+
		"\3\2\2\2\u0087\u0088\7\25\2\2\u0088\31\3\2\2\2\u0089\u008a\5\26\f\2\u008a"+
		"\u008b\7\t\2\2\u008b\u008d\5\26\f\2\u008c\u008e\5\34\17\2\u008d\u008c"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\33\3\2\2\2\u008f\u0090\7\26\2\2\u0090"+
		"\u0091\5\26\f\2\u0091\35\3\2\2\2\u0092\u0094\7\n\2\2\u0093\u0095\t\7\2"+
		"\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\n\2\2\u0099\37\3\2\2\2\u009a"+
		"\u009b\5\"\22\2\u009b\u009c\b\21\1\2\u009c\u00a1\3\2\2\2\u009d\u009e\5"+
		"&\24\2\u009e\u009f\b\21\1\2\u009f\u00a1\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0"+
		"\u009d\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a4\5$\23\2\u00a3\u00a2\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ab\5N(\2\u00a6\u00aa"+
		"\5N(\2\u00a7\u00aa\7\27\2\2\u00a8\u00aa\5$\23\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac#\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af"+
		"\t\b\2\2\u00af%\3\2\2\2\u00b0\u00b1\7\22\2\2\u00b1\u00b5\b\24\1\2\u00b2"+
		"\u00b3\7\23\2\2\u00b3\u00b5\b\24\1\2\u00b4\u00b0\3\2\2\2\u00b4\u00b2\3"+
		"\2\2\2\u00b5\'\3\2\2\2\u00b6\u00ba\7\33\2\2\u00b7\u00b9\7\24\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\5*\26\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\34"+
		"\2\2\u00c1\u00c2\b\25\1\2\u00c2)\3\2\2\2\u00c3\u00c4\5.\30\2\u00c4\u00c5"+
		"\b\26\1\2\u00c5\u00d1\3\2\2\2\u00c6\u00c7\5\60\31\2\u00c7\u00c8\b\26\1"+
		"\2\u00c8\u00d1\3\2\2\2\u00c9\u00d1\5\62\32\2\u00ca\u00cb\5> \2\u00cb\u00cc"+
		"\b\26\1\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce\5,\27\2\u00ce\u00cf\b\26\1\2"+
		"\u00cf\u00d1\3\2\2\2\u00d0\u00c3\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00c9"+
		"\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1+\3\2\2\2\u00d2"+
		"\u00d4\7\24\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00dc\7!\2\2\u00d9\u00db\7\24\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd-\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e2\7\20\2\2\u00e0\u00e3\7\24\2\2\u00e1\u00e3\5\20\t"+
		"\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\30\1\2"+
		"\u00e7/\3\2\2\2\u00e8\u00eb\7\21\2\2\u00e9\u00ec\7\24\2\2\u00ea\u00ec"+
		"\5\20\t\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0"+
		"\b\31\1\2\u00f0\61\3\2\2\2\u00f1\u00f4\5\64\33\2\u00f2\u00f4\5<\37\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\63\3\2\2\2\u00f5\u00f7\7\24\2"+
		"\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00ff\7\35\2\2"+
		"\u00fc\u00fe\7\24\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0106\5\66\34\2\u0103\u0105\7\24\2\2\u0104\u0103\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010d\58\35\2\u010a\u010c\7\24\2\2\u010b\u010a\3"+
		"\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\5:\36\2\u0111\u0110\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0116\3\2\2\2\u0113\u0115\7\24\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\65\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\5\20\t\2\u011a\67"+
		"\3\2\2\2\u011b\u011c\5\20\t\2\u011c9\3\2\2\2\u011d\u011e\5\20\t\2\u011e"+
		";\3\2\2\2\u011f\u0121\7\24\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0128\7 \2\2\u0126\u0129\7\24\2\2\u0127\u0129\5\20\t\2"+
		"\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012f\3\2\2\2\u012c\u012e\7\24\2\2"+
		"\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130=\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\5D#\2\u0133\u0134"+
		"\b \1\2\u0134\u0148\3\2\2\2\u0135\u0136\5H%\2\u0136\u0137\b \1\2\u0137"+
		"\u0148\3\2\2\2\u0138\u0139\5L\'\2\u0139\u013a\b \1\2\u013a\u0148\3\2\2"+
		"\2\u013b\u013c\5F$\2\u013c\u013d\b \1\2\u013d\u0148\3\2\2\2\u013e\u013f"+
		"\5J&\2\u013f\u0140\b \1\2\u0140\u0148\3\2\2\2\u0141\u0142\5@!\2\u0142"+
		"\u0143\b \1\2\u0143\u0148\3\2\2\2\u0144\u0145\5B\"\2\u0145\u0146\b \1"+
		"\2\u0146\u0148\3\2\2\2\u0147\u0132\3\2\2\2\u0147\u0135\3\2\2\2\u0147\u0138"+
		"\3\2\2\2\u0147\u013b\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u0141\3\2\2\2\u0147"+
		"\u0144\3\2\2\2\u0148?\3\2\2\2\u0149\u014b\7\24\2\2\u014a\u0149\3\2\2\2"+
		"\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0153\7\37\2\2\u0150\u0152\7\24\2\2"+
		"\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015a\5\20\t\2"+
		"\u0157\u0159\7\24\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u0161\5\20\t\2\u015e\u0160\7\24\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3"+
		"\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\b!\1\2\u0165A\3\2\2\2\u0166\u0168\7\24\2\2"+
		"\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0170\7\36\2\2"+
		"\u016d\u016f\7\24\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0175\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0176\7\24\2\2\u0174\u0176\5\20\t\2\u0175\u0173\3\2\2\2\u0175\u0174\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u017c\3\2\2\2\u0179\u017b\7\24\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3"+
		"\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0180\b\"\1\2\u0180C\3\2\2\2\u0181\u0183\7\24\2\2"+
		"\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018b\7\"\2\2\u0188"+
		"\u018a\7\24\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0192\5\"\22\2\u018f\u0191\7\24\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3"+
		"\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0199\5\20\t\2\u0196\u0198\7\24\2\2\u0197\u0196\3"+
		"\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\b#\1\2\u019dE\3\2\2\2\u019e"+
		"\u01a0\7\24\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a8\7#\2\2\u01a5\u01a7\7\24\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ad\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ae\5\36\20\2\u01ac\u01ae\5\20\t\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b2\3\2\2\2\u01af\u01b1\7\24\2\2"+
		"\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3G\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b7\7\24\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bf\7$\2\2\u01bc"+
		"\u01be\7\24\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3"+
		"\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c6\5\20\t\2\u01c3\u01c5\7\24\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3"+
		"\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01ca\b%\1\2\u01caI\3\2\2\2\u01cb\u01cd\7\24\2\2"+
		"\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d5\7%\2\2\u01d2"+
		"\u01d4\7\24\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3"+
		"\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01d9\b&\1\2\u01d9K\3\2\2\2\u01da\u01dc\7\24\2\2\u01db\u01da\3\2\2\2"+
		"\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e3\7&\2\2\u01e1\u01e4\7\24\2\2\u01e2"+
		"\u01e4\5\20\t\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3"+
		"\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e8\b\'\1\2\u01e8M\3\2\2\2\u01e9\u01ea\t\t\2\2\u01eaO\3\2\2\2<T[mx"+
		"\u0083\u008d\u0096\u00a0\u00a3\u00a9\u00ab\u00b4\u00ba\u00be\u00d0\u00d5"+
		"\u00dc\u00e2\u00e4\u00eb\u00ed\u00f3\u00f8\u00ff\u0106\u010d\u0111\u0116"+
		"\u0122\u0128\u012a\u012f\u0147\u014c\u0153\u015a\u0161\u0169\u0170\u0175"+
		"\u0177\u017c\u0184\u018b\u0192\u0199\u01a1\u01a8\u01ad\u01b2\u01b8\u01bf"+
		"\u01c6\u01ce\u01d5\u01dd\u01e3\u01e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}