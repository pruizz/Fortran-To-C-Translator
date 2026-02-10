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
		LISTA=1, CODEBLOCK=2, LINKOK=3, LINKERR=4, H1=5, H2=6, H3=7, H4=8, H5=9, 
		H6=10, BLOCKQUOTE=11, LINE=12, TEXT=13, BOLD=14, ITAL=15, LN=16, LNCONTENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LISTA", "CODEBLOCK", "LINKOK", "LINKERR", "H1", "H2", "H3", "H4", "H5", 
			"H6", "BLOCKQUOTE", "LINE", "TEXT", "BOLD", "ITAL", "LN", "CONTENT", 
			"LNCONTENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LISTA", "CODEBLOCK", "LINKOK", "LINKERR", "H1", "H2", "H3", "H4", 
			"H5", "H6", "BLOCKQUOTE", "LINE", "TEXT", "BOLD", "ITAL", "LN", "LNCONTENT"
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
		case 0:
			LISTA_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			CODEBLOCK_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			LINKOK_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			LINKERR_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			H1_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			H2_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			H3_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			H4_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			H5_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			H6_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			BLOCKQUOTE_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			LINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			BOLD_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			ITAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			LN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LISTA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    String completo = getText();
			    String[] lineas = completo.split("\n");
			    if (lineas.length > 1)
			        System.out.println("<UL>");
			    else
			         System.out.print("<UL>");
			    for (String linea : lineas) {
			        if (!linea.trim().isEmpty()) {
			            String contenido = linea.substring(2).trim();
			            if (lineas.length > 1)
			                System.out.println("<LI>" + contenido + "</LI>");
			            else
			                 System.out.print("<LI>" + contenido + "</LI>");
			        }
			    }
			    System.out.print("</UL>");
			    System.out.println("");

			break;
		}
	}
	private void CODEBLOCK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    System.out.print("<code> <pre>" + getText().substring(3, getText().length() - 3) + "</pre> </code>");

			break;
		}
	}
	private void LINKOK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    String str = getText();
			    int corcheteCierre = str.indexOf(']');
			    int parentesisApertura = str.indexOf('(');
			    String texto = str.substring(1, corcheteCierre);
			    String url = str.substring(parentesisApertura + 1, str.length() - 1);
			    // Cambiado println por print para evitar el doble salto de línea
			    System.out.print("<A HREF=\"" + url + "\">" + texto + "</A>");

			break;
		}
	}
	private void LINKERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    String str = getText();
			    int corcheteCierre = str.indexOf(']');
			    int parentesisApertura = str.indexOf('(');
			    String texto = str.substring(1, corcheteCierre);
			    String url = str.substring(parentesisApertura + 1, str.length() - 1);
			    System.out.print("<A HREF=\"" + url + "\">" + texto + " (URL enlace aparentemente incorrecta)</A>");

			break;
		}
	}
	private void H1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("<H1>" + getText().substring(1).trim() + "</H1>");
			break;
		}
	}
	private void H2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("<H2>" + getText().substring(2).trim() + "</H2>");
			break;
		}
	}
	private void H3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("<H3>" + getText().substring(3).trim() + "</H3>");
			break;
		}
	}
	private void H4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("<H4>" + getText().substring(4).trim() + "</H4>");
			break;
		}
	}
	private void H5_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("<H5>" + getText().substring(5).trim() + "</H5>");
			break;
		}
	}
	private void H6_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("<H6>" + getText().substring(6).trim() + "</H6>");
			break;
		}
	}
	private void BLOCKQUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println("<blockquote>" + getText().substring(1).trim() + "</blockquote>");
			break;
		}
	}
	private void LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			System.out.print("<HR/>");
			break;
		}
	}
	private void TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			System.out.print(getText());
			break;
		}
	}
	private void BOLD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			System.out.print("<SPAN class=\"bold\">" + getText().substring(2, getText().length() - 2) + "</SPAN>");
			break;
		}
	}
	private void ITAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			System.out.print("<SPAN class=\"ital\">" + getText().substring(1, getText().length() - 1) + "</SPAN>");
			break;
		}
	}
	private void LN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			System.out.println();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u00f1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000,\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b"+
		"\u0001\n\u0001\f\u0001@\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001"+
		"\u0002\u0004\u0002^\b\u0002\u000b\u0002\f\u0002_\u0001\u0002\u0001\u0002"+
		"\u0004\u0002d\b\u0002\u000b\u0002\f\u0002e\u0004\u0002h\b\u0002\u000b"+
		"\u0002\f\u0002i\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c0\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00d5\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00e1\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u00e9\b\u0010\u000b\u0010\f"+
		"\u0010\u00ea\u0001\u0011\u0004\u0011\u00ee\b\u0011\u000b\u0011\f\u0011"+
		"\u00ef\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0000#\u0011\u0001\u0000"+
		"\u0004\u0001\u0000~~\u0003\u000009AZaz\u0005\u0000\t\t  09AZaz\u0003\u0000"+
		"\n\n\r\r))\u00fd\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003"+
		"1\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000\u0007n\u0001"+
		"\u0000\u0000\u0000\tv\u0001\u0000\u0000\u0000\u000b}\u0001\u0000\u0000"+
		"\u0000\r\u0085\u0001\u0000\u0000\u0000\u000f\u008e\u0001\u0000\u0000\u0000"+
		"\u0011\u0098\u0001\u0000\u0000\u0000\u0013\u00a3\u0001\u0000\u0000\u0000"+
		"\u0015\u00af\u0001\u0000\u0000\u0000\u0017\u00bf\u0001\u0000\u0000\u0000"+
		"\u0019\u00c3\u0001\u0000\u0000\u0000\u001b\u00d4\u0001\u0000\u0000\u0000"+
		"\u001d\u00e0\u0001\u0000\u0000\u0000\u001f\u00e4\u0001\u0000\u0000\u0000"+
		"!\u00e8\u0001\u0000\u0000\u0000#\u00ed\u0001\u0000\u0000\u0000%&\u0005"+
		"-\u0000\u0000&\'\u0005 \u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0003"+
		"!\u0010\u0000)*\u0005\n\u0000\u0000*,\u0001\u0000\u0000\u0000+%\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0000\u0000"+
		"\u00000\u0002\u0001\u0000\u0000\u000012\u0005~\u0000\u000023\u0005~\u0000"+
		"\u000034\u0005~\u0000\u00004>\u0001\u0000\u0000\u00005=\b\u0000\u0000"+
		"\u000067\u0005~\u0000\u000078\u0005~\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9=\b\u0000\u0000\u0000:;\u0005~\u0000\u0000;=\b\u0000\u0000\u0000<5\u0001"+
		"\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005~\u0000"+
		"\u0000BC\u0005~\u0000\u0000CD\u0005~\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0006\u0001\u0001\u0000F\u0004\u0001\u0000\u0000\u0000GH\u0005[\u0000"+
		"\u0000HI\u0003!\u0010\u0000IJ\u0005]\u0000\u0000JZ\u0005(\u0000\u0000"+
		"KL\u0005h\u0000\u0000LM\u0005t\u0000\u0000MN\u0005t\u0000\u0000NO\u0005"+
		"p\u0000\u0000OP\u0005:\u0000\u0000PQ\u0005/\u0000\u0000Q[\u0005/\u0000"+
		"\u0000RS\u0005h\u0000\u0000ST\u0005t\u0000\u0000TU\u0005t\u0000\u0000"+
		"UV\u0005p\u0000\u0000VW\u0005s\u0000\u0000WX\u0005:\u0000\u0000XY\u0005"+
		"/\u0000\u0000Y[\u0005/\u0000\u0000ZK\u0001\u0000\u0000\u0000ZR\u0001\u0000"+
		"\u0000\u0000[]\u0001\u0000\u0000\u0000\\^\u0007\u0001\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`g\u0001\u0000\u0000\u0000ac\u0005.\u0000\u0000"+
		"bd\u0007\u0001\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ga\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0005)\u0000\u0000lm\u0006\u0002\u0002\u0000m\u0006\u0001\u0000\u0000"+
		"\u0000no\u0005[\u0000\u0000op\u0003!\u0010\u0000pq\u0005]\u0000\u0000"+
		"qr\u0005(\u0000\u0000rs\u0003#\u0011\u0000st\u0005)\u0000\u0000tu\u0006"+
		"\u0003\u0003\u0000u\b\u0001\u0000\u0000\u0000vw\u0005#\u0000\u0000wx\u0005"+
		" \u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0003!\u0010\u0000z{\u0005\n"+
		"\u0000\u0000{|\u0006\u0004\u0004\u0000|\n\u0001\u0000\u0000\u0000}~\u0005"+
		"#\u0000\u0000~\u007f\u0005#\u0000\u0000\u007f\u0080\u0005 \u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0003!\u0010\u0000\u0082"+
		"\u0083\u0005\n\u0000\u0000\u0083\u0084\u0006\u0005\u0005\u0000\u0084\f"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005#\u0000\u0000\u0086\u0087\u0005"+
		"#\u0000\u0000\u0087\u0088\u0005#\u0000\u0000\u0088\u0089\u0005 \u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0003!\u0010\u0000"+
		"\u008b\u008c\u0005\n\u0000\u0000\u008c\u008d\u0006\u0006\u0006\u0000\u008d"+
		"\u000e\u0001\u0000\u0000\u0000\u008e\u008f\u0005#\u0000\u0000\u008f\u0090"+
		"\u0005#\u0000\u0000\u0090\u0091\u0005#\u0000\u0000\u0091\u0092\u0005#"+
		"\u0000\u0000\u0092\u0093\u0005 \u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0003!\u0010\u0000\u0095\u0096\u0005\n\u0000\u0000"+
		"\u0096\u0097\u0006\u0007\u0007\u0000\u0097\u0010\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005#\u0000\u0000\u0099\u009a\u0005#\u0000\u0000\u009a\u009b"+
		"\u0005#\u0000\u0000\u009b\u009c\u0005#\u0000\u0000\u009c\u009d\u0005#"+
		"\u0000\u0000\u009d\u009e\u0005 \u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0003!\u0010\u0000\u00a0\u00a1\u0005\n\u0000\u0000"+
		"\u00a1\u00a2\u0006\b\b\u0000\u00a2\u0012\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005#\u0000\u0000\u00a4\u00a5\u0005#\u0000\u0000\u00a5\u00a6\u0005"+
		"#\u0000\u0000\u00a6\u00a7\u0005#\u0000\u0000\u00a7\u00a8\u0005#\u0000"+
		"\u0000\u00a8\u00a9\u0005#\u0000\u0000\u00a9\u00aa\u0005 \u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003!\u0010\u0000\u00ac\u00ad"+
		"\u0005\n\u0000\u0000\u00ad\u00ae\u0006\t\t\u0000\u00ae\u0014\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005>\u0000\u0000\u00b0\u00b1\u0005 \u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003!\u0010\u0000\u00b3"+
		"\u00b4\u0005\n\u0000\u0000\u00b4\u00b5\u0006\n\n\u0000\u00b5\u0016\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005*\u0000\u0000\u00b7\u00b8\u0005*\u0000"+
		"\u0000\u00b8\u00c0\u0005*\u0000\u0000\u00b9\u00ba\u0005-\u0000\u0000\u00ba"+
		"\u00bb\u0005-\u0000\u0000\u00bb\u00c0\u0005-\u0000\u0000\u00bc\u00bd\u0005"+
		"_\u0000\u0000\u00bd\u00be\u0005_\u0000\u0000\u00be\u00c0\u0005_\u0000"+
		"\u0000\u00bf\u00b6\u0001\u0000\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0006\u000b\u000b\u0000\u00c2\u0018\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0003!\u0010\u0000\u00c4\u00c5\u0006\f\f\u0000\u00c5"+
		"\u001a\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005*\u0000\u0000\u00c7\u00c8"+
		"\u0005*\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003"+
		"!\u0010\u0000\u00ca\u00cb\u0005*\u0000\u0000\u00cb\u00cc\u0005*\u0000"+
		"\u0000\u00cc\u00d5\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005_\u0000\u0000"+
		"\u00ce\u00cf\u0005_\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0003!\u0010\u0000\u00d1\u00d2\u0005_\u0000\u0000\u00d2\u00d3\u0005"+
		"_\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00cd\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0006\r\r\u0000\u00d7\u001c\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005*\u0000\u0000\u00d9\u00da\u0003!\u0010\u0000\u00da"+
		"\u00db\u0005*\u0000\u0000\u00db\u00e1\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005_\u0000\u0000\u00dd\u00de\u0003!\u0010\u0000\u00de\u00df\u0005_"+
		"\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000"+
		"\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0006\u000e\u000e\u0000\u00e3\u001e\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005\n\u0000\u0000\u00e5\u00e6\u0006\u000f\u000f"+
		"\u0000\u00e6 \u0001\u0000\u0000\u0000\u00e7\u00e9\u0007\u0002\u0000\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\"\u0001\u0000\u0000\u0000\u00ec\u00ee\b\u0003\u0000\u0000\u00ed"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"$\u0001\u0000\u0000\u0000\r\u0000-<>Z_ei\u00bf\u00d4\u00e0\u00ea\u00ef"+
		"\u0010\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0002\u0002\u0001\u0003"+
		"\u0003\u0001\u0004\u0004\u0001\u0005\u0005\u0001\u0006\u0006\u0001\u0007"+
		"\u0007\u0001\b\b\u0001\t\t\u0001\n\n\u0001\u000b\u000b\u0001\f\f\u0001"+
		"\r\r\u0001\u000e\u000e\u0001\u000f\u000f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}