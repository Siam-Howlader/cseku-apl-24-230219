
// The NotificationService interface defines methods for notifying members through various channels
// (e.g., email, SMS). It includes general notifications, sending reminders for due dates, informing 
// members of new arrivals, and welcoming new members. Each method provides functionality for different 
// types of notifications, ensuring members are kept informed.

interface NotificationService {
    // Notify a member with a generic message (default channel)
    void notify(Member member, String message);

    // Notify a member via email
    void notifyByEmail(Member member, String message);

    // Notify a member via SMS
    void notifyBySMS(Member member, String message);

    // Send a reminder message with a due date
    void sendReminder(Member member, String dueDate);

    // Notify a member about a new book arrival or library event
    void notifyNewArrival(Member member, Book book);

    // Send a welcome message to a new member
    void sendWelcomeMessage(Member member);
}
