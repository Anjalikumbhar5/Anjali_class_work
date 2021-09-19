create database join1;
use join1;
create table info(rollno int(10), fullname varchar(100));
INSERT INTO info
VALUES (1, 'Anjali' );
INSERT INTO info
VALUES (2, 'Pranita' );
INSERT INTO info
VALUES (3, 'Harsha' );
INSERT INTO info
VALUES (4, 'Ragini' );
INSERT INTO info
VALUES (4, 'Anjali' );



create table info1(rollno int(10), fullname varchar(100),email varchar(100));
INSERT INTO info1
VALUES (1, 'Anuja' , 'a@gmail');
INSERT INTO info1
VALUES (2, 'Amruta', 'am@gmail');
INSERT INTO info1
VALUES (3, 'Priya', 'p@gmail' );
INSERT INTO info1
VALUES (4, 'Aliya' , 'al@gmail');

select * from info cross join info1;
select * from info inner join info1 where info.rollno=info1.rollno;
select * from info right join info1 on info.fullname=info1.fullname;
select * from info left join info1 on info.fullname=info1.fullname;
select * from info natural join info1;