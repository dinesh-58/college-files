select * from lab_customer where country = 'Nepal';

-- start: aggregagte function (many inputs, single output
-- count, min, max, avg, sum

select count(*), country from lab_customer group by country;
select max(amount) from lab_order;
select min(amount) from lab_order;
select avg(amount) from lab_order;


-- end: aggregate function
