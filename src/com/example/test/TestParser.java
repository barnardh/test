// Generated from TestParser.g4 by ANTLR 4.9.2

package com.example.test;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestParser extends Parser {
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
	public static final int
		RULE_parse = 0, RULE_statements = 1, RULE_outputDecl = 2, RULE_packageDecl = 3, 
		RULE_outputAnnotationDecl = 4, RULE_structAnnotationDecl = 5, RULE_classAnnotationDecl = 6, 
		RULE_structDecl = 7, RULE_variableDecl = 8, RULE_tagsDecl = 9, RULE_tagDecl = 10, 
		RULE_classDecl = 11, RULE_functionDeclType = 12, RULE_functionDecl = 13, 
		RULE_functionParameterDecl = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statements", "outputDecl", "packageDecl", "outputAnnotationDecl", 
			"structAnnotationDecl", "classAnnotationDecl", "structDecl", "variableDecl", 
			"tagsDecl", "tagDecl", "classDecl", "functionDeclType", "functionDecl", 
			"functionParameterDecl"
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

	@Override
	public String getGrammarFileName() { return "TestParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TestParser.EOF, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << PACKAGE) | (1L << ID) | (1L << ANNOTATION_NAME))) != 0)) {
				{
				{
				setState(30);
				statements();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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

	public static class StatementsContext extends ParserRuleContext {
		public OutputDeclContext outputDecl() {
			return getRuleContext(OutputDeclContext.class,0);
		}
		public PackageDeclContext packageDecl() {
			return getRuleContext(PackageDeclContext.class,0);
		}
		public StructDeclContext structDecl() {
			return getRuleContext(StructDeclContext.class,0);
		}
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				outputDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				packageDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				structDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				classDecl();
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

	public static class OutputDeclContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(TestParser.OUTPUT, 0); }
		public List<OutputAnnotationDeclContext> outputAnnotationDecl() {
			return getRuleContexts(OutputAnnotationDeclContext.class);
		}
		public OutputAnnotationDeclContext outputAnnotationDecl(int i) {
			return getRuleContext(OutputAnnotationDeclContext.class,i);
		}
		public OutputDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterOutputDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitOutputDecl(this);
		}
	}

	public final OutputDeclContext outputDecl() throws RecognitionException {
		OutputDeclContext _localctx = new OutputDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_outputDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(OUTPUT);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(45);
					outputAnnotationDecl();
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class PackageDeclContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(TestParser.PACKAGE, 0); }
		public TerminalNode PACKAGE_NAME() { return getToken(TestParser.PACKAGE_NAME, 0); }
		public PackageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterPackageDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitPackageDecl(this);
		}
	}

	public final PackageDeclContext packageDecl() throws RecognitionException {
		PackageDeclContext _localctx = new PackageDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packageDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PACKAGE);
			setState(52);
			match(PACKAGE_NAME);
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

	public static class OutputAnnotationDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ANNOTATION_NAME() { return getToken(TestParser.ANNOTATION_NAME, 0); }
		public OutputAnnotationDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputAnnotationDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterOutputAnnotationDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitOutputAnnotationDecl(this);
		}
	}

	public final OutputAnnotationDeclContext outputAnnotationDecl() throws RecognitionException {
		OutputAnnotationDeclContext _localctx = new OutputAnnotationDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_outputAnnotationDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((OutputAnnotationDeclContext)_localctx).name = match(ANNOTATION_NAME);
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

	public static class StructAnnotationDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ANNOTATION_NAME() { return getToken(TestParser.ANNOTATION_NAME, 0); }
		public StructAnnotationDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structAnnotationDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterStructAnnotationDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitStructAnnotationDecl(this);
		}
	}

	public final StructAnnotationDeclContext structAnnotationDecl() throws RecognitionException {
		StructAnnotationDeclContext _localctx = new StructAnnotationDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structAnnotationDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((StructAnnotationDeclContext)_localctx).name = match(ANNOTATION_NAME);
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

	public static class ClassAnnotationDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ANNOTATION_NAME() { return getToken(TestParser.ANNOTATION_NAME, 0); }
		public ClassAnnotationDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAnnotationDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterClassAnnotationDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitClassAnnotationDecl(this);
		}
	}

	public final ClassAnnotationDeclContext classAnnotationDecl() throws RecognitionException {
		ClassAnnotationDeclContext _localctx = new ClassAnnotationDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classAnnotationDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((ClassAnnotationDeclContext)_localctx).name = match(ANNOTATION_NAME);
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

	public static class StructDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STRUCT() { return getToken(TestParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(TestParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TestParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(TestParser.ID, 0); }
		public List<StructAnnotationDeclContext> structAnnotationDecl() {
			return getRuleContexts(StructAnnotationDeclContext.class);
		}
		public StructAnnotationDeclContext structAnnotationDecl(int i) {
			return getRuleContext(StructAnnotationDeclContext.class,i);
		}
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public StructDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterStructDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitStructDecl(this);
		}
	}

	public final StructDeclContext structDecl() throws RecognitionException {
		StructDeclContext _localctx = new StructDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(60);
					structAnnotationDecl();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(66);
			((StructDeclContext)_localctx).name = match(ID);
			setState(67);
			match(STRUCT);
			setState(68);
			match(LBRACE);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				variableDecl();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(74);
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

	public static class VariableDeclContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public List<TerminalNode> ID() { return getTokens(TestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TestParser.ID, i);
		}
		public TagsDeclContext tagsDecl() {
			return getRuleContext(TagsDeclContext.class,0);
		}
		public TerminalNode LIST() { return getToken(TestParser.LIST, 0); }
		public TerminalNode GT() { return getToken(TestParser.GT, 0); }
		public TerminalNode LT() { return getToken(TestParser.LT, 0); }
		public TerminalNode MAP() { return getToken(TestParser.MAP, 0); }
		public TerminalNode COMMA() { return getToken(TestParser.COMMA, 0); }
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitVariableDecl(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDecl);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				((VariableDeclContext)_localctx).name = match(ID);
				setState(77);
				((VariableDeclContext)_localctx).type = match(ID);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BACKTICK) {
					{
					setState(78);
					tagsDecl();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				((VariableDeclContext)_localctx).name = match(ID);
				setState(82);
				match(LIST);
				setState(83);
				match(GT);
				setState(84);
				((VariableDeclContext)_localctx).type = match(ID);
				setState(85);
				match(LT);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BACKTICK) {
					{
					setState(86);
					tagsDecl();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((VariableDeclContext)_localctx).name = match(ID);
				setState(90);
				match(MAP);
				setState(91);
				match(GT);
				setState(92);
				((VariableDeclContext)_localctx).type = match(ID);
				setState(93);
				match(COMMA);
				setState(94);
				match(ID);
				setState(95);
				match(LT);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BACKTICK) {
					{
					setState(96);
					tagsDecl();
					}
				}

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

	public static class TagsDeclContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK() { return getTokens(TestParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(TestParser.BACKTICK, i);
		}
		public List<TagDeclContext> tagDecl() {
			return getRuleContexts(TagDeclContext.class);
		}
		public TagDeclContext tagDecl(int i) {
			return getRuleContext(TagDeclContext.class,i);
		}
		public TagsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterTagsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitTagsDecl(this);
		}
	}

	public final TagsDeclContext tagsDecl() throws RecognitionException {
		TagsDeclContext _localctx = new TagsDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tagsDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(BACKTICK);
			{
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(102);
					tagDecl();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
			setState(108);
			match(BACKTICK);
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

	public static class TagDeclContext extends ParserRuleContext {
		public Token name;
		public Token vale;
		public TerminalNode COLON() { return getToken(TestParser.COLON, 0); }
		public List<TerminalNode> DOUBEQOATE() { return getTokens(TestParser.DOUBEQOATE); }
		public TerminalNode DOUBEQOATE(int i) {
			return getToken(TestParser.DOUBEQOATE, i);
		}
		public List<TerminalNode> ID() { return getTokens(TestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TestParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public TagDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterTagDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitTagDecl(this);
		}
	}

	public final TagDeclContext tagDecl() throws RecognitionException {
		TagDeclContext _localctx = new TagDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tagDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((TagDeclContext)_localctx).name = match(ID);
			setState(111);
			match(COLON);
			setState(112);
			match(DOUBEQOATE);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				((TagDeclContext)_localctx).vale = match(ID);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(114);
					match(COMMA);
					}
				}

				}
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(121);
			match(DOUBEQOATE);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode CLASS() { return getToken(TestParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(TestParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TestParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(TestParser.ID, 0); }
		public List<ClassAnnotationDeclContext> classAnnotationDecl() {
			return getRuleContexts(ClassAnnotationDeclContext.class);
		}
		public ClassAnnotationDeclContext classAnnotationDecl(int i) {
			return getRuleContext(ClassAnnotationDeclContext.class,i);
		}
		public List<FunctionDeclTypeContext> functionDeclType() {
			return getRuleContexts(FunctionDeclTypeContext.class);
		}
		public FunctionDeclTypeContext functionDeclType(int i) {
			return getRuleContext(FunctionDeclTypeContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(123);
					classAnnotationDecl();
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(129);
			((ClassDeclContext)_localctx).name = match(ID);
			setState(130);
			match(CLASS);
			setState(131);
			match(LBRACE);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(132);
				functionDeclType();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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

	public static class FunctionDeclTypeContext extends ParserRuleContext {
		public Token name;
		public TerminalNode COLON() { return getToken(TestParser.COLON, 0); }
		public TerminalNode ID() { return getToken(TestParser.ID, 0); }
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public FunctionDeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterFunctionDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitFunctionDeclType(this);
		}
	}

	public final FunctionDeclTypeContext functionDeclType() throws RecognitionException {
		FunctionDeclTypeContext _localctx = new FunctionDeclTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDeclType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((FunctionDeclTypeContext)_localctx).name = match(ID);
			setState(141);
			match(COLON);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					functionDecl();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public Token name;
		public Token returnType;
		public TerminalNode LPAREN() { return getToken(TestParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TestParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(TestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TestParser.ID, i);
		}
		public List<FunctionParameterDeclContext> functionParameterDecl() {
			return getRuleContexts(FunctionParameterDeclContext.class);
		}
		public FunctionParameterDeclContext functionParameterDecl(int i) {
			return getRuleContext(FunctionParameterDeclContext.class,i);
		}
		public TerminalNode COLON() { return getToken(TestParser.COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((FunctionDeclContext)_localctx).name = match(ID);
			setState(149);
			match(LPAREN);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(150);
					functionParameterDecl();
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(151);
						match(COMMA);
						}
					}

					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(159);
			match(RPAREN);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(160);
				match(COLON);
				setState(161);
				((FunctionDeclContext)_localctx).returnType = match(ID);
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

	public static class FunctionParameterDeclContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public List<TerminalNode> ID() { return getTokens(TestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TestParser.ID, i);
		}
		public FunctionParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).enterFunctionParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestParserListener ) ((TestParserListener)listener).exitFunctionParameterDecl(this);
		}
	}

	public final FunctionParameterDeclContext functionParameterDecl() throws RecognitionException {
		FunctionParameterDeclContext _localctx = new FunctionParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionParameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((FunctionParameterDeclContext)_localctx).name = match(ID);
			setState(165);
			((FunctionParameterDeclContext)_localctx).type = match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\7\4\61\n\4\f\4\16"+
		"\4\64\13\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\7\t@\n\t\f\t\16\tC"+
		"\13\t\3\t\3\t\3\t\3\t\6\tI\n\t\r\t\16\tJ\3\t\3\t\3\n\3\n\3\n\5\nR\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\nZ\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"d\n\n\5\nf\n\n\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\fv\n\f\6\fx\n\f\r\f\16\fy\3\f\3\f\3\r\7\r\177\n\r\f\r"+
		"\16\r\u0082\13\r\3\r\3\r\3\r\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\r"+
		"\3\r\3\16\3\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\17\3\17\3"+
		"\17\3\17\5\17\u009b\n\17\7\17\u009d\n\17\f\17\16\17\u00a0\13\17\3\17\3"+
		"\17\3\17\5\17\u00a5\n\17\3\20\3\20\3\20\3\20\7\62Ak\u0080\u009e\2\21\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u00af\2#\3\2\2\2\4,\3\2\2"+
		"\2\6.\3\2\2\2\b\65\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2\16<\3\2\2\2\20A\3\2\2"+
		"\2\22e\3\2\2\2\24g\3\2\2\2\26p\3\2\2\2\30\u0080\3\2\2\2\32\u008e\3\2\2"+
		"\2\34\u0096\3\2\2\2\36\u00a6\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#"+
		"!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(-\5\6\4"+
		"\2)-\5\b\5\2*-\5\20\t\2+-\5\30\r\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2"+
		"\2\2-\5\3\2\2\2.\62\7\3\2\2/\61\5\n\6\2\60/\3\2\2\2\61\64\3\2\2\2\62\63"+
		"\3\2\2\2\62\60\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\65\66\7\4\2\2\66\67"+
		"\7\23\2\2\67\t\3\2\2\289\7\24\2\29\13\3\2\2\2:;\7\24\2\2;\r\3\2\2\2<="+
		"\7\24\2\2=\17\3\2\2\2>@\5\f\7\2?>\3\2\2\2@C\3\2\2\2AB\3\2\2\2A?\3\2\2"+
		"\2BD\3\2\2\2CA\3\2\2\2DE\7\22\2\2EF\7\5\2\2FH\7\t\2\2GI\5\22\n\2HG\3\2"+
		"\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\n\2\2M\21\3\2\2\2NO\7"+
		"\22\2\2OQ\7\22\2\2PR\5\24\13\2QP\3\2\2\2QR\3\2\2\2Rf\3\2\2\2ST\7\22\2"+
		"\2TU\7\20\2\2UV\7\27\2\2VW\7\22\2\2WY\7\30\2\2XZ\5\24\13\2YX\3\2\2\2Y"+
		"Z\3\2\2\2Zf\3\2\2\2[\\\7\22\2\2\\]\7\21\2\2]^\7\27\2\2^_\7\22\2\2_`\7"+
		"\16\2\2`a\7\22\2\2ac\7\30\2\2bd\5\24\13\2cb\3\2\2\2cd\3\2\2\2df\3\2\2"+
		"\2eN\3\2\2\2eS\3\2\2\2e[\3\2\2\2f\23\3\2\2\2gk\7\25\2\2hj\5\26\f\2ih\3"+
		"\2\2\2jm\3\2\2\2kl\3\2\2\2ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\25\2\2o\25"+
		"\3\2\2\2pq\7\22\2\2qr\7\34\2\2rw\7/\2\2su\7\22\2\2tv\7\16\2\2ut\3\2\2"+
		"\2uv\3\2\2\2vx\3\2\2\2ws\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2"+
		"\2{|\7/\2\2|\27\3\2\2\2}\177\5\16\b\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7\22\2\2\u0084\u0085\7\6\2\2\u0085\u0089\7\t\2\2\u0086\u0088"+
		"\5\32\16\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d"+
		"\7\n\2\2\u008d\31\3\2\2\2\u008e\u008f\7\22\2\2\u008f\u0093\7\34\2\2\u0090"+
		"\u0092\5\34\17\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\33\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\7\22\2\2\u0097\u009e\7\7\2\2\u0098\u009a\5\36\20\2\u0099\u009b"+
		"\7\16\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2"+
		"\u009c\u0098\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\7\b\2\2\u00a2"+
		"\u00a3\7\34\2\2\u00a3\u00a5\7\22\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\7\22\2\2\u00a8"+
		"\37\3\2\2\2\24#,\62AJQYcekuy\u0080\u0089\u0093\u009a\u009e\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}