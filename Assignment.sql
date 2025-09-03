create database db;
use db;
create table course(CourseId int primary key,C_Name varchar(10) not null,Fees int not null);

create table student(rollno int primary key,fname varchar(10),lname varchar(10),phone int unique
,C_id int,foreign key(C_Id) references course(CourseId));

create table faculty(fId int primary key,fname varchar(10) not null,Desig varchar(10),
Qualification varchar(10),phone int unique,C_Id int,foreign key(C_ID) references course(CourseId));

create table book(B_id int primary key,B_name varchar(10) unique,Author varchar(15),
Publisher varchar(15),Price int,Qty int);

create table library(L_id int primary key, Book_id int, foreign key(Book_id) references book(B_id)
,IssueDate date,ReturnDate date,r_no int, foreign key(r_no) references student(rollno));

create table address(Ad_id int primary key,House_no int,street varchar(25),city varchar(25),
state varchar(25),pincode int,r_no int,foreign key(r_no) references student(rollno));

-- Inserting values into course table
Insert into course (CourseId, C_Name, Fees) Values (1, 'Python', 5000);
Insert into course (CourseId, C_Name, Fees) Values (2, 'Java', 6000);
Insert into course (CourseId, C_Name, Fees) Values (3, 'C++', 4500);
Insert into course (CourseId, C_Name, Fees) Values (4, 'SQL', 4000);
Insert into course (CourseId, C_Name, Fees) Values (5, 'HTML', 3000);

-- Showing content of course table
select * from course;

-- Modifying phone no column in student table from int to varchar
ALTER TABLE student
MODIFY phone VARCHAR(15);

ALTER TABLE student
ADD UNIQUE (phone);

-- Inserting values into student
Insert into student (rollno, fname, lname, phone, C_id) Values (1, 'Aman', 'Sharma', 9876543210, 1);
Insert into student (rollno, fname, lname, phone, C_id) Values (2, 'Riya', 'Verma', 9876543211, 2);
Insert into student (rollno, fname, lname, phone, C_id) Values (3, 'Karan', 'Mehta', 9876543212, 3);
Insert into student (rollno, fname, lname, phone, C_id) Values (4, 'Neha', 'Singh', 9876543213, 4);
Insert into student (rollno, fname, lname, phone, C_id) Values (5, 'Vikas', 'Gupta', 9876543214, 5);
Insert into student (rollno, fname, lname, phone, C_id) Values (6, 'Pooja', 'Rathi', 9876543215, 1);
Insert into student (rollno, fname, lname, phone, C_id) Values (7, 'Arjun', 'Kapoor', 9876543216, 2);
Insert into student (rollno, fname, lname, phone, C_id) Values (8, 'Simran', 'Yadav', 9876543217, 3);
Insert into student (rollno, fname, lname, phone, C_id) Values (9, 'Rohit', 'Joshi', 9876543218, 4);
Insert into student (rollno, fname, lname, phone, C_id) Values (10, 'Meera', 'Desai', 9876543219, 5);
Insert into student (rollno, fname, lname, phone, C_id) Values (11, 'Sahil', 'Malik', 9876543220, 1);
Insert into student (rollno, fname, lname, phone, C_id) Values (12, 'Ananya', 'Bose', 9876543221, 2);
Insert into student (rollno, fname, lname, phone, C_id) Values (13, 'Nikhil', 'Chopra', 9876543222, 3);
Insert into student (rollno, fname, lname, phone, C_id) Values (14, 'Divya', 'Rao', 9876543223, 4);
Insert into student (rollno, fname, lname, phone, C_id) Values (15, 'Manish', 'Patel', 9876543224, 5);
Insert into student (rollno, fname, lname, phone, C_id) Values (16, 'Sneha', 'Nair', 9876543225, 1);
Insert into student (rollno, fname, lname, phone, C_id) Values (17, 'Aditya', 'Mishra', 9876543226, 2);
Insert into student (rollno, fname, lname, phone, C_id) Values (18, 'Ishita', 'Pawar', 9876543227, 3);
Insert into student (rollno, fname, lname, phone, C_id) Values (19, 'Harsh', 'Shukla', 9876543228, 4);
Insert into student (rollno, fname, lname, phone, C_id) Values (20, 'Kavya', 'Dubey', 9876543229, 5);

-- Displaying the data of table student

select * from student;

-- Modify phone column in faculty table
alter table faculty drop index phone;
alter table faculty modify phone varchar(15);
alter table faculty add unique(phone);

-- Inserting values into Faculty table

Insert into faculty (fId, fname, Desig, Qualification, phone, C_Id) 
Values (1, 'Ramesh', 'Professor', 'PhD', '9876500001', 1);

Insert into faculty (fId, fname, Desig, Qualification, phone, C_Id) 
Values (2, 'Suresh', 'Lecturer', 'M.Tech', '9876500002', 2);

Insert into faculty (fId, fname, Desig, Qualification, phone, C_Id) 
Values (3, 'Priya', 'Assistant', 'MCA', '9876500003', 3);

Insert into faculty (fId, fname, Desig, Qualification, phone, C_Id) 
Values (4, 'Meena', 'Professor', 'PhD', '9876500004', 4);

Insert into faculty (fId, fname, Desig, Qualification, phone, C_Id) 
Values (5, 'Amit', 'Lecturer', 'M.Sc', '9876500005', 5);

Insert into faculty (fId, fname, Desig, Qualification, phone, C_Id) 
Values (6, 'Neeta', 'Assistant', 'M.Tech', '9876500006', 1);

