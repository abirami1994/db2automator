import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Objects;

public class test {
    public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
        String databaseName = "gsdb";

        String batFilePath = "\\jpa_postgresql_curd_example\\src\\main\\java\\com\\postgresSql\\example\\jpa_postgresql_curd_example\\controller\\ddl\\ddlGenerationDB2.bat";
        FileWriter writer = new FileWriter(batFilePath);
        BufferedWriter buffer = new BufferedWriter(writer);
        String batchFileData = "@echo off\n" +
                "\n" +
                ":: BatchGotAdmin\n" +
                ":-------------------------------------\n" +

                "@if \"\"%DB2CLP%\"\"==\"\"\"\" db2cmd /c /i /w \"\"%0\"\" %* && goto :EOF\n" +
                "\n" +
                "@rem for connecting to a local database as current logged-in Windows account (no password required)\n" +
                "db2 -v connect to dbname\n" +
                "@if errorlevel 1 ( @echo \"\"FAILED to connect\"\" && @goto :EOF )\n" +
                "\n" +
                "db2 -v \"IMPORT FROM TO ...  \"\n" +
                "@if errorlevel 2 ( @echo \"FAILED to export...\" && @pause ... && @goto :EOF )\n" +
                "db2 -v connect reset"+

                ":--------------------------------------\n" +
                "@ECHO OFF\n" +
                "::db created" +
                "\n";
        buffer.write(batchFileData);
        buffer.close();
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c",batFilePath);
        Process p = pb.start();


    }
}
