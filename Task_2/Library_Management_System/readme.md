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
