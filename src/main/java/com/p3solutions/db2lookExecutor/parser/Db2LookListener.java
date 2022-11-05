// Generated from C:/Users/AbiramiRamasundaram/IdeaProjects/db2lookExecutor/src/main/java/com/p3solutions/db2lookExecutor/parser\Db2Look.g4 by ANTLR 4.10.1
package com.p3solutions.db2lookExecutor.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Db2LookParser}.
 */
public interface Db2LookListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#fileHandler}.
	 * @param ctx the parse tree
	 */
	void enterFileHandler(Db2LookParser.FileHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#fileHandler}.
	 * @param ctx the parse tree
	 */
	void exitFileHandler(Db2LookParser.FileHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#tabSpace}.
	 * @param ctx the parse tree
	 */
	void enterTabSpace(Db2LookParser.TabSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#tabSpace}.
	 * @param ctx the parse tree
	 */
	void exitTabSpace(Db2LookParser.TabSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#connectStatement}.
	 * @param ctx the parse tree
	 */
	void enterConnectStatement(Db2LookParser.ConnectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#connectStatement}.
	 * @param ctx the parse tree
	 */
	void exitConnectStatement(Db2LookParser.ConnectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#connectDbQuery}.
	 * @param ctx the parse tree
	 */
	void enterConnectDbQuery(Db2LookParser.ConnectDbQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#connectDbQuery}.
	 * @param ctx the parse tree
	 */
	void exitConnectDbQuery(Db2LookParser.ConnectDbQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createDatabasePartitionGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabasePartitionGroupStatement(Db2LookParser.CreateDatabasePartitionGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createDatabasePartitionGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabasePartitionGroupStatement(Db2LookParser.CreateDatabasePartitionGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createDbPartitionGroupQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateDbPartitionGroupQuery(Db2LookParser.CreateDbPartitionGroupQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createDbPartitionGroupQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateDbPartitionGroupQuery(Db2LookParser.CreateDbPartitionGroupQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createBufferPoolStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateBufferPoolStatement(Db2LookParser.CreateBufferPoolStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createBufferPoolStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateBufferPoolStatement(Db2LookParser.CreateBufferPoolStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createBufferPoolQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateBufferPoolQuery(Db2LookParser.CreateBufferPoolQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createBufferPoolQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateBufferPoolQuery(Db2LookParser.CreateBufferPoolQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#mimicStorageGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterMimicStorageGroupStatement(Db2LookParser.MimicStorageGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#mimicStorageGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitMimicStorageGroupStatement(Db2LookParser.MimicStorageGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#mimicStorageGroupQuery}.
	 * @param ctx the parse tree
	 */
	void enterMimicStorageGroupQuery(Db2LookParser.MimicStorageGroupQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#mimicStorageGroupQuery}.
	 * @param ctx the parse tree
	 */
	void exitMimicStorageGroupQuery(Db2LookParser.MimicStorageGroupQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createTableSpaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpaceStatement(Db2LookParser.CreateTableSpaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createTableSpaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpaceStatement(Db2LookParser.CreateTableSpaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createTableSpaceQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpaceQuery(Db2LookParser.CreateTableSpaceQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createTableSpaceQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpaceQuery(Db2LookParser.CreateTableSpaceQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#mimicTableSpaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterMimicTableSpaceStatement(Db2LookParser.MimicTableSpaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#mimicTableSpaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitMimicTableSpaceStatement(Db2LookParser.MimicTableSpaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#mimicTableSpaceQuery}.
	 * @param ctx the parse tree
	 */
	void enterMimicTableSpaceQuery(Db2LookParser.MimicTableSpaceQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#mimicTableSpaceQuery}.
	 * @param ctx the parse tree
	 */
	void exitMimicTableSpaceQuery(Db2LookParser.MimicTableSpaceQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchemaStatement(Db2LookParser.CreateSchemaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchemaStatement(Db2LookParser.CreateSchemaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createSchemaQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchemaQuery(Db2LookParser.CreateSchemaQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createSchemaQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchemaQuery(Db2LookParser.CreateSchemaQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createTypeStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeStatement(Db2LookParser.CreateTypeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createTypeStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeStatement(Db2LookParser.CreateTypeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createTypeQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeQuery(Db2LookParser.CreateTypeQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createTypeQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeQuery(Db2LookParser.CreateTypeQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequenceStatement(Db2LookParser.CreateSequenceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequenceStatement(Db2LookParser.CreateSequenceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createSequenceQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequenceQuery(Db2LookParser.CreateSequenceQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createSequenceQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequenceQuery(Db2LookParser.CreateSequenceQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#tableSegment}.
	 * @param ctx the parse tree
	 */
	void enterTableSegment(Db2LookParser.TableSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#tableSegment}.
	 * @param ctx the parse tree
	 */
	void exitTableSegment(Db2LookParser.TableSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#commentQuery}.
	 * @param ctx the parse tree
	 */
	void enterCommentQuery(Db2LookParser.CommentQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#commentQuery}.
	 * @param ctx the parse tree
	 */
	void exitCommentQuery(Db2LookParser.CommentQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createTableQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableQuery(Db2LookParser.CreateTableQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createTableQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableQuery(Db2LookParser.CreateTableQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#alterTableAddPrimaryKeyQuery}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAddPrimaryKeyQuery(Db2LookParser.AlterTableAddPrimaryKeyQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#alterTableAddPrimaryKeyQuery}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAddPrimaryKeyQuery(Db2LookParser.AlterTableAddPrimaryKeyQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#alterTableAddForeignKeyQuery}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAddForeignKeyQuery(Db2LookParser.AlterTableAddForeignKeyQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#alterTableAddForeignKeyQuery}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAddForeignKeyQuery(Db2LookParser.AlterTableAddForeignKeyQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#alterTableAddUniqueConstraintQuery}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAddUniqueConstraintQuery(Db2LookParser.AlterTableAddUniqueConstraintQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#alterTableAddUniqueConstraintQuery}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAddUniqueConstraintQuery(Db2LookParser.AlterTableAddUniqueConstraintQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#alterTableAddCheckConstraintQuery}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAddCheckConstraintQuery(Db2LookParser.AlterTableAddCheckConstraintQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#alterTableAddCheckConstraintQuery}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAddCheckConstraintQuery(Db2LookParser.AlterTableAddCheckConstraintQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#otherAlterQuery}.
	 * @param ctx the parse tree
	 */
	void enterOtherAlterQuery(Db2LookParser.OtherAlterQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#otherAlterQuery}.
	 * @param ctx the parse tree
	 */
	void exitOtherAlterQuery(Db2LookParser.OtherAlterQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createIndexQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexQuery(Db2LookParser.CreateIndexQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createIndexQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexQuery(Db2LookParser.CreateIndexQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(Db2LookParser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(Db2LookParser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#userDefinedFunctions}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedFunctions(Db2LookParser.UserDefinedFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#userDefinedFunctions}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedFunctions(Db2LookParser.UserDefinedFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createUDFQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateUDFQuery(Db2LookParser.CreateUDFQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createUDFQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateUDFQuery(Db2LookParser.CreateUDFQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createViewStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateViewStatement(Db2LookParser.CreateViewStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createViewStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateViewStatement(Db2LookParser.CreateViewStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createViewQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateViewQuery(Db2LookParser.CreateViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createViewQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateViewQuery(Db2LookParser.CreateViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#aliasStatement}.
	 * @param ctx the parse tree
	 */
	void enterAliasStatement(Db2LookParser.AliasStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#aliasStatement}.
	 * @param ctx the parse tree
	 */
	void exitAliasStatement(Db2LookParser.AliasStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#aliasQuery}.
	 * @param ctx the parse tree
	 */
	void enterAliasQuery(Db2LookParser.AliasQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#aliasQuery}.
	 * @param ctx the parse tree
	 */
	void exitAliasQuery(Db2LookParser.AliasQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createStoredProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStoredProcedureStatement(Db2LookParser.CreateStoredProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createStoredProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStoredProcedureStatement(Db2LookParser.CreateStoredProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createProcedureQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedureQuery(Db2LookParser.CreateProcedureQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createProcedureQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedureQuery(Db2LookParser.CreateProcedureQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTriggerStatement(Db2LookParser.CreateTriggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTriggerStatement(Db2LookParser.CreateTriggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createTriggerQuery}.
	 * @param ctx the parse tree
	 */
	void enterCreateTriggerQuery(Db2LookParser.CreateTriggerQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createTriggerQuery}.
	 * @param ctx the parse tree
	 */
	void exitCreateTriggerQuery(Db2LookParser.CreateTriggerQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantStatement(Db2LookParser.GrantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantStatement(Db2LookParser.GrantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#grantQuery}.
	 * @param ctx the parse tree
	 */
	void enterGrantQuery(Db2LookParser.GrantQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#grantQuery}.
	 * @param ctx the parse tree
	 */
	void exitGrantQuery(Db2LookParser.GrantQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#terminateStatement}.
	 * @param ctx the parse tree
	 */
	void enterTerminateStatement(Db2LookParser.TerminateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#terminateStatement}.
	 * @param ctx the parse tree
	 */
	void exitTerminateStatement(Db2LookParser.TerminateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(Db2LookParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(Db2LookParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#commitStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommitStatement(Db2LookParser.CommitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#commitStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommitStatement(Db2LookParser.CommitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#trustedContextStatement}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextStatement(Db2LookParser.TrustedContextStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#trustedContextStatement}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextStatement(Db2LookParser.TrustedContextStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createAuditStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateAuditStatement(Db2LookParser.CreateAuditStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createAuditStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateAuditStatement(Db2LookParser.CreateAuditStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#createRoleStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateRoleStatement(Db2LookParser.CreateRoleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#createRoleStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateRoleStatement(Db2LookParser.CreateRoleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#fullNameModel}.
	 * @param ctx the parse tree
	 */
	void enterFullNameModel(Db2LookParser.FullNameModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#fullNameModel}.
	 * @param ctx the parse tree
	 */
	void exitFullNameModel(Db2LookParser.FullNameModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(Db2LookParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(Db2LookParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(Db2LookParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(Db2LookParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(Db2LookParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(Db2LookParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(Db2LookParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(Db2LookParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Db2LookParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Db2LookParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Db2LookParser#handle}.
	 * @param ctx the parse tree
	 */
	void enterHandle(Db2LookParser.HandleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Db2LookParser#handle}.
	 * @param ctx the parse tree
	 */
	void exitHandle(Db2LookParser.HandleContext ctx);
}