<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
	<h1 style="color:red"> Welcome.....</h1>
	<h3>UserName:</h3><%String uname= request.getParameter("uname"); %>
	<h3>Password:</h3><%String pwd= request.getParameter("pwd"); %>
	
	<%
	if(uname.equals("ashwini") && pwd.equals("pwd")) {
        session.setAttribute("uname", uname);
        response.sendRedirect("success.jsp?uname=" + uname);
    }
			
		else
			response.sendRedirect("error.jsp");
	
	%>
</body>
</html>