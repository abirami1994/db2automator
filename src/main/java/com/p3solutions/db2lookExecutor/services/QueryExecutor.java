package com.p3solutions.db2lookExecutor.services;

import org.modelmapper.internal.util.Lists;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class QueryExecutor {


    public Connection getConnection(String host, String port, String userName, String password, String dbName) throws ClassNotFoundException, SQLException {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        return DriverManager.getConnection("jdbc:db2://" + host + ":" + port + "/" + dbName, userName,
                password);
    }

    public void executeQuery(String query, Connection connection, Map<String, String> failedQueryReasonMap) {
        if(Objects.nonNull(connection)){
            try (Statement statement = connection.createStatement()) {
                int i = statement.executeUpdate(query);
            } catch (Exception e) {
                failedQueryReasonMap.put(
                        query,
                        "\"" + (Objects.nonNull(e.getMessage()) ? e.getMessage().replace("\n", " ").replace("\t", " ") : "Some exception occurred") + "\""
                );
            }
        }

    }
}
