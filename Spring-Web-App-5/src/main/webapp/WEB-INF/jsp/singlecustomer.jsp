<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<form action="" method="post">
<label> Customer ID</label><input class="form-control" name="cid">
<button>Submit</button>
<button type="reset">Cancel</button>
<c:if test="${customer!=null}">  
	<h4> name is: <c:out value="${customer.cname}"/></h4>
	<h4>mobile is: <c:out value="${customer.cmobile}"/></h4>
	<h4> city: <c:out value="${customer.ccity}"/></h4>
</c:if>  
<c:if test="${error!=null}">
<h4><c:out value="${error}"/></h4>
</c:if>
<c:if test="${errorr!=null}">
<h4><c:out value="${errorr}"/></h4>
</c:if>
