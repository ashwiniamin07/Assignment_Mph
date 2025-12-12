<%@ page import="java.util.*, com.mph.model.Question" %>

<%
    List<Question> questions = (List<Question>) request.getAttribute("questions");
    int quizId = (int) request.getAttribute("quizId");
%>

<html>
<head><title>Take Quiz</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>

<h2>Quiz</h2>

<form action="SubmitQuizServlet" method="post">

<input type="hidden" name="quizId" value="<%= quizId %>">

<%
    int i = 1;
    for (Question q : questions) {
%>
    <p><b>Q<%= i++ %> : <%= q.getQuestion() %></b></p>

    <input type="radio" name="q<%= q.getId() %>" value="A"> <%= q.getOptionA() %><br>
    <input type="radio" name="q<%= q.getId() %>" value="B"> <%= q.getOptionB() %><br>
    <input type="radio" name="q<%= q.getId() %>" value="C"> <%= q.getOptionC() %><br>
    <input type="radio" name="q<%= q.getId() %>" value="D"> <%= q.getOptionD() %><br>
    <br>
<%
    }
%>

<button type="submit">Submit Quiz</button>
</form>

</body>
</html>
