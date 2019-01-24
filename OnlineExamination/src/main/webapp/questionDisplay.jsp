<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Questions List here</title>
</head>
<body>
<table>
<tr>
<td>Quesion Id</td>
<td>Question Type</td>
<td>Question</td>
<td>option1</td>
<td>option2</td>
<td>option3</td>
<td>option4</td>
<td>Right Ans</td>
</tr>
<c:forEach var="ques" items="${list}">
<tr>
<td><c:out value="${ques.qid}"></c:out></td>
<td><c:out value="${ques.qType }"></c:out></td>
<td><c:out value="${ques.qDescription }"></c:out></td>
<td><c:out value="${ques.option1 }"></c:out></td>
<td><c:out value="${ques.option2 }"></c:out></td>
<td><c:out value="${ques.option3 }"></c:out></td>
<td><c:out value="${ques.option4 }"></c:out></td>
<td><c:out value="${ques.rightAns }"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>