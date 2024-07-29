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
  <title>BLUE Bus</title>
  <style>
  input{
    font-size:100;
  }

</style>



 </head>

  <body bgcolor="aliceblue">
     <form:form action="./Signup" commandName="Signup">
	   <table align="center">
				<thead colspan="2">
					<th style="color:blue"><h1>Signup</h1></th>
				</thead>
		              <tr>
					<td><label for ="First Name"> <b>First Name:</b></label></td>
					<td><input type="text" name="name"></td>
				</tr>
                              <tr>
					<td><label for ="Last Name"> <b>Last Name:</b></label></td>
					<td><input type="text" name="name"></td>
				</tr>
				                              <tr>
					<td><label for ="Gender"> <b>Gender:</b></label></td>
					<td><input type="text" name="name"></td>
				</tr>
				      <tr>
					<td><label for ="Age"> <b>Age:</b></label></td>
					<td><input type="number" name="number"></td>
				</tr>
				                            
                              <tr>
					<td><label for ="Emailid"> <b>Mailid:</b></label></td>
					<td><input type="text" name="name"></td>
				</tr>
                              <tr>
					
					<td><label><b>Enter Password :</b></label></td>
					<td><input type="password" size="10" name="psd"></td>
				</tr>
				<tr>
					<td><label><b>Confirm Password :</b></label></td>
					<td><input type="password" size="10" name="rpsd"></td>
				</tr>
                               <tr>
					<td><label for ="Contact No"> <b>Contact No:</b></label></td>
					<td><input type="number"></td>
				</tr>
				                              <tr>
					<td><label for ="City"> <b>City:</b></label></td>
					<td><input type="text" name="name"></td>
				</tr>
				                            


                <tr>
					<td><br><button type="button" class="cancel">Cancel</button>
                            <button type="submit" class="signup">Sign Up</button></td>
					
                                        <td><br><a href="./Signup"></a></td>
                             </tr>
                             </table>
                             </form:form>
 </body>
</html>
