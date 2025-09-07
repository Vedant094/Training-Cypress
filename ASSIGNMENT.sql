create database vedant;
use vedant;
-- creating customer table
create table customer(
CustomerID int primary key auto_increment,
Name varchar(100) not null,
Contact varchar(100) unique not null,
Address varchar(255) not null
);
-- CREATING EMPLOYEE TABLE
CREATE TABLE Employee (
    EmpID           INT PRIMARY KEY AUTO_INCREMENT,
    Name            VARCHAR(100) NOT NULL,
    Role            VARCHAR(50) NOT NULL,
    Contact         VARCHAR(20) UNIQUE NOT NULL
);

-- CREATING PRODUCT TABLE
CREATE TABLE Product (
    ProductID       INT PRIMARY KEY AUTO_INCREMENT,
    Name            VARCHAR(100) NOT NULL,
    Price           DECIMAL(10,2) NOT NULL CHECK (Price >= 0),
    StockQty        INT NOT NULL DEFAULT 0 CHECK (StockQty >= 0)
);

-- CREATING SUPPLIER TABLE
CREATE TABLE Supplier (
    SupplierID      INT PRIMARY KEY AUTO_INCREMENT,
    Name            VARCHAR(100) NOT NULL,
    Contact         VARCHAR(20),
    Address         VARCHAR(255)
);

-- CREATING SUPPLIER PRODUCT TABLE
CREATE TABLE SupplierProduct (
    SupplierID      INT,
    ProductID       INT,
    SupplyPrice     DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (SupplierID, ProductID),
    FOREIGN KEY (SupplierID) REFERENCES Supplier(SupplierID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);
-- CREATING WAREHOUSE TABLE
CREATE TABLE Warehouse (
    WarehouseID     INT PRIMARY KEY AUTO_INCREMENT,
    Location        VARCHAR(100) NOT NULL,
    Capacity        INT NOT NULL
);

-- CREATING INVENTORY TABLE
CREATE TABLE Inventory (
    StockID         INT PRIMARY KEY AUTO_INCREMENT,
    ProductID       INT NOT NULL,
    WarehouseID     INT NOT NULL,
    CurrentQty      INT NOT NULL DEFAULT 0 CHECK (CurrentQty >= 0),
    SafetyStock     INT NOT NULL DEFAULT 0,
    ReorderLevel    INT NOT NULL DEFAULT 0,
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID),
    FOREIGN KEY (WarehouseID) REFERENCES Warehouse(WarehouseID),
    UNIQUE (ProductID, WarehouseID)
);

-- CREATING ORDER TABLE
CREATE TABLE Orders (
    OrderID         INT PRIMARY KEY AUTO_INCREMENT,
    CustomerID      INT NOT NULL,
    OrderDate       DATE NOT NULL,
    Status          VARCHAR(50) NOT NULL CHECK (Status IN ('Pending','On Hold','Paid','Shipped','Delivered','Cancelled')),
    TotalAmount     DECIMAL(12,2) NOT NULL CHECK (TotalAmount >= 0),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);

-- CREATING ORDERDETAILS TBALE
CREATE TABLE OrderDetails (
    OrderID         INT,
    ProductID       INT,
    Quantity        INT NOT NULL CHECK (Quantity > 0),
    PriceAtOrder    DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (OrderID, ProductID),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);

-- CREATING INVOICE TABLE
CREATE TABLE Invoice (
    InvoiceID       INT PRIMARY KEY AUTO_INCREMENT,
    OrderID         INT UNIQUE NOT NULL,
    InvoiceDate     DATE NOT NULL,
    Tax             DECIMAL(6,2) DEFAULT 0,
    Discount        DECIMAL(6,2) DEFAULT 0,
    NetAmount       DECIMAL(12,2) NOT NULL,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);

-- CREATING PAYMENT TABLE
CREATE TABLE Payment (
    PaymentID       INT PRIMARY KEY AUTO_INCREMENT,
    OrderID         INT UNIQUE NOT NULL,
    Mode            VARCHAR(50) NOT NULL CHECK (Mode IN ('Cash','Card','UPI','NetBanking')),
    Amount          DECIMAL(12,2) NOT NULL,
    Status          VARCHAR(50) NOT NULL CHECK (Status IN ('Pending','Success','Failed')),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);

