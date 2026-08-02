# 🔐 SecurePass Pro – Enterprise Password Risk & Compliance Analyzer

## 📌 Project Overview

SecurePass Pro is a Java-based console application that evaluates password security and checks compliance with enterprise password policies. It analyzes password strength, identifies weak patterns, detects common passwords, classifies risk levels, and generates security recommendations. The application also maintains an audit log of every password analysis using Java File Handling.

This project demonstrates core Java programming concepts while incorporating Governance, Risk, and Compliance (GRC) principles related to password security.

---

## 🚀 Features

- ✅ Password Strength Analysis
- ✅ Password Score Calculation (0–100)
- ✅ Enterprise Password Compliance Check
- ✅ Common Password Detection
- ✅ Weak Pattern Detection (e.g., 123, abc, password)
- ✅ Risk Level Classification (Low / Medium / High)
- ✅ Security Improvement Suggestions
- ✅ Audit Logging using Java File Handling

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- Regular Expressions (Regex)
- Java File Handling
- Java Time API
- Eclipse IDE

---

## 📂 Project Structure

```
SecurePassPro
│
├── src
│   ├── com.securepass.main
│   │      └── Main.java
│   │
│   ├── com.securepass.model
│   │      └── PasswordResult.java
│   │
│   ├── com.securepass.analyzer
│   │      ├── PasswordAnalyzer.java
│   │      ├── CommonPasswordChecker.java
│   │      ├── PatternDetector.java
│   │      └── ComplianceChecker.java
│   │
│   └── com.securepass.util
│          └── AuditLogger.java
│
├── README.md
└── .gitignore
```

---

## ▶️ How to Run

1. Clone the repository.
2. Open the project in Eclipse or IntelliJ IDEA.
3. Run `Main.java`.
4. Enter a password.
5. View the password analysis report.
6. Check `audit_log.txt` for audit records.

---

## 📊 Sample Output

```
==========================================
        SecurePass Pro
 Enterprise Password Risk Analyzer
==========================================

Enter Password: Ramya@2026

========== ANALYSIS REPORT ==========
Password Score      : 100/100
Strength            : Strong
Risk Level          : LOW
Compliance Status   : PASS
Common Password     : NO
Pattern Detected    : NO

Security Suggestions:
Password is secure and complies with the policy.

==========================================
Thank you for using SecurePass Pro
==========================================
```

---

## 💻 Java Concepts Used

- Classes and Objects
- Encapsulation
- Methods
- Packages
- Collections
- Regular Expressions
- Exception Handling
- File Handling
- Date & Time API

---

## 🔒 GRC Relevance

This project aligns with Governance, Risk, and Compliance (GRC) principles by:

- Enforcing enterprise password policies
- Detecting weak and commonly used passwords
- Identifying predictable password patterns
- Classifying password risk levels
- Maintaining audit logs for security monitoring

---

## 📈 Future Enhancements

- Spring Boot REST API
- Swing / JavaFX GUI
- Password Entropy Calculation
- Password History Validation
- Database Integration
- User Authentication Module
- Dashboard with Charts

---

## 👨‍💻 Author

**Ramya Moorthy**

Aspiring Java Developer | Cybersecurity & GRC Enthusiast

---

## ⭐ If you found this project useful, don't forget to star the repository!