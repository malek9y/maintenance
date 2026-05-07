package org.unitime.timetable.util;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuditLogService {

    private static final String LOG_FILE =
        "timetable_audit.log";

    private static final SimpleDateFormat DATE_FORMAT =
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void log(
            String username,
            String changeType,
            String entityType,
            String entityId,
            String oldValue,
            String newValue,
            String ipAddress) {

        String timestamp = DATE_FORMAT.format(new Date());

        String entry =
            "[" + timestamp + "]" +
            " User=" + username +
            " Action=" + changeType +
            " Entity=" + entityType +
            " ID=" + entityId +
            " Old=[" + oldValue + "]" +
            " New=[" + newValue + "]" +
            " IP=" + ipAddress;

        System.out.println("[AUDIT] " + entry);

        try {
            FileWriter fw = 
                new FileWriter(LOG_FILE, true);
            fw.write(entry + "\n");
            fw.close();
        } catch (IOException e) {
            System.err.println(
                "Audit log write failed: " 
                + e.getMessage());
        }
    }

    public static void logCreate(
            String username, String entityType,
            String entityId, String newValue,
            String ipAddress) {
        log(username, "Create", entityType,
            entityId, "N/A", newValue, ipAddress);
    }

    public static void logUpdate(
            String username, String entityType,
            String entityId, String oldValue,
            String newValue, String ipAddress) {
        log(username, "Update", entityType,
            entityId, oldValue, newValue, ipAddress);
    }

    public static void logDelete(
            String username, String entityType,
            String entityId, String oldValue,
            String ipAddress) {
        log(username, "Delete", entityType,
            entityId, oldValue, "N/A", ipAddress);
    }
}
