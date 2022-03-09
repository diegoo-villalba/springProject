<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Register form</title>
</head>
<body>

<form:form action="processedForm" modelAttribute="newUser">

Name<form:input path="name"/>
<form:errors path="name" style="color: red"></form:errors>

<br/><br/><br/><br/>

Lastname<form:input path="lastname"/>

<br/><br/><br/><br/>

Age<form:input path="age"/>
<form:errors path="age" style="color: red"></form:errors>
<br/><br/><br/><br/>

Email<form:input path="email"/>
<form:errors path="email" style="color: red"></form:errors>
<br/><br/><br/><br/>

Gender: <br/>

Female<form:radiobutton path="gender" value="Female"/>
<br/>
Male<form:radiobutton path="gender" value="Male"/>
<br/>
Other<form:radiobutton path="gender" value="Other"/>
<br/>

<br/><br/><br/><br/>

Ocuppation: <br/>

<form:select path="ocuppation" multiple="true">

<form:option value="Student" label="Student"></form:option>
<form:option value="Worker" label="Worker"></form:option>
<form:option value="Unemployed" label="Unemployed"></form:option>

</form:select>

<br/><br/><br/><br/>

Language: <br/>

English: <form:checkbox path="language" value="English"/>
Spanish: <form:checkbox path="language" value="Spanish"/>
German: <form:checkbox path="language" value="German"/>
Danish: <form:checkbox path="language" value="Danish"/>

<br/><br/><br/><br/>

<input type="submit" value="Send">

</form:form>

</body>
</html>