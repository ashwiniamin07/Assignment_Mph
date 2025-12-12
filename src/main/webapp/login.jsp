<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/styles.css">
    
</head>
<body>

<h2>Quiz Portal - Login</h2>

<form action="LoginServlet" method="post">
    Email: <input type="email" name="email" required><br><br>
    Password: <input type="password" name="password" required><br><br>
    <button type="submit">Login</button>
</form>

<%
    String msg = request.getParameter("msg");
    if ("invalid".equals(msg)) {
%>
<p style="color:red;">Invalid email or password!</p>
<% } %>

<p>Don't have an account? <a href="register.jsp">Register here</a></p>

</body>
</html>
