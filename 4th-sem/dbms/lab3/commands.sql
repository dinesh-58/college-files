use HCOE2077
select * from employee

insert into employee(eid, ename, dateOfEmployment, salary) VALUES('e001', 'Ram Singh', default, 35000)
insert into employee(eid, ename, dateOfEmployment, salary) VALUES('e002', 'Shyam Singh', '2009-1-1', 55000), ('e003', 'Hari Bahadur', default, 40000);

--- 

insert into issue(iid, bname, dateOfIssue) VALUES
('e001', 'Death on the nile', '2023-1-1'), 
('e002', 'Born a Crime', '2022-11-1'), 
('e001', 'Letters from my', '2023-3-3');

---
insert into bookList(isbn, bname, publication) VALUES
(1243, 'Death on the nile', 'Scholastic'),
(1145, 'Born a Crime', 'Penguin books'),
(1043, 'Letters from my', 'Scholastic');

---
INSERT into Book(bid, bname, author, price) VALUES
(1243, 'Death on the nile', 'Agatha Christie', 400),
(1145, 'Born a Crime', 'Trevor Noah', 500),
(1043, 'Letters from my', 'Barack Obama', 800);

---
select * from employee;
select * from issue;
select * from bookList;
select * from Book;

--
select * from employee;
SELECT * from employee where salary >=40000;

---
select * from Book where price>=400 AND price<=500;
select * from Book where price BETWEEN 400 and 500;

---
select * from bookList
    where publication like 'p%';