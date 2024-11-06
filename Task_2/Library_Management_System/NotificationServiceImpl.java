
// The NotificationServiceImpl class implements methods to notify library members via default messages, 
// email, SMS, reminders, welcome messages, and updates on new book arrivals, typically by printing messages to the console.

class NotificationServiceImpl implements NotificationService {

    @Override
    public void notify(Member member, String message) {
        // Logic: Print a default notification message to the console
    }

    // Notify via email
    public void notifyByEmail(Member member, String message) {
        // Logic: Simulate sending an email by printing a message to the console
    }

    // Notify via SMS
    public void notifyBySMS(Member member, String message) {
        // Logic: Simulate sending an SMS by printing a message to the console
    }

    // Send a reminder notification
    public void sendReminder(Member member, String dueDate) {
        // Logic: Create a reminder message using member's name and due date
        // Logic: Call the notify method with the reminder message
    }

    // Send a welcome message to new members
    public void sendWelcomeMessage(Member member) {
        // Logic: Create a welcome message using member's name
        // Logic: Call the notify method with the welcome message
    }

    // Notify about new arrivals
    public void notifyNewArrival(Member member, Book book) {
        // Logic: Create a message about a new book arrival using member's name, book's
        // title, and author
        // Logic: Call the notify method with the new arrival message
    }
}
