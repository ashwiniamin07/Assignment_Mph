<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Calculator</h1>
	<form action="calc.jsp">
		<label>FirstNum:</label>
		<input type="text" name="num1">
		<label>SecondNum:</label>
		<input type="text" name="num2">
		<input type=radio name="op" value="+">+
		<input type=radio name="op" value="-">-
		<input type=radio name="op" value="*">*
		<input type=radio name="op" value="/">/
		
		<input type="submit" value="submit">
	</form>
</body>
</html>