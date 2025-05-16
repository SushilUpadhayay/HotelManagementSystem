-- Create the database
CREATE DATABASE Mydb;

-- Use the database
USE Mydb;

CREATE TABLE Customer(
Name TEXT,
Gmail VARCHAR(100) PRIMARY KEY,
Age TEXT,
Gender TEXT,
Password TEXT
);
CREATE TABLE EmployeeAccount(
Name TEXT,
Gmail VARCHAR(100) PRIMARY KEY,
Age TEXT,
Gender TEXT,
Department TEXT,
Role TEXT,
Shift TEXT,
Salary DECIMAL(8, 3),
Password TEXT,
CONSTRAINT chk_shift CHECK (Shift IN ('day', 'night'))  -- to check that shift can only be either day or night (assertion)
);
ALTER TABLE EmployeeAccount
MODIFY COLUMN Salary TEXT;
CREATE TABLE Booking(
Name TEXT,
Gmail VARCHAR(100), -- MAKE THIS FOREIGN KEY FROM CUSTOMMER TABLE
RoomType TEXT,
NoOfRooms INT,
NoOfPersons INT,
NoOfDays INT,
OtherServices TEXT,
Totalprice DECIMAL(7, 4),
FOREIGN KEY (Gmail) REFERENCES Customer(Gmail) ON DELETE CASCADE
);
ALTER TABLE Booking
MODIFY COLUMN Totalprice DECIMAL(10, 2);
SELECT * FROM Customer;
SELECT * FROM Booking;
SELECT * FROM EmployeeAccount;