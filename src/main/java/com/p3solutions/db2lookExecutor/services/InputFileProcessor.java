package com.p3solutions.db2lookExecutor.services;


import com.p3solutions.db2lookExecutor.beans.Dto;
import com.p3solutions.db2lookExecutor.exception_handler.AnalyzerException;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;


public class InputFileProcessor {

    private final Db2LookFileProcessor db2LookFileProcessor;
    public InputFileProcessor() {
        this.db2LookFileProcessor =  new Db2LookFileProcessor();
    }

    public void processDirectory(Dto dto) throws IOException, AnalyzerException, CloneNotSupportedException, SQLException, ClassNotFoundException {
        File file = new File(dto.getInputDir());
        if (validateDirectory(file)) {
            processFiles(file, dto);
        }
    }

    public void processFiles(File directory, Dto migrationRequestDTO) throws IOException, AnalyzerException, CloneNotSupportedException, SQLException, ClassNotFoundException {
    for (File fileInDir : directory.listFiles()) {
        //ignore subDir
        if (!fileInDir.isFile()) {
           if(fileInDir.listFiles().length == 0) {
              throw new IllegalArgumentException("empty.subDirectory");
           }
            processFiles(fileInDir, migrationRequestDTO);
        }
        else{
                db2LookFileProcessor.processFile(fileInDir
                        , migrationRequestDTO.host
                        , migrationRequestDTO.port
                        , migrationRequestDTO.username
                        , migrationRequestDTO.password
                        , migrationRequestDTO.outputDir);
        }
      }
    }

    public boolean validateDirectory(File dir) {


        if (!dir.exists()){
            throw new IllegalArgumentException("invalid.directory");
        }
        else {
            int length = dir.listFiles().length;
            if (length == 0) {
                throw new IllegalArgumentException("empty.directory");
            }
        }
        return true;
    }

}
