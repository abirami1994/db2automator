package com.p3solutions.db2lookExecutor.beans;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Dto {
    private String inputDir;
    public String outputDir;
    public String username;
    public String password;
    public String host;
    public String port;
    public String sampledb;
    private List<String> dbnamesList = new ArrayList<>();
}
