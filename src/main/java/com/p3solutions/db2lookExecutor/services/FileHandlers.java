package com.p3solutions.db2lookExecutor.services;

import com.p3solutions.db2lookExecutor.exception_handler.AnalyzerException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileHandlers {
    public void writeLogs(Map<String, String> failedQueryReasonsMap, String outputDirectory, String dbName) throws IOException, AnalyzerException {
        try{
            File myObj = new File(outputDirectory + "\\" + dbName + ".txt");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            throw new AnalyzerException("file already exists " + outputDirectory);
        }
    } catch (IOException e) {
        System.out.println("An error occurred."  + outputDirectory);
        e.printStackTrace();
    }



        try {
            FileWriter myWriter = new FileWriter(outputDirectory + "\\" + dbName + ".txt");
            for (Map.Entry<String, String> stringEntry : failedQueryReasonsMap.entrySet()) {
                myWriter.write("\n\n______________________________");
                myWriter.write(stringEntry.getKey());
                myWriter.write("\n");
                myWriter.write(stringEntry.getValue());
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred."  + outputDirectory);
            e.printStackTrace();
        }

    }
}
