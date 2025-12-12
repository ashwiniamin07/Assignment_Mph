<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head><title>Quiz Result</title></head>
<link rel="stylesheet" href="css/styles.css">

<body>

<h2>Your Score</h2>

<%
    String score = request.getParameter("score");
%>

<p>Your score is: <b><%= score %></b></p>

<a href="dashboard.jsp">Go to Dashboard</a>

</body>
</html>
