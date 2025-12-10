<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quiz Portal</title>
</head>
<body>

<h2>Quiz Portal</h2>

<h3>Login</h3>
<form action="login" method="post">
    Email: <input name="email" type="email"/><br/>
    Password: <input name="password" type="password"/><br/>
    <button type="submit">Login</button>
</form>

<h3>Register</h3>
<form action="register" method="post">
    Name: <input name="name"/><br/>
    Email: <input name="email" type="email"/><br/>
    Password: <input name="password" type="password"/><br/>
    <button type="submit">Register</button>
</form>

</body>
</html>
