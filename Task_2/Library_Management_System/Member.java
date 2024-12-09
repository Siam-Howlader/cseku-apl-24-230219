<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;

// The Member class represents a library member with details such as name, member ID, membership date, email, phone number, 
// and a list of borrowed books. It includes methods to borrow and return books, check for overdue books, and display borrowed books. 
// The class also provides getters and setters to access and update member information, helping manage library member interactions and 
// book borrowing activities.

class Member {
    private String name;
    private String memberId;
    private Date membershipDate;
    private String email;
    private String phoneNumber;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, String memberId, Date membershipDate, String email, String phoneNumber) {
        // Logic: Initialize member fields with the provided arguments
    }

    // Business Logic
    public void borrowBook(Book book) {
        // Logic: Add the provided book to the borrowedBooks list
    }

    public void returnBook(Book book) {
        // Logic: Remove the provided book from the borrowedBooks list
    }

    // Check if a member has overdue books
    public boolean hasOverdueBooks() {
        // Logic: Get the current date using LocalDate
        // Logic: Check if any borrowed book has a due date before the current date
    }

    // Get the number of borrowed books
    public int getBorrowedBookCount() {
        // Logic: Return the size of the borrowedBooks list
    }

    // Display borrowed books
    public void displayBorrowedBooks() {
        // Logic: If borrowedBooks is empty, print a message indicating no borrowed
        // books
        // Logic: If borrowedBooks is not empty, print each borrowed book's title and
        // due date
    }

    // Getters and Setters
    public String getName() {
        // Logic: Return the name of the member
    }

    public String getMemberId() {
        // Logic: Return the memberId of the member
    }

    public List<Book> getBorrowedBooks() {
        // Logic: Return the borrowedBooks list
    }

    public Date getMembershipDate() {
        // Logic: Return the membershipDate of the member
    }

    public String getEmail() {
        // Logic: Return the email of the member
    }

    public String getPhoneNumber() {
        // Logic: Return the phone number of the member
    }

    public void setEmail(String email) {
        // Logic: Set the email of the member to the provided value
    }

    public void setPhoneNumber(String phoneNumber) {
        // Logic: Set the phone number of the member to the provided value
    }
}
=======
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;

// The Member class represents a library member with details such as name, member ID, membership date, email, phone number, 
// and a list of borrowed books. It includes methods to borrow and return books, check for overdue books, and display borrowed books. 
// The class also provides getters and setters to access and update member information, helping manage library member interactions and 
// book borrowing activities.

class Member {
    private String name;
    private String memberId;
    private Date membershipDate;
    private String email;
    private String phoneNumber;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, String memberId, Date membershipDate, String email, String phoneNumber) {
        // Logic: Initialize member fields with the provided arguments
    }

    // Business Logic
    public void borrowBook(Book book) {
        // Logic: Add the provided book to the borrowedBooks list
    }

    public void returnBook(Book book) {
        // Logic: Remove the provided book from the borrowedBooks list
    }

    // Check if a member has overdue books
    public boolean hasOverdueBooks() {
        // Logic: Get the current date using LocalDate
        // Logic: Check if any borrowed book has a due date before the current date
    }

    // Get the number of borrowed books
    public int getBorrowedBookCount() {
        // Logic: Return the size of the borrowedBooks list
    }

    // Display borrowed books
    public void displayBorrowedBooks() {
        // Logic: If borrowedBooks is empty, print a message indicating no borrowed
        // books
        // Logic: If borrowedBooks is not empty, print each borrowed book's title and
        // due date
    }

    // Getters and Setters
    public String getName() {
        // Logic: Return the name of the member
    }

    public String getMemberId() {
        // Logic: Return the memberId of the member
    }

    public List<Book> getBorrowedBooks() {
        // Logic: Return the borrowedBooks list
    }

    public Date getMembershipDate() {
        // Logic: Return the membershipDate of the member
    }

    public String getEmail() {
        // Logic: Return the email of the member
    }

    public String getPhoneNumber() {
        // Logic: Return the phone number of the member
    }

    public void setEmail(String email) {
        // Logic: Set the email of the member to the provided value
    }

    public void setPhoneNumber(String phoneNumber) {
        // Logic: Set the phone number of the member to the provided value
    }
}
>>>>>>> ef4d5b653440384dca8b827f536ec9c37f5625a2
