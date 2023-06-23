<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<h1>HELLO</h1>
<form  action="updateCustomer" method = "post">
 <table >
 	<tr>
		<td> Customer ID</td>
		<td><input name = "cid" /></td>
	</tr>
	
	<tr>
		<td> Customer Name</td>
		<td><input name = "cname" /></td>
	</tr>
	<tr>
		<td> Customer Mobile</td>
		<td><input name = "cmobile"/></td>
	</tr>
	<tr> 
		<td>Customer City</td>
		<td>
			<select name="ccity">
			<option value="">--Select your city---</option>
			<option value="Hyderabad">Hyderabad</option>
			<option value="Bangalore">Bangalore</option>
			<option value="Chennai">Chennai</option>
			</select>
		</td>
	</tr>
	</tr>
		<td><button>Register</button></td>
	</tr>
   </table>
   </form>
    
