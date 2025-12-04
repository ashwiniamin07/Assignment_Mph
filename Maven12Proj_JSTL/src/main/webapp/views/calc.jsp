<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
       <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<core:set var="num1" value="${param.num1}"></core:set>
	<core:set var="num2" value="${param.num2}"></core:set>
	<core:set var="op" value="${param.op}"></core:set>
	
<%-- 	<core:out value="${ num1}"></core:out>
	<core:out value="${ num2}"></core:out>
	<core:out value="${ op}"></core:out>
	 --%>
	<%-- <core:set var="a"  value="${num1+ 0 }"></core:set>
	<core:set var="b"  value="${num2+ 0 }"></core:set> --%>
	<fmt:parseNumber var="a" value="${num1 }"></fmt:parseNumber>
	<fmt:parseNumber var="b" value="${num2 }"></fmt:parseNumber>
	
	<core:choose>
		<core:when test="${op=='+' }">
			<core:out value="${a+b}"></core:out>
		</core:when>
		<core:when test="${op=='-' }">
			<core:out value="${a-b}"></core:out>
		</core:when>
		<core:when test="${op=='*' }">
			<core:out value="${a*b}"></core:out>
		</core:when>
		<core:when test="${op=='/' }">
			<core:out value="${a/b}"></core:out>
		</core:when>
	<core:otherwise>Invalid operation</core:otherwise>
	
	</core:choose>
	
</body>
</html>