create database constaints;
use constaints;
create table info(id int(10), fullname varchar(100));
INSERT INTO info
VALUES (1, 'ak' );
INSERT INTO info
VALUES (2 ,'nk' );
INSERT INTO info
VALUES (3, 'sk' );
INSERT INTO info
VALUES (4, 'rk' );
INSERT INTO info
VALUES (4, 'ra' );
INSERT INTO info
VALUES (4, 'madhurak' );
INSERT INTO info
VALUES (2 ,'anjali' );




select * from info where fullname like '%k';
select * from info where fullname like '_k';
select * from info where fullname like '_%ja%';
select * from info where fullname like '%li';