import java.util.Date;

// The Logger class provides flexible logging capabilities, supporting multiple log levels (INFO, DEBUG, ERROR, and WARNING) 
// and formatted messages. It includes specific methods for logging errors and debugging information and can add timestamps 
// to log entries for tracking purposes. The logFormatted method enables custom formatting, making the logger versatile 
// for various logging needs in an application.

class Logger {
    // Log levels
    public enum LogLevel {
        INFO, DEBUG, ERROR, WARNING
    }

    // General log method
    public static void log(String message) {
        // Logic: Call the log method with LogLevel.INFO and the provided message
    }

    // Log with level
    public static void log(LogLevel level, String message) {
        // Logic: Add a timestamp to the message
        // Logic: Print the log with the log level and the timestamped message
    }

    // Method to log errors specifically
    public static void error(String message) {
        // Logic: Call the log method with LogLevel.ERROR and the provided message
    }

    // Method to log debug information
    public static void debug(String message) {
        // Logic: Call the log method with LogLevel.DEBUG and the provided message
    }

    // Add timestamp to a log message
    private static String addTimestamp(String message) {
        // Logic: Create a Date object representing the current date and time
        // Logic: Return the timestamped message by combining the date and the message
    }

    // Custom log format method
    public static void logFormatted(LogLevel level, String format, Object... args) {
        // Logic: Format the message using the provided format and arguments
        // Logic: Call the log method with the formatted message and the specified log
        // level
    }
}
