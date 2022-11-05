// Generated from C:/Users/AbiramiRamasundaram/IdeaProjects/db2lookExecutor/src/main/java/com/p3solutions/db2lookExecutor/parser\Db2Look.g4 by ANTLR 4.10.1
package com.p3solutions.db2lookExecutor.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Db2LookParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONNECT=1, TO=2, TYPE=3, SEQUENCE=4, CREATE=5, ALIAS=6, ALTER=7, INDEX=8, 
		LARGE=9, REGULAR=10, SYSTEM=11, USER=12, TEMPORARY=13, TABLESPACE=14, 
		SCHEMA=15, TABLE=16, ADD=17, PRIMARY_KEY=18, FOREIGN_KEY=19, DATABASE=20, 
		PARTITION=21, GROUP=22, UNIQUE=23, CHECK=24, GRANT=25, RESET=26, SET=27, 
		TRUSTED_CONTEXT=28, COMMIT=29, TERMINATE=30, BUFFERPOOL=31, STOGROUP=32, 
		OR_REPLACE=33, VIEW=34, PROCEDURE=35, FUNCTION=36, COMMENT=37, TRIGGER=38, 
		BEGIN=39, END=40, CONSTRAINT=41, AUDIT=42, POLICY=43, ROLE=44, LT_BRACKET=45, 
		RT_BRACKET=46, SYMBOL9=47, SLASH=48, SEMI_COLON=49, QUOTATION=50, COMMA=51, 
		SPACE=52, TAB=53, TAB1=54, TAB3=55, COMMENTS=56, SINGLE_COMMENTS=57, HASH_SKIPPER=58, 
		POINTER_SYMBOL=59, DOT=60, NUMS=61, NUMBER=62, EQUAL=63, OR_OPERATOR=64, 
		LT_SET_BRACKET=65, RT_SET_BRACKET=66, ASTRIEK=67, SMALLER_THAN=68, GREATER_THAN=69, 
		PERCENTAGE=70, PLUS=71, SUB=72, DOLLAR=73, EXCLAMATION=74, WORD=75, DIGIT=76, 
		LOWERCASE=77, UPPERCASE=78, COLON=79, QUESTION_MARK=80;
	public static final int
		RULE_fileHandler = 0, RULE_tabSpace = 1, RULE_connectStatement = 2, RULE_connectDbQuery = 3, 
		RULE_createDatabasePartitionGroupStatement = 4, RULE_createDbPartitionGroupQuery = 5, 
		RULE_createBufferPoolStatement = 6, RULE_createBufferPoolQuery = 7, RULE_mimicStorageGroupStatement = 8, 
		RULE_mimicStorageGroupQuery = 9, RULE_createTableSpaceStatement = 10, 
		RULE_createTableSpaceQuery = 11, RULE_mimicTableSpaceStatement = 12, RULE_mimicTableSpaceQuery = 13, 
		RULE_createSchemaStatement = 14, RULE_createSchemaQuery = 15, RULE_createTypeStatement = 16, 
		RULE_createTypeQuery = 17, RULE_createSequenceStatement = 18, RULE_createSequenceQuery = 19, 
		RULE_tableSegment = 20, RULE_commentQuery = 21, RULE_createTableQuery = 22, 
		RULE_alterTableAddPrimaryKeyQuery = 23, RULE_alterTableAddForeignKeyQuery = 24, 
		RULE_alterTableAddUniqueConstraintQuery = 25, RULE_alterTableAddCheckConstraintQuery = 26, 
		RULE_otherAlterQuery = 27, RULE_createIndexQuery = 28, RULE_setStatement = 29, 
		RULE_userDefinedFunctions = 30, RULE_createUDFQuery = 31, RULE_createViewStatement = 32, 
		RULE_createViewQuery = 33, RULE_aliasStatement = 34, RULE_aliasQuery = 35, 
		RULE_createStoredProcedureStatement = 36, RULE_createProcedureQuery = 37, 
		RULE_createTriggerStatement = 38, RULE_createTriggerQuery = 39, RULE_grantStatement = 40, 
		RULE_grantQuery = 41, RULE_terminateStatement = 42, RULE_space = 43, RULE_commitStatement = 44, 
		RULE_trustedContextStatement = 45, RULE_createAuditStatement = 46, RULE_createRoleStatement = 47, 
		RULE_fullNameModel = 48, RULE_databaseName = 49, RULE_schemaName = 50, 
		RULE_tableName = 51, RULE_name = 52, RULE_variable = 53, RULE_handle = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"fileHandler", "tabSpace", "connectStatement", "connectDbQuery", "createDatabasePartitionGroupStatement", 
			"createDbPartitionGroupQuery", "createBufferPoolStatement", "createBufferPoolQuery", 
			"mimicStorageGroupStatement", "mimicStorageGroupQuery", "createTableSpaceStatement", 
			"createTableSpaceQuery", "mimicTableSpaceStatement", "mimicTableSpaceQuery", 
			"createSchemaStatement", "createSchemaQuery", "createTypeStatement", 
			"createTypeQuery", "createSequenceStatement", "createSequenceQuery", 
			"tableSegment", "commentQuery", "createTableQuery", "alterTableAddPrimaryKeyQuery", 
			"alterTableAddForeignKeyQuery", "alterTableAddUniqueConstraintQuery", 
			"alterTableAddCheckConstraintQuery", "otherAlterQuery", "createIndexQuery", 
			"setStatement", "userDefinedFunctions", "createUDFQuery", "createViewStatement", 
			"createViewQuery", "aliasStatement", "aliasQuery", "createStoredProcedureStatement", 
			"createProcedureQuery", "createTriggerStatement", "createTriggerQuery", 
			"grantStatement", "grantQuery", "terminateStatement", "space", "commitStatement", 
			"trustedContextStatement", "createAuditStatement", "createRoleStatement", 
			"fullNameModel", "databaseName", "schemaName", "tableName", "name", "variable", 
			"handle"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'('", "')'", null, 
			null, "';'", null, null, null, null, null, null, null, null, null, "'=>'", 
			"'.'", null, null, "'='", "'|'", "'['", "']'", "'*'", "'<'", "'>'", "'%'", 
			"'+'", "'-'", "'$'", "'!'", null, null, null, null, "':'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONNECT", "TO", "TYPE", "SEQUENCE", "CREATE", "ALIAS", "ALTER", 
			"INDEX", "LARGE", "REGULAR", "SYSTEM", "USER", "TEMPORARY", "TABLESPACE", 
			"SCHEMA", "TABLE", "ADD", "PRIMARY_KEY", "FOREIGN_KEY", "DATABASE", "PARTITION", 
			"GROUP", "UNIQUE", "CHECK", "GRANT", "RESET", "SET", "TRUSTED_CONTEXT", 
			"COMMIT", "TERMINATE", "BUFFERPOOL", "STOGROUP", "OR_REPLACE", "VIEW", 
			"PROCEDURE", "FUNCTION", "COMMENT", "TRIGGER", "BEGIN", "END", "CONSTRAINT", 
			"AUDIT", "POLICY", "ROLE", "LT_BRACKET", "RT_BRACKET", "SYMBOL9", "SLASH", 
			"SEMI_COLON", "QUOTATION", "COMMA", "SPACE", "TAB", "TAB1", "TAB3", "COMMENTS", 
			"SINGLE_COMMENTS", "HASH_SKIPPER", "POINTER_SYMBOL", "DOT", "NUMS", "NUMBER", 
			"EQUAL", "OR_OPERATOR", "LT_SET_BRACKET", "RT_SET_BRACKET", "ASTRIEK", 
			"SMALLER_THAN", "GREATER_THAN", "PERCENTAGE", "PLUS", "SUB", "DOLLAR", 
			"EXCLAMATION", "WORD", "DIGIT", "LOWERCASE", "UPPERCASE", "COLON", "QUESTION_MARK"
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
	public String getGrammarFileName() { return "Db2Look.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Db2LookParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileHandlerContext extends ParserRuleContext {
		public CommitStatementContext commitStatement() {
			return getRuleContext(CommitStatementContext.class,0);
		}
		public List<ConnectStatementContext> connectStatement() {
			return getRuleContexts(ConnectStatementContext.class);
		}
		public ConnectStatementContext connectStatement(int i) {
			return getRuleContext(ConnectStatementContext.class,i);
		}
		public TerminateStatementContext terminateStatement() {
			return getRuleContext(TerminateStatementContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<CreateDatabasePartitionGroupStatementContext> createDatabasePartitionGroupStatement() {
			return getRuleContexts(CreateDatabasePartitionGroupStatementContext.class);
		}
		public CreateDatabasePartitionGroupStatementContext createDatabasePartitionGroupStatement(int i) {
			return getRuleContext(CreateDatabasePartitionGroupStatementContext.class,i);
		}
		public List<CreateBufferPoolStatementContext> createBufferPoolStatement() {
			return getRuleContexts(CreateBufferPoolStatementContext.class);
		}
		public CreateBufferPoolStatementContext createBufferPoolStatement(int i) {
			return getRuleContext(CreateBufferPoolStatementContext.class,i);
		}
		public List<MimicStorageGroupStatementContext> mimicStorageGroupStatement() {
			return getRuleContexts(MimicStorageGroupStatementContext.class);
		}
		public MimicStorageGroupStatementContext mimicStorageGroupStatement(int i) {
			return getRuleContext(MimicStorageGroupStatementContext.class,i);
		}
		public List<CreateTableSpaceStatementContext> createTableSpaceStatement() {
			return getRuleContexts(CreateTableSpaceStatementContext.class);
		}
		public CreateTableSpaceStatementContext createTableSpaceStatement(int i) {
			return getRuleContext(CreateTableSpaceStatementContext.class,i);
		}
		public List<MimicTableSpaceStatementContext> mimicTableSpaceStatement() {
			return getRuleContexts(MimicTableSpaceStatementContext.class);
		}
		public MimicTableSpaceStatementContext mimicTableSpaceStatement(int i) {
			return getRuleContext(MimicTableSpaceStatementContext.class,i);
		}
		public List<CreateRoleStatementContext> createRoleStatement() {
			return getRuleContexts(CreateRoleStatementContext.class);
		}
		public CreateRoleStatementContext createRoleStatement(int i) {
			return getRuleContext(CreateRoleStatementContext.class,i);
		}
		public List<CreateSchemaStatementContext> createSchemaStatement() {
			return getRuleContexts(CreateSchemaStatementContext.class);
		}
		public CreateSchemaStatementContext createSchemaStatement(int i) {
			return getRuleContext(CreateSchemaStatementContext.class,i);
		}
		public List<CreateTypeStatementContext> createTypeStatement() {
			return getRuleContexts(CreateTypeStatementContext.class);
		}
		public CreateTypeStatementContext createTypeStatement(int i) {
			return getRuleContext(CreateTypeStatementContext.class,i);
		}
		public List<CreateSequenceStatementContext> createSequenceStatement() {
			return getRuleContexts(CreateSequenceStatementContext.class);
		}
		public CreateSequenceStatementContext createSequenceStatement(int i) {
			return getRuleContext(CreateSequenceStatementContext.class,i);
		}
		public List<TableSegmentContext> tableSegment() {
			return getRuleContexts(TableSegmentContext.class);
		}
		public TableSegmentContext tableSegment(int i) {
			return getRuleContext(TableSegmentContext.class,i);
		}
		public List<AlterTableAddForeignKeyQueryContext> alterTableAddForeignKeyQuery() {
			return getRuleContexts(AlterTableAddForeignKeyQueryContext.class);
		}
		public AlterTableAddForeignKeyQueryContext alterTableAddForeignKeyQuery(int i) {
			return getRuleContext(AlterTableAddForeignKeyQueryContext.class,i);
		}
		public List<UserDefinedFunctionsContext> userDefinedFunctions() {
			return getRuleContexts(UserDefinedFunctionsContext.class);
		}
		public UserDefinedFunctionsContext userDefinedFunctions(int i) {
			return getRuleContext(UserDefinedFunctionsContext.class,i);
		}
		public List<CreateViewStatementContext> createViewStatement() {
			return getRuleContexts(CreateViewStatementContext.class);
		}
		public CreateViewStatementContext createViewStatement(int i) {
			return getRuleContext(CreateViewStatementContext.class,i);
		}
		public List<AliasStatementContext> aliasStatement() {
			return getRuleContexts(AliasStatementContext.class);
		}
		public AliasStatementContext aliasStatement(int i) {
			return getRuleContext(AliasStatementContext.class,i);
		}
		public List<CreateStoredProcedureStatementContext> createStoredProcedureStatement() {
			return getRuleContexts(CreateStoredProcedureStatementContext.class);
		}
		public CreateStoredProcedureStatementContext createStoredProcedureStatement(int i) {
			return getRuleContext(CreateStoredProcedureStatementContext.class,i);
		}
		public List<CreateTriggerStatementContext> createTriggerStatement() {
			return getRuleContexts(CreateTriggerStatementContext.class);
		}
		public CreateTriggerStatementContext createTriggerStatement(int i) {
			return getRuleContext(CreateTriggerStatementContext.class,i);
		}
		public List<CreateAuditStatementContext> createAuditStatement() {
			return getRuleContexts(CreateAuditStatementContext.class);
		}
		public CreateAuditStatementContext createAuditStatement(int i) {
			return getRuleContext(CreateAuditStatementContext.class,i);
		}
		public List<TrustedContextStatementContext> trustedContextStatement() {
			return getRuleContexts(TrustedContextStatementContext.class);
		}
		public TrustedContextStatementContext trustedContextStatement(int i) {
			return getRuleContext(TrustedContextStatementContext.class,i);
		}
		public List<GrantStatementContext> grantStatement() {
			return getRuleContexts(GrantStatementContext.class);
		}
		public GrantStatementContext grantStatement(int i) {
			return getRuleContext(GrantStatementContext.class,i);
		}
		public List<AlterTableAddCheckConstraintQueryContext> alterTableAddCheckConstraintQuery() {
			return getRuleContexts(AlterTableAddCheckConstraintQueryContext.class);
		}
		public AlterTableAddCheckConstraintQueryContext alterTableAddCheckConstraintQuery(int i) {
			return getRuleContext(AlterTableAddCheckConstraintQueryContext.class,i);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public FileHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterFileHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitFileHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitFileHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileHandlerContext fileHandler() throws RecognitionException {
		FileHandlerContext _localctx = new FileHandlerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fileHandler);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					tabSpace();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(116);
							tabSpace();
							}
							} 
						}
						setState(121);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(122);
						connectStatement();
						}
						break;
					case 2:
						{
						setState(123);
						createDatabasePartitionGroupStatement();
						}
						break;
					case 3:
						{
						setState(124);
						createBufferPoolStatement();
						}
						break;
					case 4:
						{
						setState(125);
						mimicStorageGroupStatement();
						}
						break;
					case 5:
						{
						setState(126);
						createTableSpaceStatement();
						}
						break;
					case 6:
						{
						setState(127);
						mimicTableSpaceStatement();
						}
						break;
					case 7:
						{
						setState(128);
						createRoleStatement();
						}
						break;
					case 8:
						{
						setState(129);
						createSchemaStatement();
						}
						break;
					case 9:
						{
						setState(130);
						createTypeStatement();
						}
						break;
					case 10:
						{
						setState(131);
						createSequenceStatement();
						}
						break;
					case 11:
						{
						setState(132);
						tableSegment();
						}
						break;
					case 12:
						{
						setState(133);
						alterTableAddForeignKeyQuery();
						}
						break;
					case 13:
						{
						{
						setState(143);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(137);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(134);
										tabSpace();
										}
										} 
									}
									setState(139);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
								}
								setState(140);
								setStatement();
								}
								} 
							}
							setState(145);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						}
						{
						setState(146);
						alterTableAddCheckConstraintQuery();
						}
						}
						}
						break;
					case 14:
						{
						setState(147);
						userDefinedFunctions();
						}
						break;
					case 15:
						{
						setState(148);
						createViewStatement();
						}
						break;
					case 16:
						{
						setState(149);
						aliasStatement();
						}
						break;
					case 17:
						{
						setState(150);
						createStoredProcedureStatement();
						}
						break;
					case 18:
						{
						setState(151);
						createTriggerStatement();
						}
						break;
					case 19:
						{
						setState(152);
						createAuditStatement();
						}
						break;
					case 20:
						{
						setState(153);
						trustedContextStatement();
						}
						break;
					case 21:
						{
						setState(154);
						grantStatement();
						}
						break;
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(157);
							tabSpace();
							}
							} 
						}
						setState(162);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					tabSpace();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(174);
			commitStatement();
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					tabSpace();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(181);
			connectStatement();
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					tabSpace();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(188);
			terminateStatement();
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

	public static class TabSpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(Db2LookParser.SPACE, 0); }
		public TerminalNode TAB() { return getToken(Db2LookParser.TAB, 0); }
		public TerminalNode TAB1() { return getToken(Db2LookParser.TAB1, 0); }
		public TerminalNode TAB3() { return getToken(Db2LookParser.TAB3, 0); }
		public TabSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabSpace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTabSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTabSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTabSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabSpaceContext tabSpace() throws RecognitionException {
		TabSpaceContext _localctx = new TabSpaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tabSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ConnectStatementContext extends ParserRuleContext {
		public ConnectDbQueryContext connectDbQuery() {
			return getRuleContext(ConnectDbQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public ConnectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterConnectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitConnectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitConnectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectStatementContext connectStatement() throws RecognitionException {
		ConnectStatementContext _localctx = new ConnectStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_connectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(192);
				tabSpace();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			connectDbQuery();
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

	public static class ConnectDbQueryContext extends ParserRuleContext {
		public TerminalNode CONNECT() { return getToken(Db2LookParser.CONNECT, 0); }
		public TerminalNode TO() { return getToken(Db2LookParser.TO, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(Db2LookParser.SEMI_COLON, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode RESET() { return getToken(Db2LookParser.RESET, 0); }
		public ConnectDbQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectDbQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterConnectDbQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitConnectDbQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitConnectDbQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectDbQueryContext connectDbQuery() throws RecognitionException {
		ConnectDbQueryContext _localctx = new ConnectDbQueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_connectDbQuery);
		int _la;
		try {
			int _alt;
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(200);
				match(CONNECT);
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(201);
					tabSpace();
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				setState(206);
				match(TO);
				setState(208); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(207);
						tabSpace();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(210); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(212);
				fullNameModel();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(213);
					tabSpace();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(SEMI_COLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(221);
				match(CONNECT);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(222);
					tabSpace();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(RESET);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(229);
					tabSpace();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(SEMI_COLON);
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

	public static class CreateDatabasePartitionGroupStatementContext extends ParserRuleContext {
		public CreateDbPartitionGroupQueryContext createDbPartitionGroupQuery() {
			return getRuleContext(CreateDbPartitionGroupQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateDatabasePartitionGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabasePartitionGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateDatabasePartitionGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateDatabasePartitionGroupStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateDatabasePartitionGroupStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabasePartitionGroupStatementContext createDatabasePartitionGroupStatement() throws RecognitionException {
		CreateDatabasePartitionGroupStatementContext _localctx = new CreateDatabasePartitionGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createDatabasePartitionGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(238);
				tabSpace();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			createDbPartitionGroupQuery();
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

	public static class CreateDbPartitionGroupQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(Db2LookParser.DATABASE, 0); }
		public TerminalNode PARTITION() { return getToken(Db2LookParser.PARTITION, 0); }
		public TerminalNode GROUP() { return getToken(Db2LookParser.GROUP, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateDbPartitionGroupQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDbPartitionGroupQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateDbPartitionGroupQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateDbPartitionGroupQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateDbPartitionGroupQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDbPartitionGroupQueryContext createDbPartitionGroupQuery() throws RecognitionException {
		CreateDbPartitionGroupQueryContext _localctx = new CreateDbPartitionGroupQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createDbPartitionGroupQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(CREATE);
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				tabSpace();
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(252);
			match(DATABASE);
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				tabSpace();
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(258);
			match(PARTITION);
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				tabSpace();
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(264);
			match(GROUP);
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(270);
			match(SEMI_COLON);
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

	public static class CreateBufferPoolStatementContext extends ParserRuleContext {
		public CreateBufferPoolQueryContext createBufferPoolQuery() {
			return getRuleContext(CreateBufferPoolQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateBufferPoolStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createBufferPoolStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateBufferPoolStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateBufferPoolStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateBufferPoolStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateBufferPoolStatementContext createBufferPoolStatement() throws RecognitionException {
		CreateBufferPoolStatementContext _localctx = new CreateBufferPoolStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createBufferPoolStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(272);
				tabSpace();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			createBufferPoolQuery();
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

	public static class CreateBufferPoolQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode BUFFERPOOL() { return getToken(Db2LookParser.BUFFERPOOL, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateBufferPoolQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createBufferPoolQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateBufferPoolQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateBufferPoolQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateBufferPoolQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateBufferPoolQueryContext createBufferPoolQuery() throws RecognitionException {
		CreateBufferPoolQueryContext _localctx = new CreateBufferPoolQueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createBufferPoolQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(CREATE);
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				tabSpace();
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(286);
			match(BUFFERPOOL);
			setState(288); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(287);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(290); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(292);
			fullNameModel();
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(298);
			match(SEMI_COLON);
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

	public static class MimicStorageGroupStatementContext extends ParserRuleContext {
		public MimicStorageGroupQueryContext mimicStorageGroupQuery() {
			return getRuleContext(MimicStorageGroupQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public MimicStorageGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mimicStorageGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterMimicStorageGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitMimicStorageGroupStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitMimicStorageGroupStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MimicStorageGroupStatementContext mimicStorageGroupStatement() throws RecognitionException {
		MimicStorageGroupStatementContext _localctx = new MimicStorageGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mimicStorageGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(300);
				tabSpace();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			mimicStorageGroupQuery();
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

	public static class MimicStorageGroupQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode STOGROUP() { return getToken(Db2LookParser.STOGROUP, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public MimicStorageGroupQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mimicStorageGroupQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterMimicStorageGroupQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitMimicStorageGroupQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitMimicStorageGroupQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MimicStorageGroupQueryContext mimicStorageGroupQuery() throws RecognitionException {
		MimicStorageGroupQueryContext _localctx = new MimicStorageGroupQueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mimicStorageGroupQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ALTER);
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309);
				tabSpace();
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(314);
			match(STOGROUP);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(315);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(SEMI_COLON);
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

	public static class CreateTableSpaceStatementContext extends ParserRuleContext {
		public CreateTableSpaceQueryContext createTableSpaceQuery() {
			return getRuleContext(CreateTableSpaceQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateTableSpaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTableSpaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTableSpaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTableSpaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableSpaceStatementContext createTableSpaceStatement() throws RecognitionException {
		CreateTableSpaceStatementContext _localctx = new CreateTableSpaceStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createTableSpaceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(323);
				tabSpace();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			createTableSpaceQuery();
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

	public static class CreateTableSpaceQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public List<TerminalNode> TABLESPACE() { return getTokens(Db2LookParser.TABLESPACE); }
		public TerminalNode TABLESPACE(int i) {
			return getToken(Db2LookParser.TABLESPACE, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public TerminalNode REGULAR() { return getToken(Db2LookParser.REGULAR, 0); }
		public TerminalNode LARGE() { return getToken(Db2LookParser.LARGE, 0); }
		public TerminalNode TEMPORARY() { return getToken(Db2LookParser.TEMPORARY, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode USER() { return getToken(Db2LookParser.USER, 0); }
		public CreateTableSpaceQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpaceQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTableSpaceQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTableSpaceQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTableSpaceQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableSpaceQueryContext createTableSpaceQuery() throws RecognitionException {
		CreateTableSpaceQueryContext _localctx = new CreateTableSpaceQueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableSpaceQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(CREATE);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					tabSpace();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USER) {
				{
				setState(338);
				match(USER);
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(341);
				tabSpace();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LARGE) | (1L << REGULAR) | (1L << TEMPORARY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					tabSpace();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(355); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(354);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TABLESPACE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(359);
			match(TABLESPACE);
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(365);
			match(SEMI_COLON);
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

	public static class MimicTableSpaceStatementContext extends ParserRuleContext {
		public MimicTableSpaceQueryContext mimicTableSpaceQuery() {
			return getRuleContext(MimicTableSpaceQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public MimicTableSpaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mimicTableSpaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterMimicTableSpaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitMimicTableSpaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitMimicTableSpaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MimicTableSpaceStatementContext mimicTableSpaceStatement() throws RecognitionException {
		MimicTableSpaceStatementContext _localctx = new MimicTableSpaceStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mimicTableSpaceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(367);
				tabSpace();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			mimicTableSpaceQuery();
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

	public static class MimicTableSpaceQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLESPACE() { return getToken(Db2LookParser.TABLESPACE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public MimicTableSpaceQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mimicTableSpaceQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterMimicTableSpaceQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitMimicTableSpaceQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitMimicTableSpaceQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MimicTableSpaceQueryContext mimicTableSpaceQuery() throws RecognitionException {
		MimicTableSpaceQueryContext _localctx = new MimicTableSpaceQueryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mimicTableSpaceQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(ALTER);
			setState(377); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(376);
				tabSpace();
				}
				}
				setState(379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(381);
			match(TABLESPACE);
			setState(383); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(382);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(387);
			match(SEMI_COLON);
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

	public static class CreateSchemaStatementContext extends ParserRuleContext {
		public CreateSchemaQueryContext createSchemaQuery() {
			return getRuleContext(CreateSchemaQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateSchemaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSchemaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateSchemaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateSchemaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateSchemaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSchemaStatementContext createSchemaStatement() throws RecognitionException {
		CreateSchemaStatementContext _localctx = new CreateSchemaStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_createSchemaStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(389);
				tabSpace();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			createSchemaQuery();
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

	public static class CreateSchemaQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(Db2LookParser.SCHEMA, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateSchemaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSchemaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateSchemaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateSchemaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateSchemaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSchemaQueryContext createSchemaQuery() throws RecognitionException {
		CreateSchemaQueryContext _localctx = new CreateSchemaQueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_createSchemaQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(CREATE);
			setState(399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(398);
				tabSpace();
				}
				}
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(403);
			match(SCHEMA);
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(404);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(409);
			match(SEMI_COLON);
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

	public static class CreateTypeStatementContext extends ParserRuleContext {
		public CreateTypeQueryContext createTypeQuery() {
			return getRuleContext(CreateTypeQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateTypeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTypeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTypeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTypeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTypeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTypeStatementContext createTypeStatement() throws RecognitionException {
		CreateTypeStatementContext _localctx = new CreateTypeStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_createTypeStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(411);
							tabSpace();
							}
							} 
						}
						setState(416);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					}
					setState(417);
					setStatement();
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(423);
				tabSpace();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			createTypeQuery();
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

	public static class CreateTypeQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode TYPE() { return getToken(Db2LookParser.TYPE, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateTypeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTypeQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTypeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTypeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTypeQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTypeQueryContext createTypeQuery() throws RecognitionException {
		CreateTypeQueryContext _localctx = new CreateTypeQueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_createTypeQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(CREATE);
			setState(433); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(432);
				tabSpace();
				}
				}
				setState(435); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(437);
			match(TYPE);
			setState(439); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(438);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(441); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(443);
			fullNameModel();
			setState(445); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(444);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(449);
			match(SEMI_COLON);
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

	public static class CreateSequenceStatementContext extends ParserRuleContext {
		public CreateSequenceQueryContext createSequenceQuery() {
			return getRuleContext(CreateSequenceQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateSequenceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSequenceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateSequenceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateSequenceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateSequenceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSequenceStatementContext createSequenceStatement() throws RecognitionException {
		CreateSequenceStatementContext _localctx = new CreateSequenceStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_createSequenceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(451);
				tabSpace();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			createSequenceQuery();
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

	public static class CreateSequenceQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode SEQUENCE() { return getToken(Db2LookParser.SEQUENCE, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateSequenceQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSequenceQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateSequenceQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateSequenceQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateSequenceQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSequenceQueryContext createSequenceQuery() throws RecognitionException {
		CreateSequenceQueryContext _localctx = new CreateSequenceQueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_createSequenceQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(CREATE);
			setState(461); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(460);
				tabSpace();
				}
				}
				setState(463); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(465);
			match(SEQUENCE);
			setState(467); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(466);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(469); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(471);
			fullNameModel();
			setState(473); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(472);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(477);
			match(SEMI_COLON);
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

	public static class TableSegmentContext extends ParserRuleContext {
		public CreateTableQueryContext createTableQuery() {
			return getRuleContext(CreateTableQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<CommentQueryContext> commentQuery() {
			return getRuleContexts(CommentQueryContext.class);
		}
		public CommentQueryContext commentQuery(int i) {
			return getRuleContext(CommentQueryContext.class,i);
		}
		public List<AlterTableAddPrimaryKeyQueryContext> alterTableAddPrimaryKeyQuery() {
			return getRuleContexts(AlterTableAddPrimaryKeyQueryContext.class);
		}
		public AlterTableAddPrimaryKeyQueryContext alterTableAddPrimaryKeyQuery(int i) {
			return getRuleContext(AlterTableAddPrimaryKeyQueryContext.class,i);
		}
		public List<AlterTableAddUniqueConstraintQueryContext> alterTableAddUniqueConstraintQuery() {
			return getRuleContexts(AlterTableAddUniqueConstraintQueryContext.class);
		}
		public AlterTableAddUniqueConstraintQueryContext alterTableAddUniqueConstraintQuery(int i) {
			return getRuleContext(AlterTableAddUniqueConstraintQueryContext.class,i);
		}
		public List<OtherAlterQueryContext> otherAlterQuery() {
			return getRuleContexts(OtherAlterQueryContext.class);
		}
		public OtherAlterQueryContext otherAlterQuery(int i) {
			return getRuleContext(OtherAlterQueryContext.class,i);
		}
		public List<CreateIndexQueryContext> createIndexQuery() {
			return getRuleContexts(CreateIndexQueryContext.class);
		}
		public CreateIndexQueryContext createIndexQuery(int i) {
			return getRuleContext(CreateIndexQueryContext.class,i);
		}
		public TableSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTableSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTableSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTableSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSegmentContext tableSegment() throws RecognitionException {
		TableSegmentContext _localctx = new TableSegmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableSegment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					tabSpace();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(488);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(485);
							tabSpace();
							}
							} 
						}
						setState(490);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
					}
					setState(491);
					setStatement();
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(497);
				tabSpace();
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
			createTableQuery();
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(504);
							tabSpace();
							}
							} 
						}
						setState(509);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					}
					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(510);
						commentQuery();
						}
						break;
					case 2:
						{
						setState(511);
						alterTableAddPrimaryKeyQuery();
						}
						break;
					case 3:
						{
						setState(512);
						alterTableAddUniqueConstraintQuery();
						}
						break;
					case 4:
						{
						setState(513);
						otherAlterQuery();
						}
						break;
					case 5:
						{
						{
						setState(523);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(517);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(514);
										tabSpace();
										}
										} 
									}
									setState(519);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
								}
								setState(520);
								setStatement();
								}
								} 
							}
							setState(525);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
						}
						setState(529);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
							{
							{
							setState(526);
							tabSpace();
							}
							}
							setState(531);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(532);
						createIndexQuery();
						}
						}
						break;
					}
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class CommentQueryContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(Db2LookParser.COMMENT, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public CommentQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCommentQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCommentQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCommentQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentQueryContext commentQuery() throws RecognitionException {
		CommentQueryContext _localctx = new CommentQueryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_commentQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(COMMENT);
			setState(542); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(541);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(546);
			match(SEMI_COLON);
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

	public static class CreateTableQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<TerminalNode> ALTER() { return getTokens(Db2LookParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(Db2LookParser.ALTER, i);
		}
		public CreateTableQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTableQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTableQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTableQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableQueryContext createTableQuery() throws RecognitionException {
		CreateTableQueryContext _localctx = new CreateTableQueryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_createTableQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(CREATE);
			setState(550); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(549);
				tabSpace();
				}
				}
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(554);
			match(TABLE);
			setState(556); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(555);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==ALTER || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(560);
			match(SEMI_COLON);
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

	public static class AlterTableAddPrimaryKeyQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<FullNameModelContext> fullNameModel() {
			return getRuleContexts(FullNameModelContext.class);
		}
		public FullNameModelContext fullNameModel(int i) {
			return getRuleContext(FullNameModelContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Db2LookParser.ADD, 0); }
		public TerminalNode PRIMARY_KEY() { return getToken(Db2LookParser.PRIMARY_KEY, 0); }
		public TerminalNode LT_BRACKET() { return getToken(Db2LookParser.LT_BRACKET, 0); }
		public List<TerminalNode> RT_BRACKET() { return getTokens(Db2LookParser.RT_BRACKET); }
		public TerminalNode RT_BRACKET(int i) {
			return getToken(Db2LookParser.RT_BRACKET, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(Db2LookParser.CONSTRAINT, 0); }
		public AlterTableAddPrimaryKeyQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAddPrimaryKeyQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterTableAddPrimaryKeyQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterTableAddPrimaryKeyQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterTableAddPrimaryKeyQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableAddPrimaryKeyQueryContext alterTableAddPrimaryKeyQuery() throws RecognitionException {
		AlterTableAddPrimaryKeyQueryContext _localctx = new AlterTableAddPrimaryKeyQueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alterTableAddPrimaryKeyQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(ALTER);
			setState(564); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(563);
				tabSpace();
				}
				}
				setState(566); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(568);
			match(TABLE);
			setState(570); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(569);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(572); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(574);
			fullNameModel();
			setState(576); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(575);
				tabSpace();
				}
				}
				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(580);
			match(ADD);
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(581);
					tabSpace();
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(587);
				match(CONSTRAINT);
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(588);
						tabSpace();
						}
						} 
					}
					setState(593);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(594);
				fullNameModel();
				}
				break;
			}
			setState(598); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(597);
				tabSpace();
				}
				}
				setState(600); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(602);
			match(PRIMARY_KEY);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(603);
				tabSpace();
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(609);
			match(LT_BRACKET);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(610);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==RT_BRACKET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
			match(RT_BRACKET);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(617);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
			match(SEMI_COLON);
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

	public static class AlterTableAddForeignKeyQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<FullNameModelContext> fullNameModel() {
			return getRuleContexts(FullNameModelContext.class);
		}
		public FullNameModelContext fullNameModel(int i) {
			return getRuleContext(FullNameModelContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Db2LookParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(Db2LookParser.CONSTRAINT, 0); }
		public TerminalNode FOREIGN_KEY() { return getToken(Db2LookParser.FOREIGN_KEY, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public AlterTableAddForeignKeyQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAddForeignKeyQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterTableAddForeignKeyQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterTableAddForeignKeyQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterTableAddForeignKeyQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableAddForeignKeyQueryContext alterTableAddForeignKeyQuery() throws RecognitionException {
		AlterTableAddForeignKeyQueryContext _localctx = new AlterTableAddForeignKeyQueryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alterTableAddForeignKeyQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(625);
				tabSpace();
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631);
			match(ALTER);
			setState(633); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(632);
				tabSpace();
				}
				}
				setState(635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(637);
			match(TABLE);
			setState(639); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(638);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(641); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(643);
			fullNameModel();
			setState(645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(644);
				tabSpace();
				}
				}
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(649);
			match(ADD);
			setState(651); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(650);
				tabSpace();
				}
				}
				setState(653); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(655);
			match(CONSTRAINT);
			setState(657); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(656);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(659); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(661);
			fullNameModel();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(662);
				tabSpace();
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
			match(FOREIGN_KEY);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(669);
					tabSpace();
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(676); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(675);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(678); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(680);
			match(SEMI_COLON);
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

	public static class AlterTableAddUniqueConstraintQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<FullNameModelContext> fullNameModel() {
			return getRuleContexts(FullNameModelContext.class);
		}
		public FullNameModelContext fullNameModel(int i) {
			return getRuleContext(FullNameModelContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Db2LookParser.ADD, 0); }
		public TerminalNode UNIQUE() { return getToken(Db2LookParser.UNIQUE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(Db2LookParser.CONSTRAINT, 0); }
		public AlterTableAddUniqueConstraintQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAddUniqueConstraintQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterTableAddUniqueConstraintQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterTableAddUniqueConstraintQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterTableAddUniqueConstraintQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableAddUniqueConstraintQueryContext alterTableAddUniqueConstraintQuery() throws RecognitionException {
		AlterTableAddUniqueConstraintQueryContext _localctx = new AlterTableAddUniqueConstraintQueryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alterTableAddUniqueConstraintQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(ALTER);
			setState(684); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(683);
				tabSpace();
				}
				}
				setState(686); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(688);
			match(TABLE);
			setState(690); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(689);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(692); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(694);
			fullNameModel();
			setState(696); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(695);
				tabSpace();
				}
				}
				setState(698); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(700);
			match(ADD);
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(702); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(701);
					tabSpace();
					}
					}
					setState(704); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				setState(706);
				match(CONSTRAINT);
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(707);
						tabSpace();
						}
						} 
					}
					setState(712);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				setState(713);
				fullNameModel();
				}
				break;
			}
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(717);
				tabSpace();
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
			match(UNIQUE);
			setState(725); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(724);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(727); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(729);
			match(SEMI_COLON);
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

	public static class AlterTableAddCheckConstraintQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<FullNameModelContext> fullNameModel() {
			return getRuleContexts(FullNameModelContext.class);
		}
		public FullNameModelContext fullNameModel(int i) {
			return getRuleContext(FullNameModelContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Db2LookParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(Db2LookParser.CONSTRAINT, 0); }
		public TerminalNode CHECK() { return getToken(Db2LookParser.CHECK, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<TerminalNode> CREATE() { return getTokens(Db2LookParser.CREATE); }
		public TerminalNode CREATE(int i) {
			return getToken(Db2LookParser.CREATE, i);
		}
		public AlterTableAddCheckConstraintQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAddCheckConstraintQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterTableAddCheckConstraintQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterTableAddCheckConstraintQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterTableAddCheckConstraintQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableAddCheckConstraintQueryContext alterTableAddCheckConstraintQuery() throws RecognitionException {
		AlterTableAddCheckConstraintQueryContext _localctx = new AlterTableAddCheckConstraintQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alterTableAddCheckConstraintQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(731);
				tabSpace();
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
			match(ALTER);
			setState(739); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(738);
				tabSpace();
				}
				}
				setState(741); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(743);
			match(TABLE);
			setState(745); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(744);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(747); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(749);
			fullNameModel();
			setState(751); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(750);
				tabSpace();
				}
				}
				setState(753); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(755);
			match(ADD);
			setState(757); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(756);
				tabSpace();
				}
				}
				setState(759); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(761);
			match(CONSTRAINT);
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(762);
					tabSpace();
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(768);
			fullNameModel();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(769);
				tabSpace();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(775);
			match(CHECK);
			setState(777); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(776);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CREATE || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(779); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(781);
			match(SEMI_COLON);
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

	public static class OtherAlterQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<TerminalNode> PRIMARY_KEY() { return getTokens(Db2LookParser.PRIMARY_KEY); }
		public TerminalNode PRIMARY_KEY(int i) {
			return getToken(Db2LookParser.PRIMARY_KEY, i);
		}
		public List<TerminalNode> FOREIGN_KEY() { return getTokens(Db2LookParser.FOREIGN_KEY); }
		public TerminalNode FOREIGN_KEY(int i) {
			return getToken(Db2LookParser.FOREIGN_KEY, i);
		}
		public List<TerminalNode> CHECK() { return getTokens(Db2LookParser.CHECK); }
		public TerminalNode CHECK(int i) {
			return getToken(Db2LookParser.CHECK, i);
		}
		public List<TerminalNode> UNIQUE() { return getTokens(Db2LookParser.UNIQUE); }
		public TerminalNode UNIQUE(int i) {
			return getToken(Db2LookParser.UNIQUE, i);
		}
		public OtherAlterQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherAlterQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterOtherAlterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitOtherAlterQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitOtherAlterQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherAlterQueryContext otherAlterQuery() throws RecognitionException {
		OtherAlterQueryContext _localctx = new OtherAlterQueryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_otherAlterQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(783);
				tabSpace();
				}
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(789);
			match(ALTER);
			setState(791); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(790);
				tabSpace();
				}
				}
				setState(793); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(795);
			match(TABLE);
			setState(797); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(796);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(799); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(801);
			fullNameModel();
			setState(803); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(802);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(805); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(808); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(807);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << UNIQUE) | (1L << CHECK) | (1L << SEMI_COLON))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(810); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(812);
			match(SEMI_COLON);
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

	public static class CreateIndexQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(Db2LookParser.INDEX, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode UNIQUE() { return getToken(Db2LookParser.UNIQUE, 0); }
		public CreateIndexQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateIndexQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateIndexQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateIndexQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexQueryContext createIndexQuery() throws RecognitionException {
		CreateIndexQueryContext _localctx = new CreateIndexQueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createIndexQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(CREATE);
			setState(816); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(815);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(818); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(820);
					match(UNIQUE);
					}
				}

				setState(824); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(823);
					tabSpace();
					}
					}
					setState(826); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				}
			}

			setState(830);
			match(INDEX);
			setState(832); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(831);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(834); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(836);
			fullNameModel();
			setState(838); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(837);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(840); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(842);
			match(SEMI_COLON);
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

	public static class SetStatementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(Db2LookParser.SET, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_setStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(844);
				tabSpace();
				}
				}
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(850);
			match(SET);
			setState(852); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(851);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(854); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(856);
			match(SEMI_COLON);
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

	public static class UserDefinedFunctionsContext extends ParserRuleContext {
		public CreateUDFQueryContext createUDFQuery() {
			return getRuleContext(CreateUDFQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public UserDefinedFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterUserDefinedFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitUserDefinedFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitUserDefinedFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedFunctionsContext userDefinedFunctions() throws RecognitionException {
		UserDefinedFunctionsContext _localctx = new UserDefinedFunctionsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_userDefinedFunctions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(861);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(858);
							tabSpace();
							}
							} 
						}
						setState(863);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
					}
					setState(864);
					setStatement();
					}
					} 
				}
				setState(869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(870);
				tabSpace();
				}
				}
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(876);
			createUDFQuery();
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

	public static class CreateUDFQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(Db2LookParser.FUNCTION, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public TerminalNode LT_BRACKET() { return getToken(Db2LookParser.LT_BRACKET, 0); }
		public List<TerminalNode> RT_BRACKET() { return getTokens(Db2LookParser.RT_BRACKET); }
		public TerminalNode RT_BRACKET(int i) {
			return getToken(Db2LookParser.RT_BRACKET, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode END() { return getToken(Db2LookParser.END, 0); }
		public CreateUDFQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUDFQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateUDFQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateUDFQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateUDFQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUDFQueryContext createUDFQuery() throws RecognitionException {
		CreateUDFQueryContext _localctx = new CreateUDFQueryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_createUDFQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(CREATE);
			setState(880); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(879);
				tabSpace();
				}
				}
				setState(882); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(884);
			match(FUNCTION);
			setState(886); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(885);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(888); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(890);
			fullNameModel();
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(891);
				tabSpace();
				}
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(897);
			match(LT_BRACKET);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(898);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==RT_BRACKET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(904);
			match(RT_BRACKET);
			setState(906); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(905);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(908); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(910);
			match(SEMI_COLON);
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(911);
					tabSpace();
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(917);
				match(END);
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(918);
					tabSpace();
					}
					}
					setState(923);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(924);
				match(SEMI_COLON);
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

	public static class CreateViewStatementContext extends ParserRuleContext {
		public CreateViewQueryContext createViewQuery() {
			return getRuleContext(CreateViewQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateViewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createViewStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateViewStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateViewStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateViewStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewStatementContext createViewStatement() throws RecognitionException {
		CreateViewStatementContext _localctx = new CreateViewStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_createViewStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(930);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(927);
							tabSpace();
							}
							} 
						}
						setState(932);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					}
					setState(933);
					setStatement();
					}
					} 
				}
				setState(938);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(939);
				tabSpace();
				}
				}
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(945);
			createViewQuery();
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

	public static class CreateViewQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(Db2LookParser.VIEW, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateViewQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createViewQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewQueryContext createViewQuery() throws RecognitionException {
		CreateViewQueryContext _localctx = new CreateViewQueryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_createViewQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(CREATE);
			setState(949); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(948);
				tabSpace();
				}
				}
				setState(951); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(953);
			match(VIEW);
			setState(955); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(954);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(957); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(959);
			fullNameModel();
			setState(961); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(960);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(963); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(965);
			match(SEMI_COLON);
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

	public static class AliasStatementContext extends ParserRuleContext {
		public AliasQueryContext aliasQuery() {
			return getRuleContext(AliasQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public AliasStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAliasStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAliasStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAliasStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasStatementContext aliasStatement() throws RecognitionException {
		AliasStatementContext _localctx = new AliasStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_aliasStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(967);
				tabSpace();
				}
				}
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(973);
			aliasQuery();
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

	public static class AliasQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode ALIAS() { return getToken(Db2LookParser.ALIAS, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public AliasQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAliasQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAliasQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAliasQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasQueryContext aliasQuery() throws RecognitionException {
		AliasQueryContext _localctx = new AliasQueryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_aliasQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(CREATE);
			setState(977); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(976);
				tabSpace();
				}
				}
				setState(979); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(981);
			match(ALIAS);
			setState(983); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(982);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(985); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(987);
			fullNameModel();
			setState(989); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(988);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(991); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(993);
			match(SEMI_COLON);
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

	public static class CreateStoredProcedureStatementContext extends ParserRuleContext {
		public CreateProcedureQueryContext createProcedureQuery() {
			return getRuleContext(CreateProcedureQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateStoredProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStoredProcedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateStoredProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateStoredProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateStoredProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStoredProcedureStatementContext createStoredProcedureStatement() throws RecognitionException {
		CreateStoredProcedureStatementContext _localctx = new CreateStoredProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_createStoredProcedureStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(998);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(995);
							tabSpace();
							}
							} 
						}
						setState(1000);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
					}
					setState(1001);
					setStatement();
					}
					} 
				}
				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			setState(1010);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1007);
					tabSpace();
					}
					} 
				}
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1013);
			createProcedureQuery();
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

	public static class CreateProcedureQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(Db2LookParser.PROCEDURE, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> BEGIN() { return getTokens(Db2LookParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(Db2LookParser.BEGIN, i);
		}
		public List<TerminalNode> END() { return getTokens(Db2LookParser.END); }
		public TerminalNode END(int i) {
			return getToken(Db2LookParser.END, i);
		}
		public TerminalNode SEMI_COLON() { return getToken(Db2LookParser.SEMI_COLON, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<TerminalNode> GRANT() { return getTokens(Db2LookParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(Db2LookParser.GRANT, i);
		}
		public CreateProcedureQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcedureQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateProcedureQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateProcedureQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateProcedureQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateProcedureQueryContext createProcedureQuery() throws RecognitionException {
		CreateProcedureQueryContext _localctx = new CreateProcedureQueryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_createProcedureQuery);
		int _la;
		try {
			int _alt;
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				match(CREATE);
				setState(1017); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1016);
					tabSpace();
					}
					}
					setState(1019); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				setState(1021);
				match(PROCEDURE);
				setState(1023); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1022);
						tabSpace();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1025); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1027);
				fullNameModel();
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1028);
						tabSpace();
						}
						} 
					}
					setState(1033);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				}
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
					{
					{
					setState(1034);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==BEGIN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1039);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1040);
				match(BEGIN);
				setState(1044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1041);
						tabSpace();
						}
						} 
					}
					setState(1046);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				{
				setState(1048); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1047);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==END) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1050); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(1052);
					tabSpace();
					}
					}
					setState(1057);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1058);
				match(END);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(1059);
					tabSpace();
					}
					}
					setState(1064);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1065);
				match(SEMI_COLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1067);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==GRANT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1070); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CreateTriggerStatementContext extends ParserRuleContext {
		public CreateTriggerQueryContext createTriggerQuery() {
			return getRuleContext(CreateTriggerQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateTriggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTriggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTriggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTriggerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTriggerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTriggerStatementContext createTriggerStatement() throws RecognitionException {
		CreateTriggerStatementContext _localctx = new CreateTriggerStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_createTriggerStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1077);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1074);
							tabSpace();
							}
							} 
						}
						setState(1079);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
					}
					setState(1080);
					setStatement();
					}
					} 
				}
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1086);
				tabSpace();
				}
				}
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1092);
			createTriggerQuery();
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

	public static class CreateTriggerQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode TRIGGER() { return getToken(Db2LookParser.TRIGGER, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode END() { return getToken(Db2LookParser.END, 0); }
		public CreateTriggerQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTriggerQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTriggerQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTriggerQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTriggerQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTriggerQueryContext createTriggerQuery() throws RecognitionException {
		CreateTriggerQueryContext _localctx = new CreateTriggerQueryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_createTriggerQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(CREATE);
			setState(1096); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1095);
				tabSpace();
				}
				}
				setState(1098); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1100);
			match(TRIGGER);
			setState(1102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1101);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1106);
			fullNameModel();
			setState(1108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1107);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1112);
			match(SEMI_COLON);
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(1113);
					tabSpace();
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1119);
				match(END);
				setState(1120);
				match(SEMI_COLON);
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

	public static class GrantStatementContext extends ParserRuleContext {
		public GrantQueryContext grantQuery() {
			return getRuleContext(GrantQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public GrantStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterGrantStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitGrantStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitGrantStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantStatementContext grantStatement() throws RecognitionException {
		GrantStatementContext _localctx = new GrantStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_grantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1123);
				tabSpace();
				}
				}
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1129);
			grantQuery();
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

	public static class GrantQueryContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(Db2LookParser.GRANT, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public GrantQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterGrantQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitGrantQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitGrantQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantQueryContext grantQuery() throws RecognitionException {
		GrantQueryContext _localctx = new GrantQueryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_grantQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(GRANT);
			setState(1133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1132);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1137);
			match(SEMI_COLON);
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

	public static class TerminateStatementContext extends ParserRuleContext {
		public TerminalNode TERMINATE() { return getToken(Db2LookParser.TERMINATE, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(Db2LookParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(Db2LookParser.EOF, i);
		}
		public TerminateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTerminateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTerminateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTerminateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminateStatementContext terminateStatement() throws RecognitionException {
		TerminateStatementContext _localctx = new TerminateStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_terminateStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1139);
				tabSpace();
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1145);
			match(TERMINATE);
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1146);
					tabSpace();
					}
					} 
				}
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1152);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==EOF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
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

	public static class SpaceContext extends ParserRuleContext {
		public TabSpaceContext tabSpace() {
			return getRuleContext(TabSpaceContext.class,0);
		}
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			tabSpace();
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

	public static class CommitStatementContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(Db2LookParser.COMMIT, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CommitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCommitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCommitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCommitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitStatementContext commitStatement() throws RecognitionException {
		CommitStatementContext _localctx = new CommitStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_commitStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1159);
				tabSpace();
				}
				}
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1165);
			match(COMMIT);
			setState(1167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1166);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1171);
			match(SEMI_COLON);
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

	public static class TrustedContextStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode TRUSTED_CONTEXT() { return getToken(Db2LookParser.TRUSTED_CONTEXT, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TrustedContextStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trustedContextStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTrustedContextStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTrustedContextStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTrustedContextStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrustedContextStatementContext trustedContextStatement() throws RecognitionException {
		TrustedContextStatementContext _localctx = new TrustedContextStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_trustedContextStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1173);
				tabSpace();
				}
				}
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1179);
			match(CREATE);
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1180);
				space();
				}
				}
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1186);
			match(TRUSTED_CONTEXT);
			setState(1188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1187);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1192);
			match(SEMI_COLON);
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

	public static class CreateAuditStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode AUDIT() { return getToken(Db2LookParser.AUDIT, 0); }
		public TerminalNode POLICY() { return getToken(Db2LookParser.POLICY, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateAuditStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createAuditStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateAuditStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateAuditStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateAuditStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateAuditStatementContext createAuditStatement() throws RecognitionException {
		CreateAuditStatementContext _localctx = new CreateAuditStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_createAuditStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1194);
				tabSpace();
				}
				}
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1200);
			match(CREATE);
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1201);
				tabSpace();
				}
				}
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1207);
			match(AUDIT);
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1208);
				tabSpace();
				}
				}
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1214);
			match(POLICY);
			setState(1216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1215);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1220);
			match(SEMI_COLON);
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

	public static class CreateRoleStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(Db2LookParser.ROLE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateRoleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRoleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateRoleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateRoleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateRoleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateRoleStatementContext createRoleStatement() throws RecognitionException {
		CreateRoleStatementContext _localctx = new CreateRoleStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_createRoleStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1222);
				tabSpace();
				}
				}
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1228);
			match(CREATE);
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1229);
				tabSpace();
				}
				}
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1235);
			match(ROLE);
			setState(1239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1236);
					tabSpace();
					}
					} 
				}
				setState(1241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			setState(1243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1242);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL) | (1L << DOT) | (1L << NUMS) | (1L << NUMBER) | (1L << EQUAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1247);
			match(SEMI_COLON);
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

	public static class FullNameModelContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Db2LookParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Db2LookParser.DOT, i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public FullNameModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullNameModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterFullNameModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitFullNameModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitFullNameModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullNameModelContext fullNameModel() throws RecognitionException {
		FullNameModelContext _localctx = new FullNameModelContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fullNameModel);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1249);
					databaseName();
					setState(1253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
						{
						{
						setState(1250);
						space();
						}
						}
						setState(1255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1256);
					match(DOT);
					}
					break;
				}
				setState(1263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1260);
						space();
						}
						} 
					}
					setState(1265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				setState(1266);
				schemaName();
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(1267);
					space();
					}
					}
					setState(1272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1273);
				match(DOT);
				}
				break;
			}
			setState(1280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1277);
					space();
					}
					} 
				}
				setState(1282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			setState(1283);
			tableName();
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

	public static class DatabaseNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			name();
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

	public static class SchemaNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			name();
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

	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			name();
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

	public static class NameContext extends ParserRuleContext {
		public HandleContext handle() {
			return getRuleContext(HandleContext.class,0);
		}
		public List<TerminalNode> QUOTATION() { return getTokens(Db2LookParser.QUOTATION); }
		public TerminalNode QUOTATION(int i) {
			return getToken(Db2LookParser.QUOTATION, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_name);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER:
			case SPACE:
			case TAB:
			case TAB1:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				handle();
				}
				break;
			case QUOTATION:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1292);
				match(QUOTATION);
				setState(1293);
				variable();
				setState(1294);
				match(QUOTATION);
				}
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

	public static class VariableContext extends ParserRuleContext {
		public List<HandleContext> handle() {
			return getRuleContexts(HandleContext.class);
		}
		public HandleContext handle(int i) {
			return getRuleContext(HandleContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1298);
					space();
					}
					} 
				}
				setState(1303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			setState(1304);
			handle();
			setState(1308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1305);
					space();
					}
					} 
				}
				setState(1310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (USER - 12)) | (1L << (SPACE - 12)) | (1L << (TAB - 12)) | (1L << (TAB1 - 12)) | (1L << (TAB3 - 12)) | (1L << (WORD - 12)))) != 0)) {
				{
				{
				setState(1314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1311);
						space();
						}
						} 
					}
					setState(1316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1317);
				handle();
				setState(1321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1318);
						space();
						}
						} 
					}
					setState(1323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				}
				}
				setState(1328);
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

	public static class HandleContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(Db2LookParser.WORD, 0); }
		public TerminalNode SPACE() { return getToken(Db2LookParser.SPACE, 0); }
		public TerminalNode TAB() { return getToken(Db2LookParser.TAB, 0); }
		public TerminalNode TAB1() { return getToken(Db2LookParser.TAB1, 0); }
		public TerminalNode USER() { return getToken(Db2LookParser.USER, 0); }
		public HandleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterHandle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitHandle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitHandle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandleContext handle() throws RecognitionException {
		HandleContext _localctx = new HandleContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_handle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (USER - 12)) | (1L << (SPACE - 12)) | (1L << (TAB - 12)) | (1L << (TAB1 - 12)) | (1L << (WORD - 12)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\u0004\u0001P\u0534\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0005\u0000p\b\u0000\n\u0000\f\u0000s\t\u0000\u0001\u0000\u0005"+
		"\u0000v\b\u0000\n\u0000\f\u0000y\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0088"+
		"\b\u0000\n\u0000\f\u0000\u008b\t\u0000\u0001\u0000\u0005\u0000\u008e\b"+
		"\u0000\n\u0000\f\u0000\u0091\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u009c\b\u0000\u0001\u0000\u0005\u0000\u009f\b\u0000\n\u0000"+
		"\f\u0000\u00a2\t\u0000\u0005\u0000\u00a4\b\u0000\n\u0000\f\u0000\u00a7"+
		"\t\u0000\u0001\u0000\u0005\u0000\u00aa\b\u0000\n\u0000\f\u0000\u00ad\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00b1\b\u0000\n\u0000\f\u0000"+
		"\u00b4\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00b8\b\u0000\n\u0000"+
		"\f\u0000\u00bb\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0005\u0002\u00c2\b\u0002\n\u0002\f\u0002\u00c5\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u0003\u00cb\b\u0003\u000b"+
		"\u0003\f\u0003\u00cc\u0001\u0003\u0001\u0003\u0004\u0003\u00d1\b\u0003"+
		"\u000b\u0003\f\u0003\u00d2\u0001\u0003\u0001\u0003\u0005\u0003\u00d7\b"+
		"\u0003\n\u0003\f\u0003\u00da\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00e0\b\u0003\n\u0003\f\u0003\u00e3\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u00e7\b\u0003\n\u0003\f\u0003\u00ea\t\u0003"+
		"\u0001\u0003\u0003\u0003\u00ed\b\u0003\u0001\u0004\u0005\u0004\u00f0\b"+
		"\u0004\n\u0004\f\u0004\u00f3\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u00f9\b\u0005\u000b\u0005\f\u0005\u00fa\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u00ff\b\u0005\u000b\u0005\f\u0005\u0100"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u0105\b\u0005\u000b\u0005\f\u0005"+
		"\u0106\u0001\u0005\u0001\u0005\u0004\u0005\u010b\b\u0005\u000b\u0005\f"+
		"\u0005\u010c\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006\u0112\b\u0006"+
		"\n\u0006\f\u0006\u0115\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u011b\b\u0007\u000b\u0007\f\u0007\u011c\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u0121\b\u0007\u000b\u0007\f\u0007\u0122\u0001"+
		"\u0007\u0001\u0007\u0004\u0007\u0127\b\u0007\u000b\u0007\f\u0007\u0128"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0005\b\u012e\b\b\n\b\f\b\u0131\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0004\t\u0137\b\t\u000b\t\f\t\u0138\u0001\t"+
		"\u0001\t\u0005\t\u013d\b\t\n\t\f\t\u0140\t\t\u0001\t\u0001\t\u0001\n\u0005"+
		"\n\u0145\b\n\n\n\f\n\u0148\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u014e\b\u000b\n\u000b\f\u000b\u0151\t\u000b\u0001\u000b\u0003"+
		"\u000b\u0154\b\u000b\u0001\u000b\u0005\u000b\u0157\b\u000b\n\u000b\f\u000b"+
		"\u015a\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u015e\b\u000b\n\u000b"+
		"\f\u000b\u0161\t\u000b\u0001\u000b\u0004\u000b\u0164\b\u000b\u000b\u000b"+
		"\f\u000b\u0165\u0001\u000b\u0001\u000b\u0004\u000b\u016a\b\u000b\u000b"+
		"\u000b\f\u000b\u016b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u0171\b\f"+
		"\n\f\f\f\u0174\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u017a\b\r\u000b"+
		"\r\f\r\u017b\u0001\r\u0001\r\u0004\r\u0180\b\r\u000b\r\f\r\u0181\u0001"+
		"\r\u0001\r\u0001\u000e\u0005\u000e\u0187\b\u000e\n\u000e\f\u000e\u018a"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0004\u000f\u0190"+
		"\b\u000f\u000b\u000f\f\u000f\u0191\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u0196\b\u000f\u000b\u000f\f\u000f\u0197\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0005\u0010\u019d\b\u0010\n\u0010\f\u0010\u01a0\t\u0010\u0001\u0010"+
		"\u0005\u0010\u01a3\b\u0010\n\u0010\f\u0010\u01a6\t\u0010\u0001\u0010\u0005"+
		"\u0010\u01a9\b\u0010\n\u0010\f\u0010\u01ac\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0004\u0011\u01b2\b\u0011\u000b\u0011\f\u0011"+
		"\u01b3\u0001\u0011\u0001\u0011\u0004\u0011\u01b8\b\u0011\u000b\u0011\f"+
		"\u0011\u01b9\u0001\u0011\u0001\u0011\u0004\u0011\u01be\b\u0011\u000b\u0011"+
		"\f\u0011\u01bf\u0001\u0011\u0001\u0011\u0001\u0012\u0005\u0012\u01c5\b"+
		"\u0012\n\u0012\f\u0012\u01c8\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u01ce\b\u0013\u000b\u0013\f\u0013\u01cf\u0001"+
		"\u0013\u0001\u0013\u0004\u0013\u01d4\b\u0013\u000b\u0013\f\u0013\u01d5"+
		"\u0001\u0013\u0001\u0013\u0004\u0013\u01da\b\u0013\u000b\u0013\f\u0013"+
		"\u01db\u0001\u0013\u0001\u0013\u0001\u0014\u0005\u0014\u01e1\b\u0014\n"+
		"\u0014\f\u0014\u01e4\t\u0014\u0001\u0014\u0005\u0014\u01e7\b\u0014\n\u0014"+
		"\f\u0014\u01ea\t\u0014\u0001\u0014\u0005\u0014\u01ed\b\u0014\n\u0014\f"+
		"\u0014\u01f0\t\u0014\u0001\u0014\u0005\u0014\u01f3\b\u0014\n\u0014\f\u0014"+
		"\u01f6\t\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01fa\b\u0014\n\u0014"+
		"\f\u0014\u01fd\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0204\b\u0014\n\u0014\f\u0014\u0207\t\u0014\u0001"+
		"\u0014\u0005\u0014\u020a\b\u0014\n\u0014\f\u0014\u020d\t\u0014\u0001\u0014"+
		"\u0005\u0014\u0210\b\u0014\n\u0014\f\u0014\u0213\t\u0014\u0001\u0014\u0003"+
		"\u0014\u0216\b\u0014\u0005\u0014\u0218\b\u0014\n\u0014\f\u0014\u021b\t"+
		"\u0014\u0001\u0015\u0001\u0015\u0004\u0015\u021f\b\u0015\u000b\u0015\f"+
		"\u0015\u0220\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0004\u0016"+
		"\u0227\b\u0016\u000b\u0016\f\u0016\u0228\u0001\u0016\u0001\u0016\u0004"+
		"\u0016\u022d\b\u0016\u000b\u0016\f\u0016\u022e\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0004\u0017\u0235\b\u0017\u000b\u0017\f\u0017"+
		"\u0236\u0001\u0017\u0001\u0017\u0004\u0017\u023b\b\u0017\u000b\u0017\f"+
		"\u0017\u023c\u0001\u0017\u0001\u0017\u0004\u0017\u0241\b\u0017\u000b\u0017"+
		"\f\u0017\u0242\u0001\u0017\u0001\u0017\u0005\u0017\u0247\b\u0017\n\u0017"+
		"\f\u0017\u024a\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u024e\b\u0017"+
		"\n\u0017\f\u0017\u0251\t\u0017\u0001\u0017\u0003\u0017\u0254\b\u0017\u0001"+
		"\u0017\u0004\u0017\u0257\b\u0017\u000b\u0017\f\u0017\u0258\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u025d\b\u0017\n\u0017\f\u0017\u0260\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0264\b\u0017\n\u0017\f\u0017\u0267\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u026b\b\u0017\n\u0017\f\u0017\u026e"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0005\u0018\u0273\b\u0018"+
		"\n\u0018\f\u0018\u0276\t\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u027a"+
		"\b\u0018\u000b\u0018\f\u0018\u027b\u0001\u0018\u0001\u0018\u0004\u0018"+
		"\u0280\b\u0018\u000b\u0018\f\u0018\u0281\u0001\u0018\u0001\u0018\u0004"+
		"\u0018\u0286\b\u0018\u000b\u0018\f\u0018\u0287\u0001\u0018\u0001\u0018"+
		"\u0004\u0018\u028c\b\u0018\u000b\u0018\f\u0018\u028d\u0001\u0018\u0001"+
		"\u0018\u0004\u0018\u0292\b\u0018\u000b\u0018\f\u0018\u0293\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0298\b\u0018\n\u0018\f\u0018\u029b\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u029f\b\u0018\n\u0018\f\u0018\u02a2\t\u0018"+
		"\u0001\u0018\u0004\u0018\u02a5\b\u0018\u000b\u0018\f\u0018\u02a6\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0004\u0019\u02ad\b\u0019\u000b"+
		"\u0019\f\u0019\u02ae\u0001\u0019\u0001\u0019\u0004\u0019\u02b3\b\u0019"+
		"\u000b\u0019\f\u0019\u02b4\u0001\u0019\u0001\u0019\u0004\u0019\u02b9\b"+
		"\u0019\u000b\u0019\f\u0019\u02ba\u0001\u0019\u0001\u0019\u0004\u0019\u02bf"+
		"\b\u0019\u000b\u0019\f\u0019\u02c0\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u02c5\b\u0019\n\u0019\f\u0019\u02c8\t\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u02cc\b\u0019\u0001\u0019\u0005\u0019\u02cf\b\u0019\n\u0019\f\u0019"+
		"\u02d2\t\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u02d6\b\u0019\u000b"+
		"\u0019\f\u0019\u02d7\u0001\u0019\u0001\u0019\u0001\u001a\u0005\u001a\u02dd"+
		"\b\u001a\n\u001a\f\u001a\u02e0\t\u001a\u0001\u001a\u0001\u001a\u0004\u001a"+
		"\u02e4\b\u001a\u000b\u001a\f\u001a\u02e5\u0001\u001a\u0001\u001a\u0004"+
		"\u001a\u02ea\b\u001a\u000b\u001a\f\u001a\u02eb\u0001\u001a\u0001\u001a"+
		"\u0004\u001a\u02f0\b\u001a\u000b\u001a\f\u001a\u02f1\u0001\u001a\u0001"+
		"\u001a\u0004\u001a\u02f6\b\u001a\u000b\u001a\f\u001a\u02f7\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u02fc\b\u001a\n\u001a\f\u001a\u02ff\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0303\b\u001a\n\u001a\f\u001a\u0306\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0004\u001a\u030a\b\u001a\u000b\u001a\f\u001a"+
		"\u030b\u0001\u001a\u0001\u001a\u0001\u001b\u0005\u001b\u0311\b\u001b\n"+
		"\u001b\f\u001b\u0314\t\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u0318"+
		"\b\u001b\u000b\u001b\f\u001b\u0319\u0001\u001b\u0001\u001b\u0004\u001b"+
		"\u031e\b\u001b\u000b\u001b\f\u001b\u031f\u0001\u001b\u0001\u001b\u0004"+
		"\u001b\u0324\b\u001b\u000b\u001b\f\u001b\u0325\u0001\u001b\u0004\u001b"+
		"\u0329\b\u001b\u000b\u001b\f\u001b\u032a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0004\u001c\u0331\b\u001c\u000b\u001c\f\u001c\u0332"+
		"\u0001\u001c\u0003\u001c\u0336\b\u001c\u0001\u001c\u0004\u001c\u0339\b"+
		"\u001c\u000b\u001c\f\u001c\u033a\u0003\u001c\u033d\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0004\u001c\u0341\b\u001c\u000b\u001c\f\u001c\u0342\u0001"+
		"\u001c\u0001\u001c\u0004\u001c\u0347\b\u001c\u000b\u001c\f\u001c\u0348"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0005\u001d\u034e\b\u001d\n\u001d"+
		"\f\u001d\u0351\t\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u0355\b\u001d"+
		"\u000b\u001d\f\u001d\u0356\u0001\u001d\u0001\u001d\u0001\u001e\u0005\u001e"+
		"\u035c\b\u001e\n\u001e\f\u001e\u035f\t\u001e\u0001\u001e\u0005\u001e\u0362"+
		"\b\u001e\n\u001e\f\u001e\u0365\t\u001e\u0001\u001e\u0005\u001e\u0368\b"+
		"\u001e\n\u001e\f\u001e\u036b\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0004\u001f\u0371\b\u001f\u000b\u001f\f\u001f\u0372\u0001"+
		"\u001f\u0001\u001f\u0004\u001f\u0377\b\u001f\u000b\u001f\f\u001f\u0378"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u037d\b\u001f\n\u001f\f\u001f\u0380"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0384\b\u001f\n\u001f\f\u001f"+
		"\u0387\t\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u038b\b\u001f\u000b"+
		"\u001f\f\u001f\u038c\u0001\u001f\u0001\u001f\u0005\u001f\u0391\b\u001f"+
		"\n\u001f\f\u001f\u0394\t\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0398"+
		"\b\u001f\n\u001f\f\u001f\u039b\t\u001f\u0001\u001f\u0003\u001f\u039e\b"+
		"\u001f\u0001 \u0005 \u03a1\b \n \f \u03a4\t \u0001 \u0005 \u03a7\b \n"+
		" \f \u03aa\t \u0001 \u0005 \u03ad\b \n \f \u03b0\t \u0001 \u0001 \u0001"+
		"!\u0001!\u0004!\u03b6\b!\u000b!\f!\u03b7\u0001!\u0001!\u0004!\u03bc\b"+
		"!\u000b!\f!\u03bd\u0001!\u0001!\u0004!\u03c2\b!\u000b!\f!\u03c3\u0001"+
		"!\u0001!\u0001\"\u0005\"\u03c9\b\"\n\"\f\"\u03cc\t\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0004#\u03d2\b#\u000b#\f#\u03d3\u0001#\u0001#\u0004#\u03d8\b"+
		"#\u000b#\f#\u03d9\u0001#\u0001#\u0004#\u03de\b#\u000b#\f#\u03df\u0001"+
		"#\u0001#\u0001$\u0005$\u03e5\b$\n$\f$\u03e8\t$\u0001$\u0005$\u03eb\b$"+
		"\n$\f$\u03ee\t$\u0001$\u0005$\u03f1\b$\n$\f$\u03f4\t$\u0001$\u0001$\u0001"+
		"%\u0001%\u0004%\u03fa\b%\u000b%\f%\u03fb\u0001%\u0001%\u0004%\u0400\b"+
		"%\u000b%\f%\u0401\u0001%\u0001%\u0005%\u0406\b%\n%\f%\u0409\t%\u0001%"+
		"\u0005%\u040c\b%\n%\f%\u040f\t%\u0001%\u0001%\u0005%\u0413\b%\n%\f%\u0416"+
		"\t%\u0001%\u0004%\u0419\b%\u000b%\f%\u041a\u0001%\u0005%\u041e\b%\n%\f"+
		"%\u0421\t%\u0001%\u0001%\u0005%\u0425\b%\n%\f%\u0428\t%\u0001%\u0001%"+
		"\u0001%\u0004%\u042d\b%\u000b%\f%\u042e\u0003%\u0431\b%\u0001&\u0005&"+
		"\u0434\b&\n&\f&\u0437\t&\u0001&\u0005&\u043a\b&\n&\f&\u043d\t&\u0001&"+
		"\u0005&\u0440\b&\n&\f&\u0443\t&\u0001&\u0001&\u0001\'\u0001\'\u0004\'"+
		"\u0449\b\'\u000b\'\f\'\u044a\u0001\'\u0001\'\u0004\'\u044f\b\'\u000b\'"+
		"\f\'\u0450\u0001\'\u0001\'\u0004\'\u0455\b\'\u000b\'\f\'\u0456\u0001\'"+
		"\u0001\'\u0005\'\u045b\b\'\n\'\f\'\u045e\t\'\u0001\'\u0001\'\u0003\'\u0462"+
		"\b\'\u0001(\u0005(\u0465\b(\n(\f(\u0468\t(\u0001(\u0001(\u0001)\u0001"+
		")\u0004)\u046e\b)\u000b)\f)\u046f\u0001)\u0001)\u0001*\u0005*\u0475\b"+
		"*\n*\f*\u0478\t*\u0001*\u0001*\u0005*\u047c\b*\n*\f*\u047f\t*\u0001*\u0004"+
		"*\u0482\b*\u000b*\f*\u0483\u0001+\u0001+\u0001,\u0005,\u0489\b,\n,\f,"+
		"\u048c\t,\u0001,\u0001,\u0004,\u0490\b,\u000b,\f,\u0491\u0001,\u0001,"+
		"\u0001-\u0005-\u0497\b-\n-\f-\u049a\t-\u0001-\u0001-\u0005-\u049e\b-\n"+
		"-\f-\u04a1\t-\u0001-\u0001-\u0004-\u04a5\b-\u000b-\f-\u04a6\u0001-\u0001"+
		"-\u0001.\u0005.\u04ac\b.\n.\f.\u04af\t.\u0001.\u0001.\u0005.\u04b3\b."+
		"\n.\f.\u04b6\t.\u0001.\u0001.\u0005.\u04ba\b.\n.\f.\u04bd\t.\u0001.\u0001"+
		".\u0004.\u04c1\b.\u000b.\f.\u04c2\u0001.\u0001.\u0001/\u0005/\u04c8\b"+
		"/\n/\f/\u04cb\t/\u0001/\u0001/\u0005/\u04cf\b/\n/\f/\u04d2\t/\u0001/\u0001"+
		"/\u0005/\u04d6\b/\n/\f/\u04d9\t/\u0001/\u0004/\u04dc\b/\u000b/\f/\u04dd"+
		"\u0001/\u0001/\u00010\u00010\u00050\u04e4\b0\n0\f0\u04e7\t0\u00010\u0001"+
		"0\u00030\u04eb\b0\u00010\u00050\u04ee\b0\n0\f0\u04f1\t0\u00010\u00010"+
		"\u00050\u04f5\b0\n0\f0\u04f8\t0\u00010\u00010\u00030\u04fc\b0\u00010\u0005"+
		"0\u04ff\b0\n0\f0\u0502\t0\u00010\u00010\u00011\u00011\u00012\u00012\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00014\u00034\u0511\b4\u00015\u0005"+
		"5\u0514\b5\n5\f5\u0517\t5\u00015\u00015\u00055\u051b\b5\n5\f5\u051e\t"+
		"5\u00015\u00055\u0521\b5\n5\f5\u0524\t5\u00015\u00015\u00055\u0528\b5"+
		"\n5\f5\u052b\t5\u00055\u052d\b5\n5\f5\u0530\t5\u00016\u00016\u00016\u0000"+
		"\u00007\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\r\u0001"+
		"\u000047\u0001\u000011\u0002\u0000\t\n\r\r\u0001\u0000\u000e\u000e\u0002"+
		"\u0000\u0007\u000711\u0001\u0000..\u0002\u0000\u0005\u000511\u0003\u0000"+
		"\u0012\u0013\u0017\u001811\u0001\u0000\'\'\u0001\u0000((\u0001\u0000\u0019"+
		"\u0019\u0000\u0001\u0003\u0000\f\f46KK\u05cb\u0000q\u0001\u0000\u0000"+
		"\u0000\u0002\u00be\u0001\u0000\u0000\u0000\u0004\u00c3\u0001\u0000\u0000"+
		"\u0000\u0006\u00ec\u0001\u0000\u0000\u0000\b\u00f1\u0001\u0000\u0000\u0000"+
		"\n\u00f6\u0001\u0000\u0000\u0000\f\u0113\u0001\u0000\u0000\u0000\u000e"+
		"\u0118\u0001\u0000\u0000\u0000\u0010\u012f\u0001\u0000\u0000\u0000\u0012"+
		"\u0134\u0001\u0000\u0000\u0000\u0014\u0146\u0001\u0000\u0000\u0000\u0016"+
		"\u014b\u0001\u0000\u0000\u0000\u0018\u0172\u0001\u0000\u0000\u0000\u001a"+
		"\u0177\u0001\u0000\u0000\u0000\u001c\u0188\u0001\u0000\u0000\u0000\u001e"+
		"\u018d\u0001\u0000\u0000\u0000 \u01a4\u0001\u0000\u0000\u0000\"\u01af"+
		"\u0001\u0000\u0000\u0000$\u01c6\u0001\u0000\u0000\u0000&\u01cb\u0001\u0000"+
		"\u0000\u0000(\u01e2\u0001\u0000\u0000\u0000*\u021c\u0001\u0000\u0000\u0000"+
		",\u0224\u0001\u0000\u0000\u0000.\u0232\u0001\u0000\u0000\u00000\u0274"+
		"\u0001\u0000\u0000\u00002\u02aa\u0001\u0000\u0000\u00004\u02de\u0001\u0000"+
		"\u0000\u00006\u0312\u0001\u0000\u0000\u00008\u032e\u0001\u0000\u0000\u0000"+
		":\u034f\u0001\u0000\u0000\u0000<\u0363\u0001\u0000\u0000\u0000>\u036e"+
		"\u0001\u0000\u0000\u0000@\u03a8\u0001\u0000\u0000\u0000B\u03b3\u0001\u0000"+
		"\u0000\u0000D\u03ca\u0001\u0000\u0000\u0000F\u03cf\u0001\u0000\u0000\u0000"+
		"H\u03ec\u0001\u0000\u0000\u0000J\u0430\u0001\u0000\u0000\u0000L\u043b"+
		"\u0001\u0000\u0000\u0000N\u0446\u0001\u0000\u0000\u0000P\u0466\u0001\u0000"+
		"\u0000\u0000R\u046b\u0001\u0000\u0000\u0000T\u0476\u0001\u0000\u0000\u0000"+
		"V\u0485\u0001\u0000\u0000\u0000X\u048a\u0001\u0000\u0000\u0000Z\u0498"+
		"\u0001\u0000\u0000\u0000\\\u04ad\u0001\u0000\u0000\u0000^\u04c9\u0001"+
		"\u0000\u0000\u0000`\u04fb\u0001\u0000\u0000\u0000b\u0505\u0001\u0000\u0000"+
		"\u0000d\u0507\u0001\u0000\u0000\u0000f\u0509\u0001\u0000\u0000\u0000h"+
		"\u0510\u0001\u0000\u0000\u0000j\u0515\u0001\u0000\u0000\u0000l\u0531\u0001"+
		"\u0000\u0000\u0000np\u0003\u0002\u0001\u0000on\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000r\u00a5\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0003"+
		"\u0002\u0001\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u009b\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z\u009c\u0003\u0004\u0002\u0000"+
		"{\u009c\u0003\b\u0004\u0000|\u009c\u0003\f\u0006\u0000}\u009c\u0003\u0010"+
		"\b\u0000~\u009c\u0003\u0014\n\u0000\u007f\u009c\u0003\u0018\f\u0000\u0080"+
		"\u009c\u0003^/\u0000\u0081\u009c\u0003\u001c\u000e\u0000\u0082\u009c\u0003"+
		" \u0010\u0000\u0083\u009c\u0003$\u0012\u0000\u0084\u009c\u0003(\u0014"+
		"\u0000\u0085\u009c\u00030\u0018\u0000\u0086\u0088\u0003\u0002\u0001\u0000"+
		"\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0003:\u001d\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u009c\u00034\u001a\u0000\u0093\u009c"+
		"\u0003<\u001e\u0000\u0094\u009c\u0003@ \u0000\u0095\u009c\u0003D\"\u0000"+
		"\u0096\u009c\u0003H$\u0000\u0097\u009c\u0003L&\u0000\u0098\u009c\u0003"+
		"\\.\u0000\u0099\u009c\u0003Z-\u0000\u009a\u009c\u0003P(\u0000\u009bz\u0001"+
		"\u0000\u0000\u0000\u009b{\u0001\u0000\u0000\u0000\u009b|\u0001\u0000\u0000"+
		"\u0000\u009b}\u0001\u0000\u0000\u0000\u009b~\u0001\u0000\u0000\u0000\u009b"+
		"\u007f\u0001\u0000\u0000\u0000\u009b\u0080\u0001\u0000\u0000\u0000\u009b"+
		"\u0081\u0001\u0000\u0000\u0000\u009b\u0082\u0001\u0000\u0000\u0000\u009b"+
		"\u0083\u0001\u0000\u0000\u0000\u009b\u0084\u0001\u0000\u0000\u0000\u009b"+
		"\u0085\u0001\u0000\u0000\u0000\u009b\u008f\u0001\u0000\u0000\u0000\u009b"+
		"\u0093\u0001\u0000\u0000\u0000\u009b\u0094\u0001\u0000\u0000\u0000\u009b"+
		"\u0095\u0001\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009b"+
		"\u0097\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u00a0\u0001\u0000\u0000\u0000\u009d\u009f\u0003\u0002\u0001\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"w\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0003\u0002\u0001\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b2\u0003X,\u0000\u00af\u00b1\u0003\u0002"+
		"\u0001\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b9\u0003\u0004\u0002\u0000\u00b6\u00b8\u0003\u0002"+
		"\u0001\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0003T*\u0000\u00bd\u0001\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0007\u0000\u0000\u0000\u00bf\u0003\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c2\u0003\u0002\u0001\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u0006\u0003\u0000"+
		"\u00c7\u0005\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\u0001\u0000\u0000"+
		"\u00c9\u00cb\u0003\u0002\u0001\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d0\u0005\u0002\u0000\u0000\u00cf\u00d1\u0003\u0002\u0001\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d8\u0003`0\u0000\u00d5\u00d7"+
		"\u0003\u0002\u0001\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u00051\u0000\u0000\u00dc\u00ed\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e1\u0005\u0001\u0000\u0000\u00de\u00e0\u0003"+
		"\u0002\u0001\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e8\u0005\u001a\u0000\u0000\u00e5\u00e7\u0003"+
		"\u0002\u0001\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ed\u00051\u0000\u0000\u00ec\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ec\u00dd\u0001\u0000\u0000\u0000\u00ed\u0007\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f0\u0003\u0002\u0001\u0000\u00ef\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003\n\u0005"+
		"\u0000\u00f5\t\u0001\u0000\u0000\u0000\u00f6\u00f8\u0005\u0005\u0000\u0000"+
		"\u00f7\u00f9\u0003\u0002\u0001\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fe\u0005\u0014\u0000\u0000\u00fd\u00ff\u0003\u0002\u0001\u0000"+
		"\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0005\u0015\u0000\u0000"+
		"\u0103\u0105\u0003\u0002\u0001\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0005\u0016\u0000\u0000\u0109\u010b\b\u0001\u0000\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u00051\u0000\u0000\u010f\u000b"+
		"\u0001\u0000\u0000\u0000\u0110\u0112\u0003\u0002\u0001\u0000\u0111\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0003\u000e\u0007\u0000\u0117\r\u0001\u0000\u0000\u0000\u0118\u011a\u0005"+
		"\u0005\u0000\u0000\u0119\u011b\u0003\u0002\u0001\u0000\u011a\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u0005\u001f\u0000\u0000\u011f\u0121\u0003"+
		"\u0002\u0001\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0003"+
		"`0\u0000\u0125\u0127\b\u0001\u0000\u0000\u0126\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u00051\u0000\u0000\u012b\u000f\u0001\u0000\u0000\u0000"+
		"\u012c\u012e\u0003\u0002\u0001\u0000\u012d\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0003\u0012\t\u0000\u0133"+
		"\u0011\u0001\u0000\u0000\u0000\u0134\u0136\u0005\u0007\u0000\u0000\u0135"+
		"\u0137\u0003\u0002\u0001\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u013e\u0005 \u0000\u0000\u013b\u013d\b\u0001\u0000\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u00051\u0000\u0000\u0142\u0013\u0001\u0000\u0000\u0000\u0143\u0145\u0003"+
		"\u0002\u0001\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001"+
		"\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0003\u0016\u000b\u0000\u014a\u0015\u0001"+
		"\u0000\u0000\u0000\u014b\u014f\u0005\u0005\u0000\u0000\u014c\u014e\u0003"+
		"\u0002\u0001\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001"+
		"\u0000\u0000\u0000\u0152\u0154\u0005\f\u0000\u0000\u0153\u0152\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0158\u0001\u0000"+
		"\u0000\u0000\u0155\u0157\u0003\u0002\u0001\u0000\u0156\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000"+
		"\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015f\u0007\u0002"+
		"\u0000\u0000\u015c\u015e\u0003\u0002\u0001\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0164\b\u0003\u0000"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0005\u000e\u0000"+
		"\u0000\u0168\u016a\b\u0001\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u00051\u0000\u0000\u016e\u0017\u0001\u0000\u0000\u0000\u016f"+
		"\u0171\u0003\u0002\u0001\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0175\u0176\u0003\u001a\r\u0000\u0176\u0019"+
		"\u0001\u0000\u0000\u0000\u0177\u0179\u0005\u0007\u0000\u0000\u0178\u017a"+
		"\u0003\u0002\u0001\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f"+
		"\u0005\u000e\u0000\u0000\u017e\u0180\b\u0001\u0000\u0000\u017f\u017e\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u017f\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u00051\u0000\u0000\u0184\u001b\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0003\u0002\u0001\u0000\u0186\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b\u0001\u0000"+
		"\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018c\u0003\u001e"+
		"\u000f\u0000\u018c\u001d\u0001\u0000\u0000\u0000\u018d\u018f\u0005\u0005"+
		"\u0000\u0000\u018e\u0190\u0003\u0002\u0001\u0000\u018f\u018e\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000"+
		"\u0000\u0000\u0193\u0195\u0005\u000f\u0000\u0000\u0194\u0196\b\u0001\u0000"+
		"\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u00051\u0000\u0000"+
		"\u019a\u001f\u0001\u0000\u0000\u0000\u019b\u019d\u0003\u0002\u0001\u0000"+
		"\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000"+
		"\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000"+
		"\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a3\u0003:\u001d\u0000\u01a2\u019e\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a5\u01aa\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a9\u0003\u0002\u0001\u0000\u01a8"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0003\"\u0011\u0000\u01ae!\u0001\u0000\u0000\u0000\u01af\u01b1"+
		"\u0005\u0005\u0000\u0000\u01b0\u01b2\u0003\u0002\u0001\u0000\u01b1\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b7\u0005\u0003\u0000\u0000\u01b6\u01b8"+
		"\u0003\u0002\u0001\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd"+
		"\u0003`0\u0000\u01bc\u01be\b\u0001\u0000\u0000\u01bd\u01bc\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u00051\u0000\u0000\u01c2#\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c5\u0003\u0002\u0001\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003&\u0013\u0000\u01ca"+
		"%\u0001\u0000\u0000\u0000\u01cb\u01cd\u0005\u0005\u0000\u0000\u01cc\u01ce"+
		"\u0003\u0002\u0001\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3"+
		"\u0005\u0004\u0000\u0000\u01d2\u01d4\u0003\u0002\u0001\u0000\u01d3\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d9\u0003`0\u0000\u01d8\u01da\b\u0001"+
		"\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u00051\u0000"+
		"\u0000\u01de\'\u0001\u0000\u0000\u0000\u01df\u01e1\u0003\u0002\u0001\u0000"+
		"\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e3\u01ee\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e7\u0003\u0002\u0001\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ed\u0003:\u001d\u0000\u01ec"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f3\u0003\u0002\u0001\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f7\u0219\u0003,\u0016\u0000\u01f8\u01fa"+
		"\u0003\u0002\u0001\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fc\u0215\u0001\u0000\u0000\u0000\u01fd\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fe\u0216\u0003*\u0015\u0000\u01ff\u0216\u0003"+
		".\u0017\u0000\u0200\u0216\u00032\u0019\u0000\u0201\u0216\u00036\u001b"+
		"\u0000\u0202\u0204\u0003\u0002\u0001\u0000\u0203\u0202\u0001\u0000\u0000"+
		"\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000"+
		"\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u020a\u0003:\u001d\u0000"+
		"\u0209\u0205\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000"+
		"\u020c\u0211\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000"+
		"\u020e\u0210\u0003\u0002\u0001\u0000\u020f\u020e\u0001\u0000\u0000\u0000"+
		"\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0214\u0001\u0000\u0000\u0000"+
		"\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0216\u00038\u001c\u0000\u0215"+
		"\u01fe\u0001\u0000\u0000\u0000\u0215\u01ff\u0001\u0000\u0000\u0000\u0215"+
		"\u0200\u0001\u0000\u0000\u0000\u0215\u0201\u0001\u0000\u0000\u0000\u0215"+
		"\u020b\u0001\u0000\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000\u0217"+
		"\u01fb\u0001\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219"+
		"\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a"+
		")\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u021e"+
		"\u0005%\u0000\u0000\u021d\u021f\b\u0001\u0000\u0000\u021e\u021d\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u021e\u0001"+
		"\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u00051\u0000\u0000\u0223+\u0001\u0000\u0000"+
		"\u0000\u0224\u0226\u0005\u0005\u0000\u0000\u0225\u0227\u0003\u0002\u0001"+
		"\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000"+
		"\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022c\u0005\u0010\u0000"+
		"\u0000\u022b\u022d\b\u0004\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000"+
		"\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000"+
		"\u0230\u0231\u00051\u0000\u0000\u0231-\u0001\u0000\u0000\u0000\u0232\u0234"+
		"\u0005\u0007\u0000\u0000\u0233\u0235\u0003\u0002\u0001\u0000\u0234\u0233"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0234"+
		"\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0001\u0000\u0000\u0000\u0238\u023a\u0005\u0010\u0000\u0000\u0239\u023b"+
		"\u0003\u0002\u0001\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023b\u023c"+
		"\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023d"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u0240"+
		"\u0003`0\u0000\u023f\u0241\u0003\u0002\u0001\u0000\u0240\u023f\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000"+
		"\u0000\u0000\u0244\u0253\u0005\u0011\u0000\u0000\u0245\u0247\u0003\u0002"+
		"\u0001\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000"+
		"\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000"+
		"\u0000\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000"+
		"\u0000\u0000\u024b\u024f\u0005)\u0000\u0000\u024c\u024e\u0003\u0002\u0001"+
		"\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024e\u0251\u0001\u0000\u0000"+
		"\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000"+
		"\u0000\u0250\u0252\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0252\u0254\u0003`0\u0000\u0253\u0248\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0001\u0000\u0000\u0000\u0255"+
		"\u0257\u0003\u0002\u0001\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257"+
		"\u0258\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a"+
		"\u025e\u0005\u0012\u0000\u0000\u025b\u025d\u0003\u0002\u0001\u0000\u025c"+
		"\u025b\u0001\u0000\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e"+
		"\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"+
		"\u0261\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261"+
		"\u0265\u0005-\u0000\u0000\u0262\u0264\b\u0005\u0000\u0000\u0263\u0262"+
		"\u0001\u0000\u0000\u0000\u0264\u0267\u0001\u0000\u0000\u0000\u0265\u0263"+
		"\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0268"+
		"\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u026c"+
		"\u0005.\u0000\u0000\u0269\u026b\b\u0001\u0000\u0000\u026a\u0269\u0001"+
		"\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026a\u0001"+
		"\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026f\u0001"+
		"\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0270\u0005"+
		"1\u0000\u0000\u0270/\u0001\u0000\u0000\u0000\u0271\u0273\u0003\u0002\u0001"+
		"\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0276\u0001\u0000\u0000"+
		"\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000"+
		"\u0000\u0275\u0277\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000"+
		"\u0000\u0277\u0279\u0005\u0007\u0000\u0000\u0278\u027a\u0003\u0002\u0001"+
		"\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000"+
		"\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027f\u0005\u0010\u0000"+
		"\u0000\u027e\u0280\u0003\u0002\u0001\u0000\u027f\u027e\u0001\u0000\u0000"+
		"\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000"+
		"\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000"+
		"\u0000\u0283\u0285\u0003`0\u0000\u0284\u0286\u0003\u0002\u0001\u0000\u0285"+
		"\u0284\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287"+
		"\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0001\u0000\u0000\u0000\u0289\u028b\u0005\u0011\u0000\u0000\u028a"+
		"\u028c\u0003\u0002\u0001\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f"+
		"\u0291\u0005)\u0000\u0000\u0290\u0292\u0003\u0002\u0001\u0000\u0291\u0290"+
		"\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0291"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295"+
		"\u0001\u0000\u0000\u0000\u0295\u0299\u0003`0\u0000\u0296\u0298\u0003\u0002"+
		"\u0001\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0298\u029b\u0001\u0000"+
		"\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000"+
		"\u0000\u0000\u029a\u029c\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000"+
		"\u0000\u0000\u029c\u02a0\u0005\u0013\u0000\u0000\u029d\u029f\u0003\u0002"+
		"\u0001\u0000\u029e\u029d\u0001\u0000\u0000\u0000\u029f\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a5\b\u0001\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a9\u00051\u0000\u0000\u02a91\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ac\u0005\u0007\u0000\u0000\u02ab\u02ad\u0003\u0002\u0001\u0000\u02ac"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b2\u0005\u0010\u0000\u0000\u02b1"+
		"\u02b3\u0003\u0002\u0001\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b8\u0003`0\u0000\u02b7\u02b9\u0003\u0002\u0001\u0000\u02b8\u02b7\u0001"+
		"\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bc\u02cb\u0005\u0011\u0000\u0000\u02bd\u02bf\u0003"+
		"\u0002\u0001\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c6\u0005"+
		")\u0000\u0000\u02c3\u02c5\u0003\u0002\u0001\u0000\u02c4\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c8\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c9\u0001\u0000"+
		"\u0000\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c9\u02ca\u0003`0\u0000"+
		"\u02ca\u02cc\u0001\u0000\u0000\u0000\u02cb\u02be\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02d0\u0001\u0000\u0000\u0000"+
		"\u02cd\u02cf\u0003\u0002\u0001\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d2\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d5\u0005\u0017\u0000\u0000"+
		"\u02d4\u02d6\b\u0001\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d8\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9"+
		"\u02da\u00051\u0000\u0000\u02da3\u0001\u0000\u0000\u0000\u02db\u02dd\u0003"+
		"\u0002\u0001\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001"+
		"\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001"+
		"\u0000\u0000\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02de\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e3\u0005\u0007\u0000\u0000\u02e2\u02e4\u0003"+
		"\u0002\u0001\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e9\u0005"+
		"\u0010\u0000\u0000\u02e8\u02ea\u0003\u0002\u0001\u0000\u02e9\u02e8\u0001"+
		"\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001"+
		"\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ef\u0003`0\u0000\u02ee\u02f0\u0003\u0002\u0001"+
		"\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000"+
		"\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5\u0005\u0011\u0000"+
		"\u0000\u02f4\u02f6\u0003\u0002\u0001\u0000\u02f5\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fd\u0005)\u0000\u0000\u02fa\u02fc\u0003\u0002\u0001\u0000"+
		"\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fc\u02ff\u0001\u0000\u0000\u0000"+
		"\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000"+
		"\u02fe\u0300\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000"+
		"\u0300\u0304\u0003`0\u0000\u0301\u0303\u0003\u0002\u0001\u0000\u0302\u0301"+
		"\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000\u0000\u0304\u0302"+
		"\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0307"+
		"\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0307\u0309"+
		"\u0005\u0018\u0000\u0000\u0308\u030a\b\u0006\u0000\u0000\u0309\u0308\u0001"+
		"\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u0309\u0001"+
		"\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0001"+
		"\u0000\u0000\u0000\u030d\u030e\u00051\u0000\u0000\u030e5\u0001\u0000\u0000"+
		"\u0000\u030f\u0311\u0003\u0002\u0001\u0000\u0310\u030f\u0001\u0000\u0000"+
		"\u0000\u0311\u0314\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000"+
		"\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0315\u0001\u0000\u0000"+
		"\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0315\u0317\u0005\u0007\u0000"+
		"\u0000\u0316\u0318\u0003\u0002\u0001\u0000\u0317\u0316\u0001\u0000\u0000"+
		"\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000"+
		"\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000"+
		"\u0000\u031b\u031d\u0005\u0010\u0000\u0000\u031c\u031e\u0003\u0002\u0001"+
		"\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000"+
		"\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0323\u0003`0\u0000\u0322"+
		"\u0324\u0003\u0002\u0001\u0000\u0323\u0322\u0001\u0000\u0000\u0000\u0324"+
		"\u0325\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325"+
		"\u0326\u0001\u0000\u0000\u0000\u0326\u0328\u0001\u0000\u0000\u0000\u0327"+
		"\u0329\b\u0007\u0000\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0329\u032a"+
		"\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b"+
		"\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032d"+
		"\u00051\u0000\u0000\u032d7\u0001\u0000\u0000\u0000\u032e\u0330\u0005\u0005"+
		"\u0000\u0000\u032f\u0331\u0003\u0002\u0001\u0000\u0330\u032f\u0001\u0000"+
		"\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000"+
		"\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u033c\u0001\u0000"+
		"\u0000\u0000\u0334\u0336\u0005\u0017\u0000\u0000\u0335\u0334\u0001\u0000"+
		"\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0338\u0001\u0000"+
		"\u0000\u0000\u0337\u0339\u0003\u0002\u0001\u0000\u0338\u0337\u0001\u0000"+
		"\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u0338\u0001\u0000"+
		"\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033d\u0001\u0000"+
		"\u0000\u0000\u033c\u0335\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000"+
		"\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u0340\u0005\b\u0000"+
		"\u0000\u033f\u0341\u0003\u0002\u0001\u0000\u0340\u033f\u0001\u0000\u0000"+
		"\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000"+
		"\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000"+
		"\u0000\u0344\u0346\u0003`0\u0000\u0345\u0347\b\u0001\u0000\u0000\u0346"+
		"\u0345\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348"+
		"\u0346\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349"+
		"\u034a\u0001\u0000\u0000\u0000\u034a\u034b\u00051\u0000\u0000\u034b9\u0001"+
		"\u0000\u0000\u0000\u034c\u034e\u0003\u0002\u0001\u0000\u034d\u034c\u0001"+
		"\u0000\u0000\u0000\u034e\u0351\u0001\u0000\u0000\u0000\u034f\u034d\u0001"+
		"\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0352\u0001"+
		"\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0352\u0354\u0005"+
		"\u001b\u0000\u0000\u0353\u0355\b\u0001\u0000\u0000\u0354\u0353\u0001\u0000"+
		"\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0354\u0001\u0000"+
		"\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u00051\u0000\u0000\u0359;\u0001\u0000\u0000\u0000"+
		"\u035a\u035c\u0003\u0002\u0001\u0000\u035b\u035a\u0001\u0000\u0000\u0000"+
		"\u035c\u035f\u0001\u0000\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000"+
		"\u035d\u035e\u0001\u0000\u0000\u0000\u035e\u0360\u0001\u0000\u0000\u0000"+
		"\u035f\u035d\u0001\u0000\u0000\u0000\u0360\u0362\u0003:\u001d\u0000\u0361"+
		"\u035d\u0001\u0000\u0000\u0000\u0362\u0365\u0001\u0000\u0000\u0000\u0363"+
		"\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364"+
		"\u0369\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0366"+
		"\u0368\u0003\u0002\u0001\u0000\u0367\u0366\u0001\u0000\u0000\u0000\u0368"+
		"\u036b\u0001\u0000\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u0369"+
		"\u036a\u0001\u0000\u0000\u0000\u036a\u036c\u0001\u0000\u0000\u0000\u036b"+
		"\u0369\u0001\u0000\u0000\u0000\u036c\u036d\u0003>\u001f\u0000\u036d=\u0001"+
		"\u0000\u0000\u0000\u036e\u0370\u0005\u0005\u0000\u0000\u036f\u0371\u0003"+
		"\u0002\u0001\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0371\u0372\u0001"+
		"\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373\u0001"+
		"\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0376\u0005"+
		"$\u0000\u0000\u0375\u0377\u0003\u0002\u0001\u0000\u0376\u0375\u0001\u0000"+
		"\u0000\u0000\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u0376\u0001\u0000"+
		"\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000"+
		"\u0000\u0000\u037a\u037e\u0003`0\u0000\u037b\u037d\u0003\u0002\u0001\u0000"+
		"\u037c\u037b\u0001\u0000\u0000\u0000\u037d\u0380\u0001\u0000\u0000\u0000"+
		"\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000"+
		"\u037f\u0381\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000"+
		"\u0381\u0385\u0005-\u0000\u0000\u0382\u0384\b\u0005\u0000\u0000\u0383"+
		"\u0382\u0001\u0000\u0000\u0000\u0384\u0387\u0001\u0000\u0000\u0000\u0385"+
		"\u0383\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386"+
		"\u0388\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0388"+
		"\u038a\u0005.\u0000\u0000\u0389\u038b\b\u0001\u0000\u0000\u038a\u0389"+
		"\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038a"+
		"\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038e"+
		"\u0001\u0000\u0000\u0000\u038e\u039d\u00051\u0000\u0000\u038f\u0391\u0003"+
		"\u0002\u0001\u0000\u0390\u038f\u0001\u0000\u0000\u0000\u0391\u0394\u0001"+
		"\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0392\u0393\u0001"+
		"\u0000\u0000\u0000\u0393\u0395\u0001\u0000\u0000\u0000\u0394\u0392\u0001"+
		"\u0000\u0000\u0000\u0395\u0399\u0005(\u0000\u0000\u0396\u0398\u0003\u0002"+
		"\u0001\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0398\u039b\u0001\u0000"+
		"\u0000\u0000\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000"+
		"\u0000\u0000\u039a\u039c\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000"+
		"\u0000\u0000\u039c\u039e\u00051\u0000\u0000\u039d\u0392\u0001\u0000\u0000"+
		"\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e?\u0001\u0000\u0000\u0000"+
		"\u039f\u03a1\u0003\u0002\u0001\u0000\u03a0\u039f\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a4\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a7\u0003:\u001d\u0000\u03a6"+
		"\u03a2\u0001\u0000\u0000\u0000\u03a7\u03aa\u0001\u0000\u0000\u0000\u03a8"+
		"\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9"+
		"\u03ae\u0001\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03ab"+
		"\u03ad\u0003\u0002\u0001\u0000\u03ac\u03ab\u0001\u0000\u0000\u0000\u03ad"+
		"\u03b0\u0001\u0000\u0000\u0000\u03ae\u03ac\u0001\u0000\u0000\u0000\u03ae"+
		"\u03af\u0001\u0000\u0000\u0000\u03af\u03b1\u0001\u0000\u0000\u0000\u03b0"+
		"\u03ae\u0001\u0000\u0000\u0000\u03b1\u03b2\u0003B!\u0000\u03b2A\u0001"+
		"\u0000\u0000\u0000\u03b3\u03b5\u0005\u0005\u0000\u0000\u03b4\u03b6\u0003"+
		"\u0002\u0001\u0000\u03b5\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001"+
		"\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001"+
		"\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03bb\u0005"+
		"\"\u0000\u0000\u03ba\u03bc\u0003\u0002\u0001\u0000\u03bb\u03ba\u0001\u0000"+
		"\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001\u0000"+
		"\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000"+
		"\u0000\u0000\u03bf\u03c1\u0003`0\u0000\u03c0\u03c2\b\u0001\u0000\u0000"+
		"\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000"+
		"\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c6\u00051\u0000\u0000\u03c6"+
		"C\u0001\u0000\u0000\u0000\u03c7\u03c9\u0003\u0002\u0001\u0000\u03c8\u03c7"+
		"\u0001\u0000\u0000\u0000\u03c9\u03cc\u0001\u0000\u0000\u0000\u03ca\u03c8"+
		"\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000\u03cb\u03cd"+
		"\u0001\u0000\u0000\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cd\u03ce"+
		"\u0003F#\u0000\u03ceE\u0001\u0000\u0000\u0000\u03cf\u03d1\u0005\u0005"+
		"\u0000\u0000\u03d0\u03d2\u0003\u0002\u0001\u0000\u03d1\u03d0\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d1\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d7\u0005\u0006\u0000\u0000\u03d6\u03d8\u0003\u0002"+
		"\u0001\u0000\u03d7\u03d6\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000"+
		"\u0000\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03d9\u03da\u0001\u0000"+
		"\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dd\u0003`0\u0000"+
		"\u03dc\u03de\b\u0001\u0000\u0000\u03dd\u03dc\u0001\u0000\u0000\u0000\u03de"+
		"\u03df\u0001\u0000\u0000\u0000\u03df\u03dd\u0001\u0000\u0000\u0000\u03df"+
		"\u03e0\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1"+
		"\u03e2\u00051\u0000\u0000\u03e2G\u0001\u0000\u0000\u0000\u03e3\u03e5\u0003"+
		"\u0002\u0001\u0000\u03e4\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e8\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001"+
		"\u0000\u0000\u0000\u03e7\u03e9\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e9\u03eb\u0003:\u001d\u0000\u03ea\u03e6\u0001\u0000"+
		"\u0000\u0000\u03eb\u03ee\u0001\u0000\u0000\u0000\u03ec\u03ea\u0001\u0000"+
		"\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u03f2\u0001\u0000"+
		"\u0000\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ef\u03f1\u0003\u0002"+
		"\u0001\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000"+
		"\u0000\u0000\u03f3\u03f5\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f6\u0003J%\u0000\u03f6I\u0001\u0000\u0000\u0000"+
		"\u03f7\u03f9\u0005\u0005\u0000\u0000\u03f8\u03fa\u0003\u0002\u0001\u0000"+
		"\u03f9\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000"+
		"\u03fb\u03f9\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000"+
		"\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u03ff\u0005#\u0000\u0000\u03fe"+
		"\u0400\u0003\u0002\u0001\u0000\u03ff\u03fe\u0001\u0000\u0000\u0000\u0400"+
		"\u0401\u0001\u0000\u0000\u0000\u0401\u03ff\u0001\u0000\u0000\u0000\u0401"+
		"\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403"+
		"\u0407\u0003`0\u0000\u0404\u0406\u0003\u0002\u0001\u0000\u0405\u0404\u0001"+
		"\u0000\u0000\u0000\u0406\u0409\u0001\u0000\u0000\u0000\u0407\u0405\u0001"+
		"\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u040d\u0001"+
		"\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u040a\u040c\b\b"+
		"\u0000\u0000\u040b\u040a\u0001\u0000\u0000\u0000\u040c\u040f\u0001\u0000"+
		"\u0000\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000"+
		"\u0000\u0000\u040e\u0410\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000"+
		"\u0000\u0000\u0410\u0414\u0005\'\u0000\u0000\u0411\u0413\u0003\u0002\u0001"+
		"\u0000\u0412\u0411\u0001\u0000\u0000\u0000\u0413\u0416\u0001\u0000\u0000"+
		"\u0000\u0414\u0412\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000\u0000"+
		"\u0000\u0415\u0418\u0001\u0000\u0000\u0000\u0416\u0414\u0001\u0000\u0000"+
		"\u0000\u0417\u0419\b\t\u0000\u0000\u0418\u0417\u0001\u0000\u0000\u0000"+
		"\u0419\u041a\u0001\u0000\u0000\u0000\u041a\u0418\u0001\u0000\u0000\u0000"+
		"\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041f\u0001\u0000\u0000\u0000"+
		"\u041c\u041e\u0003\u0002\u0001\u0000\u041d\u041c\u0001\u0000\u0000\u0000"+
		"\u041e\u0421\u0001\u0000\u0000\u0000\u041f\u041d\u0001\u0000\u0000\u0000"+
		"\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0422\u0001\u0000\u0000\u0000"+
		"\u0421\u041f\u0001\u0000\u0000\u0000\u0422\u0426\u0005(\u0000\u0000\u0423"+
		"\u0425\u0003\u0002\u0001\u0000\u0424\u0423\u0001\u0000\u0000\u0000\u0425"+
		"\u0428\u0001\u0000\u0000\u0000\u0426\u0424\u0001\u0000\u0000\u0000\u0426"+
		"\u0427\u0001\u0000\u0000\u0000\u0427\u0429\u0001\u0000\u0000\u0000\u0428"+
		"\u0426\u0001\u0000\u0000\u0000\u0429\u042a\u00051\u0000\u0000\u042a\u0431"+
		"\u0001\u0000\u0000\u0000\u042b\u042d\b\n\u0000\u0000\u042c\u042b\u0001"+
		"\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u042c\u0001"+
		"\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000\u042f\u0431\u0001"+
		"\u0000\u0000\u0000\u0430\u03f7\u0001\u0000\u0000\u0000\u0430\u042c\u0001"+
		"\u0000\u0000\u0000\u0431K\u0001\u0000\u0000\u0000\u0432\u0434\u0003\u0002"+
		"\u0001\u0000\u0433\u0432\u0001\u0000\u0000\u0000\u0434\u0437\u0001\u0000"+
		"\u0000\u0000\u0435\u0433\u0001\u0000\u0000\u0000\u0435\u0436\u0001\u0000"+
		"\u0000\u0000\u0436\u0438\u0001\u0000\u0000\u0000\u0437\u0435\u0001\u0000"+
		"\u0000\u0000\u0438\u043a\u0003:\u001d\u0000\u0439\u0435\u0001\u0000\u0000"+
		"\u0000\u043a\u043d\u0001\u0000\u0000\u0000\u043b\u0439\u0001\u0000\u0000"+
		"\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u0441\u0001\u0000\u0000"+
		"\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043e\u0440\u0003\u0002\u0001"+
		"\u0000\u043f\u043e\u0001\u0000\u0000\u0000\u0440\u0443\u0001\u0000\u0000"+
		"\u0000\u0441\u043f\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000"+
		"\u0000\u0442\u0444\u0001\u0000\u0000\u0000\u0443\u0441\u0001\u0000\u0000"+
		"\u0000\u0444\u0445\u0003N\'\u0000\u0445M\u0001\u0000\u0000\u0000\u0446"+
		"\u0448\u0005\u0005\u0000\u0000\u0447\u0449\u0003\u0002\u0001\u0000\u0448"+
		"\u0447\u0001\u0000\u0000\u0000\u0449\u044a\u0001\u0000\u0000\u0000\u044a"+
		"\u0448\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b"+
		"\u044c\u0001\u0000\u0000\u0000\u044c\u044e\u0005&\u0000\u0000\u044d\u044f"+
		"\u0003\u0002\u0001\u0000\u044e\u044d\u0001\u0000\u0000\u0000\u044f\u0450"+
		"\u0001\u0000\u0000\u0000\u0450\u044e\u0001\u0000\u0000\u0000\u0450\u0451"+
		"\u0001\u0000\u0000\u0000\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0454"+
		"\u0003`0\u0000\u0453\u0455\b\u0001\u0000\u0000\u0454\u0453\u0001\u0000"+
		"\u0000\u0000\u0455\u0456\u0001\u0000\u0000\u0000\u0456\u0454\u0001\u0000"+
		"\u0000\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u0458\u0001\u0000"+
		"\u0000\u0000\u0458\u0461\u00051\u0000\u0000\u0459\u045b\u0003\u0002\u0001"+
		"\u0000\u045a\u0459\u0001\u0000\u0000\u0000\u045b\u045e\u0001\u0000\u0000"+
		"\u0000\u045c\u045a\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000"+
		"\u0000\u045d\u045f\u0001\u0000\u0000\u0000\u045e\u045c\u0001\u0000\u0000"+
		"\u0000\u045f\u0460\u0005(\u0000\u0000\u0460\u0462\u00051\u0000\u0000\u0461"+
		"\u045c\u0001\u0000\u0000\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462"+
		"O\u0001\u0000\u0000\u0000\u0463\u0465\u0003\u0002\u0001\u0000\u0464\u0463"+
		"\u0001\u0000\u0000\u0000\u0465\u0468\u0001\u0000\u0000\u0000\u0466\u0464"+
		"\u0001\u0000\u0000\u0000\u0466\u0467\u0001\u0000\u0000\u0000\u0467\u0469"+
		"\u0001\u0000\u0000\u0000\u0468\u0466\u0001\u0000\u0000\u0000\u0469\u046a"+
		"\u0003R)\u0000\u046aQ\u0001\u0000\u0000\u0000\u046b\u046d\u0005\u0019"+
		"\u0000\u0000\u046c\u046e\b\u0001\u0000\u0000\u046d\u046c\u0001\u0000\u0000"+
		"\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000\u0000"+
		"\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u0471\u0001\u0000\u0000"+
		"\u0000\u0471\u0472\u00051\u0000\u0000\u0472S\u0001\u0000\u0000\u0000\u0473"+
		"\u0475\u0003\u0002\u0001\u0000\u0474\u0473\u0001\u0000\u0000\u0000\u0475"+
		"\u0478\u0001\u0000\u0000\u0000\u0476\u0474\u0001\u0000\u0000\u0000\u0476"+
		"\u0477\u0001\u0000\u0000\u0000\u0477\u0479\u0001\u0000\u0000\u0000\u0478"+
		"\u0476\u0001\u0000\u0000\u0000\u0479\u047d\u0005\u001e\u0000\u0000\u047a"+
		"\u047c\u0003\u0002\u0001\u0000\u047b\u047a\u0001\u0000\u0000\u0000\u047c"+
		"\u047f\u0001\u0000\u0000\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047d"+
		"\u047e\u0001\u0000\u0000\u0000\u047e\u0481\u0001\u0000\u0000\u0000\u047f"+
		"\u047d\u0001\u0000\u0000\u0000\u0480\u0482\b\u000b\u0000\u0000\u0481\u0480"+
		"\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483\u0481"+
		"\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000\u0484U\u0001"+
		"\u0000\u0000\u0000\u0485\u0486\u0003\u0002\u0001\u0000\u0486W\u0001\u0000"+
		"\u0000\u0000\u0487\u0489\u0003\u0002\u0001\u0000\u0488\u0487\u0001\u0000"+
		"\u0000\u0000\u0489\u048c\u0001\u0000\u0000\u0000\u048a\u0488\u0001\u0000"+
		"\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048d\u0001\u0000"+
		"\u0000\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048d\u048f\u0005\u001d"+
		"\u0000\u0000\u048e\u0490\b\u0001\u0000\u0000\u048f\u048e\u0001\u0000\u0000"+
		"\u0000\u0490\u0491\u0001\u0000\u0000\u0000\u0491\u048f\u0001\u0000\u0000"+
		"\u0000\u0491\u0492\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000\u0000"+
		"\u0000\u0493\u0494\u00051\u0000\u0000\u0494Y\u0001\u0000\u0000\u0000\u0495"+
		"\u0497\u0003\u0002\u0001\u0000\u0496\u0495\u0001\u0000\u0000\u0000\u0497"+
		"\u049a\u0001\u0000\u0000\u0000\u0498\u0496\u0001\u0000\u0000\u0000\u0498"+
		"\u0499\u0001\u0000\u0000\u0000\u0499\u049b\u0001\u0000\u0000\u0000\u049a"+
		"\u0498\u0001\u0000\u0000\u0000\u049b\u049f\u0005\u0005\u0000\u0000\u049c"+
		"\u049e\u0003V+\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049e\u04a1\u0001"+
		"\u0000\u0000\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u049f\u04a0\u0001"+
		"\u0000\u0000\u0000\u04a0\u04a2\u0001\u0000\u0000\u0000\u04a1\u049f\u0001"+
		"\u0000\u0000\u0000\u04a2\u04a4\u0005\u001c\u0000\u0000\u04a3\u04a5\b\u0001"+
		"\u0000\u0000\u04a4\u04a3\u0001\u0000\u0000\u0000\u04a5\u04a6\u0001\u0000"+
		"\u0000\u0000\u04a6\u04a4\u0001\u0000\u0000\u0000\u04a6\u04a7\u0001\u0000"+
		"\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8\u04a9\u00051\u0000"+
		"\u0000\u04a9[\u0001\u0000\u0000\u0000\u04aa\u04ac\u0003\u0002\u0001\u0000"+
		"\u04ab\u04aa\u0001\u0000\u0000\u0000\u04ac\u04af\u0001\u0000\u0000\u0000"+
		"\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000"+
		"\u04ae\u04b0\u0001\u0000\u0000\u0000\u04af\u04ad\u0001\u0000\u0000\u0000"+
		"\u04b0\u04b4\u0005\u0005\u0000\u0000\u04b1\u04b3\u0003\u0002\u0001\u0000"+
		"\u04b2\u04b1\u0001\u0000\u0000\u0000\u04b3\u04b6\u0001\u0000\u0000\u0000"+
		"\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b5\u04b7\u0001\u0000\u0000\u0000\u04b6\u04b4\u0001\u0000\u0000\u0000"+
		"\u04b7\u04bb\u0005*\u0000\u0000\u04b8\u04ba\u0003\u0002\u0001\u0000\u04b9"+
		"\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bd\u0001\u0000\u0000\u0000\u04bb"+
		"\u04b9\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc"+
		"\u04be\u0001\u0000\u0000\u0000\u04bd\u04bb\u0001\u0000\u0000\u0000\u04be"+
		"\u04c0\u0005+\u0000\u0000\u04bf\u04c1\b\u0001\u0000\u0000\u04c0\u04bf"+
		"\u0001\u0000\u0000\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000\u04c2\u04c0"+
		"\u0001\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u04c4"+
		"\u0001\u0000\u0000\u0000\u04c4\u04c5\u00051\u0000\u0000\u04c5]\u0001\u0000"+
		"\u0000\u0000\u04c6\u04c8\u0003\u0002\u0001\u0000\u04c7\u04c6\u0001\u0000"+
		"\u0000\u0000\u04c8\u04cb\u0001\u0000\u0000\u0000\u04c9\u04c7\u0001\u0000"+
		"\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000\u04ca\u04cc\u0001\u0000"+
		"\u0000\u0000\u04cb\u04c9\u0001\u0000\u0000\u0000\u04cc\u04d0\u0005\u0005"+
		"\u0000\u0000\u04cd\u04cf\u0003\u0002\u0001\u0000\u04ce\u04cd\u0001\u0000"+
		"\u0000\u0000\u04cf\u04d2\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001\u0000"+
		"\u0000\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u04d3\u0001\u0000"+
		"\u0000\u0000\u04d2\u04d0\u0001\u0000\u0000\u0000\u04d3\u04d7\u0005,\u0000"+
		"\u0000\u04d4\u04d6\u0003\u0002\u0001\u0000\u04d5\u04d4\u0001\u0000\u0000"+
		"\u0000\u04d6\u04d9\u0001\u0000\u0000\u0000\u04d7\u04d5\u0001\u0000\u0000"+
		"\u0000\u04d7\u04d8\u0001\u0000\u0000\u0000\u04d8\u04db\u0001\u0000\u0000"+
		"\u0000\u04d9\u04d7\u0001\u0000\u0000\u0000\u04da\u04dc\b\u0001\u0000\u0000"+
		"\u04db\u04da\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001\u0000\u0000\u0000"+
		"\u04dd\u04db\u0001\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000"+
		"\u04de\u04df\u0001\u0000\u0000\u0000\u04df\u04e0\u00051\u0000\u0000\u04e0"+
		"_\u0001\u0000\u0000\u0000\u04e1\u04e5\u0003b1\u0000\u04e2\u04e4\u0003"+
		"V+\u0000\u04e3\u04e2\u0001\u0000\u0000\u0000\u04e4\u04e7\u0001\u0000\u0000"+
		"\u0000\u04e5\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000"+
		"\u0000\u04e6\u04e8\u0001\u0000\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000"+
		"\u0000\u04e8\u04e9\u0005<\u0000\u0000\u04e9\u04eb\u0001\u0000\u0000\u0000"+
		"\u04ea\u04e1\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000"+
		"\u04eb\u04ef\u0001\u0000\u0000\u0000\u04ec\u04ee\u0003V+\u0000\u04ed\u04ec"+
		"\u0001\u0000\u0000\u0000\u04ee\u04f1\u0001\u0000\u0000\u0000\u04ef\u04ed"+
		"\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001\u0000\u0000\u0000\u04f0\u04f2"+
		"\u0001\u0000\u0000\u0000\u04f1\u04ef\u0001\u0000\u0000\u0000\u04f2\u04f6"+
		"\u0003d2\u0000\u04f3\u04f5\u0003V+\u0000\u04f4\u04f3\u0001\u0000\u0000"+
		"\u0000\u04f5\u04f8\u0001\u0000\u0000\u0000\u04f6\u04f4\u0001\u0000\u0000"+
		"\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u04f9\u0001\u0000\u0000"+
		"\u0000\u04f8\u04f6\u0001\u0000\u0000\u0000\u04f9\u04fa\u0005<\u0000\u0000"+
		"\u04fa\u04fc\u0001\u0000\u0000\u0000\u04fb\u04ea\u0001\u0000\u0000\u0000"+
		"\u04fb\u04fc\u0001\u0000\u0000\u0000\u04fc\u0500\u0001\u0000\u0000\u0000"+
		"\u04fd\u04ff\u0003V+\u0000\u04fe\u04fd\u0001\u0000\u0000\u0000\u04ff\u0502"+
		"\u0001\u0000\u0000\u0000\u0500\u04fe\u0001\u0000\u0000\u0000\u0500\u0501"+
		"\u0001\u0000\u0000\u0000\u0501\u0503\u0001\u0000\u0000\u0000\u0502\u0500"+
		"\u0001\u0000\u0000\u0000\u0503\u0504\u0003f3\u0000\u0504a\u0001\u0000"+
		"\u0000\u0000\u0505\u0506\u0003h4\u0000\u0506c\u0001\u0000\u0000\u0000"+
		"\u0507\u0508\u0003h4\u0000\u0508e\u0001\u0000\u0000\u0000\u0509\u050a"+
		"\u0003h4\u0000\u050ag\u0001\u0000\u0000\u0000\u050b\u0511\u0003l6\u0000"+
		"\u050c\u050d\u00052\u0000\u0000\u050d\u050e\u0003j5\u0000\u050e\u050f"+
		"\u00052\u0000\u0000\u050f\u0511\u0001\u0000\u0000\u0000\u0510\u050b\u0001"+
		"\u0000\u0000\u0000\u0510\u050c\u0001\u0000\u0000\u0000\u0511i\u0001\u0000"+
		"\u0000\u0000\u0512\u0514\u0003V+\u0000\u0513\u0512\u0001\u0000\u0000\u0000"+
		"\u0514\u0517\u0001\u0000\u0000\u0000\u0515\u0513\u0001\u0000\u0000\u0000"+
		"\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0518\u0001\u0000\u0000\u0000"+
		"\u0517\u0515\u0001\u0000\u0000\u0000\u0518\u051c\u0003l6\u0000\u0519\u051b"+
		"\u0003V+\u0000\u051a\u0519\u0001\u0000\u0000\u0000\u051b\u051e\u0001\u0000"+
		"\u0000\u0000\u051c\u051a\u0001\u0000\u0000\u0000\u051c\u051d\u0001\u0000"+
		"\u0000\u0000\u051d\u052e\u0001\u0000\u0000\u0000\u051e\u051c\u0001\u0000"+
		"\u0000\u0000\u051f\u0521\u0003V+\u0000\u0520\u051f\u0001\u0000\u0000\u0000"+
		"\u0521\u0524\u0001\u0000\u0000\u0000\u0522\u0520\u0001\u0000\u0000\u0000"+
		"\u0522\u0523\u0001\u0000\u0000\u0000\u0523\u0525\u0001\u0000\u0000\u0000"+
		"\u0524\u0522\u0001\u0000\u0000\u0000\u0525\u0529\u0003l6\u0000\u0526\u0528"+
		"\u0003V+\u0000\u0527\u0526\u0001\u0000\u0000\u0000\u0528\u052b\u0001\u0000"+
		"\u0000\u0000\u0529\u0527\u0001\u0000\u0000\u0000\u0529\u052a\u0001\u0000"+
		"\u0000\u0000\u052a\u052d\u0001\u0000\u0000\u0000\u052b\u0529\u0001\u0000"+
		"\u0000\u0000\u052c\u0522\u0001\u0000\u0000\u0000\u052d\u0530\u0001\u0000"+
		"\u0000\u0000\u052e\u052c\u0001\u0000\u0000\u0000\u052e\u052f\u0001\u0000"+
		"\u0000\u0000\u052fk\u0001\u0000\u0000\u0000\u0530\u052e\u0001\u0000\u0000"+
		"\u0000\u0531\u0532\u0007\f\u0000\u0000\u0532m\u0001\u0000\u0000\u0000"+
		"\u00b9qw\u0089\u008f\u009b\u00a0\u00a5\u00ab\u00b2\u00b9\u00c3\u00cc\u00d2"+
		"\u00d8\u00e1\u00e8\u00ec\u00f1\u00fa\u0100\u0106\u010c\u0113\u011c\u0122"+
		"\u0128\u012f\u0138\u013e\u0146\u014f\u0153\u0158\u015f\u0165\u016b\u0172"+
		"\u017b\u0181\u0188\u0191\u0197\u019e\u01a4\u01aa\u01b3\u01b9\u01bf\u01c6"+
		"\u01cf\u01d5\u01db\u01e2\u01e8\u01ee\u01f4\u01fb\u0205\u020b\u0211\u0215"+
		"\u0219\u0220\u0228\u022e\u0236\u023c\u0242\u0248\u024f\u0253\u0258\u025e"+
		"\u0265\u026c\u0274\u027b\u0281\u0287\u028d\u0293\u0299\u02a0\u02a6\u02ae"+
		"\u02b4\u02ba\u02c0\u02c6\u02cb\u02d0\u02d7\u02de\u02e5\u02eb\u02f1\u02f7"+
		"\u02fd\u0304\u030b\u0312\u0319\u031f\u0325\u032a\u0332\u0335\u033a\u033c"+
		"\u0342\u0348\u034f\u0356\u035d\u0363\u0369\u0372\u0378\u037e\u0385\u038c"+
		"\u0392\u0399\u039d\u03a2\u03a8\u03ae\u03b7\u03bd\u03c3\u03ca\u03d3\u03d9"+
		"\u03df\u03e6\u03ec\u03f2\u03fb\u0401\u0407\u040d\u0414\u041a\u041f\u0426"+
		"\u042e\u0430\u0435\u043b\u0441\u044a\u0450\u0456\u045c\u0461\u0466\u046f"+
		"\u0476\u047d\u0483\u048a\u0491\u0498\u049f\u04a6\u04ad\u04b4\u04bb\u04c2"+
		"\u04c9\u04d0\u04d7\u04dd\u04e5\u04ea\u04ef\u04f6\u04fb\u0500\u0510\u0515"+
		"\u051c\u0522\u0529\u052e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}