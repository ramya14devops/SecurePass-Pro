package com.securepass.analyzer;

public class PatternDetector {

    public static boolean hasSimplePattern(String password) {

        String lower = password.toLowerCase();

        if (lower.contains("123")
                || lower.contains("abc")
                || lower.contains("qwerty")
                || lower.contains("password")) {
            return true;
        }

        return false;
    }
}