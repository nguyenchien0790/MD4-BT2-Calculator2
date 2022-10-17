<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<br/>
<form action="/result" method="post">
    <input type="number" name="n1">
    <input type="number" name="n2">
    <br>
    <input type="submit" value="Add" name="cal">
    <input type="submit" value="Sub" name="cal">
    <input type="submit" value="Mult" name="cal">
    <input type="submit" value="Div" name="cal">
</form>
<h3>Result: ${cal} : ${rs}</h3>
</body>
</html>