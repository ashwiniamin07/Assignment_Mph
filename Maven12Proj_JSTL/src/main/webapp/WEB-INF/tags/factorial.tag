 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ tag description="num factorial" pageEncoding="UTF-8" %>
 <%@ attribute name="num" required="true" type="java.lang.Integer" %>
 <c:set var="fact" value="1"></c:set>
 <c:forEach var="i" begin="1" end="${num }">
 	<c:set var="fact" value="${fact*i}"></c:set>
 </c:forEach>
 Result:<c:out value="${fact}"></c:out>