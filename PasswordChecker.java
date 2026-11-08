# Java Password Checker 🔐

A lightweight, command-line security tool built in Java. This program evaluates the strength of a user's password by checking for length, character complexity, and common vulnerabilities.

## Features
* Checks for minimum length (8+ characters)
* Verifies inclusion of uppercase letters
* Verifies inclusion of numbers
* Provides a clear PASS/FAIL breakdown and an overall strength status

## How to Run
1. Ensure you have Java installed on your machine.
2. Compile the code: `javac PasswordChecker.java`
3. Run the program: `java PasswordChecker`

---
*Built by MassangoTech as part of an ongoing journey into Cybersecurity and Software Development.*
  import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== MassangoTech Password Analyzer ===");
        System.out.print("Enter a password to test: ");
        String password = scanner.nextLine();
        
        analyzePassword(password);
        scanner.close();
    }

    public static void analyzePassword(String password) {
        boolean hasLength = password.length() >= 8;
        boolean hasUpper = !password.equals(password.toLowerCase());
        boolean hasDigit = password.matches(".*\\d.*");
        
        System.out.println("\n--- Results ---");
        System.out.println((hasLength ? "[PASS] " : "[FAIL] ") + "Length is at least 8 characters.");
        System.out.println((hasUpper ? "[PASS] " : "[FAIL] ") + "Contains uppercase letters.");
        System.out.println((hasDigit ? "[PASS] " : "[FAIL] ") + "Contains numbers.");
        
        if (hasLength && hasUpper && hasDigit) {
            System.out.println("Status: STRONG");
        } else {
            System.out.println("Status: WEAK - Needs improvement.");
        }
    }
}
