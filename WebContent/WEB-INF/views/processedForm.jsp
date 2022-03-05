<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/style/myStyle.css">
<title>Processed Form</title>
</head>
<body>

Hi ${param.visitorsName }!! Welcome to my first Spring project

<p><br>
${message}
</p>

<img alt="that's_all_folks" src="${pageContext.request.contextPath }/resources/img/folks.jpg">
</body>
</html>