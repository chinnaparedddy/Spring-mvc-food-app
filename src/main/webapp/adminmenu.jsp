<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h1> ${meg}</h1>
	<h1>ADMIN HOME</h1>
	<h2>
		<a href="loaduser">Add User</a><br>
		<a href="usersall">View All Users</a><br>
		<a href="productload">Add Products</a><br>
		<a href="productsall">View All Products</a><br>
	</h2>
</body>
</html>