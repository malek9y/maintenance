package org.unitime.timetable.util;
import java.util.List;

public class ConflictNotificationServiceTest {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        ConflictNotificationService.notifyRoomConflict(
            "CS101", "Room A",
            "Monday 9AM",
            "manager@university.edu");
        passed++;

        ConflictNotificationService.notifyInstructorConflict(
            "CS202", "Dr. Smith",
            "Tuesday 2PM",
            "manager@university.edu");
        passed++;

        List<String> all = ConflictNotificationService.getAllNotifications();
        if (all.size() == 2) {
            passed++;
        } else {
            failed++;
        }

        ConflictNotificationService.clearNotifications();
        if (ConflictNotificationService.getAllNotifications().isEmpty()) {
            passed++;
        } else {
            failed++;
        }

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
    }
}
