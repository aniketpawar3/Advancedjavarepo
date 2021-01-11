<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD EMPLOYEE</title>
</head>
<body>
<form action="addEmployee" method="post">
<h2>Add Employee</h2>
<table>

<tr>
<td>EmployeeId:</td>
<td><input type="text" name="employeeId"></td>
</tr>


<tr>
<td>Name:</td>
<td><input type="text" name="employeeName"></td>
</tr>

<tr>
<td>designation:</td>
<td><input type="text" name="designation"></td>
</tr>

<tr>
<td>salary:</td>
<td><input type="text" name="salary"></td>
</tr>

<tr>
<td>gender:</td>
</tr>
<tr>
<td><input type="radio" id="male" name="gender" value="male"/>male</td>
<td><input type="radio" id="female" name="gender" value="female"/>female</td>
<td><input type="radio" id="other" name="gender" value="other"/>other</td>
</tr>


<tr>
<td><input type="submit"></td>
</tr>
</table>
</form>
</body>
</html>