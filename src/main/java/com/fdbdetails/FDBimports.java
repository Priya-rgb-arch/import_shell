package com.fdbdetails;

import java.io.IOException;
import java.util.List;

 

public class FDBimports {
    public static void main(String[] args) {
        try {
            // Set the command and arguments
            List<String> command = List.of("bash", "/mnt/c/Users/AMBATS/Documents/Shell Script/FDBDailyPrice/src/main/resources/load_fdb_daily.sh");

 

            // Create the process builder
            ProcessBuilder processBuilder = new ProcessBuilder(command);

 

            // Run the command
            Process process = processBuilder.start();

 

            // Wait for the process to complete
            int exitCode = process.waitFor();

 

            if (exitCode == 0) {
                System.out.println("Script executed successfully.");
            } else {
                System.err.println("Script execution failed with exit code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
