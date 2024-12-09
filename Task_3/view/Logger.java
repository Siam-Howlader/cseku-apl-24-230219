package View;

import java.text.SimpleDateFormat;
import java.util.Date;

 public class Logger {
    // Define log levels
    public enum LogLevel {
        INFO, DEBUG, ERROR, WARNING
    }

    // General log method
    public static void log(String message) {
        log(LogLevel.INFO, message); // Default to INFO level
    }

    // Log with a specific level
    public static void log(LogLevel level, String message) {
        String timestampedMessage = addTimestamp(message); // Add timestamp to the message
        System.out.println("[" + level + "] " + timestampedMessage); // Print log
    }

    // Log errors
    public static void error(String message) {
        log(LogLevel.ERROR, message);
    }

    // Log debug information
    public static void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    // Add timestamp to a log message
    private static String addTimestamp(String message) {
        // Create a date formatter
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = dateFormat.format(new Date()); // Get the current date and time
        return "[" + timestamp + "] " + message; // Combine timestamp with the message
    }

    // Custom log format method
    public static void logFormatted(LogLevel level, String format, Object... args) {
        String formattedMessage = String.format(format, args); // Format the message
        log(level, formattedMessage); // Log the formatted message
    }
}
