<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Examination</title>
</head>
<body>
	<h1>ADD EMPLOYEE</h1>
	<form:form action="addemployee" method="post" modelAttribute="employee">
		<table>
			<tr>
				<td>Employee Name</td>
				<td><form:input path="ename"/><form:errors path="ename"/></td>
			</tr>
			<tr>
				<td>Employee Salary</td>  
				<td><form:input path="salary"/><form:errors path="salary"/></td>
			</tr>
			<tr>
				<td></td>	
				<td><input type="submit" value="add"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>