<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="database Connectivity"></c:out>
	<sql:setDataSource var="db"
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/mph25"
		user="root"
		password="root@39"
	/>
	
	<sql:query var="rs" dataSource="${db}">
		select * from emptable;
	</sql:query>
	
	<c:forEach var="row" items="${rs.rows}">
		EmployeeId: <c:out value="${row.employeeid}"></c:out><br>
		EmployeeName: <c:out value="${row.empname}"></c:out><br>
		EmployeeMobile: <c:out value="${row.mobile}"></c:out><br>
		EmployeeAddress: <c:out value="${row.address}"></c:out><br>
		EmployeeDeptId: <c:out value="${row.deptid}"></c:out><br>
		EmployeeAge: <c:out value="${row.age}"></c:out><br>
		EmployeeEmail: <c:out value="${row.email}"></c:out><br>
		<br><c:out value="---------------------------------------------"></c:out><br>
	</c:forEach>
	
	<%-- <sql:update var="insert" dataSource="${db}">
	insert into emptable
	(employeeid,empname,mobile,address,deptid,age,email)
	values
	(490,'amrutha','8876543309','chennai',1,40,'amrutha@gmail.com');
	
	</sql:update> --%>
	<sql:update var="update" dataSource="${db}">
	update emptable set empname='swarna' where employeeid=124;
	
	</sql:update>
	<%-- <c:out value="${insert}"></c:out> --%>
	<c:out value="${update}"></c:out>
	
	<sql:update var="delete" dataSource="${db}">
	delete from emptable  where employeeid=678;
	
	</sql:update>
	<c:out value="${delete}"></c:out>
</body>
</html>