-- CREATING TRANSPORT TABLE
CREATE TABLE Transport (
    TransportID     INT PRIMARY KEY AUTO_INCREMENT,
    VehicleNo       VARCHAR(50) NOT NULL UNIQUE,
    Capacity        INT NOT NULL,
    DriverName      VARCHAR(100) NOT NULL
);

-- CREATING ORDERTRANSPORT TABLE
CREATE TABLE OrderTransport (
    OrderID         INT,
    TransportID     INT,
    AssignedDate    DATE NOT NULL,
    PRIMARY KEY (OrderID, TransportID),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (TransportID) REFERENCES Transport(TransportID)
);

-- INSERTING VALUES INTO CUSTOMER TABLE
INSERT INTO Customer (Name, Contact, Address) VALUES
('Amit Sharma', '9876543210', 'Delhi, India'),
('Priya Verma', '9876543211', 'Mumbai, India'),
('Ravi Singh', '9876543212', 'Lucknow, India'),
('Sneha Gupta', '9876543213', 'Bangalore, India'),
('Vikas Mehta', '9876543214', 'Chennai, India');

-- INSERTING VALUES INTO EMPLOYEE TABLE
INSERT INTO Employee (Name, Role, Contact) VALUES
('Ramesh Yadav', 'Manager', '8800112233'),
('Suresh Kumar', 'Warehouse Staff', '8800112234'),
('Anita Rao', 'Accountant', '8800112235'),
('Karan Patel', 'Delivery Staff', '8800112236'),
('Meena Joshi', 'Support Staff', '8800112237');

-- INSERTING VALUES INTO PRODUCT TABLE
INSERT INTO Product (Name, Price, StockQty) VALUES
('Laptop', 55000.00, 30),
('Mobile Phone', 18000.00, 100),
('Headphones', 2500.00, 200),
('Keyboard', 1200.00, 150),
('Monitor', 15000.00, 50);

-- INSERTING VALUES INTO SUPPLIER TABLE
INSERT INTO Supplier (Name, Contact, Address) VALUES
('Tech Distributors', '9990001111', 'Noida, India'),
('Gadget Supplies', '9990002222', 'Hyderabad, India'),
('Digital World', '9990003333', 'Kolkata, India'),
('ElectroMart', '9990004444', 'Delhi, India'),
('Global Traders', '9990005555', 'Pune, India');

-- INSERTING VALUES INTO SUPPLIERPRODUCT TABLE
INSERT INTO SupplierProduct (SupplierID, ProductID, SupplyPrice) VALUES
(1, 1, 52000.00),
(2, 2, 17000.00),
(3, 3, 2300.00),
(4, 4, 1000.00),
(5, 5, 14000.00);

-- INSERTING VALUES INTO WAREHOUSE TABLE
INSERT INTO Warehouse (Location, Capacity) VALUES
('Delhi', 500),
('Mumbai', 700),
('Bangalore', 600),
('Chennai', 450),
('Kolkata', 550);

-- INSERTING VALUES INTO INVENTORY TABLE
INSERT INTO Inventory (ProductID, WarehouseID, CurrentQty, SafetyStock, ReorderLevel) VALUES
(1, 1, 10, 5, 8),
(2, 2, 50, 20, 40),
(3, 3, 70, 30, 50),
(4, 4, 60, 25, 40),
(5, 5, 20, 10, 15);

-- INSERTING VALUES INTO ORDERS TABLE
INSERT INTO Orders (CustomerID, OrderDate, Status, TotalAmount) VALUES
(1, '2025-09-01', 'Pending', 55000.00),
(2, '2025-09-02', 'Paid', 18000.00),
(3, '2025-09-03', 'Shipped', 2500.00),
(4, '2025-09-04', 'Delivered', 13200.00),
(5, '2025-09-05', 'Cancelled', 15000.00);

-- INSERTING VALUES INTO ORDERDETAILS TABLE
INSERT INTO OrderDetails (OrderID, ProductID, Quantity, PriceAtOrder) VALUES
(1, 1, 1, 55000.00),
(2, 2, 1, 18000.00),
(3, 3, 1, 2500.00),
(4, 4, 11, 1200.00),
(5, 5, 1, 15000.00);

