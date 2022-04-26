<%@page import="com.simplilearn.aeroplane.dto.TravelData"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dummy payment</title>
</head>
<body>
<%Set<TravelData> confirmData=(Set<TravelData>)session.getAttribute("BookData");
int nop=(int)session.getAttribute("seatRequired");
for(TravelData data:confirmData)
{ %>
<h2>Payment details</h2>
You have payment of total amount <b><%= data.getCostPerPerson()*nop %></b> for Airline name <b><%=data.getAirlines() %></b> with flight id <b><%=data.getId()  %></b>.
So to proceed payment, enter the debit card information and otp:
<%} %>
<form action="Otp.jsp" method="post">
Card Number:<input type="number" name="CardNumber"/></br>
Name:<input type="text" name="CardName"/></br>
Expiry date:<input type="text" name="ExpiryDate"/></br>
CNN:<input type="number" name="CNN"/></br>
</br>
<input type="submit" value="Generate OTP"/>
</form>
</body>
</html>