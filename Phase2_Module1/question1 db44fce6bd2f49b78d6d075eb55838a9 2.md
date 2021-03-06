# question1

### 数据准备

```sql
## 创建数据库
create database lianxi01 character set utf8;

## 使用数据库
use lianxi01;

## 创建商品表
create table product(
pid int,  #主键ID
pname varchar(20),  #商品名称
price double,  #商品价格
category_name varchar(32)  #商品分类名称
);

## 导入数据
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

```markdown
+------+-----------------+-------+---------------+
| pid  | pname           | price | category_name |
+------+-----------------+-------+---------------+
|    1 | 联想电脑        |  5000 | 电脑办公      |
|    2 | 海尔电脑        |  3000 | 电脑办公      |
|    3 | 雷神电脑        |  5000 | 电脑办公      |
|    4 | JACK JONES      |   800 | 服装          |
|    5 | 真维斯          |   200 | 服装          |
|    6 | 花花公子        |   440 | 服装          |
|    7 | 劲霸            |  2000 | 服装          |
|    8 | 香奈儿          |   800 | 女士用品      |
|    9 | 相宜本草        |   200 | 女士用品      |
|   10 | 面霸            |     5 | 女士用品      |
|   11 | 雪碧            |    56 | 饮料饮品      |
|   12 | 香飘飘奶茶      |     1 | 饮料饮品      |
|   13 | iPhone9         |  8000 | NULL          |
+------+-----------------+-------+---------------+
13 rows in set (0.00 sec)
```

### 查询

- 查询练习

    /

-