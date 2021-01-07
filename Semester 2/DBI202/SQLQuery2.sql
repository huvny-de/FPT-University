--a.	Listing all those departments whose manager was assigned in 2010 (score: 1)
select *
from tblDepartment
where year(mgrAssDate) = '2010'
go
--b.	Listing the number of projects for each department, if any (score: 2).
select d.depName, count(*) 'Number of projects'
from tblProject p join tblDepartment d on p.depNum = d.depNum
group by d.depName
go
--c.	Listing all those projects whose the number of employees is maximum (score: 2.)
SELECT P.pronum,P.prname,count(E.empSSN) NoOfemployee
From tblProject P JOIN tblWorkOn W ON P.proNum=W.ProNum
GROUP BY p.proNum,p.ProName
HAVING COUNT(W.empSSN)>=All (
Select count(*)
from tblWorksOn
group by proNum
)

--3.	Write a trigger to ensure that 
--a.	Dependent must less than 18 years old (score: 1.5)
Create trigger tr1
	on   tblDependent
	after  Insert,Update
as
	Declare@YOB INT
	Select @YOB =Year(depBirthDay)From Inserted 
	IF year(getdate())-@YOB>=18
	BEGIN
		RAISERROR('dependent must less then 18 year old',16,10)
		ROLLBACK TRANSACTION
	END
GO
--b.	Manager must be a member of deparment controlled by himself (score: 1.5)
create trigger tr2
	on	Tbldepartment
	àter	insert,update
as
	Declare @depnum INT, @mgrSSN decimal(18,0)
	Declare @depmgrSSN INT
	select @depnum=depnum, @MGRSSN=mgrSSN From inserted
	select @depngrSSN =depNum from tblEmployee Where empSSN=@mgrSSN
	IF @depnum=@depmgrSSN
	begin
		SAISERROR('',16,10)
		ROLLBACK TRANSACTION
	end

go