import java.util.*;
import java.util.stream.Collectors;

// The CatalogService class manages the library's catalog of books, allowing for operations
// such as adding and removing books, searching by title, author, or ISBN, and sorting the catalog.
// It includes methods to display available books, count total and available copies, and search for books by keyword.

class CatalogService {
    private final List<Book> books; // A list to store books in the catalog

    // Constructor to initialize the catalog service with an initial list of books
    public CatalogService(List<Book> books) {
        // Initialize the books list
    }

    // Add a new book to the catalog
    public void addBook(Book book) {
        // Logic: Add the provided book to the list of books
    }

    // Remove a book from the catalog
    public void removeBook(Book book) {
        // Logic: Remove the provided book from the list of books
    }

    // Find a book by its title (case-insensitive search)
    public Optional<Book> findBookByTitle(String title) {
        // Logic: Search through the list of books and find the one with a matching
        // title, ignoring case
        // If found, wrap it in an Optional
    }

    // Find a book by its ISBN
    public Optional<Book> findBookByISBN(String ISBN) {
        // Logic: Search through the list of books and find the one with the matching
        // ISBN
        // If found, wrap it in an Optional
    }

    // Display all books in the catalog
    public void displayCatalog() {
        // Logic: Check if the catalog is empty and display a message accordingly
        // If not empty, display details of each book including title, author, and
        // available copies
    }

    // Find all books by a specific author (case-insensitive search)
    public List<Book> findBooksByAuthor(String author) {
        // Logic: Filter the list of books based on the author's name, ignoring case
        // Collect and return all books that match
    }

    // Display all books in the catalog with their availability status
    public void displayBooksByAvailability() {
        // Logic: Iterate over all books and check their availability based on the
        // number of copies
        // Display book title along with its availability status ("Available" or "Not
        // Available")
    }

    // List all books sorted by their title
    public List<Book> listBooksSortedByTitle() {
        // Logic: Sort the books list by title in ascending order
        // Return the sorted list
    }

    // List all books sorted by their author
    public List<Book> listBooksSortedByAuthor() {
        // Logic: Sort the books list by author in ascending order
        // Return the sorted list
    }

    // Check if a specific book is available by its title
    public boolean isBookAvailable(String title) {
        // Logic: Check if any book in the list with the given title has available
        // copies
        // Return true if available, false otherwise
    }

    // Count the total number of books in the catalog
    public int countTotalBooks() {
        // Logic: Return the total number of books in the catalog list
    }

    // Count the total number of available copies for a given book by title
    public int countAvailableCopies(String title) {
        // Logic: Filter books by title and sum the available copies
        // Return the total number of available copies
    }

    // Display books that match a specific keyword in the title
    public List<Book> searchBooksByKeyword(String keyword) {
        // Logic: Filter the list of books and find those that contain the keyword in
        // the title, ignoring case
        // Return the books that match the search criteria
    }
}
