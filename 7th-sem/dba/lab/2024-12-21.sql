create table LAB_PAYMENT_STATUS (
    payment_status_id int not null primary key,
    payment_status varchar(25)
);


create table LAB_PRODUCT_CATEGORY (
    product_category_id int not null primary key,
    category_name varchar(25)
);

alter table LAB_ORDER rename column order_status to order_status_id;
