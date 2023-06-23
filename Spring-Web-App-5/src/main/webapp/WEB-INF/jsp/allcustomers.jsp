<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${customer.size()>0}">  
	<table border="1" align="center">
	
	<tr>
		<td> Customer ID</td>
		<td> Customer Name</td>
		<td>Customer Mobile</td>
		<td>Customer city</td>
		
	</tr>
	<c:forEach items="${customer}" var="cs">
	<tr>
	<td><c:out value="${cs.cid}"></c:out></td>
	<td><c:out value="${cs.cname}"></c:out></td>
	<td><c:out value="${cs.cmobile}"></c:out></td>
	<td><c:out value="${cs.ccity}"></c:out></td>	
	
	</c:forEach>
	</table>
</c:if>
