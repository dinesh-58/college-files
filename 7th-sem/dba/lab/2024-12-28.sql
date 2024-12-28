-- Normally apply filters using where
-- having: useful for filtering using aggregate functions

SELECT
    country,
    COUNT(*)
FROM
    lab_customer
GROUP BY
    country
HAVING
    COUNT(*) > 1
ORDER BY
    country ASC;

SELECT DISTINCT
    country
FROM
    lab_customer;

-- sub query (select inside select) useful when you don't know exact condition for query (where)
-- also useful when needing aggregate f'n inside where (these aren't supported directly inside where)

--e.g: select 2nd highest order amount
SELECT
    MAX(amount)
FROM
    lab_order
WHERE
    amount < (
        SELECT
            MAX(amount)
        FROM
            lab_order
    );
    
-- select customers that have placed orders
select * from lab_customer c where exists (select * from lab_order o where o.cust_id = c.customer_id);
-- this is same as this? select * from lab_customer c where exists (select * from lab_order o);