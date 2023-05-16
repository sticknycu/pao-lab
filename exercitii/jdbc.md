#### The Library Management System
You've been hired by a library to develop a simple Library Management System (LMS). The LMS needs to interact with a relational database to store information about books and library members. Your task is to implement the database operations using JDBC.


##### Exercises:

1) Setting Up the Database Connection

- Create a new Java project and add the JDBC driver for your chosen database (e.g., MySQL, PostgreSQL, SQLite) to your classpath.
- Establish a connection to the database using the JDBC API.
- Handle any potential exceptions that may occur during the connection process.

2) Creating the Book Table
- Create a table named "Books" in the database with the following columns: "id" (integer), "title" (varchar), "author" (varchar), and "year" (integer).
- Write a Java method that executes a SQL query to create the "Books" table.
- Test the method to ensure the table is successfully created.

3) Inserting Data into the Book Table
- Write a Java method that accepts book details (title, author, year) as parameters and inserts a new row into the "Books" table.
- Prompt the user to input book details from the command line and use the method to add the book to the table.
- Implement error handling to catch any exceptions that may occur during the insertion process.

4) Retrieving Books
- Write a Java method that retrieves all the books from the "Books" table.
- Execute a SQL query to fetch the books and print the details (e.g., book ID, title, author, year) to the console.
- Test the method to ensure it retrieves and displays the books correctly.

5) Updating Book Details
- Write a Java method that allows the user to update the details of a book based on its ID.
- Prompt the user to input the book ID and the new details (title, author, year) from the command line.
- Use a prepared statement to execute an SQL update query and modify the corresponding row in the "Books" table.
- Implement appropriate error handling for this method.

6) Deleting a Book
- Write a Java method that prompts the user to input a book ID and deletes the corresponding row from the "Books" table.
- Use a prepared statement to execute an SQL delete query.
- Handle any exceptions that may occur during the deletion process.

7) Creating the Member Table
- Create a table named "Members" in the database with the following columns: "id" (integer), "name" (varchar), "email" (varchar), and "phone" (varchar).
- Write a Java method that executes a SQL query to create the "Members" table.
- Test the method to ensure the table is successfully created.

8) Inserting Data into the Member Table

- Write a Java method that accepts member details (name, email, phone) as parameters and inserts a new row into the "Members" table.
- Prompt the user to input member details from the command line and use the method to add the member to the table.
- Implement error handling to catch any exceptions that may occur during the insertion process.

9) Retrieving Members

- Write a Java method that retrieves all the members from the "Members" table.
- Execute a SQL query to fetch the members and print their details (e.g., member ID, name, email, phone) to the console.
- Test the method to ensure it retrieves and displays the members correctly.

10) Updating Member Details
- Write a Java method that allows the user to update the details of a member based on their ID.
- Prompt the user to input the member ID and the new details (name, email, phone) from the command line.
- Use a prepared statement to execute an SQL update query and modify the corresponding row in the "Members" table.
- Implement appropriate error handling for this method.

11) Deleting a Member

- Write a Java method that prompts the user to input a member ID and deletes the corresponding row from the "Members" table.
- Use a prepared statement to execute an SQL delete query.
- Handle any exceptions that may occur during the deletion process.

12) Searching for Books by Author

- Write a Java method that prompts the user to enter an author's name and retrieves all the books written by that author from the "Books" table.
- Execute a SQL query with a parameterized prepared statement to fetch the books and display their details.
- Implement error handling and proper result set handling in this method.

13) Counting Books by Year

- Write a Java method that counts the number of books published in a specific year.
- Prompt the user to input a year and execute an SQL query with a parameterized prepared statement to count the books.
- Print the count to the console, handling any exceptions that may occur.

14) Joining Tables

- Write a Java method that performs an inner join between the "Books" and "Members" tables based on the member ID.
- Execute an SQL query with a join operation to retrieve the books borrowed by each member.
- Print the member's name, book title, and the borrowed date to the console.
- Implement error handling and proper result set handling in this method.

15) Test application using JUnit and Mockito. Use Generics as much as you can.