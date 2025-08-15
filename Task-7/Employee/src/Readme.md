# Task 7

## Employee Database App (Java + MySQL)

## 💻 Requirements

###  Java JDK 8+ , MySQL Server 
###  MySQL Connector/J (JDBC driver) added to your project
###  Tools :- VS Code

## 📌 Overview
### A console-based **CRUD application** in Java using **MySQL** to manage employee records.

## ⚙ Features
- **View Employees** (all or by ID)
- **Add Employee**
- **Update Employee**
- **Delete Employee** (single or all)
- **Exit Application**

### [Main.java](https://github.com/Narayana48/Elevate-Labs/blob/main/Task-7/Employee/src/Main.java) It is a Runnable file and it contains the main menu loop and handles user input to call the respective Employee database operations.

### [Employee.java](https://github.com/Narayana48/Elevate-Labs/blob/main/Task-7/Employee/src/Employee.java) It contains all the CRUD operations methods.

## 🗂 Database Setup
```sql
CREATE DATABASE Employee;
USE Employee;
CREATE TABLE Employee_details (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary INT,
    city VARCHAR(50)
); 

