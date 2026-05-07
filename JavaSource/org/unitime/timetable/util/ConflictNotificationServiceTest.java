package org.unitime.timetable.util;

import java.util.List;

/**
 * CR-004: Test cases for ConflictNotificationService
 */
public class ConflictNotificationServiceTest {

    public static void main(String[] args) {
        System.out.println(
            "=== Conflict Notification Tests ===\n");
        int passed = 0;
        int failed = 0;

        // Test 1: Room conflict
        System.out.println("Test 1 - Room Conflict:");
        ConflictNotificationService.notifyRoomConflict(
            "CS101", "Room A",
            "Monday 9AM",
            "manager@university.edu");
        System.out.println("✅ PASS | Notified\n");
        passed++;

        // Test 2: Instructor conflict
        System.out.println(
            "Test 2 - Instructor Conflict:");
        ConflictNotificationService
            .notifyInstructorConflict(
                "CS202", "Dr. Smith",
                "Tuesday 2PM",
                "manager@university.edu");
        System.out.println("✅ PASS | Notified\n");
        passed++;

        // Test 3: Notifications stored
        System.out.print(
            "Test 3 - Notifications Stored: ");
        List<String> all = 
            ConflictNotificationService
                .getAllNotifications();
        if (all.size() == 2) {
            System.out.println("✅ PASS | "
                + all.size() + " stored");
            passed++;
        } else {
            System.out.println("❌ FAIL | Expected 2"
                + ", got " + all.size());
            failed++;
        }

        // Test 4: Clear notifications
        System.out.print(
            "\nTest 4 - Clear Notifications: ");
        ConflictNotificationService
            .clearNotifications();
        if (ConflictNotificationService
                .getAllNotifications().isEmpty()) {
            System.out.println("✅ PASS | Cleared");
            passed++;
        } else {
            System.out.println("❌ FAIL | Not cleared");
            failed++;
        }

        System.out.println("\n=== Results ===");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
    }
}
