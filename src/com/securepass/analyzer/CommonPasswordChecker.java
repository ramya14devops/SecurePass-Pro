package com.securepass.analyzer;

import java.util.HashSet;
import java.util.Set;

public class CommonPasswordChecker {

    private static final Set<String> commonPasswords = new HashSet<>();

    static {
        commonPasswords.add("123456");
        commonPasswords.add("password");
        commonPasswords.add("admin");
        commonPasswords.add("welcome");
        commonPasswords.add("qwerty");
        commonPasswords.add("abc123");
        commonPasswords.add("letmein");
        commonPasswords.add("123456789");
        commonPasswords.add("password123");
    }

    public static boolean isCommonPassword(String password) {
        return commonPasswords.contains(password.toLowerCase());
    }
}