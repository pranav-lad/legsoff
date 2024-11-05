drop database IF EXISTS jagograhakcomplaintdb;
create database jagograhakcomplaintdb;
use jagograhakcomplaintdb;

create table ComplaintType(
complaintTypeId int PRIMARY KEY,
complaintTypeName varchar(50)
);

insert into ComplaintType values(1001,'Quality – related');
insert into ComplaintType values(1002,'Cost – related');
insert into ComplaintType values(1003,'Delivery - related');
insert into ComplaintType values(1004,'Wait – Time Complaint');

create table Complaint(
complaintId int PRIMARY KEY auto_increment,
customerName varchar(50),
description varchar(100),
dateOfIncidence date,
amount double,
complaintTypeId int references ComplaintType(complaintTypeId)
);

insert into Complaint values(10001,'Arnav','Quality is not as expected','2018-01-22',30000,1001);
insert into Complaint values(10002,'Adira','Overcharged on bill than actual price','2019-01-12',50000,1002);
insert into Complaint values(10003,'Aadidev','Wrong Product delivered','2020-01-24',70000,1003);
commit;
