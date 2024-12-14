--SELECT VALUE
--FROM V$NLS_PARAMETERS
--WHERE PARAMETER = 'NLS_DATE_FORMAT';
--
--alter system
--set NLS_DATE_FORMAT='YYYY-MM-DD' scope= BOTH;

CREATE TABLE lab_order_status (
    order_status_id  INT NOT NULL PRIMARY KEY,
    order_status     VARCHAR(25)
);

INSERT INTO lab_order_status (
    order_status_id,
    order_status
) VALUES (
    1,
    'Pending'
);

INSERT INTO lab_order_status (
    order_status_id,
    order_status
) VALUES (
    2,
    'Complete'
);

INSERT INTO lab_order_status (
    order_status_id,
    order_status
) VALUES (
    3,
    'Cancelled'
);

ALTER TABLE lab_order DROP COLUMN order_status;

ALTER TABLE lab_order ADD order_status
    REFERENCES lab_order_status ( order_status_id );

INSERT INTO lab_order (
    order_id,
    order_date,
    order_status,
    quantity,
    amount,
    cust_id
) VALUES (
    1,
    '14-DEC-14',
    1,
    1,
    300,
    1
);

INSERT INTO lab_order (
    order_id,
    order_date,
    order_status,
    quantity,
    amount,
    cust_id
) VALUES (
    2,
    '14-DEC-14',
    2,
    1,
    500,
    2
);

INSERT INTO lab_order (
    order_id,
    order_date,
    order_status,
    quantity,
    amount,
    cust_id
) VALUES (
    3,
    '10-DEC-14',
    3,
    1,
    300,
    1
);

SELECT
    *
FROM
         lab_order ord
    INNER JOIN lab_order_status os ON ord.order_status = os.order_status_id;

-- Views (logical tables. can be used for storing join results as table for future use)
CREATE VIEW lab_customer_order_view AS
    SELECT
        c.first_name
        || ' '
        || c.last_name AS name,
        c.country,
        ord.order_date,
        ord.quantity,
        ord.amount,
        os.order_status
    FROM
             lab_customer c
        INNER JOIN lab_order         ord ON c.customer_id = ord.cust_id
        INNER JOIN lab_order_status  os ON ord.order_status = os.order_status_id;
        -- using multiple inner join

--DROP VIEW lab_customer_order_view;

CREATE MATERIALIZED VIEW lab_m_customer_order_view AS
    SELECT
        c.first_name
        || ' '
        || c.last_name AS name,
        c.country,
        ord.order_date,
        ord.quantity,
        ord.amount,
        os.order_status
    FROM
             lab_customer c
        INNER JOIN lab_order         ord ON c.customer_id = ord.cust_id
        INNER JOIN lab_order_status  os ON ord.order_status = os.order_status_id;

INSERT INTO lab_customer (
    customer_id,
    first_name,
    last_name,
    phone,
    country,
    email
) VALUES (
    4,
    'ram',
    'dham',
    '143',
    'Nepal',
    'ram@mail.com'
);

INSERT INTO lab_order (
    order_id,
    order_date,
    quantity,
    amount,
    cust_id,
    order_status
) VALUES (
    4,
    TO_DATE('14-DEC-14', 'DD-MON-RR'),
    1,
    1000,
    4,
    1
);

SELECT
    *
FROM
    lab_customer_order_view;

SELECT
    *
FROM
    lab_m_customer_order_view;
    
-- get insert statement for a table. run this as script
SELECT /*insert*/ *
FROM
    lab_order;
    