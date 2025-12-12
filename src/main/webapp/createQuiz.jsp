<%@ page import="com.mph.model.User" %>
<%
    User u = (User) session.getAttribute("user");
    if (u == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<html>
<head><title>Create Quiz</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>

<h2>Create New Quiz</h2>

<form action="CreateQuizServlet" method="post">
    Quiz Title: <input type="text" name="title" required><br><br>
    <button type="submit">Create Quiz</button>
</form>

</body>
</html>
