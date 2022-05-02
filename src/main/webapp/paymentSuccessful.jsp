<%@page import="com.simplilearn.aeroplane.dto.TravelData"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Cinfirmation successful</title>
</head>

<body>
<h1>Thank you!! For booking flight at Aerospace. Have a delightful journey!!!</h1></br>
<% Set<TravelData> details=(Set<TravelData>)session.getAttribute("details");
	int nop=(int)session.getAttribute("seatRequired");
	for(TravelData detail:details)
	{%>
Your flight with Airline <b><%=detail.getAirlines() %></b> having flight id  <b><i><%=detail.getId() %></i></b> from <b><%=detail.getSource()%></b> to <b><%=detail.getDestination() %></b> on Date : <b><i><%=detail.getDateOfTravel() %></i></b> for <b><%=nop %></b> seat has been SUCCESFULLY BOOKED at Aerospace.
<% } %>
	</br>
	</br>
	<h3>Have a Safe journey!! See u at the other end.</h3>
</body>
</html>