<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%String uname=request.getParameter("uname");
	String pwd=request.getParameter("pwd");
	
	%> --%>
	
	<c:if test="${param.uname=='ashwini' && param.pwd=='ashwini' }">
	<h1>Authentication Successful</h1>
	<c:redirect url="success.jsp">
		<c:param name="uname" value="${param.uname }"/>
	</c:redirect>
	</c:if>
	
	<c:if test="${param.uname!='ashwini' || param.pwd!='ashwini' }">
	<h1>Invalid Credentials</h1>
	</c:if>
	
</body>
</html>
