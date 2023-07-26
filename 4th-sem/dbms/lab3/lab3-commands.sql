-- lab tasks for lab 3 in manual 
-- SA password is "SQLpass123"
------ 1: 
use HCOE2077
select * from bookList where publication = 'Ekta'

------ 2: 
-- question is wrong, should be employee because issue table has relation with employee
select eid, ename from employee
where eid in (
    select iid from issue 
    where dateOfIssue = '2023-3-3'
)

------ 3: 
use HCOE2077
select * from teacher
-- question is wrong, should be teacher instead of employee
-- set tid primary

alter table teacher
alter column tid int not null;
go
alter table teacher
add primary key(tid)
-- set salaries for teachers
use HCOE2077
update teacher 
set salary = 15000 
where (tid % 2) = 0
select * from teacher

-- use single quotes for strings
use HCOE2077
select * from teacher 
where salary < 10000 AND faculty = 'BCA';

------ 4: 
ALTER TABLE issue
    ADD bid int NULL 
    

------ 5: 
use HCOE2077
update issue set bid=001 where iid='e001'
update issue set bid=002 where iid='e002'
select * from issue


------ 6: 
-- incorrect. look up
use HCOE2077
select bname from issue
where iid in (
    select eid from employee where ename like 'S%'
)
union 
select ename from employee where ename like 'S%'


------ 7: 
update teacher set salary = 1.1 * salary;
update employee set salary = 1.1 * salary;

select * from teacher;
select * from employee;

------ 8: 
-- double quotes are for column names. single quotes are for strings
update bookList set bname = 'DATABASE' where bname = 'DBMS';
update bookList set bname = 'DATABASE' where bname = 'DBMS';

------ 9: 
update employee set salary = 1.2 * salary where salary < 5000;

------ 10: 
delete from employee where eid = '111';

------ 11: 
-- unable to do because ques 1 from lab2 wasn't done. skip for now

------ 12: 
SELECT * from bookList

select bid, bname
from Book
where bid
in 
(select isbn
from bookList
where publication = 'Scholastic')