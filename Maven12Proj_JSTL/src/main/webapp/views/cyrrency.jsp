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
	<fmt:setLocale value="en_In"/>
	<fmt:formatNumber value="123456.789" type="currency"></fmt:formatNumber><br>
	<fmt:setLocale value="en_US"/>
	<fmt:formatNumber value="123456.789" type="currency"></fmt:formatNumber><br>
	
	<fmt:formatNumber value="123456.7" type="number" minFractionDigits="5"></fmt:formatNumber><br>
	<fmt:formatNumber value="0.7865" type="percent"></fmt:formatNumber><br>
	<fmt:formatNumber value="12345678" pattern="#,##0.00"></fmt:formatNumber>
	
	
	
</body>
</html>