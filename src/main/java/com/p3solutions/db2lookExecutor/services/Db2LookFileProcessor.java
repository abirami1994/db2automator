package com.p3solutions.db2lookExecutor.services;

import com.p3solutions.db2lookExecutor.exception_handler.AnalyzerException;
import com.p3solutions.db2lookExecutor.parser.Db2LookLexer;
import com.p3solutions.db2lookExecutor.parser.Db2LookParser;
import com.p3solutions.db2lookExecutor.parser.syntax.SyntaxErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class Db2LookFileProcessor {

    private final QueryExecutor queryExecutor;
    private final FileHandlers fileHandlers;

    public Db2LookFileProcessor() {
        this.queryExecutor = new QueryExecutor();
        this.fileHandlers = new FileHandlers();
    }

    public void processFile(File file, String host,  String port, String userName, String password, String outputDirectory) throws IOException, AnalyzerException, CloneNotSupportedException, SQLException, ClassNotFoundException {

        Db2LookLexer lexer = new Db2LookLexer(CharStreams.fromFileName(file.getAbsolutePath()));
//
//         Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        Db2LookParser parser = new Db2LookParser(tokens);
        if(!isCorrect(parser)){
            throw new AnalyzerException("db2look parser error");
        }
//
        Db2LookParser.FileHandlerContext fileHandlerContext = parser.fileHandler();
        try {
            startProcessing(fileHandlerContext, host, port, userName, password, outputDirectory);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void startProcessing(Db2LookParser.FileHandlerContext tree, String host, String port, String userName, String password, String outputDirectory) throws SQLException, ClassNotFoundException, AnalyzerException, IOException {
      String dbName = null;
      Map<String , String> failedQueryReasonsMap = new LinkedHashMap<>();
        Connection connection = null;
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            if(child instanceof Db2LookParser.ConnectStatementContext){
                String[] split = child.getText().split(" ");
               dbName =  split[split.length-1]
                        .replaceAll("\"","")
                        .replaceAll(";","")
                        .trim();
               connection = queryExecutor.getConnection(host, port, userName, password, dbName);
            }
            if(child instanceof Db2LookParser.CreateDatabasePartitionGroupStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateBufferPoolQueryContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.MimicStorageGroupStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }

            else if(child instanceof Db2LookParser.MimicTableSpaceStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateRoleStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateSchemaStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateTypeStatementContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree typechild = child.getChild(i1);
                    if(typechild instanceof Db2LookParser.CreateTableQueryContext){
                        queryExecutor.executeQuery(typechild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.CreateSequenceStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.TableSegmentContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree tablechild = child.getChild(i1);
                    if(tablechild instanceof Db2LookParser.CreateTableQueryContext ||
                      tablechild instanceof Db2LookParser.CommentQueryContext ||
                      tablechild instanceof Db2LookParser.AlterTableAddPrimaryKeyQueryContext ||
                      tablechild instanceof Db2LookParser.AlterTableAddUniqueConstraintQueryContext ||
                      tablechild instanceof Db2LookParser.OtherAlterQueryContext ||
                      tablechild instanceof Db2LookParser.CreateIndexQueryContext){
                        queryExecutor.executeQuery(tablechild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.AlterTableAddForeignKeyQueryContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.SetStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.AlterTableAddCheckConstraintQueryContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.UserDefinedFunctionsContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree udfChild = child.getChild(i1);
                    if(udfChild instanceof Db2LookParser.CreateUDFQueryContext){
                        queryExecutor.executeQuery(udfChild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.CreateViewStatementContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree viewChild = child.getChild(i1);
                    if(viewChild instanceof Db2LookParser.CreateViewQueryContext){
                        queryExecutor.executeQuery(viewChild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.AliasStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateStoredProcedureStatementContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree procedureChild = child.getChild(i1);
                    if(procedureChild instanceof Db2LookParser.CreateProcedureQueryContext){
                        queryExecutor.executeQuery(procedureChild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.CreateTriggerStatementContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree triggerChild = child.getChild(i1);
                    if(triggerChild instanceof Db2LookParser.CreateTriggerQueryContext){
                        queryExecutor.executeQuery(triggerChild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.CreateAuditStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof  Db2LookParser.TrustedContextStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.GrantStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }

            if(child instanceof Db2LookParser.CreateTableSpaceStatementContext){
                String newQuery = alterTablespaceQuery(child.getText());
                queryExecutor.executeQuery(newQuery, connection, failedQueryReasonsMap);
            }
        }
        fileHandlers.writeLogs(failedQueryReasonsMap, outputDirectory ,dbName);
        connection.close();
    }

    private String alterTablespaceQuery(String query) {
        if(query.contains("(") && query.contains(")")) {
            String locationPart =  StringUtils.substringBetween(query, "(", ")");
            if(locationPart.contains(",")){
                String[] locationSplit = locationPart.split(",");
                for (int i = 0; i < locationPart.split(",").length; i++) {
                    String newLocation = processLocationAndMakeDir(locationSplit[i]);
                    query = query.replace(locationSplit[i], newLocation);
                }
            }
            else{
                String newLocation = processLocationAndMakeDir(locationPart);
                query = query.replace(locationPart, newLocation);
            }
        }
        return query;
    }

    private String processLocationAndMakeDir(String location){
        String[] split = location.split("/");
        List<String> dirList = new ArrayList<>();
        for (int i = split.length-2 ,  j=1 ; j<=2; i--,j++) {
            dirList.add(split[i]);
        }
        Collections.reverse(dirList);
        String dirLocation = "C:\\Program Files\\IBM\\SQLLIB";
        for (int i = 0; i < dirList.size(); i++) {
            dirLocation = validateDirectory(dirLocation, dirList.get(i));
        }
        return  dirLocation;
    }

    private String validateDirectory(String dirLocation, String possibleDirName) {
        String dirLocTemp = dirLocation + "\\" + possibleDirName;
        File file = new File(dirLocTemp);
        if (!file.exists()){//not present
           return dirLocTemp;
        }
        //find other alternative
        else{
          validateDirectory(dirLocation, possibleDirName + "1");
        }
        return dirLocation;
    }

    public Boolean isCorrect (Db2LookParser parser) {
        SyntaxErrorListener listener = new SyntaxErrorListener();
        parser.addErrorListener(listener);
        parser.fileHandler();
        return listener.getSyntaxErrors().isEmpty();
    }

}
