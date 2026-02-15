// Generated from C:/Users/cmhug/OneDrive/Escritorio/PL_Practica_ANTLR/Fortran-To-C-Translator/fortranTranslator/src/Translator.g4 by ANTLR 4.13.2
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
		PROGRAM=1, END=2, INTERFACE=3, SUBROUTINE=4, FUNCTION=5, INTEGER=6, REAL=7, 
		CHARACTER=8, PARAMETER=9, INTENT=10, IN=11, OUT=12, INOUT=13, CALL=14, 
		STRING_CONST=15, IDENT=16, NUM_REAL_CONST=17, NUM_INT_CONST=18, COMMENT=19, 
		LN=20, WS=21;
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
			null, "'PROGRAM'", "'END'", "'INTERFACE'", "'SUBROUTINE'", "'FUNCTION'", 
			"'INTEGER'", "'REAL'", "'CHARACTER'", "'PARAMETER'", "'INTENT'", "'IN'", 
			"'OUT'", "'INOUT'", "'CALL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "END", "INTERFACE", "SUBROUTINE", "FUNCTION", "INTEGER", 
			"REAL", "CHARACTER", "PARAMETER", "INTENT", "IN", "OUT", "INOUT", "CALL", 
			"STRING_CONST", "IDENT", "NUM_REAL_CONST", "NUM_INT_CONST", "COMMENT", 
			"LN", "WS"
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
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
		}
		public List<TerminalNode> NUM_INT_CONST() { return getTokens(TranslatorParser.NUM_INT_CONST); }
		public TerminalNode NUM_INT_CONST(int i) {
			return getToken(TranslatorParser.NUM_INT_CONST, i);
		}
		public List<TerminalNode> NUM_REAL_CONST() { return getTokens(TranslatorParser.NUM_REAL_CONST); }
		public TerminalNode NUM_REAL_CONST(int i) {
			return getToken(TranslatorParser.NUM_REAL_CONST, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(TranslatorParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(TranslatorParser.COMMENT, i);
		}
		public List<TerminalNode> PROGRAM() { return getTokens(TranslatorParser.PROGRAM); }
		public TerminalNode PROGRAM(int i) {
			return getToken(TranslatorParser.PROGRAM, i);
		}
		public List<TerminalNode> END() { return getTokens(TranslatorParser.END); }
		public TerminalNode END(int i) {
			return getToken(TranslatorParser.END, i);
		}
		public List<TerminalNode> LN() { return getTokens(TranslatorParser.LN); }
		public TerminalNode LN(int i) {
			return getToken(TranslatorParser.LN, i);
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2031622L) != 0)) ) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2031622L) != 0) );
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
		"\u0004\u0001\u0015\b\u0002\u0000\u0007\u0000\u0001\u0000\u0004\u0000\u0004"+
		"\b\u0000\u000b\u0000\f\u0000\u0005\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0002\u0000\u0001\u0002\u0010\u0014\u0007\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001"+
		"\u0000\u0000\u0000\u0004\u0005\u0001\u0000\u0000\u0000\u0005\u0003\u0001"+
		"\u0000\u0000\u0000\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001\u0001"+
		"\u0000\u0000\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}