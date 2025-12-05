<html>
<body>
<h2><%= "Async Demo" %></h2>

<form>
	UserName=:<input id="uname" type="text" name="uname">
	password:<input id="pwd" type="password" name="pwd">
	<button type="button" onclick="login(event)">Login</button>
</form>

<div id="output">

</div>
<script type="text/javascript">
async function login(event){
	let username=document.getElementById("uname").value;
	let password=document.getElementById("pwd").value;
	
	let resp=await fetch("AsyncServlet",{
		method:"POST",
		headers:{"Content-Type":"application/x-www-form-urlencoded"},
		body:"uname=" + username +  "&pwd="+password
	});
	
	document.getElementById("output").innerHTML=await resp.text();
}

</script>









</body>
</html>
