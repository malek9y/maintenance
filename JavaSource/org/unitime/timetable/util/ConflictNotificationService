package org.unitime.timetable.util;
import java.util.ArrayList;
import java.util.List;

public class ConflictNotificationService {
    private static final List<String> notifications = new ArrayList<>();

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
        System.out.println(message);
    }

    private static String buildMessage(
            String conflictType,
            String className,
            String roomOrInstructor,
            String timeSlot,
            String managerEmail) {
        return "To: " + managerEmail
            + "\nConflict Type: " + conflictType
            + "\nClass: " + className
            + "\nAffected: " + roomOrInstructor
            + "\nTime Slot: " + timeSlot;
    }

    public static void notifyRoomConflict(
            String className, String roomName,
            String timeSlot, String managerEmail) {
        notifyConflict("ROOM DOUBLE BOOKING",
            className, roomName, timeSlot, managerEmail);
    }

    public static void notifyInstructorConflict(
            String className, String instructorName,
            String timeSlot, String managerEmail) {
        notifyConflict("INSTRUCTOR OVERLAP",
            className, instructorName, timeSlot, managerEmail);
    }

    public static List<String> getAllNotifications() {
        return notifications;
    }

    public static void clearNotifications() {
        notifications.clear();
    }
}
