<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>Id</td>
<td>Name</td>
<td>Salary</td>
</tr>
<c:forEach var="employee" items="${employeeList}">
<tr>
<td><c:out value="${employee.eid}"/></td>
<td><c:out value="${employee.ename }"></c:out></td>
<td><c:out value="${employee.salary }"></c:out></td>
<td><a href="/OnlineExamination/dj/delete/${employee.eid}" >Delete</a></td>
<td><a href="/OnlineExamination/dj/edit/${employee.eid}">Edit</a></td>
<td>
     <spring:url value="OnlineExamination/dj/edit/${employee.eid }" var="updateURL" />
     <a href="${updateURL }">Update</a>
    </td>
</tr>
</c:forEach>
</table>
</body>
</html>