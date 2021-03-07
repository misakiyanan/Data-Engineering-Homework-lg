## Question4

### 1. 设计三张表

```
讲师表
		讲师ID 主键 int类型
		讲师姓名 VARCHAR类型
		讲师简介 VARCHAR类型
		讲师级别 char类型 高级讲师&首席讲师
		为讲师姓名添加索引
		
课程分类表
		课程分类ID 主键 int类型
		课程分类名称 VARCHAR类型 比如前端开发 后端开发 数据库DBA......
		课程分类描述 VARCHAR类型 
		创建时间 datetime类型
		更新时间 datetime类型
		
课程表
		课程ID 主键 int类型
		课程讲师ID 外键 用于描述课程的授课老师
		课程分类ID 外键 用于描述课程所属的分类 比如 Java课程就属于后端分类
		课程标题 VARCHAR类型 比如Java VUE PHP ......
		总课时 int类型 
		浏览数量 bigint类型
		课程状态 char 类型,  0 未发布(默认)  1 已发布
		为 课程标题字段添加索引
		为 teacher_id & subject_id,添加外键约束
```

```sql
create database lianxi04 character set utf8;
use lianxi04;

create table lagou_teacher (
  teacher_id INT PRIMARY KEY, 
  teacher_name VARCHAR(20), 
  teacher_desc VARCHAR(500), 
  trank CHAR(4),  -- 'rank' is reserved
  index lname_ind (teacher_name)
);


create table lagou_subject ( -- 学科/课程分类
  subject_id INT PRIMARY KEY, 
  subject_name VARCHAR(20), 
  subject_desc VARCHAR(500), 
  create_time DATETIME, 
  update_time DATETIME
);

create table lagou_course (
  course_id INT PRIMARY KEY, 
  teacher_id INT, 
  subject_id INT, 
  course_title VARCHAR(20), 
  total_duration INT, 
  visits BIGINT, 
  status enum('0','1') default '0', 
  index title_ind (course_title),
  FOREIGN KEY (teacher_id) REFERENCES lagou_teacher(teacher_id),
  FOREIGN KEY (subject_id) REFERENCES lagou_subject(subject_id)
);

```

### 2. 插入数据

```sql
-- 向讲师表插入两条数据
INSERT INTO lagou_teacher 
VALUES (1, '刘德华', '毕业于清华大学，主攻前端技术,授课风格生动活泼,深受学员喜爱', 
'高级讲师');
INSERT INTO lagou_teacher 
VALUES (2, '郭富城', '毕业于北京大学，多年的IT经验，研发多项Java课题,授课经验丰富', 
'首席讲师');

-- 向课程分类表中插入两条数据
INSERT INTO lagou_subject VALUES (1, '后端开发', '后端课程包括 Java PHP Python', '2020-03-27 00:44:04', '2020-03-27 00:44:04');
INSERT INTO lagou_subject VALUES (2, '前端开发', '前端课程包括 JQuery VUE angularJS', '2020-02-27 10:00:04', '2020-02-27 18:44:04');

-- 向课程表中插入两条数据
-- 插入Java课程
INSERT INTO lagou_course VALUES (1,1,1 ,'Java', 300,250000, '1');
-- 插入VUE课程
INSERT INTO lagou_course VALUES (2,2,2, 'VUE', 400,200000,'1');
```

### 3. 查询

```sql
-- 查询刘德华老师所教的课程属于哪个课程分类

select t.teacher_name, s.subject_name, c.course_title
from lagou_course as c
left join lagou_subject as s
on c.subject_id = s.subject_id
left join lagou_teacher as t
on c.teacher_id = t.teacher_id
where t.teacher_name = '刘德华';

```



