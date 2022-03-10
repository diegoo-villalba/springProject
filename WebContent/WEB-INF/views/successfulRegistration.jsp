<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful registration</title>
</head>
<body>

The user <strong>${newUser.name } ${newUser.lastname }</strong> and email <strong>${newUser.email }</strong> has successfully registered!!
<br/>
The age of <strong>${newUser.name }</strong> is: <strong>${newUser.age}</strong>
<br/>
The Zip Code introduced is: <strong>${newUser.zipCode}</strong>
<br/>
The ocuppation of <strong>${newUser.name }</strong> is: <strong>${newUser.ocuppation}</strong>
<br/>
The assigned gender is: <strong>${newUser.gender}</strong>
<br/>
The assigned language is: <strong>${newUser.language}</strong>

</body>
</html>