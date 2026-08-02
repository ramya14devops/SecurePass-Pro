package com.securepass.analyzer;

import com.securepass.model.PasswordResult;

public class PasswordAnalyzer {

    public PasswordResult analyze(String password) {

        PasswordResult result = new PasswordResult();

        int score = 0;

        // Check password length
        if (password.length() >= 8)
            score += 20;

        // Check uppercase letter
        if (password.matches(".*[A-Z].*"))
            score += 20;

        // Check lowercase letter
        if (password.matches(".*[a-z].*"))
            score += 20;

        // Check number
        if (password.matches(".*\\d.*"))
            score += 20;

        // Check special character
        if (password.matches(".*[@#$%^&+=!].*"))
            score += 20;

        result.setScore(score);

        // Password Strength
        if (score >= 80)
            result.setStrength("Strong");
        else if (score >= 50)
            result.setStrength("Medium");
        else
            result.setStrength("Weak");

        // Check Common Password
        result.setCommonPassword(
                CommonPasswordChecker.isCommonPassword(password));

        // Check Pattern Detection
        result.setPatternDetected(
                PatternDetector.hasSimplePattern(password));

        // Check Compliance
        result.setCompliant(
                ComplianceChecker.isCompliant(password));

        // Risk Level
        if (result.isCommonPassword() || result.isPatternDetected()) {
            result.setRiskLevel("HIGH");
        } else if (result.isCompliant()) {
            result.setRiskLevel("LOW");
        } else {
            result.setRiskLevel("MEDIUM");
        }

        // Suggestions
        String suggestion = "";

        if (password.length() < 8)
            suggestion += "Use at least 8 characters. ";

        if (!password.matches(".*[A-Z].*"))
            suggestion += "Add an uppercase letter. ";

        if (!password.matches(".*[a-z].*"))
            suggestion += "Add a lowercase letter. ";

        if (!password.matches(".*\\d.*"))
            suggestion += "Add a number. ";

        if (!password.matches(".*[@#$%^&+=!].*"))
            suggestion += "Add a special character. ";

        if (result.isCommonPassword())
            suggestion += "Avoid commonly used passwords. ";

        if (result.isPatternDetected())
            suggestion += "Avoid predictable patterns like 123 or abc. ";

        if (suggestion.isEmpty())
            suggestion = "Password is secure and complies with the policy.";

        result.setSuggestions(suggestion);

        return result;
    }
}