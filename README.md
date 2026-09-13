# Employee Management System

A Java-based Employee Management System that allows users to manage employee records through a menu-driven console application.

The application uses Java, JDBC, Maven, and MySQL to perform CRUD operations on employee data.

## 🚀 Features

- Add a new employee
- Update employee salary
- Display employee details
- Delete an employee
- Menu-driven console interface
- MySQL database integration
- JDBC connectivity
- Continuous menu until the user chooses Exit

## 🛠️ Technologies Used

- Java 17
- JDBC
- MySQL
- Maven
- IntelliJ IDEA
- Git
- GitHub

## 📂 Project Structure

```text
EmployeeManagementSystem
│
├── src
│   └── main
│       └── java
│           └── com.employeemanagement
│               ├── DBConnection.java
│               ├── Employee.java
│               ├── EmployeeApp.java
│               └── EmployeeService.java
│
├── .gitignore
├── pom.xml
└── README.md
## 🗄️ Database Setup

This project uses MySQL to store employee records.

Create the database and table using the following SQL:

```sql
CREATE DATABASE college;

USE college;

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE
);
## ⚙️ Configuration

The database connection uses an environment variable for the MySQL password.

Set the following environment variable before running the application:

`DB_PASSWORD=your_mysql_password`

The database URL and username are configured in `DBConnection.java`.

## ▶️ How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java 17, Maven, and MySQL are installed.
4. Create the `college` database and `employees` table.
5. Configure the `DB_PASSWORD` environment variable.
6. Run `EmployeeApp.java`.
7. Use the menu to add, update, display, or delete employees.

## 🔮 Future Improvements

- Add employee search functionality
- Add input validation
- Add a graphical user interface
- Add unit testing
- Add role-based access