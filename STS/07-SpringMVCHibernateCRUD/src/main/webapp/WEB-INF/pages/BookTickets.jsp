<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>


<!DOCTYPE html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Blue Bus</title>
 <style>

 
  
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
  
 
</style>


 </head>
 <body>
  <form:form action="./buslist" modelAttribute="BookTickets">
   <table align="center">   
	
	<thead colspan="2">
					<th style="color:black"><h1>Search for Bus</h1></th>
				<tr>
					<td><label>From</label></td>
					<td><input type="text" name="Username"></td>
				</tr>
				<tr>
					<td><label>To:</label></td>
					<td><input type="text" name="Username"></td>
				</tr>
				<td><label>date:</label></td>
					<td><input type="date" name="Username"></td>
           <tr>
		   <td><br>
               <button type="submit" class="Check availability">Check availability</button></td>
					
                                        <td><br><a href="./BookTickets"></a></td>
                             </tr>
                             </thead>
                             </table>
                             
   </form:form>
 </body>
</html>
