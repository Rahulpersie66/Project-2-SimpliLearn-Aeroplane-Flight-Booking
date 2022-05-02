<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome Admin:</h1>
<h3>Your functions are:</h3>
<body>
<table border="1" cellpadding="1">
<form action="AddFlight.jsp" method="post">
<tr><td>Add details of the Flight</td><td> <input type="submit" value="Add flight"/></td></tr>
<tr><td>Change password of any user </td><td><input type="submit" formaction="ChangePassword.jsp" value="Lets change"/></td></tr>
<tr><td>Master List of Airlines</td><td><input type="submit" formaction="Airlineslist.jsp" value="Airline list"/></td></tr>
<tr><td>Master List of Source & Destinations</td><td><input type="submit" formaction="Source&Dest.jsp" value="Source & Dest"/></td></tr>
</table></br>
Logout from admin <input type="submit" formaction="login.jsp" value="Logout"/>
</form>

</body>
</html>