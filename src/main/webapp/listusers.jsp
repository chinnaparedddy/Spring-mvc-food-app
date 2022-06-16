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

<table border="5px solid red" cellpadding=20px cellspacing=0px
		align="center">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
			<th>EDIT</th>
			<th>DELET</th>
		</tr>

		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.getId()}</td>
				<td>${user.getName()}</td>
				<td>${user.getEmail()}</td>
				<td>${user.getPassword()}</td>
				<td><a href="edituser?id=${user.getId()}">Edit</a></td>
				<td><a href="deleteuser?id=${user.getId()}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>