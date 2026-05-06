
package org.unitime.timetable.util;
import java.util.List;

/**
 * CR-003: Test cases for RoomCapacityValidator
 */
public class RoomCapacityValidatorTest {

public static void main(String[] args)  {
        System.out.println(
"=== Room Capacity Validator Test===\n");
int passed = 0;
int failed = 0;

// Test 1: Room too small
if (runTest("Test 1 - Room Too Small",
RoomCapacityValidator.validate(30, 50),
false)) passed++; else failed++;
// Test 2: Room exactly right
if (runTest("Test 2 - Exact Fit",
RoomCapacityValidator.validate(50, 50),
true)) passed++; else failed++;
        // Test 3: Room larger
        if (runTest("Test 3 - Room Large Enough",
RoomCapacityValidator.validate(100, 50),
true)) passed++; else failed++;

        // Test 4: Zero capacity
        if (runTest("Test 4 - Zero Capacity",
       
       
        RoomCapacityValidator.validate(0, 50),
        false)) passed++; else failed++;

        // Test 5: Zero class limit
        if (runTest("Test 5 - Zero Class Limit",
             RoomCapacityValidator.validate(50, 0),
            false)) passed++; else failed++;

    // Test 6: Warning message
    System.out.print("Test 6 - Warning Mesage: ");
    String w = RoomCapacityValidator
    .getWarningMessage(30, 50);
if (w != null) {
System.out.println("PASS");
System.out.println("     → " + w);
            passed++;
}            else {
  System.out.println("FAIL ");
    failed++;
        }

         System.out.println("\n=== Results ===");
        System.out.println("Passed: " + passed);
        
        System.out.println("Failed: " + failed);
    }

    private static boolean runTest(
            String name,
            List<String> errors,
            boolean shouldBeValid)   {
boolean isValid = errors.isEmpty();
boolean pass = isValid == shouldBeValid;
    System.out.println(
    (pass ? "PASS" : "FAIL")
            + " | " + name);
if (!errors.isEmpty()) {
for (String e : errors)
System.out.println("     >> " + e);
        }
        return pass;  } }
    
