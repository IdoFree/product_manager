CREATE DATABASE db_1874;


CREATE TABLE  db_1874.user
(
id int NOT NULL AUTO_INCREMENT,
name varchar(50) NOT NULL,
role varchar(30),
password varchar(255) NOT NULL,
PRIMARY KEY (id)
);


CREATE TABLE db_1874.category
(
id int NOT NULL AUTO_INCREMENT,
name varchar(50) NOT NULL,
parent_id int ,
PRIMARY KEY (id),
FOREIGN KEY (parent_id) REFERENCES category(id)
);

CREATE TABLE db_1874.product
(
id int NOT NULL AUTO_INCREMENT,
name varchar(50) NOT NULL,
details varchar(255),
category_id int(30),
price float(9,2),
PRIMARY KEY (id)
);


CREATE TABLE  db_1874.sale_record
(
id int NOT NULL AUTO_INCREMENT,
product_id int NOT NULL,
sale_time datetime,
actual_price float(9,2),
pay_type  varchar(30),
buyer_id int,
PRIMARY KEY (id),
CHECK (pay_type in ('cash','alipay','wechat_pay')),
FOREIGN KEY (product_id) REFERENCES product(id)
);


CREATE INDEX buy_id_index
ON db_1874.sale_record (buyer_id) ;

CREATE TABLE  db_1874.buyer
(
id int NOT NULL AUTO_INCREMENT,
name varchar(50) ,
sign_up_time datetime,
PRIMARY KEY (id)
);


CREATE TABLE  db_1874.Sale_Record_Product_Map
(
id int NOT NULL AUTO_INCREMENT,
product_id int ,
sale_record_id int,
PRIMARY KEY (id)
);







CREATE TABLE  db_1874.material
(
id int NOT NULL AUTO_INCREMENT,
name varchar(50) ,
details varchar(255) ,
category_id int,
unit varchar(10),
count float(9,2),
product_id int,
PRIMARY KEY (id)
);
