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
  <title>blue bus</title>
 <style>
 
  table
  {
      background-color: blue;
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
  
 


</style>

 </head>
 <body>
  <form:form action="./login1" modelAttribute="user">
   <table align="center">   
	
	<thead colspan="2">
					<th style="color:black"><h1>Welcome to Blue bUs</h1></th>
				<tr>
 <td><form:input type="text" path="username" id="type"/></td>
  </tr>
  <tr>
 <td><form:input type="password" path="password" id="type"/></td>
  </tr>
  <tr>
  <tr>
    
					<td><br><button type="button" class="cancel">Cancel</button>
                            <button type="submit" class="signup">Login</button></td>
					
                                        
                             </tr>
           
					
				<tr colspan="2">
					<td>
						<br>NewUser <a href="./Signup">Signin</a>
					</td>

				</tr>
				<tr colspan="2">
					<td>
						<br><a href="./home"></a>
					</td>

				</tr>
				
			
				
				
				
							</table>

    
</form:form>
 </body>
</html>
