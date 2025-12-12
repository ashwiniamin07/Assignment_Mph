<%@ page import="com.mph.model.User" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null || !"admin".equals(session.getAttribute("role"))) { response.sendRedirect("login.jsp"); return; }
%>
<html>
<head><title>Admin Dashboard</title><link rel="stylesheet" href="css/styles.css"></head>
<body>
<h2>Admin Dashboard</h2>

<p>Total Quizzes: <b><%= request.getAttribute("totalQuizzes") %></b></p>
<p>Total Questions: <b><%= request.getAttribute("totalQuestions") %></b></p>
<p>Total Users: <b><%= request.getAttribute("totalUsers") %></b></p>

<a href="createQuiz.jsp">Create New Quiz</a><br><br>
<a href="viewQuizzes.jsp">Manage Quizzes</a><br><br>

</body>
</html>