-- INSERTING VALUES INTO INVOICE TABLE
INSERT INTO Invoice (OrderID, InvoiceDate, Tax, Discount, NetAmount) VALUES
(1, '2025-09-01', 5000.00, 0, 60000.00),
(2, '2025-09-02', 1500.00, 500.00, 19000.00),
(3, '2025-09-03', 200.00, 0, 2700.00),
(4, '2025-09-04', 1200.00, 200.00, 14200.00),
(5, '2025-09-05', 0, 0, 15000.00);

-- INSERTING VALUES INTO PAYMENT TABLE
INSERT INTO Payment (OrderID, Mode, Amount, Status) VALUES
(1, 'Card', 60000.00, 'Pending'),
(2, 'UPI', 19000.00, 'Success'),
(3, 'Cash', 2700.00, 'Success'),
(4, 'NetBanking', 14200.00, 'Success'),
(5, 'Card', 15000.00, 'Failed');

-- INSERTING VALUES INTO TRANSPORT TABLE
INSERT INTO Transport (VehicleNo, Capacity, DriverName) VALUES
('DL01AB1234', 200, 'Rajesh Kumar'),
('MH02CD5678', 300, 'Sanjay Singh'),
('KA03EF9101', 150, 'Arun Nair'),
('TN04GH1213', 250, 'Ravi Menon'),
('WB05IJ1415', 180, 'Sourav Das');

-- INSERTING VALUES INTO ORDERTRASNPORT TABLE
INSERT INTO OrderTransport (OrderID, TransportID, AssignedDate) VALUES
(1, 1, '2025-09-01'),
(2, 2, '2025-09-02'),
(3, 3, '2025-09-03'),
(4, 4, '2025-09-04'),
(5, 5, '2025-09-05');

-- DISPLAYING THE CONTENT OF ALL TABLES ON BY ONE

SELECT * FROM CUSTOMER;
SELECT * FROM EMPLOYEE;
SELECT * FROM PRODUCT;
SELECT * FROM SUPPLIER;
SELECT * FROM SUPPLIERPRODUCT;
SELECT * FROM WAREHOUSE;
SELECT * FROM INVENTORY;
SELECT * FROM ORDERS;
SELECT * FROM ORDERDETAILS;
SELECT * FROM INVOICE;
SELECT * FROM PAYMENT;
SELECT * FROM TRANSPORT;
SELECT * FROM ORDERTRANSPORT;


-- LIST OF ALL THE ORDERS DELIVERED WITH CUSTOMER,INVOICE,PAYMENT AND TRANSPORTDETAILS
SELECT 
    o.OrderID,
    c.Name AS CustomerName,
    o.Status,
    i.NetAmount,
    p.Mode AS PaymentMode,
    p.Status AS PaymentStatus,
    t.VehicleNo,
    t.DriverName
FROM Orders o
JOIN Customer c ON o.CustomerID = c.CustomerID
JOIN Invoice i ON o.OrderID = i.OrderID
JOIN Payment p ON o.OrderID = p.OrderID
JOIN OrderTransport ot ON o.OrderID = ot.OrderID
JOIN Transport t ON ot.TransportID = t.TransportID
WHERE o.Status = 'Delivered';

INSERT INTO Customer (CustomerID, Name, Contact, Address)
VALUES (101, 'Kavya Nair', '9100000001', 'Jaipur, India');

INSERT INTO Employee (EmpID, Name, Role, Contact)
VALUES (201, 'Aditya Menon', 'Warehouse Manager', '9100000002');

INSERT INTO Product (ProductID, Name, Price, StockQty)
VALUES (301, 'Smartwatch', 12000.00, 6);

INSERT INTO Supplier (SupplierID, Name, Contact, Address)
VALUES (401, 'FutureTech Traders', '9100000003', 'Surat, India');

INSERT INTO SupplierProduct (SupplierID, ProductID, SupplyPrice)
VALUES (401, 301, 11000.00);

INSERT INTO Warehouse (WarehouseID, Location, Capacity)
VALUES (501, 'Nagpur', 350);

INSERT INTO Inventory (StockID, ProductID, WarehouseID, CurrentQty, SafetyStock, ReorderLevel)
VALUES (601, 301, 501, 2, 2, 5);

INSERT INTO Orders (OrderID, CustomerID, OrderDate, Status, TotalAmount)
VALUES (701, 101, '2025-09-06', 'Pending', 12000.00);

INSERT INTO OrderDetails (OrderID, ProductID, Quantity, PriceAtOrder)
VALUES (701, 301, 1, 12000.00);

