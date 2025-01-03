-- index
-- index is used for speeding up searching (selects). primary keys are auto-indexed?
-- index lives in primary memory? when retrieving data, retrieval done from index instead of db / tables on disk (secondary memory)
-- useful for tables w/o primary key?

-- go through: https://dev.mysql.com/doc/refman/8.4/en/mysql-indexes.html
CREATE INDEX idx_customer_id ON
    lab_order (
        cust_id
    );
-- unique index: can't have duplicate values in indexed column
UPDATE lab_customer
SET
    email = 'dham@mail.com'
WHERE
    customer_id = 4; --making email values unique to create unique index
CREATE UNIQUE INDEX idx_unique_email ON
    lab_customer (
        email
    );

-- check if index created or not
SELECT
    index_name
FROM
    user_indexes
WHERE
    table_name = 'LAB_CUSTOMER';


-- synonym: basically just alias for names of table, view, ... 
CREATE SYNONYM my_orders FOR lab_order;

SELECT
    *
FROM
    user_synonyms
WHERE
    synonym_name = 'MY_ORDERS';

-- sequence
-- akin to range / i in for loop
-- value that can be incremented (using NEXTVAL)
-- global value i.e. can be accessed anywhere, be used in any table
-- useful for generating primary key values during insertion

-- min max limits can be specified & used alongside nocycle
-- cache specifies number of values to store in memory for faster access
CREATE SEQUENCE cust_seq START WITH 7 INCREMENT BY 2 CACHE 20;
select cust_seq.currval from dual;

insert into lab_customer(customer_id, first_name, last_name, phone, country, email) 
values(CUST_SEQ.NEXTVAL, 'john', 'doe', 9841, 'USA', 'john@doe.com');
-- below should give error due to unique constraint
insert into lab_customer(customer_id, first_name, last_name, phone, country, email) 
values(CUST_SEQ.currval, 'john', 'doe', 9841, 'USA', 'john@doe.com');