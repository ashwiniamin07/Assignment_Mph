<html>
<body>
<h2><%= "Hello World!" %></h2>
</body>
</html>
<html>
<body>
<h2><%= "Login form" %></h2>
<form action="UserLoginServlet" method="get">
<label>User Name:</label>
 <input type="text" name="uname">
 <label>Password</label>
 <input type="password" name="pwd" required><br><br>
 <input type="submit" value="Login">
</form>

</body>
</html>