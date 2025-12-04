<html>
<head><title>Student CRUD</title></head>
<body>
<h2>Student Operations</h2>

<form action="StudentServlet" method="get">
    <input type="hidden" name="action" value="create"/>
    ID: <input type="text" name="id" required/>
    Name: <input type="text" name="name" required/>
    Email: <input type="text" name="email" required/>
    <input type="submit" value="Create"/>
</form>


<!-- Read -->
<form action="StudentServlet" method="get">
    <input type="hidden" name="action" value="read"/>
    <input type="submit" value="Read All"/>
</form>

<!-- Update -->
<form action="StudentServlet" method="get">
    <input type="hidden" name="action" value="update"/>
    ID: <input type="text" name="id"/>
    Name: <input type="text" name="name"/>
    Email: <input type="text" name="email"/>
    <input type="submit" value="Update"/>
</form>

<!-- Delete -->
<form action="StudentServlet" method="get">
    <input type="hidden" name="action" value="delete"/>
    ID: <input type="text" name="id"/>
    <input type="submit" value="Delete"/>
</form>

</body>
</html>
