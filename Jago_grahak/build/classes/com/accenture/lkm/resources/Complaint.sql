
-- Table Script goes here.

create database jagograhak;
use jagograhak;

create table CompliantType(
     compliantTypeId int primary key,
     compliantTypeName varchar(50) not null
     );
     
create table Compliant(
     compliantId int(10) primary key auto_increment,
     customerName varchar(50) not null,
     description varchar(100),
     dateOfIncidence date,
     amount double,
     compliantTypeId int(10) references CompliantType(compliantTypeId)
     );
     

INSERT INTO CompliantType (compliantTypeId, compliantTypeName) VALUES
(1001, 'Quality-related'),
(1002, 'Cost-related'),
(1003, 'Delivery-related'),
(1004, 'Wait-Time Complaint');


INSERT INTO Compliant (amount, compliantTypeId, customerName, dateOfIncidence, description)
VALUES
(4000, 1001, 'Hari Prasad', '2022-02-18', 'Quality issue with product A'),
(8002, 1002, 'Sham lal', '2023-08-19', 'Cost-related complaint'),
(6722, 1003, 'Shubh Singh', '2020-07-17', 'Late delivery of order B'),
(6277, 1004, 'Ram lal', '2021-09-11', 'Long wait time at the service center');

commit;

