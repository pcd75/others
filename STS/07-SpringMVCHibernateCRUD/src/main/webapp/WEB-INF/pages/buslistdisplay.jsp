<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/res"
        user="root" password="Root"
    />
     
    <sql:query var="listbuses"   dataSource="${myDS}">
        SELECT * FROM bus;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of busess</h2></caption>
            <tr>
                <th>from</th>
                <th>to</th>
                <th>busno</th>
                <th>busname</th>
                <th>type</th>
                 <th>time</th>
            </tr>
            <c:forEach var="user" items="${listbuses.rows}">
                <tr>
                    <td><c:out value="${user.from}" /></td>
                    <td><c:out value="${user.to}" /></td>
                    <td><c:out value="${user.busno}" /></td>
                    <td><c:out value="${userbusname}" /></td>
                    <td><c:out value="${user.type}" /></td>
                      <td><c:out value="${user.time}" /></td>
                    
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>