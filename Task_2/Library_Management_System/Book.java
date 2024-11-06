import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// The Book class represents a library book, tracking its title,author,ISBN, available and total copies, due date, and a
// waitlist of members.It includes methods to manage availability, check for overdue status, and handle waitlist operations,
// supporting effective library inventory management.

class Book {
    private String title;
    private String author;
    private String ISBN;
    private int copiesAvailable;
    private int totalCopies;
    private LocalDate dueDate; // Changed to LocalDate for compatibility with date comparison
    private List<Member> waitList = new ArrayList<>(); // List to keep track of members waiting for the book

    // Constructor to initialize a new book with title, author, ISBN, and total
    // number of copies
    public Book(String title, String author, String ISBN, int totalCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.totalCopies = totalCopies; // Sets the total number of copies
        this.copiesAvailable = totalCopies; // Initially, all copies are available
    }

    // Business Logic

    // Add a member to the waitlist if they are not already present
    public void addToWaitList(Member member) {
        // Check if the member is already in the waitlist
        // If they are not in the list, add them
        // This prevents duplicate entries for the same member
    }

    // Check if the due date is before a given date
    public boolean before(LocalDate date) {
        // Check if the due date is not null and if it is before the given date
        // Returns true if the due date is before the provided date, otherwise false
        // This is useful for checking if a book is overdue before a specific date
    }

    // Remove a member from the waitlist
    public void removeFromWaitList(Member member) {
        // If the member is in the waitlist, remove them
        // This could happen when a book is returned and the member can now borrow it
    }

    // Check if the book is overdue
    public boolean isOverdue() {
        // If the due date is not null and is before the current date, return true
        // Otherwise, return false
        // This helps in determining if the book is overdue based on the current date
    }

    // Display book details including availability and waitlist
    public void displayBookDetails() {
        // Print out essential book details: title, author, ISBN
        // Display the available copies and the total copies of the book
        // If the book is borrowed, show the due date; otherwise, display "Not Borrowed"
        // If there are members in the waitlist, print their names, otherwise print "No
        // waitlist"
    }

    // Getters and Setters
    // These methods allow you to access and update the private fields of the Book
    // class

    // Getter for the book title
    public String getTitle() {
        return title;
    }

    // Getter for the book author
    public String getAuthor() {
        return author;
    }

    // Getter for the book ISBN
    public String getISBN() {
        return ISBN;
    }

    // Getter for the number of available copies of the book
    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    // Setter for the number of available copies of the book
    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    // Getter for the total number of copies of the book
    public int getTotalCopies() {
        return totalCopies;
    }

    // Getter for the due date of the book
    public LocalDate getDueDate() {
        return dueDate; // Returns the due date of the book
    }

    // Setter for the due date of the book
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate; // Sets the due date when the book is borrowed
    }

    // Getter for the waitlist of members
    public List<Member> getWaitList() {
        return waitList; // Returns the list of members waiting for this book
    }
}
