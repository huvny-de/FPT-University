create table partner(
PNumber int primary key,
Name nvarchar(50),
PNum int
foreign key(PNum) references tblProject(proNum)
) 
go