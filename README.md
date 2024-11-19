# Library Management System

This Library Management System is designed to efficiently manage books and members in a library. It allows only registered members to issue books while storing all relevant details, including member and book information. Administrators can track issued books and view their availability with ease.

This project utilizes **Java** and **JavaFX**, making it an excellent resource for learning core Java concepts and GUI development. It is ideal for deployment in schools, colleges, or small libraries.

---

## 🚀 Features
- **Member Management**: Add and track member details.
- **Book Management**: Add, issue, return, and view book details.
- **Admin Login**: Only administrators can access the system.
- **Search Members**: Find members by ID or name, along with issued book details.
- **Database Integration**: Uses text files for data storage (path customization required).

---

## 🛠️ Key Java Concepts Utilized
- **List**
- **HashSet**
- **ArrayList**
- **Reader**
- **Iterator**

This project is a practical introduction to basic Java and JavaFX, providing hands-on experience with data structures, file handling, and GUI applications.

---

## 📂 Project Modules
The system consists of **8 main screens**:
1. **Login**  
2. **Home**  
3. **Add Book**  
4. **Issue Book**  
5. **Add Member**  
6. **Book List**  
7. **Return Book**  
8. **Search Member**

---

## 🔑 Login
- The **Login Page** is restricted to administrators only.  
- **Default Admin Credentials**:
  - Username: `saksham`
  - Password: `sl`
- Credentials are hardcoded and can be updated in `MainController.java`.

![LOGIN](https://github.com/Saksham-Lakhera/library_management/blob/master/images/login.JPG)

---

## 🏠 Home
The **Home Screen** serves as the dashboard with six buttons linking to the other pages.

![HOME](https://github.com/Saksham-Lakhera/library_management/blob/master/images/main.JPG)

---

## 📚 Add Book
- Fields: **ID**, **Name**, **Author**, **Publication** (all required).  
- On clicking the **Add Book** button, the book is saved in the database.

![ADD BOOK](https://github.com/Saksham-Lakhera/library_management/blob/master/images/add.JPG)

---

## 📖 Issue Book
- Fields: **Member ID**, **Book ID** (both required).  
- Books are issued only if:
  - The Member ID and Book ID are valid.
  - The book is not already issued.  
- Errors are displayed for invalid inputs or unavailable books.

![ISSUE BOOK](https://github.com/Saksham-Lakhera/library_management/blob/master/images/book_issue.JPG)

---

## 👤 Add Member
- Fields: **ID**, **Name**, **Phone**, **Email** (all required).  
- Members cannot have duplicate IDs.  
- Clicking **Add Member** saves the member to the database.

![ADD MEMBER](https://github.com/Saksham-Lakhera/library_management/blob/master/images/new_member.JPG)

---

## 📋 Book List
Displays all books available in the library along with their details.

![BOOK LIST](https://github.com/Saksham-Lakhera/library_management/blob/master/images/book_list.JPG)

---

## 🔄 Return Book
- Fields: **Member ID**, **Book ID** (both required).  
- Errors are shown if:
  - No books are issued to the member.
  - An incorrect book ID is entered.

![RETURN BOOK](https://github.com/Saksham-Lakhera/library_management/blob/master/images/return.JPG)

---

## 🔍 Search Members
- Search members by **ID** or **Name**.  
- Displays all issued book details for the member.

![SEARCH MEMBERS](https://github.com/Saksham-Lakhera/library_management/blob/master/images/search_member.JPG)

---

## 📌 To Do
- The system currently uses text files for the database. Paths must be updated in all controller files.  
- Future enhancements:
  - Transition to a relational database for scalability.
  - Implement user-level authentication for members.

---

## 🎓 Project Context
This project was developed as part of the **Java course** during my undergraduate program, focusing on building foundational Java and JavaFX skills.

---

## 📧 Contact
For any queries or suggestions, feel free to reach out:  
**Linkedin**: [https://www.linkedin.com/in/sakshamlakhera/]  
