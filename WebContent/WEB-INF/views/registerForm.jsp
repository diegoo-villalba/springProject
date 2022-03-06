<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/style/myStyle.css">
<title>Register form</title>
</head>
<body>

<form:form action="processedForm" modelAttribute="newUser">

Name<form:input path="name"/>

<br><br><br><br>

Lastname<form:input path="lastname"/>

<br><br><br><br>

<input type="submit" value="Send">

</form:form>

</body>
</html>