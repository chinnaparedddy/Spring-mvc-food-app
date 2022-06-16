<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${msg}</h1>
	
	<form:form action="savecustomer" modelAttribute="order">
		NAME : <form:input path="name"/><br><br>
		PHONE : <form:input path="phone"/><br><br>
		<form:button>register</form:button>
	</form:form>

</body>
</html>