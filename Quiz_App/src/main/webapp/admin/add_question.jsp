<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.mphasis.model.Question" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Take Quiz</title>
</head>
<body>

<%
 List<Question> questions = (List<Question>) request.getAttribute("questions");
%>

<h2>Quiz</h2>

<form action="${pageContext.request.contextPath}/submitQuiz" method="post">

  <input type="hidden" name="quizId" value="${param.quizId}"/>

  <c:forEach var="q" items="${questions}">
    <div>
      <p><b>${q.question}</b></p>
      <input type="radio" name="q_${q.id}" value="1"/> ${q.option1}<br/>
      <input type="radio" name="q_${q.id}" value="2"/> ${q.option2}<br/>
      <input type="radio" name="q_${q.id}" value="3"/> ${q.option3}<br/>
      <input type="radio" name="q_${q.id}" value="4"/> ${q.option4}<br/>
    </div>
  </c:forEach>

  <button type="submit">Submit</button>

</form>

</body>
</html>