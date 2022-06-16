<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>MENU</h1>
	<h1>
		PRODUCTS LIST
	</h1>
	<h2>${msg}</h2>
	

	
	<table border="5px solid red" cellpadding=20px cellspacing=0px
		align="center">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>TYPE</th>
			<th>COST</th>
			<th>ADD</th>
		</tr>

		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.getId()}</td>
				<td>${product.getName()}</td>
				<td>${product.getType()}</td>
				<td>${product.getCost()}</td>
				<td><a href="additem?id=${product.getId()}">ADD</a></td>
			</tr>
		</c:forEach>

	</table>
	
	<a href="submitorder">Submit</a>
	


</body>
</html>