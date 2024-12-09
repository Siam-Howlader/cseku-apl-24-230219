package View;

import model.Book;
import model.Member;
import model.BookNotAvailableException;

import java.util.List;

public interface LoanService {

    /**
     * Borrow a book for a member.
     * @param member The member borrowing the book.
     * @param book   The book to be borrowed.
     * @throws BookNotAvailableException if the book is unavailable.
     */
    void borrowBook(Member member, Book book) throws BookNotAvailableException;

    /**
     * Return a borrowed book.
     * @param member The member returning the book.
     * @param book   The book to be returned.
     */
    void returnBook(Member member, Book book);

    /**
     * Check the waitlist for a book.
     * @param book The book whose waitlist needs to be checked.
     */
    void checkWaitList(Book book);

    /**
     * Notify members about overdue books.
     * @param members The list of members to notify.
     */
    void notifyOverdueBooks(List<Member> members);

    /**
     * Check if a member has reached their borrow limit.
     * @param member The member to be checked.
     * @return True if the member has reached the limit, false otherwise.
     */
    boolean hasReachedBorrowLimit(Member member);
}
