
// The MemberNotFoundException class is a custom exception used when a library member is not found. 
// It stores the member's ID and optional additional details. It provides constructors to initialize these fields, 
// along with getter methods and a logException() method to log the error using a logger.

class MemberNotFoundException extends Exception {
    private String memberId;
    private String additionalDetails;

    public MemberNotFoundException(String memberId) {
        // Logic: Initialize the exception message with memberId
        // Logic: Set the memberId field
    }

    public MemberNotFoundException(String memberId, String additionalDetails) {
        // Logic: Initialize the exception message with memberId and additionalDetails
        // Logic: Set both memberId and additionalDetails fields
    }

    // Get the ID of the missing member
    public String getMemberId() {
        // Logic: Return the memberId field
    }

    // Get additional details
    public String getAdditionalDetails() {
        // Logic: Return the additionalDetails field
    }

    // Method to log the error using Logger
    public void logException() {
        // Logic: Log the exception message and additional details using Logger.error
    }
}
