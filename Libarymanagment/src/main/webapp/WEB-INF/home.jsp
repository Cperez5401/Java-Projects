<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="table">
			<table>
				<thead>
					<tr>
						<th>Book Name</th>
						<th>Author</th>
						<th>Price</th>
						<th>Quantity</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${book}" var="book">
						<tr>
							<td><c:out value="${book.bookName}" /></td>
							<td><c:out value="${book.author}" /></td>
							<td><c:out value="${book.price}" /></td>
							<td><c:out value="${book.quantity}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>