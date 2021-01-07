CREATE DATABASE SE140364_WS8
go
CREATE TABLE tblSuppliers(
	supCode nvarchar(5) NOT NULL,
	supName nvarchar(30) ,
	address nvarchar(30) ,
	collaborating bit
	PRIMARY KEY (SupCode)
);
go
CREATE TABLE tblItems(
	itemCode nvarchar(5) NOT NULL,
	itemName nvarchar(50),
	supCode nvarchar(5),
	unit nvarchar(10),
	price int,
	supplying bit
	PRIMARY KEY (itemCode),
	FOREIGN KEY (supCode) REFERENCES tblSuppliers(supCode)
);
go
INSERT INTO tblSuppliers
VALUES ('1','Vo Nhat Huy','TPHCM', '0'),('2','La Li Sa', 'Thai', '1'),('3', 'Lisa', 'Thai', '1'),('4', 'Lalisa Manoban', 'Thai', '0'),('5', 'Le Nin', 'Nga', '1')


GO
INSERT INTO tblItems
VALUES	('1', 'Mouse', '1', '3','3000000', '0'),
		('10','KeyBoard', '2', '2','111000000', '1'),
		('11','LCD', '3', '11','32000000', '1'),
		('12','Main Asus', '3', '11','320000', '1'),
		('13','Main GigaByte', '3', '2','32000000', '1'),
		('14','LAPTOP', '2', '1','35000000', '1'),
		('15','Blank DV', '4', '3','30020000', '0'),
		('16','Blank CD', '4', '3','32000000', '1'),
		('17','USB 2.0', '5', '5','3000000', '1'),
		('18','USB ADA', '5', '3','30020000', '0')

