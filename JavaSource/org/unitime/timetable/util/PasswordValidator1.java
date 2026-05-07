package org.unitime.timetable.util;
import java.util.ArrayList;
import java.util.List;
public class PasswordValidator1 {
    private static final int MIN_LENGTH = 8;
    public static List<String> validate(
           String password, String username) {
        List<String> errors = new ArrayList<>();
        if (password == null || // check if password is null
                password.length() < MIN_LENGTH) {
            errors.add("Password must be at least "
                + MIN_LENGTH + " characters long.");
        }
        if (password != null && 
                !password.matches(".*[A-Z].*")) {
            errors.add("Password must contain at least "
                + "one uppercase letter.");
        }

        if (password != null && //if password not null
                !password.matches(".*[a-z].*")) {
            errors.add("Password must contain at least "
                + "one lowercase letter.");
        }
        if (password != null && 
                !password.matches(".*[0-9].*")) {
            errors.add("Password must contain at least "
                + "one digit.");
        }
        if (password != null && 
                !password.matches(".*[!@#$%^&*()].*")) {
            errors.add("Password must contain at least "
                + "one special character.");
        }
        if (username != null && password != null &&
                password.equalsIgnoreCase(username)) {
            errors.add("Password must not match "
                + "the username.");
        }
        return errors;
    }
    public static boolean isValid(// validate function for validating password
            String password, String username) {
        return validate(password, username).isEmpty();
    }
}
