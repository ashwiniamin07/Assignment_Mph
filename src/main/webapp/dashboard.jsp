<%@ page import="com.mph.model.User" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) { response.sendRedirect("login.jsp"); return; }
    String role = (String) session.getAttribute("role");
%>
<html> ...
<h2>Welcome, <%= user.getName() %>!</h2>

<% if ("admin".equals(role)) { %>
    <a href="createQuiz.jsp">Create Quiz</a><br><br>
<% } %>

<a href="viewQuizzes.jsp">View All Quizzes</a><br><br>
<a href="logout">Logout</a>
</html>
