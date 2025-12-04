<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<core:import url="success.jsp"></core:import>
<%-- 	<core:import url="mphasislogo.png"></core:import> --%>
	<core:forEach var="n" begin="1" end="10">
		${n}
		<br>
	</core:forEach>
	
	<core:forTokens var="item" items="ashwini,prathith,anvitha" delims=",">
	${item}<br>
	</core:forTokens>
	
</body>
</html>