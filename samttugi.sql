select * from cart;
select * from mcategory;
select * from orderList;
select * from orders;
select * from product;
select * from scategory;
select * from users;

drop table orderlist;
drop table cart;
drop table product;
drop table orders;
drop table scategory;
drop table mcategory;
drop table users;

-- users 테이블 생성
CREATE TABLE users (
   userNo   int   auto_increment primary key,
   id   varchar(50)   NOT NULL,
   userName   varchar(10)   NOT NULL,
   password   varchar(50)   NOT NULL,
   hp   varchar(20)   NOT NULL,
   email   varchar(200) ,
   gender   varchar(20)   NOT NULL,
   birth   Date,
   address   varchar(50)   NOT NULL
);
-- mainCategory 테이블 생성
CREATE TABLE mcategory (
   mcNo   int   auto_increment primary key,
   mcName   varchar(100)    NOT NULL
);

-- subCategory 테이블 생성
CREATE TABLE scategory (
   scNo   int   auto_increment primary key,
   mcNo   int   ,
   scName   varchar(100)   NOT NULL,
    CONSTRAINT sCategory_fk FOREIGN KEY (mcNo)
   REFERENCES mcategory(mcNo)
);

-- orders 테이블 생성
CREATE TABLE orders (
   orderNo   int   auto_increment primary key,
   userNo   int   ,
   payment   varchar(100) NOT NULL,
   payDay   Date   NOT NULL,
   request   text,
    CONSTRAINT orders_fk FOREIGN KEY (userNo)
   REFERENCES users(userNo)
);

-- product 테이블 생성
CREATE TABLE product (
   productNo   int   auto_increment primary key,
   scNo   int   ,
   productName   varchar(50)   NOT NULL,
   price   int   NOT NULL,
   storage   varchar(50)   NOT NULL,
   detail   text,
   saveName   text,
   best   int   NOT NULL,
   CONSTRAINT product_fk FOREIGN KEY (scNo)
   REFERENCES scategory(scNo)
);

-- cart 테이블 생성
CREATE TABLE cart (
   userNo   int   ,
   productNo   int   ,
   cCount   int   Not NULL,
    CONSTRAINT cart1_fk FOREIGN KEY (userNo)
   REFERENCES users(userNo),
    CONSTRAINT cart2_fk FOREIGN KEY (productNo)
   REFERENCES product(productNo)
);

-- orderList 테이블 생성
CREATE TABLE orderList (
   oderListNo   int   auto_increment primary key,
   orderNo   int   ,
   productNo   int   ,
   oCount   varchar(50)   Not NULL,
   oPrice   int   Not NULL,
    CONSTRAINT orderList1_fk FOREIGN KEY (orderNo)
   REFERENCES orders(orderNo),
    CONSTRAINT orderList2_fk FOREIGN KEY (productNo)
   REFERENCES product(productNo)
);
select * from mcategory;
-- mcategory 등록
insert into mcategory values(null, '라면/컵누들');
insert into mcategory values(null, '카레/짜장/간편렌지');
insert into mcategory values(null, '소스/드레싱/양념');
insert into mcategory values(null, '캔/통조림/오일');
insert into mcategory values(null, '떡볶이/핫도그/간식');

-- scategory 등록
insert into scategory values(null, 1 ,'봉지라면');
insert into scategory values(null, 1 ,'컵라면');
insert into scategory values(null, 1 ,'잡채');
insert into scategory values(null, 2 ,'카레/짜장');
insert into scategory values(null, 2 ,'미트/햄버그/치킨/탕수완자');
insert into scategory values(null, 3 ,'케챂/마요네스/드레싱');
insert into scategory values(null, 3 ,'식초/미향');
insert into scategory values(null, 3 ,'간편소스/볶음/조림양념');
insert into scategory values(null, 4 ,'스위트콘/과일통조림');
insert into scategory values(null, 4 ,'참기름/들기름');
insert into scategory values(null, 4 ,'햄/참치/고등어');
insert into scategory values(null, 4 ,'올리브유/카놀라유/포도씨유');
insert into scategory values(null, 5 ,'스낵');
insert into scategory values(null, 5 ,'핫도그');
insert into scategory values(null, 5 ,'떡볶이');

select * from orderlist;