INSERT INTO Invoice (InvoiceID, OrderID, InvoiceDate, Tax, Discount, NetAmount)
VALUES (801, 701, '2025-09-06', 600.00, 0, 12600.00);

INSERT INTO Payment (PaymentID, OrderID, Mode, Amount, Status)
VALUES (901, 701, 'NetBanking', 12600.00, 'Pending');

INSERT INTO Transport (TransportID, VehicleNo, Capacity, DriverName)
VALUES (1001, 'RJ14KL5678', 220, 'Vineet Choudhary');

INSERT INTO OrderTransport (OrderID, TransportID, AssignedDate)
VALUES (701, 1001, '2025-09-06');

-- LIST OF PRODUCTS WHICH ARE REQUIRED TO BE REORDERED DUE TO LESS QUANTITY

SELECT 
    p.Name AS ProductName,
    w.Location AS WarehouseLocation,
    i.CurrentQty,
    i.ReorderLevel
FROM Inventory i
JOIN Product p ON i.ProductID = p.ProductID
JOIN Warehouse w ON i.WarehouseID = w.WarehouseID
WHERE i.CurrentQty < i.ReorderLevel;

-- DELETE A CUSTOMER
DELETE FROM Customer
WHERE CustomerID = 5;

-- DELETE CANCELLED ROWS
DELETE FROM Orders
WHERE Status = 'Cancelled';

-- DELETE TRASNPPORT RECORDS OLDER THAN 2023
DELETE FROM OrderTransport
WHERE AssignedDate < '2023-01-01';

-- SHOW INVOICES WITH PAYMENT AND CUSTOMER INFO
SELECT 
    i.InvoiceID,
    c.Name AS CustomerName,
    i.NetAmount,
    p.Mode AS PaymentMode,
    p.Status AS PaymentStatus
FROM Invoice i
JOIN Orders o ON i.OrderID = o.OrderID
JOIN Customer c ON o.CustomerID = c.CustomerID
JOIN Payment p ON o.OrderID = p.OrderID;

-- SHOW INVENTORY STATUS WITH PRODUCT AND WAREHOUSE
SELECT 
    p.Name AS ProductName,
    w.Location AS WarehouseLocation,
    i.CurrentQty,
    i.ReorderLevel
FROM Inventory i
JOIN Product p ON i.ProductID = p.ProductID
JOIN Warehouse w ON i.WarehouseID = w.WarehouseID;

-- SHOE TRANSPORT DETAILS FOR EACH ORDER
SELECT 
    o.OrderID,
    c.Name AS CustomerName,
    t.VehicleNo,
    t.DriverName,
    ot.AssignedDate
FROM OrderTransport ot
JOIN Orders o ON ot.OrderID = o.OrderID
JOIN Customer c ON o.CustomerID = c.CustomerID
JOIN Transport t ON ot.TransportID = t.TransportID;

-- FIND CUSTOMERS WHO PLACED ORDERS MORE THAN 10000
SELECT Name, Contact
FROM Customer
WHERE CustomerID IN (
    SELECT CustomerID
    FROM Orders
    WHERE TotalAmount > 10000
);

-- FIND PRODUCTS SUPPLIED BY CHEAPEST SUPPLIER
SELECT p.Name AS ProductName, s.Name AS SupplierName, sp.SupplyPrice
FROM SupplierProduct sp
JOIN Product p ON sp.ProductID = p.ProductID
JOIN Supplier s ON sp.SupplierID = s.SupplierID
WHERE sp.SupplyPrice = (
    SELECT MIN(SupplyPrice) FROM SupplierProduct
);

-- GET ORDERS THAT HAVE PENDING PAYMENTS
SELECT OrderID, TotalAmount
FROM Orders
WHERE OrderID IN (
    SELECT OrderID
    FROM Payment
    WHERE Status = 'Pending'
);

-- FIND PRODUCTS THAT NEED RESTOCKING
SELECT Name
FROM Product
WHERE ProductID IN (
    SELECT ProductID
    FROM Inventory
    WHERE CurrentQty < ReorderLevel
);

-- FIND THE CUSTOMER WHO SPENT THE MOST
SELECT Name, Contact
FROM Customer
WHERE CustomerID = (
    SELECT CustomerID
    FROM Orders
    GROUP BY CustomerID
    ORDER BY SUM(TotalAmount) DESC
    LIMIT 1
);


