CREATE TABLE lab_payment_status (
    payment_status_id  INT NOT NULL PRIMARY KEY,
    payment_status     VARCHAR(25)
);

CREATE TABLE lab_product_category (
    product_category_id  INT NOT NULL PRIMARY KEY,
    category_name        VARCHAR(25)
);

ALTER TABLE lab_order RENAME COLUMN order_status TO order_status_id;

alter table lab_product add product_category_id int references lab_product_category(product_category_id);

alter table lab_payment drop column payment_status;
alter table lab_payment add payment_status_id int references lab_payment_status(payment_status_id);

insert into lab_payment_status(payment_status_id, payment_status) values(1, 'Paid');
insert into lab_payment_status(payment_status_id, payment_status) values(2, 'Unpaid');
insert into lab_payment_status(payment_status_id, payment_status) values(3, 'Processing');

insert into lab_product_category(product_category_id, category_name) values(1, 'Food');
insert into lab_product_category(product_category_id, category_name) values(2, 'Electronics');
insert into lab_product_category(product_category_id, category_name) values(3, 'Books, Stationery');

alter table lab_product drop column product_description;
insert into lab_product(product_id, item, price, product_category_id) values(1, 'Apple', 50, 1);
insert into lab_product(product_id, item, price, product_category_id) values(2, 'Phone', 30000, 2);
insert into lab_product(product_id, item, price, product_category_id) values(3, 'Book', 500, 3);

insert into lab_product_order(ord_id, prod_id) values(1,1);
insert into lab_product_order(ord_id, prod_id) values(2,2);
insert into lab_product_order(ord_id, prod_id) values(3,3);
insert into lab_product_order(ord_id, prod_id) values(4,3);

insert into lab_payment(payment_id, amount_paid, ord_id, payment_status_id) values(1, 300, 1, 1);
insert into lab_payment(payment_id, amount_paid, ord_id, payment_status_id) values(2, 300, 2, 2);
insert into lab_payment(payment_id, amount_paid, ord_id, payment_status_id) values(3, 250, 3, 1);
insert into lab_payment(payment_id, amount_paid, ord_id, payment_status_id) values(4, 600, 4, 1);
