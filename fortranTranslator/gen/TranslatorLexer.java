// Generated from /Users/zskyh/university/third-year/second-term/procesadores/Fortran-To-C-Translator/fortranTranslator/src/Translator.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TranslatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, END=2, INTERFACE=3, SUBROUTINE=4, FUNCTION=5, INTEGER=6, REAL=7, 
		CHARACTER=8, PARAMETER=9, INTENT=10, IN=11, OUT=12, INOUT=13, CALL=14, 
		IDENT=15, NUM_INT_CONST=16, NUM_REAL_CONST=17, LN=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "END", "INTERFACE", "SUBROUTINE", "FUNCTION", "INTEGER", "REAL", 
			"CHARACTER", "PARAMETER", "INTENT", "IN", "OUT", "INOUT", "CALL", "IDENT", 
			"NUM_INT_CONST", "NUM_REAL_CONST", "LN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END'", "'INTERFACE'", "'SUBROUTINE'", "'FUNCTION'", 
			"'INTEGER'", "'REAL'", "'CHARACTER'", "'PARAMETER'", "'INTENT'", "'IN'", 
			"'OUT'", "'INOUT'", "'CALL'", null, null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "END", "INTERFACE", "SUBROUTINE", "FUNCTION", "INTEGER", 
			"REAL", "CHARACTER", "PARAMETER", "INTENT", "IN", "OUT", "INOUT", "CALL", 
			"IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "LN"
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


	public TranslatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Translator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14:
			IDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			NUM_INT_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			NUM_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			LN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.print(getText());
			break;
		}
	}
	private void NUM_INT_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.print(getText());
			break;
		}
	}
	private void NUM_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.print(getText());
			break;
		}
	}
	private void LN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("");
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u00d3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u008c\b\u000e\n\u000e\f\u000e\u008f\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f\u0094\b\u000f\u0001\u000f"+
		"\u0004\u000f\u0097\b\u000f\u000b\u000f\f\u000f\u0098\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0003\u0010\u009e\b\u0010\u0001\u0010\u0004\u0010\u00a1"+
		"\b\u0010\u000b\u0010\f\u0010\u00a2\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00a7\b\u0010\u000b\u0010\f\u0010\u00a8\u0001\u0010\u0004\u0010\u00ac"+
		"\b\u0010\u000b\u0010\f\u0010\u00ad\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00b2\b\u0010\u0001\u0010\u0004\u0010\u00b5\b\u0010\u000b\u0010\f\u0010"+
		"\u00b6\u0001\u0010\u0004\u0010\u00ba\b\u0010\u000b\u0010\f\u0010\u00bb"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u00c0\b\u0010\u000b\u0010\f\u0010"+
		"\u00c1\u0001\u0010\u0001\u0010\u0003\u0010\u00c6\b\u0010\u0001\u0010\u0004"+
		"\u0010\u00c9\b\u0010\u000b\u0010\f\u0010\u00ca\u0003\u0010\u00cd\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000"+
		"\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0002\u0000A"+
		"Zaz\u0004\u000009AZ__az\u0001\u000009\u0002\u0000EEee\u00e1\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003"+
		"-\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007;\u0001"+
		"\u0000\u0000\u0000\tF\u0001\u0000\u0000\u0000\u000bO\u0001\u0000\u0000"+
		"\u0000\rW\u0001\u0000\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011"+
		"f\u0001\u0000\u0000\u0000\u0013p\u0001\u0000\u0000\u0000\u0015w\u0001"+
		"\u0000\u0000\u0000\u0017z\u0001\u0000\u0000\u0000\u0019~\u0001\u0000\u0000"+
		"\u0000\u001b\u0084\u0001\u0000\u0000\u0000\u001d\u0089\u0001\u0000\u0000"+
		"\u0000\u001f\u0093\u0001\u0000\u0000\u0000!\u009d\u0001\u0000\u0000\u0000"+
		"#\u00d0\u0001\u0000\u0000\u0000%&\u0005P\u0000\u0000&\'\u0005R\u0000\u0000"+
		"\'(\u0005O\u0000\u0000()\u0005G\u0000\u0000)*\u0005R\u0000\u0000*+\u0005"+
		"A\u0000\u0000+,\u0005M\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005"+
		"E\u0000\u0000./\u0005N\u0000\u0000/0\u0005D\u0000\u00000\u0004\u0001\u0000"+
		"\u0000\u000012\u0005I\u0000\u000023\u0005N\u0000\u000034\u0005T\u0000"+
		"\u000045\u0005E\u0000\u000056\u0005R\u0000\u000067\u0005F\u0000\u0000"+
		"78\u0005A\u0000\u000089\u0005C\u0000\u00009:\u0005E\u0000\u0000:\u0006"+
		"\u0001\u0000\u0000\u0000;<\u0005S\u0000\u0000<=\u0005U\u0000\u0000=>\u0005"+
		"B\u0000\u0000>?\u0005R\u0000\u0000?@\u0005O\u0000\u0000@A\u0005U\u0000"+
		"\u0000AB\u0005T\u0000\u0000BC\u0005I\u0000\u0000CD\u0005N\u0000\u0000"+
		"DE\u0005E\u0000\u0000E\b\u0001\u0000\u0000\u0000FG\u0005F\u0000\u0000"+
		"GH\u0005U\u0000\u0000HI\u0005N\u0000\u0000IJ\u0005C\u0000\u0000JK\u0005"+
		"T\u0000\u0000KL\u0005I\u0000\u0000LM\u0005O\u0000\u0000MN\u0005N\u0000"+
		"\u0000N\n\u0001\u0000\u0000\u0000OP\u0005I\u0000\u0000PQ\u0005N\u0000"+
		"\u0000QR\u0005T\u0000\u0000RS\u0005E\u0000\u0000ST\u0005G\u0000\u0000"+
		"TU\u0005E\u0000\u0000UV\u0005R\u0000\u0000V\f\u0001\u0000\u0000\u0000"+
		"WX\u0005R\u0000\u0000XY\u0005E\u0000\u0000YZ\u0005A\u0000\u0000Z[\u0005"+
		"L\u0000\u0000[\u000e\u0001\u0000\u0000\u0000\\]\u0005C\u0000\u0000]^\u0005"+
		"H\u0000\u0000^_\u0005A\u0000\u0000_`\u0005R\u0000\u0000`a\u0005A\u0000"+
		"\u0000ab\u0005C\u0000\u0000bc\u0005T\u0000\u0000cd\u0005E\u0000\u0000"+
		"de\u0005R\u0000\u0000e\u0010\u0001\u0000\u0000\u0000fg\u0005P\u0000\u0000"+
		"gh\u0005A\u0000\u0000hi\u0005R\u0000\u0000ij\u0005A\u0000\u0000jk\u0005"+
		"M\u0000\u0000kl\u0005E\u0000\u0000lm\u0005T\u0000\u0000mn\u0005E\u0000"+
		"\u0000no\u0005R\u0000\u0000o\u0012\u0001\u0000\u0000\u0000pq\u0005I\u0000"+
		"\u0000qr\u0005N\u0000\u0000rs\u0005T\u0000\u0000st\u0005E\u0000\u0000"+
		"tu\u0005N\u0000\u0000uv\u0005T\u0000\u0000v\u0014\u0001\u0000\u0000\u0000"+
		"wx\u0005I\u0000\u0000xy\u0005N\u0000\u0000y\u0016\u0001\u0000\u0000\u0000"+
		"z{\u0005O\u0000\u0000{|\u0005U\u0000\u0000|}\u0005T\u0000\u0000}\u0018"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005I\u0000\u0000\u007f\u0080\u0005N"+
		"\u0000\u0000\u0080\u0081\u0005O\u0000\u0000\u0081\u0082\u0005U\u0000\u0000"+
		"\u0082\u0083\u0005T\u0000\u0000\u0083\u001a\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005C\u0000\u0000\u0085\u0086\u0005A\u0000\u0000\u0086\u0087\u0005"+
		"L\u0000\u0000\u0087\u0088\u0005L\u0000\u0000\u0088\u001c\u0001\u0000\u0000"+
		"\u0000\u0089\u008d\u0007\u0000\u0000\u0000\u008a\u008c\u0007\u0001\u0000"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0006\u000e\u0000\u0000\u0091\u001e\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0005-\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0007\u0002\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0006\u000f\u0001\u0000\u009b \u0001\u0000\u0000\u0000\u009c"+
		"\u009e\u0005-\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00cc\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0007\u0002\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0005.\u0000\u0000\u00a5\u00a7\u0007\u0002\u0000\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00cd\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ac\u0007\u0002\u0000\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b1\u0007\u0003\u0000\u0000\u00b0\u00b2\u0005"+
		"-\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b5\u0007\u0002"+
		"\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00cd\u0001\u0000\u0000\u0000\u00b8\u00ba\u0007\u0002"+
		"\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0005.\u0000"+
		"\u0000\u00be\u00c0\u0007\u0002\u0000\u0000\u00bf\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c5\u0007\u0003\u0000\u0000\u00c4\u00c6\u0005-\u0000\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c9\u0007\u0002\u0000\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00a0\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ab\u0001\u0000\u0000\u0000\u00cc\u00b9\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0006\u0010\u0002\u0000"+
		"\u00cf\"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\n\u0000\u0000\u00d1"+
		"\u00d2\u0006\u0011\u0003\u0000\u00d2$\u0001\u0000\u0000\u0000\u000f\u0000"+
		"\u008d\u0093\u0098\u009d\u00a2\u00a8\u00ad\u00b1\u00b6\u00bb\u00c1\u00c5"+
		"\u00ca\u00cc\u0004\u0001\u000e\u0000\u0001\u000f\u0001\u0001\u0010\u0002"+
		"\u0001\u0011\u0003";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}