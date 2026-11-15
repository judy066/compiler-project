// Generated from C:/Users/lenovo/IdeaProjects/Compiler2/src/HtmlTemplate.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlTemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_OPEN=1, TAG_CLOSE=2, TAG_SLASH_CLOSE=3, TAG_END_PREFIX=4, TH_TEXT=5, 
		TH_EACH=6, TH_IF=7, TH_OBJECT=8, EQUALS=9, ATTR_VAL=10, TAG_NAME=11, TEXT_CONTENT=12, 
		WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAG_OPEN", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_END_PREFIX", "TH_TEXT", 
			"TH_EACH", "TH_IF", "TH_OBJECT", "EQUALS", "ATTR_VAL", "TAG_NAME", "TEXT_CONTENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'/>'", "'</'", "'th:text'", "'th:each'", "'th:if'", 
			"'th:object'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_OPEN", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_END_PREFIX", "TH_TEXT", 
			"TH_EACH", "TH_IF", "TH_OBJECT", "EQUALS", "ATTR_VAL", "TAG_NAME", "TEXT_CONTENT", 
			"WS"
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


	public HtmlTemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HtmlTemplate.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\ra\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t"+
		"J\b\t\n\t\f\tM\t\t\u0001\t\u0001\t\u0001\n\u0004\nR\b\n\u000b\n\f\nS\u0001"+
		"\u000b\u0004\u000bW\b\u000b\u000b\u000b\f\u000bX\u0001\f\u0004\f\\\b\f"+
		"\u000b\f\f\f]\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0004\u0003\u0000\n\n\r\r\"\""+
		"\u0005\u0000--09AZ__az\u0001\u0000<<\u0003\u0000\t\n\r\r  d\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000"+
		"\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007\"\u0001\u0000\u0000"+
		"\u0000\t%\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000\u0000\r5\u0001"+
		"\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000"+
		"\u0000\u0013G\u0001\u0000\u0000\u0000\u0015Q\u0001\u0000\u0000\u0000\u0017"+
		"V\u0001\u0000\u0000\u0000\u0019[\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"<\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005>\u0000"+
		"\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005/\u0000\u0000 "+
		"!\u0005>\u0000\u0000!\u0006\u0001\u0000\u0000\u0000\"#\u0005<\u0000\u0000"+
		"#$\u0005/\u0000\u0000$\b\u0001\u0000\u0000\u0000%&\u0005t\u0000\u0000"+
		"&\'\u0005h\u0000\u0000\'(\u0005:\u0000\u0000()\u0005t\u0000\u0000)*\u0005"+
		"e\u0000\u0000*+\u0005x\u0000\u0000+,\u0005t\u0000\u0000,\n\u0001\u0000"+
		"\u0000\u0000-.\u0005t\u0000\u0000./\u0005h\u0000\u0000/0\u0005:\u0000"+
		"\u000001\u0005e\u0000\u000012\u0005a\u0000\u000023\u0005c\u0000\u0000"+
		"34\u0005h\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005t\u0000\u0000"+
		"67\u0005h\u0000\u000078\u0005:\u0000\u000089\u0005i\u0000\u00009:\u0005"+
		"f\u0000\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005t\u0000\u0000<=\u0005"+
		"h\u0000\u0000=>\u0005:\u0000\u0000>?\u0005o\u0000\u0000?@\u0005b\u0000"+
		"\u0000@A\u0005j\u0000\u0000AB\u0005e\u0000\u0000BC\u0005c\u0000\u0000"+
		"CD\u0005t\u0000\u0000D\u0010\u0001\u0000\u0000\u0000EF\u0005=\u0000\u0000"+
		"F\u0012\u0001\u0000\u0000\u0000GK\u0005\"\u0000\u0000HJ\b\u0000\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000NO\u0005\"\u0000\u0000O\u0014\u0001\u0000\u0000\u0000"+
		"PR\u0007\u0001\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0016\u0001"+
		"\u0000\u0000\u0000UW\b\u0002\u0000\u0000VU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\u0018\u0001\u0000\u0000\u0000Z\\\u0007\u0003\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0006\f\u0000\u0000`\u001a"+
		"\u0001\u0000\u0000\u0000\u0005\u0000KSX]\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}