
<%@ page import="java.util.ArrayList"%>
<html>
<body>
<h2><%= "Hello World!" %></h2>

<h3>current time:<%=new java.util.Date() %></h3>


<%! 
public int add() {
	int a=5;
	int b=7;
	return a+b;
}
%>


<%out.println(add());%>
<% 	ArrayList alist=new ArrayList();
	alist.add(56);
	alist.add("ashwini");
	out.println(alist);

%>

<%@ include file="welcome.jsp" %>
</body>
</html>
