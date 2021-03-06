## Question1

### 1. 数据准备

#### 1.1 创建数据库

```sql
create database lianxi01 character set utf8;
```

#### 1.2 使用数据库

```sql
use lianxi01;
```

#### 1.3 创建商品表

```sql
create table product (
pid int,
pname varchar(20),
price double,
category_name varchar(32)
);
```

#### 1.4导入数据

```sql
INSERT INTO product(pid,pname,price,category_name) VALUES(1,'联想电脑',5000,'电脑办公');
INSERT INTO product(pid,pname,price,category_name) VALUES(2,'海尔电脑',3000,'电脑办公');
INSERT INTO product(pid,pname,price,category_name) VALUES(3,'雷神电脑',5000,'电脑办公');

INSERT INTO product(pid,pname,price,category_name) VALUES(4,'JACK JONES',800,'服装');
INSERT INTO product(pid,pname,price,category_name) VALUES(5,'真维斯',200,'服装');
INSERT INTO product(pid,pname,price,category_name) VALUES(6,'花花公子',440,'服装');
INSERT INTO product(pid,pname,price,category_name) VALUES(7,'劲霸',2000,'服装');

INSERT INTO product(pid,pname,price,category_name) VALUES(8,'香奈儿',800,'女士用品');
INSERT INTO product(pid,pname,price,category_name) VALUES(9,'相宜本草',200,'女士用品');
INSERT INTO product(pid,pname,price,category_name) VALUES(10,'面霸',5,'女士用品');

INSERT INTO product(pid,pname,price,category_name) VALUES(11,'雪碧',56,'饮料饮品');
INSERT INTO product(pid,pname,price,category_name) VALUES(12,'香飘飘奶茶',1,'饮料饮品');

INSERT INTO product(pid,pname,price,category_name) VALUES(13,'iPhone9',8000,NULL);

```

### 2.查询



2.1 查询练习

```sql
#1.查询所有的商品
select * from product;

#2.查询商品名和商品价格
select pname, price from product;

#3.别名查询.使用的关键字是as（as可以省略的）. 
select pname as 'product_name', price as 'product_price'
from product;

#4.查询商品价格，对价格去除重复；
select distinct price from product;

#5.查询结果是表达式（运算查询）：将所有商品的价格+10元进行显示.
select pname, price+10 from product;

#6.查询商品名称为“花花公子”的商品所有信息：
select * from product
where pname='花花公子';

#7.查询价格为800商品
select * from product 
where price = 800;

#8.查询价格不是800的所有商品
select * from product
where price <> 800;


#9.查询商品价格大于60元的所有商品信息
select * from product
where price > 60;

#10.查询商品价格在200到1000之间所有商品
select * from product
where price between 200 and 1000;

#11.查询商品价格是200或800的所有商品
select 

#12.查询含有'霸'字的所有商品


#13.查询以'香'开头的所有商品


#14.查询第二个字为'想'的所有商品


#15.商品没有分类的商品


#16.查询有分类的商品
```





#### 2.2 排序练习

```sql
 #1.查询所有的商品
 #2.查询商品名和商品价格
 #3.别名查询.使用的关键字是as（as可以省略的）. 
 #4.查询商品价格，对价格去除重复；
 #5.查询结果是表达式（运算查询）：将所有商品的价格+10元进行显示.
 #6.查询商品名称为“花花公子”的商品所有信息：
 #7.查询价格为800商品
 #8.查询价格不是800的所有商品
 #9.查询商品价格大于60元的所有商品信息
 #10.查询商品价格在200到1000之间所有商品
 #11.查询商品价格是200或800的所有商品
 #12.查询含有'霸'字的所有商品
 #13.查询以'香'开头的所有商品
 #14.查询第二个字为'想'的所有商品
 #15.商品没有分类的商品
 #16.查询有分类的商品
```





#### 2.3 练习



