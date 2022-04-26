<%@page import="com.simplilearn.aeroplane.dto.TravelData"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1> Available Flights </h1>

</center>
<div align="center">
<table border="1" cellpadding="8">
	<caption><h2>Book now from Aerospace </h2></caption>
	<tr>
		<th>Flight Id</th>
		<th>Airlines name:</th>
		<th>Date of Flight: </th>
		<th>From: </th>
		<th>To: </th>
		<th>Available Seats:</th>
		<th>Ticket price per Person:</th>
		<th>Book Flight</th>
	</tr>
	<% Set<TravelData> allData=(Set<TravelData>)session.getAttribute("travelDetails");
	
	for(TravelData data : allData)
			{	
	%>	
			<tr><td><%=data.getId() %></td>
			<td><%=data.getAirlines() %></td>
			<td><%=data.getDateOfTravel() %></td>
			<td><%=data.getSource() %></td>
			<td><%=data.getDestination() %></td>
			<td><%=data.getNoOfPerson() %></td>
			<td><b><%=data.getCostPerPerson() %></b></td>	
			<td><a href="PersonalDetailsBookingServlet?print_id=<%=data.getId() %>" >Book</a></td></tr>
	<% 
	}
	%>
	

	
	
</table>
</div>
</body>
</html>