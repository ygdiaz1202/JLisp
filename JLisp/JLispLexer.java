// Generated from JLisp.g4 by ANTLR 4.2

  import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JLispLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, SIMPLE_PUNC=13, A_OPERATOR=14, L_OPERATOR=15, 
		NIL=16, T=17, WSP=18, REAL=19, E=20, INT=21, LC=22, UC=23, DIGIT=24, LP=25, 
		RP=26, IF=27, MAX=28, EXPT=29, LOOP=30, BREAK=31, SETF=32, QUOTE=33, PRINT=34, 
		READ=35, PROGN=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'--h'", "'--i'", "'--execute'", "'--interprete'", "'--help'", "'--compile'", 
		"'.'", "'\"'", "'--e'", "'--gbytecode'", "'--c'", "'--g'", "SIMPLE_PUNC", 
		"A_OPERATOR", "L_OPERATOR", "NIL", "T", "WSP", "REAL", "'E'", "INT", "LC", 
		"UC", "DIGIT", "'('", "')'", "'if'", "MAX", "EXPT", "LOOP", "BREAK", "SETF", 
		"QUOTE", "PRINT", "READ", "PROGN", "WS"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "SIMPLE_PUNC", "A_OPERATOR", "L_OPERATOR", "NIL", 
		"T", "WSP", "REAL", "E", "INT", "LC", "UC", "DIGIT", "LP", "RP", "IF", 
		"MAX", "EXPT", "LOOP", "BREAK", "SETF", "QUOTE", "PRINT", "READ", "PROGN", 
		"WS"
	};


	  int numOps = 1; //numero de operaciones, comienza en 1 porque al menos se carga el argumento del main
	  HashMap<String,VarInfo> memory = new HashMap<String, VarInfo>(); //mapea el ID con el numero para la variable local
	  int localVarNum = 1; // cantidad de variables locales.
	  boolean comand=false;


	public JLispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JLisp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0101\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\6"+
		"\23\u00a7\n\23\r\23\16\23\u00a8\3\24\6\24\u00ac\n\24\r\24\16\24\u00ad"+
		"\3\24\3\24\6\24\u00b2\n\24\r\24\16\24\u00b3\3\25\3\25\3\26\6\26\u00b9"+
		"\n\26\r\26\16\26\u00ba\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\6&\u00fc"+
		"\n&\r&\16&\u00fd\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\32\6\2\60\60<<^^a"+
		"a\5\2,-//\61\61\4\2PPpp\4\2KKkk\4\2NNnn\4\2VVvv\5\2\13\f\17\17\"\"\3\2"+
		"\62;\3\2c|\3\2C\\\4\2OOoo\4\2CCcc\4\2ZZzz\4\2GGgg\4\2RRrr\4\2QQqq\4\2"+
		"TTtt\4\2WWww\4\2UUuu\4\2HHhh\4\2SSss\4\2FFff\4\2IIii\4\2\13\13\"\"\u0105"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5Q\3\2\2\2\7U\3\2\2\2\t_\3\2\2\2\13"+
		"l\3\2\2\2\rs\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25\u0085"+
		"\3\2\2\2\27\u0091\3\2\2\2\31\u0095\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3"+
		"\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a3\3\2\2\2%\u00a6\3\2\2\2\'"+
		"\u00ab\3\2\2\2)\u00b5\3\2\2\2+\u00b8\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2"+
		"\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c4\3\2\2\2\67\u00c6\3\2\2"+
		"\29\u00c9\3\2\2\2;\u00cd\3\2\2\2=\u00d2\3\2\2\2?\u00d7\3\2\2\2A\u00de"+
		"\3\2\2\2C\u00e3\3\2\2\2E\u00e9\3\2\2\2G\u00ef\3\2\2\2I\u00f4\3\2\2\2K"+
		"\u00fb\3\2\2\2MN\7/\2\2NO\7/\2\2OP\7j\2\2P\4\3\2\2\2QR\7/\2\2RS\7/\2\2"+
		"ST\7k\2\2T\6\3\2\2\2UV\7/\2\2VW\7/\2\2WX\7g\2\2XY\7z\2\2YZ\7g\2\2Z[\7"+
		"e\2\2[\\\7w\2\2\\]\7v\2\2]^\7g\2\2^\b\3\2\2\2_`\7/\2\2`a\7/\2\2ab\7k\2"+
		"\2bc\7p\2\2cd\7v\2\2de\7g\2\2ef\7t\2\2fg\7r\2\2gh\7t\2\2hi\7g\2\2ij\7"+
		"v\2\2jk\7g\2\2k\n\3\2\2\2lm\7/\2\2mn\7/\2\2no\7j\2\2op\7g\2\2pq\7n\2\2"+
		"qr\7r\2\2r\f\3\2\2\2st\7/\2\2tu\7/\2\2uv\7e\2\2vw\7q\2\2wx\7o\2\2xy\7"+
		"r\2\2yz\7k\2\2z{\7n\2\2{|\7g\2\2|\16\3\2\2\2}~\7\60\2\2~\20\3\2\2\2\177"+
		"\u0080\7$\2\2\u0080\22\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7/\2\2\u0083"+
		"\u0084\7g\2\2\u0084\24\3\2\2\2\u0085\u0086\7/\2\2\u0086\u0087\7/\2\2\u0087"+
		"\u0088\7i\2\2\u0088\u0089\7d\2\2\u0089\u008a\7{\2\2\u008a\u008b\7v\2\2"+
		"\u008b\u008c\7g\2\2\u008c\u008d\7e\2\2\u008d\u008e\7q\2\2\u008e\u008f"+
		"\7f\2\2\u008f\u0090\7g\2\2\u0090\26\3\2\2\2\u0091\u0092\7/\2\2\u0092\u0093"+
		"\7/\2\2\u0093\u0094\7e\2\2\u0094\30\3\2\2\2\u0095\u0096\7/\2\2\u0096\u0097"+
		"\7/\2\2\u0097\u0098\7i\2\2\u0098\32\3\2\2\2\u0099\u009a\t\2\2\2\u009a"+
		"\34\3\2\2\2\u009b\u009c\t\3\2\2\u009c\36\3\2\2\2\u009d\u009e\4>@\2\u009e"+
		" \3\2\2\2\u009f\u00a0\t\4\2\2\u00a0\u00a1\t\5\2\2\u00a1\u00a2\t\6\2\2"+
		"\u00a2\"\3\2\2\2\u00a3\u00a4\t\7\2\2\u00a4$\3\2\2\2\u00a5\u00a7\t\b\2"+
		"\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9&\3\2\2\2\u00aa\u00ac\t\t\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\7\61\2\2\u00b0\u00b2\t\t\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4(\3\2\2\2"+
		"\u00b5\u00b6\7G\2\2\u00b6*\3\2\2\2\u00b7\u00b9\5\61\31\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		",\3\2\2\2\u00bc\u00bd\t\n\2\2\u00bd.\3\2\2\2\u00be\u00bf\t\13\2\2\u00bf"+
		"\60\3\2\2\2\u00c0\u00c1\t\t\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3"+
		"\64\3\2\2\2\u00c4\u00c5\7+\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7h\2\2\u00c88\3\2\2\2\u00c9\u00ca\t\f\2\2\u00ca\u00cb\t\r\2\2\u00cb"+
		"\u00cc\t\16\2\2\u00cc:\3\2\2\2\u00cd\u00ce\t\17\2\2\u00ce\u00cf\t\16\2"+
		"\2\u00cf\u00d0\t\20\2\2\u00d0\u00d1\t\7\2\2\u00d1<\3\2\2\2\u00d2\u00d3"+
		"\t\6\2\2\u00d3\u00d4\t\21\2\2\u00d4\u00d5\t\21\2\2\u00d5\u00d6\t\20\2"+
		"\2\u00d6>\3\2\2\2\u00d7\u00d8\t\22\2\2\u00d8\u00d9\t\17\2\2\u00d9\u00da"+
		"\t\7\2\2\u00da\u00db\t\23\2\2\u00db\u00dc\t\22\2\2\u00dc\u00dd\t\4\2\2"+
		"\u00dd@\3\2\2\2\u00de\u00df\t\24\2\2\u00df\u00e0\t\17\2\2\u00e0\u00e1"+
		"\t\7\2\2\u00e1\u00e2\t\25\2\2\u00e2B\3\2\2\2\u00e3\u00e4\t\26\2\2\u00e4"+
		"\u00e5\t\23\2\2\u00e5\u00e6\t\21\2\2\u00e6\u00e7\t\7\2\2\u00e7\u00e8\t"+
		"\17\2\2\u00e8D\3\2\2\2\u00e9\u00ea\t\20\2\2\u00ea\u00eb\t\22\2\2\u00eb"+
		"\u00ec\t\5\2\2\u00ec\u00ed\t\4\2\2\u00ed\u00ee\t\7\2\2\u00eeF\3\2\2\2"+
		"\u00ef\u00f0\t\22\2\2\u00f0\u00f1\t\17\2\2\u00f1\u00f2\t\r\2\2\u00f2\u00f3"+
		"\t\27\2\2\u00f3H\3\2\2\2\u00f4\u00f5\t\20\2\2\u00f5\u00f6\t\22\2\2\u00f6"+
		"\u00f7\t\21\2\2\u00f7\u00f8\t\30\2\2\u00f8\u00f9\t\4\2\2\u00f9J\3\2\2"+
		"\2\u00fa\u00fc\t\31\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\b&"+
		"\2\2\u0100L\3\2\2\2\b\2\u00a8\u00ad\u00b3\u00ba\u00fd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}