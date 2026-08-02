package com.securepass.util;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import com.securepass.model.PasswordResult;

public class AuditLogger {

    public static void logResult(PasswordResult result) {

        try {

            // Creates audit_log.txt in the project folder
            FileWriter writer = new FileWriter("audit_log.txt", true);

            writer.write("=====================================\n");
            writer.write("Date : " + LocalDateTime.now() + "\n");
            writer.write("Score : " + result.getScore() + "\n");
            writer.write("Strength : " + result.getStrength() + "\n");
            writer.write("Risk Level : " + result.getRiskLevel() + "\n");
            writer.write("Compliance : " + (result.isCompliant() ? "PASS" : "FAIL") + "\n");
            writer.write("=====================================\n\n");

            writer.flush();
            writer.close();

            System.out.println("Audit log saved successfully!");

        } catch (IOException e) {

            System.out.println("Unable to write audit log.");
            e.printStackTrace();

        }
    }
}