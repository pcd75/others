<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="./login" modelAttribute="admin">
Enter username: <form:input path="username" type="text"/><br>
Enter password:<form:input path="password" type="password"/><br>
<input type="submit" value="login">

</form:form>

</body>
</html>