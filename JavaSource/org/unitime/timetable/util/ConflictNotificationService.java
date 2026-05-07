package org.unitime.timetable.util;

import java.util.ArrayList;
import java.util.List;

/**
 * CR-004: Conflict Notification Service
 * Sends notifications when scheduling conflicts
 * are detected in the timetable.
 */
public class ConflictNotificationService {

    private static final List<String> notifications =
        new ArrayList<>();

    public static void notifyConflict(
            String conflictType,
            String className,
            String roomOrInstructor,
            String timeSlot,
            String managerEmail) {

        String message = buildMessage(
            conflictType, className,
            roomOrInstructor, timeSlot,
            managerEmail);

        notifications.add(message);

        System.out.println(
            "=== CONFLICT NOTIFICATION ===");
        System.out.println(message);
        System.out.println(
            "Notification sent to: " 
            + managerEmail);
        System.out.println(
            "=============================\n");
    }

    private static String buildMessage(
            String conflictType,
            String className,
            String roomOrInstructor,
            String timeSlot,
            String managerEmail) {
        return "To: " + managerEmail + "\n"
            + "Subject: Scheduling Conflict Alert\n"
            + "Conflict Type: " + conflictType + "\n"
            + "Class: " + className + "\n"
            + "Affected: " + roomOrInstructor + "\n"
            + "Time Slot: " + timeSlot + "\n"
            + "Action: Please log in to UniTime "
            + "to resolve this conflict.";
    }

    public static void notifyRoomConflict(
            String className, String roomName,
            String timeSlot, String managerEmail) {
        notifyConflict(
            "ROOM DOUBLE BOOKING",
            className, roomName,
            timeSlot, managerEmail);
    }

    public static void notifyInstructorConflict(
            String className, String instructorName,
            String timeSlot, String managerEmail) {
        notifyConflict(
            "INSTRUCTOR OVERLAP",
            className, instructorName,
            timeSlot, managerEmail);
    }

    public static List<String> getAllNotifications() {
        return notifications;
    }

    public static void clearNotifications() {
        notifications.clear();
    }
}
