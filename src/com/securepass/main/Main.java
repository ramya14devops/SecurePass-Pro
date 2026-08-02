package com.securepass.main;

import java.util.Scanner;

import com.securepass.analyzer.PasswordAnalyzer;
import com.securepass.model.PasswordResult;
import com.securepass.util.AuditLogger;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("        SecurePass Pro");
        System.out.println(" Enterprise Password Risk Analyzer");
        System.out.println("==========================================");

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        PasswordAnalyzer analyzer = new PasswordAnalyzer();

        PasswordResult result = analyzer.analyze(password);

        // Save audit log
        AuditLogger.logResult(result);

        System.out.println("\n========== ANALYSIS REPORT ==========");
        System.out.println("Password Score      : " + result.getScore() + "/100");
        System.out.println("Strength            : " + result.getStrength());
        System.out.println("Risk Level          : " + result.getRiskLevel());
        System.out.println("Compliance Status   : " +
                (result.isCompliant() ? "PASS" : "FAIL"));
        System.out.println("Common Password     : " +
                (result.isCommonPassword() ? "YES" : "NO"));
        System.out.println("Pattern Detected    : " +
                (result.isPatternDetected() ? "YES" : "NO"));

        System.out.println("\nSecurity Suggestions:");
        System.out.println(result.getSuggestions());

        System.out.println("==========================================");
        System.out.println("Thank you for using SecurePass Pro");
        System.out.println("==========================================");

        scanner.close();
    }
}