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
	<form:form action="update" modelAttribute="product">
		ID : <form:input path="id" readonly="true"/><br><br>
		NAME : <form:input path="name"/><br><br>
		TYPE : <form:input path="type"/><br><br>
		COST : <form:input path="cost"/><br><br>
		
		<form:button>update</form:button>
	</form:form>

</body>
</html>