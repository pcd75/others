<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>BusList Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Bus
</h1>

<c:url var="addAction" value="/addbus" ></c:url>

<form:form action="${addAction}" modelAttribute="bus">
<table>
   <tr>
		<td>
			<form:label path="from">
				<spring:message text="from"/>
			</form:label>
		</td>
		<td>
			<form:input path="from" />
		</td> 
	</tr>
   <tr>
		<td>
			<form:label path="to">
				<spring:message text="to"/>
			</form:label>
		</td>
		<td>
			<form:input path="to" />
		</td> 
	</tr>
   
	<tr>
		<td>
			<form:label path="busno">
				<spring:message text="busno"/>
			</form:label>
		</td>
		<td>
			<form:input path="busno" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="busname">
				<spring:message text="busname"/>
			</form:label>
		</td>
		<td>
			<form:input path="busname" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="bustype">
				<spring:message text="bustype"/>
			</form:label>
		</td>
		<td>
			<form:input path="bustype" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="time">
				<spring:message text="timet"/>
			</form:label>
		</td>
		<td>
			<form:input path="time" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty bus.busname}">
				<input type="submit"
					value="<spring:message text="Edit Bus"/>" />
			</c:if>
			<c:if test="${empty bus.busname}">
				<input type="submit"
					value="<spring:message text="Add Bus"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Buses List</h3>
<c:if test="${!empty listBuses}">
	<table class="tg">
	<tr>
		<th width="80">Bus busno</th>
		<th width="120">Bus busname</th>
		<th width="120">Bus type</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listBuses}" var="train">
		<tr>
			<td>${bus.busno}</td>
			<td>${bus.busname}</td>
			<td>${bus.type}</td>
			<td><a href="<c:url value='/edit/${bus.busno}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${bus.busno}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
