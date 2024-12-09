package View;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


class LoanServiceImpl implements LoanService {
    private final NotificationService notificationService;
    private final int MAX_BORROW_LIMIT = 5; // Maximum books a member can borrow

    public LoanServiceImpl(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void borrowBook(Member member, Book book) throws BookNotAvailableException {
        // Check if the member has reached the borrow limit
        if (hasReachedBorrowLimit(member)) {
            notificationService.sendNotification(member, "You have reached your borrow limit of " + MAX_BORROW_LIMIT + " books.");
            return;
        }

        // Check if the book is available
        if (book.getAvailableCopies() <= 0) {
            book.addToWaitList(member); // Add member to waitlist
            notificationService.sendNotification(member, "The book \"" + book.getTitle() + "\" is unavailable. You are added to the waitlist.");
            return;
        }

        // Borrow the book
        book.decrementCopies(); // Reduce available copies
        member.borrowBook(book); // Add the book to the member's borrowed list
        LocalDate dueDate = LocalDate.now().plusWeeks(2); // 2-week borrowing period
        book.setDueDate(dueDate);
        notificationService.sendNotification(member, "You have successfully borrowed \"" + book.getTitle() + "\". Due date: " + dueDate);
    }

    @Override
    public void returnBook(Member member, Book book) {
        // Return the book
        member.returnBook(book); // Remove the book from the member's list
        book.incrementCopies(); // Increment available copies

        // Notify if the book was overdue
        if (LocalDate.now().isAfter(book.getDueDate())) {
            notificationService.sendNotification(member, "The book \"" + book.getTitle() + "\" was returned late.");
        } else {
            notificationService.sendNotification(member, "The book \"" + book.getTitle() + "\" has been successfully returned.");
        }

        // Notify the next member on the waitlist
        if (!book.getWaitList().isEmpty()) {
            Member nextInLine = book.getWaitList().poll(); // Get the next member in the queue
            notificationService.sendNotification(nextInLine, "The book \"" + book.getTitle() + "\" is now available for borrowing.");
        }
    }

    @Override
    public void checkWaitList(Book book) {
        if (book.getWaitList().isEmpty()) {
            System.out.println("No members are on the waitlist for \"" + book.getTitle() + "\".");
        } else {
            Member nextMember = book.getWaitList().peek(); // Check the next member in line
            System.out.println("Next member in waitlist for \"" + book.getTitle() + "\": " + nextMember.getName());
        }
    }

    @Override
    public void notifyOverdueBooks(List<Member> members) {
        for (Member member : members) {
            for (Book book : member.getBorrowedBooks()) {
                if (LocalDate.now().isAfter(book.getDueDate())) {
                    notificationService.sendNotification(member, "The book \"" + book.getTitle() + "\" is overdue. Please return it as soon as possible.");
                }
            }
        }
    }

    @Override
    public boolean hasReachedBorrowLimit(Member member) {
        return member.getBorrowedBookCount() >= MAX_BORROW_LIMIT;
    }
}
