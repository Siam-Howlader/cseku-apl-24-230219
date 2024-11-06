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
# Library Management System
![Library Management System Overview]((https://www.plantuml.com/plantuml/png/xLZRZjis4xxtK-XIHdPVGFWHnDv3OFm-fFOMMw0e0agQjTcLI9Ual16Aldj5ZKnhQCfnclQgtGkjpFdcF9ePwOCsJ9cgB4PPmRIEvZnLJDKB9jWMIX1cKsi3PVJxA6h-tfMCYvYfhKwYZL5SR7_-PPn41ydpqH-ZJiHKojSEVskuAU28nIDMcPrKz6oscIxfIIRt7FJam7Z1KYk22zE9b8OLTosvTvfNSCzCWvlBZ1Ns5i_V63TphaqIsUl_5b2ceDwZCzRGc5Xu4r7hRY9dMVlBrpr6GIpFd-HpfoakMnr9XBgwy21GGIaFyAXaUGqwXHUf8CwfNmqabR809X35zUe0AgyWzYavr_k2rTRDUp2C5pecyhTWdgptzXGzTEUJDWm1Wer7uFYEfCjATAbvfy_9eUoUcNQAjHFNaUunsV6Of1jrEU9vHVWQN0x6NdMuKiQ3Op4BLdgrZCcRvQ5JlUDxDE1KZL0oNb3mVYS5B2lBGGcfL4g-GMxJfpi3xNrNl6XQtBVf9lBjmHFVbfl8sO6WW0rTPQCHxOEIDfSaihTUIPjAYKk87JjMQEiABLFCnBJdwvsiX74P9tLy0frNyfALeK9UT149a3nvVeYHdOJFWkn_HtwmSGo8_dGAg4_LHowI0-ADfW92sV5xxXqph93R3QW3p-1Oi6cuT2WuFaETkbemhQINNKAySD5AcDROPaYhRP2hlU5Ii0Ar-Znjfx6NGGvI7PrJST02FQsxZaRxEqaw4NVamXR52svgAhfe-5hGHYe3-T57AZ6CH5D2KAxjZqwf7p7_kSba9R1BMYRI997cv60NfT9eXsOgstKk_n_gDwdo-1N_1qDb2w_X1lN2CeYMql0NdZ6R6rg1xuGbrTwGirr9QxQ5OFKZoxJ6f-IlS6uMcs_Yqo3oDPHSvA3E6DqO6LIuXBU9Klp0pgsb3mPH-0n59ajOe5qUf_zyXq8yA_T5n9jBkwRf_xBmpsTXBXaDBHcGGRN30_DwZcm7sQjRLYZ8Ym8Pj2XUq-N67yrhO8ty78VXd9Syi99sRSSFX2j3jo2Tbs0Igaj4BoO_VPwkrklLy-VvR35xwZKaJtvyhU3nlpafLlvIdhh-mvSCsddPNmVibBfYYSKN9pkvFadDhP1UTWOLnKH3U2KTVwSCF0bQD-wjTYZZ6pV2Pq_gSQIw41_pZH4TVhiSVYaShYgInsPYrovj3kfUZMjS1wbro8XhqE06-Dsh7Ocnjr8Wy6JGFJCiPHhkf12GzKkHw-uCSd-hmNEwRELS1y_X2sILWHygK7Nycxq69qGAMowU51EQjLPG8PaiIsu6oKeMHSgorq50pvUpTviT4tc_k269t0ylvDH1CdMsMr37WMDttE4nYlG23b0abd5kxoxFNL1AgeiYSqYhhofzbAfana1-hlsb9PqUNln-j4f_XSouxqTO5_QXuILemyfzG2FU-E_dIsaUPILosl32dGrrS7oDwBwAq3um83CEDhBhuJVHeDxnDRrfudCJ3ER0QUyN4OYgTCde8ZDRFgxQc_k7wOyVsxk7PX2lsxldoNevMtwql4DV0s_V-s-SILHfq9SOSAPVYwR3dN1HpHPikqv3BLivUeIQ71M3wj6lvdOjFudQaMy1TFdnVUijvQE1lJti8U4DwXaUyKbaTag-XPp3OT85hpyZVD-HIaAsOzhDsj6mzjkJA0K5Cw0Z8o_YdGx2yTNK1YPAgBJoAAq7i4w53ySssvhcHpw96Wxj424f580YFEf0fq0uSY8oQblotruy5nwf3o3ogYp-1000))
