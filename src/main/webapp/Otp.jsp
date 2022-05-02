<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Otp generation</title>
</head>
<body>
<h2>Hello an OTP for payment is send on the number 7**6**709.Please enter the OTP for booking the Flight at AEROSPACE.</h2>
<form action="paymentSuccesfulServlet" method="post">
Enter OTP: <input type="number" name="otp"/></br>
</br>
<input type="submit" value="Ok"/>
</form>
</body>
</html>