Insert into faculty (fId, fname, Desig, Qualification, phone, C_Id) 
Values (7, 'Vijay', 'Lecturer', 'PhD', '9876500007', 2);

-- Displaying the data of table faculty

select * from faculty;

-- Inserting values into table book

Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (1, 'Book1', 'Author1', 'Pearson', 200, 15);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (2, 'Book2', 'Author2', 'McGrawHill', 250, 12);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (3, 'Book3', 'Author3', 'Wiley', 300, 20);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (4, 'Book4', 'Author4', 'BPB', 180, 18);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (5, 'Book5', 'Author5', 'Oxford', 400, 10);

Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (6, 'Book6', 'Author6', 'Pearson', 220, 25);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (7, 'Book7', 'Author7', 'McGrawHill', 270, 8);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (8, 'Book8', 'Author8', 'Wiley', 350, 14);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (9, 'Book9', 'Author9', 'BPB', 150, 30);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (10, 'Book10', 'Author10', 'Oxford', 500, 5);

Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (11, 'Book11', 'Author11', 'Pearson', 210, 22);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (12, 'Book12', 'Author12', 'McGrawHill', 260, 17);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (13, 'Book13', 'Author13', 'Wiley', 320, 11);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (14, 'Book14', 'Author14', 'BPB', 280, 16);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (15, 'Book15', 'Author15', 'Oxford', 420, 7);

Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (16, 'Book16', 'Author16', 'Pearson', 230, 19);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (17, 'Book17', 'Author17', 'McGrawHill', 310, 13);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (18, 'Book18', 'Author18', 'Wiley', 330, 21);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (19, 'Book19', 'Author19', 'BPB', 370, 9);
Insert into book (B_id, B_name, Author, Publisher, Price, Qty) Values (20, 'Book20', 'Author20', 'Oxford', 450, 6);

-- Displaying the content from table book

select * from book;

-- Inserting values into table Library

insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (1, 1, '2025-08-01', '2025-08-15', 1);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (2, 2, '2025-08-02', '2025-08-16', 2);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (3, 3, '2025-08-03', '2025-08-17', 3);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (4, 4, '2025-08-04', '2025-08-18', 4);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (5, 5, '2025-08-05', '2025-08-19', 5);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (6, 6, '2025-08-06', '2025-08-20', 6);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (7, 7, '2025-08-07', '2025-08-21', 7);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (8, 8, '2025-08-08', '2025-08-22', 8);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (9, 9, '2025-08-09', '2025-08-23', 9);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (10, 10, '2025-08-10', '2025-08-24', 10);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (11, 11, '2025-08-11', '2025-08-25', 11);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (12, 12, '2025-08-12', '2025-08-26', 12);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (13, 13, '2025-08-13', '2025-08-27', 13);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (14, 14, '2025-08-14', '2025-08-28', 14);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (15, 15, '2025-08-15', '2025-08-29', 15);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (16, 16, '2025-08-16', '2025-08-30', 16);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (17, 17, '2025-08-17', '2025-09-01', 17);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (18, 18, '2025-08-18', '2025-09-02', 18);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (19, 19, '2025-08-19', '2025-09-03', 19);
insert into library (L_id, Book_id, IssueDate, ReturnDate, r_no) values (20, 20, '2025-08-20', '2025-09-04', 20);

-- Displaying data from table library
select * from library;

-- inserting values into table address

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (1, 101, 'mg road', 'rishikesh', 'uttarakhand', 249201, 1);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (2, 202, 'rajpur road', 'dehradun', 'uttarakhand', 248001, 2);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (3, 33, 'nehru colony', 'haridwar', 'uttarakhand', 249401, 3);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (4, 17, 'lakshman jhula', 'rishikesh', 'uttarakhand', 249302, 4);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (5, 55, 'civil lines', 'roorkee', 'uttarakhand', 247667, 5);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (6, 89, 'race course', 'dehradun', 'uttarakhand', 248001, 6);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (7, 12, 'bhadrabad road', 'haridwar', 'uttarakhand', 249403, 7);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (8, 77, 'rajaji marg', 'rishikesh', 'uttarakhand', 249201, 8);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (9, 23, 'chakrata road', 'dehradun', 'uttarakhand', 248007, 9);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (10, 91, 'ranipur more', 'haridwar', 'uttarakhand', 249407, 10);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (11, 45, 'prem nagar', 'dehradun', 'uttarakhand', 248007, 11);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (12, 18, 'ganga vihar', 'rishikesh', 'uttarakhand', 249302, 12);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (13, 67, 'shivpuri road', 'rishikesh', 'uttarakhand', 249304, 13);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (14, 150, 'doon vihar', 'dehradun', 'uttarakhand', 248001, 14);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (15, 39, 'kankhal road', 'haridwar', 'uttarakhand', 249408, 15);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (16, 61, 'patel nagar', 'dehradun', 'uttarakhand', 248001, 16);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (17, 72, 'ganga nagar', 'rishikesh', 'uttarakhand', 249201, 17);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (18, 84, 'kashipur road', 'roorkee', 'uttarakhand', 247667, 18);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (19, 95, 'balawala', 'dehradun', 'uttarakhand', 248161, 19);

insert into address (ad_id, house_no, street, city, state, pincode, r_no) 
values (20, 110, 'chandreshwar nagar', 'rishikesh', 'uttarakhand', 249201, 20);

-- Displaying data from table address

select * from address;


