package org.unitime.timetable.util;
import java.util.List;
public class PasswordValidatorTest {

    public static void main(String[] args) {
        System.out.println(
            " Password Validator Tests \n");
        int passed = 0;
        int failed = 0;
        // Test 1 Too short
        if (runTest("Test 1 - Too Short",
            PasswordValidator.validate("abc", "user"),
            false)) passed++; else failed++;
        // Test 2 No uppercase
        if (runTest("Test 2 - No Uppercase",
            PasswordValidator.validate(
                "password1!", "user"),
            false)) passed++; else failed++;
        // Test 3 No lowercase
        if (runTest("Test 3 - No Lowercase",
            PasswordValidator.validate(
                "PASSWORD1!", "user"),
            false)) passed++; else failed++;
        // Test 4 No digit
        if (runTest("Test 4 - No Digit",
            PasswordValidator.validate(
                "Password!", "user"),
            false)) passed++; else failed++;
        // Test 5 No special character
        if (runTest("Test 5 - No Special Char",
            PasswordValidator.validate(
                "Password1", "user"),
            false)) passed++; else failed++;
        // Test 6 Matches username
        if (runTest("Test 6 - Matches Username",
            PasswordValidator.validate(
                "Admin123!", "admin"),
            false)) passed++; else failed++;
        // Test 7 Valid password
        if (runTest("Test 7 - Valid Password",
            PasswordValidator.validate(
                "SecureP@ss1", "user"),
            true)) passed++; else failed++;
        // Test 8 Null password
        if (runTest("Test 8 - Null Password",
            PasswordValidator.validate(null, "user"),
            false)) passed++; else failed++;
        System.out.println("\n Results ");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
    }
    private static boolean runTest(
            String name,
            List<String> errors,
            boolean shouldBeValid) {
        boolean isValid = errors.isEmpty();
        boolean pass = isValid == shouldBeValid;
        System.out.println(
            (pass ? " PASS" : " FAIL") 
            + " | " + name);
        if (!errors.isEmpty()) {
            for (String e : errors)
                System.out.println("     → " + e);
        }
        return pass;
    }
}
