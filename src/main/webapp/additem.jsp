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
	
	<form:form action="addedItems" modelAttribute="item">
		NAME : <form:input path="name" readonly="true"/><br><br>
		COST : <form:input path="cost" readonly="true"/><br><br>
		QTY : <form:input path="qty" /><br><br>
		<form:button>update</form:button>
	</form:form>

</body>
</html>