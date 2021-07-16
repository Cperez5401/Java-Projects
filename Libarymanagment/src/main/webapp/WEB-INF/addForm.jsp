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
		<div class="addForm">
			<h1>Add A Book to our libary</h1>
			<form:form action="/addresults" method="POST" modelAttribute="book">
				<label>Book Name: <input type="text" name="bookName"></label>
				<label>Author: <input type="text" name="author"></label>
				<label>Price: <input type="number" name="price"></label>
				<label>Quantity: <input type="number" name="quantity"></label>
				<button>Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>