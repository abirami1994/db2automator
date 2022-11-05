package com.p3solutions.db2lookExecutor.services;

import com.p3solutions.db2lookExecutor.beans.Dto;
import com.p3solutions.db2lookExecutor.exception_handler.AnalyzerException;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;

public class Db2LookExecutorController {

    public void startProcessing() throws IOException, AnalyzerException, CloneNotSupportedException, SQLException, ClassNotFoundException {
         Dto dto = Dto.builder().build();
        try(InputStream input = Db2LookExecutorController.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties properties = new Properties();
            properties.load(input);
            if (input != null) {
                String inputPath = properties.getProperty("path");
                String outputFolderName = properties.getProperty("output");
                if (!new File(outputFolderName).exists()) {
                    throw new AnalyzerException("invalid.outputDir");
                }
                if (!new File(inputPath).exists()) {
                    throw new AnalyzerException("invalid.inputPath");
                }
                String dbnames = properties.getProperty("dbnames");
                String username = properties.getProperty("username");
                String password = properties.getProperty("password");
                String port = properties.getProperty("port");
                String host = properties.getProperty("host");
                String sampledb = properties.getProperty("sampledb");
                if (StringUtils.isNotEmpty(inputPath)
                        && StringUtils.isNotEmpty(outputFolderName)
                        && StringUtils.isNotEmpty(dbnames)
                        && StringUtils.isNotEmpty(username)
                        && StringUtils.isNotEmpty(password)
                        && StringUtils.isNotEmpty(port)
                        && StringUtils.isNotEmpty(host)
                        && StringUtils.isNotEmpty(sampledb)
                ) {
                    dto = processMigrationRequest(inputPath, outputFolderName, dbnames, username, password, port, host, sampledb );
                } else {
                    throw new AnalyzerException("empty.config.parameters");
                }
            } else {
                throw new AnalyzerException();
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        InputFileProcessor inputFileProcessor = new InputFileProcessor();
        inputFileProcessor.processDirectory(dto);
    }

    private Dto processMigrationRequest(String inputPath, String outputFolderName, String dbnames, String username, String password, String port, String host, String sampledb) {
        return Dto.builder()
                .inputDir(inputPath)
                .outputDir(outputFolderName)
                .dbnamesList(Arrays.asList(dbnames.split(",")))
                .build();
    }
}
