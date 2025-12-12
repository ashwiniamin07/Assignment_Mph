<%@ page import="com.mph.model.User" %>
<%
    User u = (User) session.getAttribute("user");
    if (u == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    int quizId = Integer.parseInt(request.getParameter("quizId"));
%>

<html>
<head><title>Add Question</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>

<h2>Add Question to Quiz</h2>

<form action="AddQuestionServlet method="post">

    <input type="hidden" name="quizId" value="<%= quizId %>">

    Question: <input type="text" name="question" required><br><br>

    Option A: <input type="text" name="optionA" required><br><br>
    Option B: <input type="text" name="optionB" required><br><br>
    Option C: <input type="text" name="optionC" required><br><br>
    Option D: <input type="text" name="optionD" required><br><br>

    Correct Answer (A/B/C/D): 
    <input type="text" name="correctAns" maxlength="1" required><br><br>

    <button type="submit">Add Question</button>
</form>

</body>
</html>
