create database test;

use test;
create table Worker(
orker_id varchar(20) Not null,
First_Name varchar(30),
Last_Name varchar(30),
Salary varchar(30),
Joining_Date varchar(30),
Department varchar(50)
);


insert into test.Worker value('002','Niharika' ,'verma','80000','2014-06-11 09:00:00','Admin');
insert into test.Worker values('003','Vishal','Singhal', '300000','2014-02-20 09:00:00','HR');
insert into test.Worker values('004','Amitabh', 'Singh','500000','2014-02-20 09:00:00','Admin');
insert into test.Worker VALUES ('006','Vipul', 'Diwan','200000','2014-06-11 09:00:00','Account');
insert into test.Worker VALUES ('007','Satish', 'Kumar','75000','2014-01-20 09:00:00','Account');
insert into test.Worker VALUES ('008','Geetika', 'Chauhan','90000','2014-04-11 09:00:00','Admin');


select replace(First_Name,'a','A') from worker;

select concat(First_Name,' ',Last_Name) as COMPLETE_NAME from Worker;

select * from Worker order by First_Name asc, Department desc;

select * from Worker where Department='Admin';

Select * from Worker where First_Name in ('Vipul','Satish');

select * from Worker where First_Name like '%a';

select * from Worker where First_Name like '_____h';

SELECT UPPER(First_Name) 
FROM Worker;
 
Select * from Worker where SALARY between 100000 and 500000;
   


