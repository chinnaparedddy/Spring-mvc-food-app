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
 	<form:form action="usersave" modelAttribute="user">
 	NAME: <form:input path="name"/>
 	EMAIL: <form:input path="email"/>
 	PASSWORD: <form:input path="password"/>
 	<form:button>ADDUSER</form:button>
 	
 	</form:form>

</body>
</html>