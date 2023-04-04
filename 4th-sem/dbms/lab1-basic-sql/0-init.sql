-- create tables

-- use master
-- create database HCOE2077
-- go

use HCOE2077
create table student(
    id int,
    name varchar(25),
    rn int, 
    batch int
)
create table teacher(
    tid int,
    name varchar(25),
    faculty varchar(10)
)