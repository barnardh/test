// Generated from TestLexer.g4 by ANTLR 4.9.2

package com.example.test;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OUTPUT=1, PACKAGE=2, STRUCT=3, CLASS=4, LPAREN=5, RPAREN=6, LBRACE=7, 
		RBRACE=8, LBRACK=9, RBRACK=10, SEMI=11, COMMA=12, DOT=13, LIST=14, MAP=15, 
		ID=16, PACKAGE_NAME=17, ANNOTATION_NAME=18, BACKTICK=19, ASSIGN=20, GT=21, 
		LT=22, BANG=23, TILDE=24, QUESTION=25, COLON=26, EQUAL=27, LE=28, GE=29, 
		NOTEQUAL=30, AND=31, OR=32, INC=33, DEC=34, ADD=35, SUB=36, MUL=37, DIV=38, 
		BITAND=39, BITOR=40, CARET=41, MOD=42, ARROW=43, COLONCOLON=44, DOUBEQOATE=45, 
		AT=46, ELLIPSIS=47, WS=48, COMMENT=49, LINE_COMMENT=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OUTPUT", "PACKAGE", "STRUCT", "CLASS", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "LIST", "MAP", 
			"ID", "PACKAGE_NAME", "ANNOTATION_NAME", "BACKTICK", "ASSIGN", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"CARET", "MOD", "ARROW", "COLONCOLON", "DOUBEQOATE", "AT", "ELLIPSIS", 
			"WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'output'", "'package'", "'struct'", "'class'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'List'", "'Map'", null, null, 
			null, "'`'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
			"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
			"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'\"'", "'@'", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OUTPUT", "PACKAGE", "STRUCT", "CLASS", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "LIST", "MAP", 
			"ID", "PACKAGE_NAME", "ANNOTATION_NAME", "BACKTICK", "ASSIGN", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"CARET", "MOD", "ARROW", "COLONCOLON", "DOUBEQOATE", "AT", "ELLIPSIS", 
			"WS", "COMMENT", "LINE_COMMENT"
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


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TestLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0114\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\6\21\u00a0\n\21\r\21\16\21\u00a1\3\22\3\22\3"+
		"\22\7\22\u00a7\n\22\f\22\16\22\u00aa\13\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\6\61"+
		"\u00f6\n\61\r\61\16\61\u00f7\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0100"+
		"\n\62\f\62\16\62\u0103\13\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\7\63\u010e\n\63\f\63\16\63\u0111\13\63\3\63\3\63\3\u0101\2\64\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\5\t\2%%,,\63;>"+
		">@@C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0118\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\3g\3\2\2\2\5n\3\2\2\2\7v\3\2\2\2\t}\3\2\2\2\13\u0083\3\2\2\2\r"+
		"\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008b\3\2\2\2\25\u008d"+
		"\3\2\2\2\27\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3"+
		"\2\2\2\37\u009a\3\2\2\2!\u009f\3\2\2\2#\u00a3\3\2\2\2%\u00ab\3\2\2\2\'"+
		"\u00ae\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2/\u00b6\3\2"+
		"\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00bc\3\2\2\2\67\u00be\3\2\2"+
		"\29\u00c1\3\2\2\2;\u00c4\3\2\2\2=\u00c7\3\2\2\2?\u00ca\3\2\2\2A\u00cd"+
		"\3\2\2\2C\u00d0\3\2\2\2E\u00d3\3\2\2\2G\u00d6\3\2\2\2I\u00d8\3\2\2\2K"+
		"\u00da\3\2\2\2M\u00dc\3\2\2\2O\u00de\3\2\2\2Q\u00e0\3\2\2\2S\u00e2\3\2"+
		"\2\2U\u00e4\3\2\2\2W\u00e6\3\2\2\2Y\u00e9\3\2\2\2[\u00ec\3\2\2\2]\u00ee"+
		"\3\2\2\2_\u00f0\3\2\2\2a\u00f5\3\2\2\2c\u00fb\3\2\2\2e\u0109\3\2\2\2g"+
		"h\7q\2\2hi\7w\2\2ij\7v\2\2jk\7r\2\2kl\7w\2\2lm\7v\2\2m\4\3\2\2\2no\7r"+
		"\2\2op\7c\2\2pq\7e\2\2qr\7m\2\2rs\7c\2\2st\7i\2\2tu\7g\2\2u\6\3\2\2\2"+
		"vw\7u\2\2wx\7v\2\2xy\7t\2\2yz\7w\2\2z{\7e\2\2{|\7v\2\2|\b\3\2\2\2}~\7"+
		"e\2\2~\177\7n\2\2\177\u0080\7c\2\2\u0080\u0081\7u\2\2\u0081\u0082\7u\2"+
		"\2\u0082\n\3\2\2\2\u0083\u0084\7*\2\2\u0084\f\3\2\2\2\u0085\u0086\7+\2"+
		"\2\u0086\16\3\2\2\2\u0087\u0088\7}\2\2\u0088\20\3\2\2\2\u0089\u008a\7"+
		"\177\2\2\u008a\22\3\2\2\2\u008b\u008c\7]\2\2\u008c\24\3\2\2\2\u008d\u008e"+
		"\7_\2\2\u008e\26\3\2\2\2\u008f\u0090\7=\2\2\u0090\30\3\2\2\2\u0091\u0092"+
		"\7.\2\2\u0092\32\3\2\2\2\u0093\u0094\7\60\2\2\u0094\34\3\2\2\2\u0095\u0096"+
		"\7N\2\2\u0096\u0097\7k\2\2\u0097\u0098\7u\2\2\u0098\u0099\7v\2\2\u0099"+
		"\36\3\2\2\2\u009a\u009b\7O\2\2\u009b\u009c\7c\2\2\u009c\u009d\7r\2\2\u009d"+
		" \3\2\2\2\u009e\u00a0\t\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\"\3\2\2\2\u00a3\u00a8\5"+
		"!\21\2\u00a4\u00a5\7\60\2\2\u00a5\u00a7\5!\21\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9$\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00ab\u00ac\5]/\2\u00ac\u00ad\5!\21\2\u00ad&\3\2"+
		"\2\2\u00ae\u00af\7b\2\2\u00af(\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1*\3\2\2"+
		"\2\u00b2\u00b3\7@\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5.\3\2\2\2"+
		"\u00b6\u00b7\7#\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\7\u0080\2\2\u00b9\62"+
		"\3\2\2\2\u00ba\u00bb\7A\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd"+
		"\66\3\2\2\2\u00be\u00bf\7?\2\2\u00bf\u00c0\7?\2\2\u00c08\3\2\2\2\u00c1"+
		"\u00c2\7>\2\2\u00c2\u00c3\7?\2\2\u00c3:\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5"+
		"\u00c6\7?\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7#\2\2\u00c8\u00c9\7?\2\2\u00c9"+
		">\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7(\2\2\u00cc@\3\2\2\2\u00cd\u00ce"+
		"\7~\2\2\u00ce\u00cf\7~\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7-\2\2\u00d1\u00d2"+
		"\7-\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4\u00d5\7/\2\2\u00d5F\3"+
		"\2\2\2\u00d6\u00d7\7-\2\2\u00d7H\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9J\3\2"+
		"\2\2\u00da\u00db\7,\2\2\u00dbL\3\2\2\2\u00dc\u00dd\7\61\2\2\u00ddN\3\2"+
		"\2\2\u00de\u00df\7(\2\2\u00dfP\3\2\2\2\u00e0\u00e1\7~\2\2\u00e1R\3\2\2"+
		"\2\u00e2\u00e3\7`\2\2\u00e3T\3\2\2\2\u00e4\u00e5\7\'\2\2\u00e5V\3\2\2"+
		"\2\u00e6\u00e7\7/\2\2\u00e7\u00e8\7@\2\2\u00e8X\3\2\2\2\u00e9\u00ea\7"+
		"<\2\2\u00ea\u00eb\7<\2\2\u00ebZ\3\2\2\2\u00ec\u00ed\7$\2\2\u00ed\\\3\2"+
		"\2\2\u00ee\u00ef\7B\2\2\u00ef^\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2"+
		"\7\60\2\2\u00f2\u00f3\7\60\2\2\u00f3`\3\2\2\2\u00f4\u00f6\t\3\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\61\2\2\u00fab\3\2\2\2\u00fb\u00fc"+
		"\7\61\2\2\u00fc\u00fd\7,\2\2\u00fd\u0101\3\2\2\2\u00fe\u0100\13\2\2\2"+
		"\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u0102\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7,\2\2\u0105"+
		"\u0106\7\61\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\62\2\2\u0108d\3\2\2"+
		"\2\u0109\u010a\7\61\2\2\u010a\u010b\7\61\2\2\u010b\u010f\3\2\2\2\u010c"+
		"\u010e\n\4\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\b\63\2\2\u0113f\3\2\2\2\b\2\u00a1\u00a8\u00f7\u0101\u010f\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}