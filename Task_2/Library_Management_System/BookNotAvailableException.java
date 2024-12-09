<<<<<<< HEAD

// The BookNotAvailableException class is a custom exception for handling cases where a requested 
// book is unavailable. It stores details like the book title, member ID, and waitlist position (if applicable). 
// The class provides constructors for creating exceptions with or without waitlist position and includes 
// getter methods to retrieve this information.

class BookNotAvailableException extends Exception {
    // Private fields to store information about the exception
    private String bookTitle; // Title of the book that is unavailable
    private String memberId; // Member ID of the person who tried to borrow the book
    private int waitlistPosition; // Position of the member in the waitlist (if applicable)

    // Constructor to handle book unavailability without providing waitlist position
    public BookNotAvailableException(String bookTitle, String memberId) {
        // Calls the superclass constructor with a specific error message
        super("The book '" + bookTitle + "' is currently unavailable for member ID: " + memberId);
        this.bookTitle = bookTitle; // Initialize the bookTitle with the passed value
        this.memberId = memberId; // Initialize the memberId with the passed value
        this.waitlistPosition = -1; // -1 indicates that the member is not on the waitlist or no waitlist position
                                    // is set
    }

    // Constructor to handle book unavailability with waitlist position
    public BookNotAvailableException(String bookTitle, String memberId, int waitlistPosition) {
        // Calls the superclass constructor with a specific error message including the
        // waitlist position
        super("The book '" + bookTitle + "' is currently unavailable for member ID: " + memberId +
                ". You are at position " + waitlistPosition + " in the waitlist.");
        this.bookTitle = bookTitle; // Initialize the bookTitle with the passed value
        this.memberId = memberId; // Initialize the memberId with the passed value
        this.waitlistPosition = waitlistPosition; // Initialize the waitlistPosition with the passed value
    }

    // Getter for the book title
    public String getBookTitle() {
        // Returns the title of the book that is unavailable
        return bookTitle;
    }

    // Getter for the member ID
    public String getMemberId() {
        // Returns the member ID of the person who tried to borrow the book
        return memberId;
    }

    // Getter for the waitlist position
    public int getWaitlistPosition() {
        // Returns the member's position in the waitlist, or -1 if the position is not
        // set
        return waitlistPosition;
    }
}
=======

// The BookNotAvailableException class is a custom exception for handling cases where a requested 
// book is unavailable. It stores details like the book title, member ID, and waitlist position (if applicable). 
// The class provides constructors for creating exceptions with or without waitlist position and includes 
// getter methods to retrieve this information.

class BookNotAvailableException extends Exception {
    // Private fields to store information about the exception
    private String bookTitle; // Title of the book that is unavailable
    private String memberId; // Member ID of the person who tried to borrow the book
    private int waitlistPosition; // Position of the member in the waitlist (if applicable)

    // Constructor to handle book unavailability without providing waitlist position
    public BookNotAvailableException(String bookTitle, String memberId) {
        // Calls the superclass constructor with a specific error message
        super("The book '" + bookTitle + "' is currently unavailable for member ID: " + memberId);
        this.bookTitle = bookTitle; // Initialize the bookTitle with the passed value
        this.memberId = memberId; // Initialize the memberId with the passed value
        this.waitlistPosition = -1; // -1 indicates that the member is not on the waitlist or no waitlist position
                                    // is set
    }

    // Constructor to handle book unavailability with waitlist position
    public BookNotAvailableException(String bookTitle, String memberId, int waitlistPosition) {
        // Calls the superclass constructor with a specific error message including the
        // waitlist position
        super("The book '" + bookTitle + "' is currently unavailable for member ID: " + memberId +
                ". You are at position " + waitlistPosition + " in the waitlist.");
        this.bookTitle = bookTitle; // Initialize the bookTitle with the passed value
        this.memberId = memberId; // Initialize the memberId with the passed value
        this.waitlistPosition = waitlistPosition; // Initialize the waitlistPosition with the passed value
    }

    // Getter for the book title
    public String getBookTitle() {
        // Returns the title of the book that is unavailable
        return bookTitle;
    }

    // Getter for the member ID
    public String getMemberId() {
        // Returns the member ID of the person who tried to borrow the book
        return memberId;
    }

    // Getter for the waitlist position
    public int getWaitlistPosition() {
        // Returns the member's position in the waitlist, or -1 if the position is not
        // set
        return waitlistPosition;
    }
}
>>>>>>> ef4d5b653440384dca8b827f536ec9c37f5625a2
