<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Initialize an empty list of books for the catalog
        List<Book> books = new ArrayList<>();

        // Initialize CatalogService with the books list
        CatalogService catalogService = new CatalogService(books);

        // Initialize NotificationService and LoanService
        NotificationService notificationService = new NotificationServiceImpl();
        LoanService loanService = new LoanServiceImpl(notificationService);

        // Create sample Book objects with title, author, ISBN, and copies available
        Book book1 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 5);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "978-0134685991", 3);
        Book book3 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 2);

        // Add the created books to the catalog using catalogService.addBook()
        catalogService.addBook(book1);
        catalogService.addBook(book2);
        catalogService.addBook(book3);

        // Create sample Member objects with name, member ID, registration date, email,
        // and phone number
        Member member1 = new Member("Alice Smith", "M001", new Date(), "alice@example.com", "1234567890");
        Member member2 = new Member("Bob Johnson", "M002", new Date(), "bob@example.com", "0987654321");

        // Display the current catalog by calling catalogService.displayCatalog()
        catalogService.displayCatalog();

        // Attempt to borrow books using loanService.borrowBook() for member1 (Alice
        // Smith)
        try {
            loanService.borrowBook(member1, book1);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Attempt to borrow a book for member2 (Bob Johnson) that is already borrowed
        // by Alice
        try {
            loanService.borrowBook(member2, book1); // This should fail because Alice borrowed the book
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Display the updated catalog after borrowing books
        catalogService.displayCatalog();

        // Attempt to return a book for Alice Smith using loanService.returnBook()
        loanService.returnBook(member1, book1);

        // Display the catalog after a book return
        catalogService.displayCatalog();

        // Check if there are any members on the waitlist for the book 'Design Patterns'
        loanService.checkWaitList(book1);
    }
}
=======
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Initialize an empty list of books for the catalog
        List<Book> books = new ArrayList<>();

        // Initialize CatalogService with the books list
        CatalogService catalogService = new CatalogService(books);

        // Initialize NotificationService and LoanService
        NotificationService notificationService = new NotificationServiceImpl();
        LoanService loanService = new LoanServiceImpl(notificationService);

        // Create sample Book objects with title, author, ISBN, and copies available
        Book book1 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 5);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "978-0134685991", 3);
        Book book3 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 2);

        // Add the created books to the catalog using catalogService.addBook()
        catalogService.addBook(book1);
        catalogService.addBook(book2);
        catalogService.addBook(book3);

        // Create sample Member objects with name, member ID, registration date, email,
        // and phone number
        Member member1 = new Member("Alice Smith", "M001", new Date(), "alice@example.com", "1234567890");
        Member member2 = new Member("Bob Johnson", "M002", new Date(), "bob@example.com", "0987654321");

        // Display the current catalog by calling catalogService.displayCatalog()
        catalogService.displayCatalog();

        // Attempt to borrow books using loanService.borrowBook() for member1 (Alice
        // Smith)
        try {
            loanService.borrowBook(member1, book1);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Attempt to borrow a book for member2 (Bob Johnson) that is already borrowed
        // by Alice
        try {
            loanService.borrowBook(member2, book1); // This should fail because Alice borrowed the book
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Display the updated catalog after borrowing books
        catalogService.displayCatalog();

        // Attempt to return a book for Alice Smith using loanService.returnBook()
        loanService.returnBook(member1, book1);

        // Display the catalog after a book return
        catalogService.displayCatalog();

        // Check if there are any members on the waitlist for the book 'Design Patterns'
        loanService.checkWaitList(book1);
    }
}
>>>>>>> ef4d5b653440384dca8b827f536ec9c37f5625a2
