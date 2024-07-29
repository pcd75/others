<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  table
  {
      background-color: black;
	  border: 8px solid white;
	  border-radius: 25px;
	  background:rgba(0,0,0,0.7)
  }
  #type
  {
      width: 300px;
	  height:32px;
	  
	  border:0;
	  outline:0;
	  background:transparent;
	  border-bottom:3px solid white;
	  color:white;
	  font-size:25px;
  }
  input::-webkit-input-placeholder
  {
  font-size:20px;
  line-height:3;
  color:white;
  }

  #btn
  {
  width:250px;
  background-color:orange;
  height:35px;
  font-size:20px;
  }

</style>
</head>
<form:form action="./login" modelAttribute="admin">
<body >
 <br><br><br><br>
 <table width="25%" border="0" cellspacing="40" align="center">
 <tr>
 <td align="center"></td>
 </tr>
 <tr>
 <td><form:input type="text" path="username" id="type"/></td>
  </tr>
  <tr>
 <td><form:input type="password" path="password" id="type"/></td>
  </tr>
  <tr>
 <td align="center"><input type="submit" value="login" id="btn"></td>
  </tr>
 </body>
</form:form>

</html>