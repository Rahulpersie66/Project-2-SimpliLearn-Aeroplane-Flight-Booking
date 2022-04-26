<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to AeroBooking</title>
</head>
<h1><b>Welcome to AeroBooking</b></h1>
<body>
<form action="LoginServlet" method="post">
Enter username:<input type="text" name="uname"/></br>
Enter password:<input type="password" name="pwd"/></br></br>
<input type="submit" value="Login"/>
<input type="submit" formaction="Register.jsp" value="Register"/>
</form>
</br>

</body>
</html>