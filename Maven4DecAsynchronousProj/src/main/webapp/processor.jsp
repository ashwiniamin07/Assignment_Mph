<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Async File Processor</title>
</head>
<body>
<h2>Async File Processor</h2>

<form id="processorForm">
    Enter Text: <input type="text" id="text" name="text">
    <button type="button" onclick="processText()">Process</button>
</form>

<div id="output"></div>

<script>
async function processText() {
    let text = document.getElementById("text").value;

    let resp = await fetch("AsyncProcessorServlet", {
        method: "POST",
        headers: { "Content-Type": "application/x-www-form-urlencoded" },
        body: "text=" + text
    });

    let result = await resp.text();
    document.getElementById("output").innerHTML = result;
}
</script>

</body>
</html>
