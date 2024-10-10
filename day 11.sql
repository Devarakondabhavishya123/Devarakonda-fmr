create table Customers(
CustomerID int primary key,CompanyName varchar(35),
Address varchar(50));
insert into Customers values(143,'Levono','Manyatha Techpark Bengaluru');
select * from Customers;
create table Shippers(ShipperID int primary key, CompanyName varchar(50)unique);
insert into Shippers values(10,'Realme');
insert into Shippers values(20,'Sony'); 
insert into Shippers values(30,'Sony');
select * from Shippers;
create table Products(ProductID int primary key, ProductName varchar(50),QuantityPerUnit int,UnitPrice int);
insert into Products values(143,'Hp',20,100000);
select * from Products;
create table Orders(OrderID int primary key,CustomerID int,EmployeeID int,OrderDate date, ShippedDate date);
alter table Orders add constraint fCustomerID foreign key(CustomerID) references Customers(CustomerID);
alter table Orders add constraint shippeddate CHECK (shippeddate > orderdate);
insert into Orders values(234,143,1432,'2024-09-16','2025-09-15');
insert into Orders values(234,143,1432,'2025-09-16','2024-09-15');