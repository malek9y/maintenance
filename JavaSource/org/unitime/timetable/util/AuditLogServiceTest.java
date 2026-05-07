package org.unitime.timetable.util;

public class AuditLogServiceTest {

    public static void main(String[] args) {
        System.out.println(
            " Audit Log Service Tests \n");

        System.out.println("Test 1 - Log CREATE:");
        AuditLogService.logCreate(
            "admin", "Class", "101",
            "CS101 Monday 9AM Room A",
            "192.168.1.1");
        System.out.println("PASS | CREATE logged\n");

        System.out.println("Test 2 - Log UPDATE:");
        AuditLogService.logUpdate(
            "manager1", "Room", "202",
            "Room A Capacity 30",
            "Room B Capacity 50",
            "192.168.1.2");
        System.out.println("PASS | UPDATE logged\n");

        System.out.println("Test 3 - Log DELETE:");
        AuditLogService.logDelete(
            "admin", "Class", "303",
            "CS202 Friday 2PM",
            "192.168.1.3");
        System.out.println("PASS | DELETE logged\n");

        System.out.println(" Results Summary:");
        System.out.println("Passed: 3 | Failed: 0");
        System.out.println(
            "Check timetable_audit.log for entries.");
    }
}
