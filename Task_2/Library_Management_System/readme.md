# Library Management System
## Project Overview
The Library Management System is a Java-based application designed to manage books, members, borrow/return operations, and notifications in a library setting. This project demonstrates the use of SOLID principles, offering a clean, scalable, and extensible design. The system allows efficient management of the book catalog, membership details, loan tracking, and sends notifications to members for due dates, new arrivals, and overdue books.
## Key Features:
Book Catalog Management: Manage a collection of books, including adding, removing, searching, and sorting books by title, author, and ISBN.
Membership Management: Handle member registrations, track borrowed books, and enforce borrowing limits.
Borrowing and Returning Books: Allow members to borrow books and return them after a specified due date. The system tracks overdue books and handles penalties (if applicable).
Waitlist Management: If a book is unavailable, members can be placed on a waitlist to be notified once the book becomes available.
Notification System: The system sends notifications to members via email or SMS, including overdue reminders and new book arrivals.
## Project Structure
```plaintext
library-management-system/
├── core/
│   ├── Book.java
│   ├── Member.java
│   ├── CatalogService.java
│   ├── LoanService.java
│   ├── NotificationService.java
│   ├── NotificationServiceImpl.java
│   ├── WaitList.java
│   └── DatabaseConnection.java
├── service/
│   ├── LoanServiceImpl.java
│   ├── CatalogServiceImpl.java
│   ├── NotificationServiceImpl.java
│   └── Logger.java
└── exceptions/
    ├── BookNotAvailableException.java
    └── MemberNotFoundException.java
```
## Core Components
Book.java: The Book class represents the properties of a book, including its title, author, ISBN, availability, due date, and the waitlist for borrowing.
Member.java: The Member class holds the details of a library member, including personal information, borrowed books, and membership status.
CatalogService.java: Provides services for adding, removing, and searching books within the library's catalog.
LoanService.java: Responsible for processing book loans, managing borrowed books, and ensuring that no member exceeds the borrowing limit.
NotificationService.java: An interface that defines methods for notifying members via different channels (email, SMS, reminders).
NotificationServiceImpl.java: Implements the NotificationService interface to send notifications for events like overdue books or new arrivals.
WaitList.java: Manages a waitlist for books that are currently unavailable, allowing members to be notified when a book is available.
DatabaseConnection.java: Handles database operations, including connecting, querying, and executing transactions.
## Service Layer
LoanServiceImpl.java: Implements the loan service logic, ensuring that the book borrowing process adheres to business rules such as checking availability and handling overdue books.
CatalogServiceImpl.java: Implements the catalog service, allowing users to add, remove, and search books in the catalog.
NotificationServiceImpl.java: Implements the logic to notify members about overdue books, new arrivals, and reminders via email or SMS.
Logger.java: A logging utility that records events in the system, helping to track operations and errors.
## Exception Handling
BookNotAvailableException.java: This exception is thrown when a book is not available for borrowing, either due to being already borrowed or unavailable in the library.
MemberNotFoundException.java: This exception is thrown when an action is attempted with a member ID that does not exist in the system.
## UML Diagram
The project's architecture is illustrated in the UML diagram below, which provides a visual representation of the relationships between the classes and interfaces. This diagram helps in understanding the design and structure of the system.
![Library Management System Overview](UML_diagram_Library_management_system.png)
