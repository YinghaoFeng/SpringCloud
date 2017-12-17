DROP DATABASE IF EXISTS dept8002 ;
CREATE DATABASE dept8002 CHARACTER SET UTF8 ;
USE dept8002 ;
CREATE TABLE dept(
     deptno    bigint  auto_increment ,
     dname     varchar(50) ,
     loc       varchar(50) ,
     constraint pk_deptno primary key(deptno)
) ;
INSERT INTO dept(dname,loc) VALUES ('【8002】财务部','【8002】北京') ;
INSERT INTO dept(dname,loc) VALUES ('【8002】开发部','【8002】石家庄') ;
INSERT INTO dept(dname,loc) VALUES ('【8002】销售部','【8002】上海') ;
INSERT INTO dept(dname,loc) VALUES ('【8002】产品部','【8002】广州') ;
INSERT INTO dept(dname,loc) VALUES ('【8002】人事部','【8002】深圳') ;