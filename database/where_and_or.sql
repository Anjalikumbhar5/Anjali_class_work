create database stud;
use stud;
create table student(sid int(100),sname varchar(200),sage int(20),smark int(50)); 
INSERT INTO student(sid,sname,sage,smark)
VALUES (1, 'ak' ,20,60);
INSERT INTO student(sid,sname,sage,smark)
VALUES (2, 'sk' ,25,50);
INSERT INTO student(sid,sname,sage,smark)
VALUES (3, 'vk' ,30,80);
INSERT INTO student(sid,sname,sage,smark)
VALUES (4, 'rk' ,40,60);
INSERT INTO student(sid,sname,sage,smark)
VALUES (5, 'mk' ,70,70);
INSERT INTO student(sid,sname,sage,smark)
VALUES (6, 'ask' ,30,90);

select * from student;
select * from student where sage=70 ;
select * from student where sid=1 or sid=5;
select * from student where smark=60 and sage=20;
describe student;

