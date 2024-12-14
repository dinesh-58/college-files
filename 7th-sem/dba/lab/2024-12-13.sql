drop table customer;
drop table orders;

create table lab_customer(
customer_id int not null primary key,
first_name varchar(25) not null,
last_name varchar(25),
phone varchar(15) unique,
country varchar(25) default 'NP'
);

create table lab_order (
order_id int not null primary key,
order_date date, -- oracle default date format is 'DD-MON-RR' e.g: '12-DEC-24'
order_status varchar(10),
quantity int,
amount float, -- price
cust_id int references lab_customer(customer_id) -- foreign key
);

create table lab_product (
product_id int not null primary key,
item varchar(25) not null,
product_description varchar(150),
price float,
check (price > 0)
);

create table lab_product_order ( -- to represent M-M relation between product & order
ord_id references lab_order(order_id),  -- data type is inherited from reference primary key?
prod_id references lab_product(product_id)
);

select * from lab_product_order;

CREATE TABLE lab_payment (
payment_id int not null primary key,
amount_paid float,
payment_status varchar(15),
ord_id references lab_order(order_id)
);

alter table lab_customer 
add email varchar(30);

INSERT INTO lab_customer(customer_id, first_name, last_name, phone, country, email)
VALUES (1, 'ram', 'bam', '123', 'Nepal', 'ram@mail.com');
INSERT INTO lab_customer(customer_id, first_name, last_name, phone, country, email)
VALUES (2, 'shyam', 'bam', '1234', 'Nepal', 'shyam@mail.com');
