<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="css/styles.css">
    
</head>
<body>

<h2>Create an Account</h2>

<form action="register" method="post">

    Name: <input type="text" name="name" required><br><br>
    Email: <input type="email" name="email" required><br><br>
    Password: <input type="password" name="password" required><br><br>
    <button type="submit">Register</button>
</form>

<%
    String msg = request.getParameter("msg");
    if ("failed".equals(msg)) {
%>
<p style="color:red;">Email already exists!</p>
<% } %>

<p><a href="login.jsp">Back to Login</a></p>

</body>
</html>
