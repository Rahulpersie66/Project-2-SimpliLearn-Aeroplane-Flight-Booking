<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Welcome to book the Flight </h2>
<h4>Fill the Personal Details:</h4>
<body>
<form action="ShowConfirmBooking.jsp" method="post">
<table>
<tr><td>Enter name: </td><td><input type="text" name="name"/></td></tr>
<tr><td>Enter email: </td><td><input type="text" name="email"/></td></tr>
<tr><td>Enter username: </td><td><input type="text" name="uname"/></td></tr>
<tr><td>Enter age: </td><td><input type="number" name="age" min="10" /></td></tr>
<tr><td>Enter Adhaar: </td><td><input type="number" name="adhaar"/></td></tr>
<tr><td>Enter address: </td><td><input type="text" name="address"/></td></tr>
<tr><td>Enter phone number: </td><td><input type="number" name="phn"/></td></tr>
<tr><td><input type="submit" value="Go to Next"/></td></tr>
</table>
</form>

</body>
</html>