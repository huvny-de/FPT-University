USE FU_COMPANY
GO
--1.	Create the procedure named pList_Employee to list all those employees who only work for his/her department (that is, who never join to projects from other departments).
--Required Information: empSSN, empName, depName, numOfProjects, totalWorkHours

IF OBJECT_ID ('pList_Employee', 'p') is not null
DROP PROCEDURE pList_Employee
GO
CREATE PROCEDURE pList_Employee
AS 
SELECT T.empSSN, T.empName, D.depName, COUNT(W.proNum) AS 'NumOfProjects', SUM(W.workHours) AS 'totalWorkHours'
FROM tblWorksOn W JOIN (SELECT DISTINCT E.empSSN, E.empName, E.depNum
FROM (((tblEmployee E JOIN tblWorksOn W ON E.empSSN = W.empSSN) JOIN tblProject P ON W.proNum = P.proNum) 
JOIN tblDepartment D ON D.depNum = P.depNum)
WHERE E.depNum = P.depNum
EXCEPT (SELECT DISTINCT E.empSSN, E.empName, E.depNum
FROM (((tblEmployee E JOIN tblWorksOn W ON E.empSSN = W.empSSN) JOIN tblProject P ON W.proNum = P.proNum) 
JOIN tblDepartment D ON D.depNum = P.depNum)
WHERE E.depNum != P.depNum)) T ON W.empSSN = T.empSSN JOIN tblDepartment D ON T.depNum = D.depNum
GROUP BY T.empName, T.empSSN, D.depName
GO
EXEC pList_Employee
GO
--2.	Create the procedure name pList_Project to find all internal projects (one project is called by internal, if there are no members from out of its controlling department)
--Required Information: proNum, proName, depName, numOfEmployees, totalWorkHours 

IF OBJECT_ID ('pList_Project', 'p') is not null
DROP PROCEDURE pList_Project
GO
CREATE PROCEDURE pList_Project
AS
SELECT T.ProNum, T.proName, D.depName, count(W.empSSN) AS 'numOfEmployees', SUM(W.workHours) AS 'totalWorKHours'
FROM tblWorksOn W JOIN (SELECT DISTINCT P.ProNum, P.proName, P.depNum
FROM (((tblEmployee E JOIN tblWorksOn W ON E.empSSN = W.empSSN) JOIN tblProject P ON W.proNum = P.proNum) 
JOIN tblDepartment D ON D.depNum = P.depNum)
WHERE P.depNum = E.depNum
EXCEPT
(SELECT DISTINCT P.ProNum, P.proName, P.depNum
FROM (((tblEmployee E JOIN tblWorksOn W ON E.empSSN = W.empSSN) JOIN tblProject P ON W.proNum = P.proNum) 
JOIN tblDepartment D ON D.depNum = P.depNum)
WHERE P.depNum != E.depNum)) T ON W.proNum = T.proNum JOIN tblDepartment D ON T.depNum = D.depNum
GROUP BY T.proNum,T.proName,D.depName
GO
EXEC pList_Project
GO
--3.	Create the procedure name pAssign_Supervisor to assign an employee as supervisor of the other employee.
IF OBJECT_ID ('pAssign_Supervisor', 'p') is not null
DROP PROCEDURE pAssign_Supervisor
GO

CREATE PROCEDURE pAssign_Supervisor (@empSuper NVARCHAR(50), @empName NVARCHAR (50))
	
AS
	DECLARE @t DECIMAL(18,0);
	SELECT @t = empSSN 
	FROM tblEmployee 
	WHERE empName LIKE @empSuper
	
	UPDATE tblEmployee
	SET supervisorSSN = @t
	WHERE empName LIKE @empName
GO
EXEC pAssign_Supervisor N'Mai Duy An' , N'Tống Thị Lan Anh'
SELECT * 
FROM tblEmployee