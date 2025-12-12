<%@ page import="com.mph.model.User" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="css/styles.css">
    
</head>
<body>

<h2>Welcome, <%= user.getName() %>!</h2>

<a href="createQuiz.jsp">Create Quiz</a><br><br>
<a href="viewQuizzes.jsp">View All Quizzes</a><br><br>
<a href="logout">Logout</a>

</body>
</html>
