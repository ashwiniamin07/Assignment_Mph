<%@ page import="java.util.*, com.mph.dao.QuizDAO, com.mph.model.Quiz" %>

<%
    QuizDAO dao = new QuizDAO();
    List<Quiz> list = dao.getAll();
%>

<html>
<head><title>All Quizzes</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>

<h2>Available Quizzes</h2>

<%
    for (Quiz q : list) {
%>
    <p>
        <b><%= q.getTitle() %></b>
        <a href="startQuiz?quizId=<%= q.getId() %>">Start Quiz</a> |
<% if ("admin".equals(session.getAttribute("role"))) { %>
    <a href="addQuestion.jsp?quizId=<%= q.getId() %>">Add Question</a>
<% } %>
    </p>
<%
    }
%>

</body>
</html>
