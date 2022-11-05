// Generated from C:/Users/AbiramiRamasundaram/IdeaProjects/db2lookExecutor/src/main/java/com/p3solutions/db2lookExecutor/parser\Db2Look.g4 by ANTLR 4.10.1
package com.p3solutions.db2lookExecutor.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Db2LookParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Db2LookVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#fileHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileHandler(Db2LookParser.FileHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#tabSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabSpace(Db2LookParser.TabSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#connectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectStatement(Db2LookParser.ConnectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#connectDbQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectDbQuery(Db2LookParser.ConnectDbQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createDatabasePartitionGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabasePartitionGroupStatement(Db2LookParser.CreateDatabasePartitionGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createDbPartitionGroupQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDbPartitionGroupQuery(Db2LookParser.CreateDbPartitionGroupQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createBufferPoolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateBufferPoolStatement(Db2LookParser.CreateBufferPoolStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createBufferPoolQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateBufferPoolQuery(Db2LookParser.CreateBufferPoolQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#mimicStorageGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMimicStorageGroupStatement(Db2LookParser.MimicStorageGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#mimicStorageGroupQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMimicStorageGroupQuery(Db2LookParser.MimicStorageGroupQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createTableSpaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpaceStatement(Db2LookParser.CreateTableSpaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createTableSpaceQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpaceQuery(Db2LookParser.CreateTableSpaceQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#mimicTableSpaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMimicTableSpaceStatement(Db2LookParser.MimicTableSpaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#mimicTableSpaceQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMimicTableSpaceQuery(Db2LookParser.MimicTableSpaceQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createSchemaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchemaStatement(Db2LookParser.CreateSchemaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createSchemaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchemaQuery(Db2LookParser.CreateSchemaQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createTypeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeStatement(Db2LookParser.CreateTypeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createTypeQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeQuery(Db2LookParser.CreateTypeQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createSequenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequenceStatement(Db2LookParser.CreateSequenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createSequenceQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequenceQuery(Db2LookParser.CreateSequenceQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#tableSegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSegment(Db2LookParser.TableSegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#commentQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentQuery(Db2LookParser.CommentQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createTableQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableQuery(Db2LookParser.CreateTableQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#alterTableAddPrimaryKeyQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAddPrimaryKeyQuery(Db2LookParser.AlterTableAddPrimaryKeyQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#alterTableAddForeignKeyQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAddForeignKeyQuery(Db2LookParser.AlterTableAddForeignKeyQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#alterTableAddUniqueConstraintQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAddUniqueConstraintQuery(Db2LookParser.AlterTableAddUniqueConstraintQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#alterTableAddCheckConstraintQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAddCheckConstraintQuery(Db2LookParser.AlterTableAddCheckConstraintQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#otherAlterQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherAlterQuery(Db2LookParser.OtherAlterQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createIndexQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexQuery(Db2LookParser.CreateIndexQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(Db2LookParser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#userDefinedFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinedFunctions(Db2LookParser.UserDefinedFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createUDFQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUDFQuery(Db2LookParser.CreateUDFQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateViewStatement(Db2LookParser.CreateViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createViewQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateViewQuery(Db2LookParser.CreateViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#aliasStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasStatement(Db2LookParser.AliasStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#aliasQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasQuery(Db2LookParser.AliasQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createStoredProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStoredProcedureStatement(Db2LookParser.CreateStoredProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createProcedureQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedureQuery(Db2LookParser.CreateProcedureQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTriggerStatement(Db2LookParser.CreateTriggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createTriggerQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTriggerQuery(Db2LookParser.CreateTriggerQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#grantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantStatement(Db2LookParser.GrantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#grantQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantQuery(Db2LookParser.GrantQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#terminateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminateStatement(Db2LookParser.TerminateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(Db2LookParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#commitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitStatement(Db2LookParser.CommitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#trustedContextStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextStatement(Db2LookParser.TrustedContextStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createAuditStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAuditStatement(Db2LookParser.CreateAuditStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#createRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRoleStatement(Db2LookParser.CreateRoleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#fullNameModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullNameModel(Db2LookParser.FullNameModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(Db2LookParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(Db2LookParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(Db2LookParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(Db2LookParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Db2LookParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Db2LookParser#handle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandle(Db2LookParser.HandleContext ctx);
}