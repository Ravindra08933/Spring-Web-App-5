<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${error!=null}">
<h4><c:out value="${error}"/></h4>
</c:if>
<c:if test="${errorr!=null}">
<h4><c:out value="${errorr}"/></h4>
</c:if>
