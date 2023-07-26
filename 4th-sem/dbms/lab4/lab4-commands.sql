-- 1:
select * from employee order by eid desc;

-- 2:
select * from bookList order by bname, publication asc;

-- 3: 
select top 3 * from teacher;

-- 4: 
select sum(salary) from employee

-- 5: 
select min(salary) from employee

-- 6:
select * from Book;
select author, avg(price) as "average book price" from Book group by author;
-- using select * in group by may cause error
-- see: https://stackoverflow.com/a/13999903

-- 7:
select publication, count(bname) as "books published" from bookList group by publication;

-- 8:
select bid, bname from Book where price > (select avg(price) from Book);