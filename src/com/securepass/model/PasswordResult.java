package com.securepass.model;

public class PasswordResult {

    private int score;
    private String strength;
    private String riskLevel;
    private boolean commonPassword;
    private boolean patternDetected;
    private String suggestions;
    private boolean compliant;

    // Score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Strength
    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    // Risk Level
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    // Common Password
    public boolean isCommonPassword() {
        return commonPassword;
    }

    public void setCommonPassword(boolean commonPassword) {
        this.commonPassword = commonPassword;
    }

    // Pattern Detection
    public boolean isPatternDetected() {
        return patternDetected;
    }

    public void setPatternDetected(boolean patternDetected) {
        this.patternDetected = patternDetected;
    }

    // Suggestions
    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    // Compliance
    public boolean isCompliant() {
        return compliant;
    }

    public void setCompliant(boolean compliant) {
        this.compliant = compliant;
    }
}