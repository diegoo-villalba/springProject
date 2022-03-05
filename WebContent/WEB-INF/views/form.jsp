<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/style/myStyle.css">
<title>Form</title>
</head>
<body>

<h1>Please, enter your name below:</h1>

<div class="centerForm">
<form action="formProcessor2" method="get">

	<input type="text" name="visitorsName">
	
	<input type="submit">

</div>


</form>
</body>
</html>