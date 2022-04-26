<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to password cahnge section</title>
</head>
<h2>Change the password of the user:</h2>
<body>
<form action="changePasswordServlet" method="post">
	Enter username of the user : <input type="text" name="uname"/>
	Enter New password to set : <input type="text" name="password"/>
	<input type="submit" value="Change password"/>
</form>
</body>
</html>