CREATE DATABASE java;

USE java;

CREATE TABLE Student (
    roll_no INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50),
    marks INT
);

INSERT INTO Student VALUES
(101, 'Daksh', 'CSE', 85),
(102, 'Rahul', 'CSE', 78),
(103, 'Amit', 'IT', 90);

CREATE TABLE Product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    quantity INT,
    price DOUBLE
);

INSERT INTO Product VALUES
(1, 'Laptop', 10, 55000),
(2, 'Mouse', 25, 800),
(3, 'Keyboard', 15, 1500);