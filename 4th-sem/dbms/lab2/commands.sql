use HCOE2077;
create table employee (
    eid varchar(5),
    ename varchar(25) not null, 
    dateOfEmployment date default '2/22/2010',
    salary int,
    primary key(eid)
);

-- 2:

create table issue(
    iid VARCHAR(5),
    bname VARCHAR(20) not null,
    dateOfIssue date,
    foreign key(iid) REFERENCES employee(eid)
)

-- 3:

create table bookList (
    isbn int, 
    bname varchar(30) not null,
    publication varchar(30)
    primary key(isbn)
)

create table Book(
    bid int, 
    bname varchar(30) not null,
    author varchar(30),
    price int,
    foreign key(bid) REFERENCES bookList(isbn)
)

-- 4:
exec sp_help Book;
-- TODO look up what this does