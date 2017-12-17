DROP DATABASE IF EXISTS dept8003 ;
CREATE DATABASE dept8003 CHARACTER SET UTF8 ;
USE dept8003 ;
CREATE TABLE dept(
     deptno    bigint  auto_increment ,
     dname     varchar(50) ,
     loc       varchar(50) ,
     constraint pk_deptno primary key(deptno)
) ;
INSERT INTO dept(dname,loc) VALUES ('【8003】财务部','【8003】北京') ;
INSERT INTO dept(dname,loc) VALUES ('【8003】开发部','【8003】石家庄') ;
INSERT INTO dept(dname,loc) VALUES ('【8003】销售部','【8003】上海') ;
INSERT INTO dept(dname,loc) VALUES ('【8003】产品部','【8003】广州') ;
INSERT INTO dept(dname,loc) VALUES ('【8003】人事部','【8003】深圳') ;