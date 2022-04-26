<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register the user</title>
</head>
<h1><b>REGISTER USER</b></h1>
<body>

<form action="RegisterServlet" method="post">
<table>
<tr><td>User Name:</td><td><input type="text" name="uname"/></td></tr>
<tr><td>First name:</td><td><input type="text" name="fname"/></td></tr>
<tr><td>Second name:</td><td><input type="text" name="sname"/></td></tr>
<tr><td>Age:</td><td><input type="number" name="age" min="10" max="100"/></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>
<tr><td>Confirm password:</td><td><input type="password" name="cpassword"/></td></tr>
</table>
<input type="submit" value="Registered"/>
</form>

</body>
</html>