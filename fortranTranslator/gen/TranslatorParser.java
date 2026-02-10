// Generated from /Users/zskyh/university/third-year/second-term/procesadores/Fortran-To-C-Translator/fortranTranslator/src/Translator.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TranslatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LISTA=1, CODEBLOCK=2, LINKOK=3, LINKERR=4, H1=5, H2=6, H3=7, H4=8, H5=9, 
		H6=10, BLOCKQUOTE=11, LINE=12, TEXT=13, BOLD=14, ITAL=15, LN=16, LNCONTENT=17;
	public static final int
		RULE_axioma = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"axioma"
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

	@Override
	public String getGrammarFileName() { return "Translator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TranslatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AxiomaContext extends ParserRuleContext {
		public List<TerminalNode> H1() { return getTokens(TranslatorParser.H1); }
		public TerminalNode H1(int i) {
			return getToken(TranslatorParser.H1, i);
		}
		public List<TerminalNode> H2() { return getTokens(TranslatorParser.H2); }
		public TerminalNode H2(int i) {
			return getToken(TranslatorParser.H2, i);
		}
		public List<TerminalNode> H3() { return getTokens(TranslatorParser.H3); }
		public TerminalNode H3(int i) {
			return getToken(TranslatorParser.H3, i);
		}
		public List<TerminalNode> H4() { return getTokens(TranslatorParser.H4); }
		public TerminalNode H4(int i) {
			return getToken(TranslatorParser.H4, i);
		}
		public List<TerminalNode> H5() { return getTokens(TranslatorParser.H5); }
		public TerminalNode H5(int i) {
			return getToken(TranslatorParser.H5, i);
		}
		public List<TerminalNode> H6() { return getTokens(TranslatorParser.H6); }
		public TerminalNode H6(int i) {
			return getToken(TranslatorParser.H6, i);
		}
		public List<TerminalNode> BOLD() { return getTokens(TranslatorParser.BOLD); }
		public TerminalNode BOLD(int i) {
			return getToken(TranslatorParser.BOLD, i);
		}
		public List<TerminalNode> ITAL() { return getTokens(TranslatorParser.ITAL); }
		public TerminalNode ITAL(int i) {
			return getToken(TranslatorParser.ITAL, i);
		}
		public List<TerminalNode> LINE() { return getTokens(TranslatorParser.LINE); }
		public TerminalNode LINE(int i) {
			return getToken(TranslatorParser.LINE, i);
		}
		public List<TerminalNode> BLOCKQUOTE() { return getTokens(TranslatorParser.BLOCKQUOTE); }
		public TerminalNode BLOCKQUOTE(int i) {
			return getToken(TranslatorParser.BLOCKQUOTE, i);
		}
		public List<TerminalNode> LN() { return getTokens(TranslatorParser.LN); }
		public TerminalNode LN(int i) {
			return getToken(TranslatorParser.LN, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(TranslatorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(TranslatorParser.TEXT, i);
		}
		public List<TerminalNode> LINKOK() { return getTokens(TranslatorParser.LINKOK); }
		public TerminalNode LINKOK(int i) {
			return getToken(TranslatorParser.LINKOK, i);
		}
		public List<TerminalNode> LINKERR() { return getTokens(TranslatorParser.LINKERR); }
		public TerminalNode LINKERR(int i) {
			return getToken(TranslatorParser.LINKERR, i);
		}
		public List<TerminalNode> CODEBLOCK() { return getTokens(TranslatorParser.CODEBLOCK); }
		public TerminalNode CODEBLOCK(int i) {
			return getToken(TranslatorParser.CODEBLOCK, i);
		}
		public List<TerminalNode> LISTA() { return getTokens(TranslatorParser.LISTA); }
		public TerminalNode LISTA(int i) {
			return getToken(TranslatorParser.LISTA, i);
		}
		public AxiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axioma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterAxioma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitAxioma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitAxioma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxiomaContext axioma() throws RecognitionException {
		AxiomaContext _localctx = new AxiomaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_axioma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131070L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131070L) != 0) );
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
		"\u0004\u0001\u0011\b\u0002\u0000\u0007\u0000\u0001\u0000\u0004\u0000\u0004"+
		"\b\u0000\u000b\u0000\f\u0000\u0005\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0001\u0000\u0001\u0010\u0007\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001\u0000\u0000"+
		"\u0000\u0004\u0005\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000\u0000"+
		"\u0000\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000\u0000"+
		"\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}