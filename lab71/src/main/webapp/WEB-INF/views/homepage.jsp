<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<h1>Grades</h1>
<table class="table">
	<thead>
				<tr>
						<th>Name</th><th>Type</th><th>Score</th><th>Total</th>
				</tr>
	</thead>
	<tbody>
	<c:forEach var="grades" items="${grades}">
	<tr>
			<td><c:out value="${grades.name}"></c:out></td>
			<td><c:out value="${grades.type}"></c:out></td>
			<td><c:out value="${grades.score}"></c:out></td>
			<td><c:out value="${grades.total}"></c:out></td>
			<td><a href="/delete?id=${grades.id}" class="button">Delete</a></td>
	</tr>
	</c:forEach>
	</tbody>
</table>
<br>
<br>
<br>
<a href="/addGrade" class="button">Add Grade</a>
</body>
</html>