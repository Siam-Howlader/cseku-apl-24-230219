import java.util.List;

// The LoanService interface defines the core operations for managing book loans in a library system.
// It includes methods to borrow and return books, check waitlists, notify members about overdue books,
// and determine if a member has reached their borrowing limit.
// Each method outlines a specific aspect of the book loan process, making it a foundational 
// interface for loan management in a library system.

interface LoanService {
    // Borrow a book for a member
    void borrowBook(Member member, Book book) throws BookNotAvailableException;

    // Return a borrowed book
    void returnBook(Member member, Book book);

    // Check the waitlist for a book
    void checkWaitList(Book book);

    // Notify overdue books to members
    void notifyOverdueBooks(List<Member> members);

    // Check if a member has reached their borrow limit
    boolean hasReachedBorrowLimit(Member member);
}
