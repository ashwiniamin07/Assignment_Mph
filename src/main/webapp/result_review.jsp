<%@ page import="java.util.*, com.mph.model.Question" %>
<%
    List<Question> questions = (List<Question>) request.getAttribute("questions");
    Map<Integer,String> userAnswers = (Map<Integer,String>) request.getAttribute("userAnswers");
    Integer score = (Integer) request.getAttribute("score");
%>
<html>
<head><link rel="stylesheet" href="css/styles.css"></head>
<body>
<h2>Your Score: <%= score %> / <%= (questions != null ? questions.size() : 0) %></h2>

<% for (Question q : questions) { 
       String userAns = userAnswers.get(q.getId());
       String correct = q.getCorrectAns();
%>
    <div class="quiz-option">
        <p><b><%= q.getQuestion() %></b></p>
        <p>A. <%= q.getOptionA() %> 
            <% if ("A".equalsIgnoreCase(correct)) { %>
                <span style="color:green">(Correct)</span>
            <% } %>
            <% if ("A".equalsIgnoreCase(userAns) && !"A".equalsIgnoreCase(correct)) { %>
                <span style="color:red">(Your answer)</span>
            <% } %>
        </p>
        <p>B. <%= q.getOptionB() %> 
            <% if ("B".equalsIgnoreCase(correct)) { %>
                <span style="color:green">(Correct)</span>
            <% } %>
            <% if ("B".equalsIgnoreCase(userAns) && !"B".equalsIgnoreCase(correct)) { %>
                <span style="color:red">(Your answer)</span>
            <% } %>
        </p>
        <p>C. <%= q.getOptionC() %> ...</p>
        <p>D. <%= q.getOptionD() %> ...</p>
    </div>
<% } %>

<a href="dashboard.jsp">Go to Dashboard</a>
</body>
</html>
