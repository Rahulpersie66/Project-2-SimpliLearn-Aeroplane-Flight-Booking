<%@page import="java.util.LinkedHashSet"%>
<%@page import="com.simplilearn.aeroplane.dto.TravelData"%>
<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.aeroplane.dao.AeroplaneDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add flight here to database</title>
</head>
<h2>Flight details add here:</h2>
<h3>Here to enter:</h3>
<body>
<form action="addFlightServlet" method="post">
	Enter Airline:<input type="text" name="airline"/></br>
	Date of travel:<input type="date" name=dateOfTravel min="2022-04-25"/></br>
	Source:<input type="text" name="source"/></br>
	Destination:<input type="text" name="destination"/></br>
	Number of person:<input type="number" name="noOfPerson" min="1"/></br>
	Cost per Person:<input type="number" name="costPerPerson" min="2000" max="1000000"/></br></br>
	<input type="submit" formaction="addFlightServlet" value="Flight Add"/>
</form>
</br>
<table border="1" padding="7">
<tr><th>Flight ID</th><th>Airline</th><th>Date of Travel</th><th>Source</th><th>Destination</th><th>Seats Availabe</th><th>Cost per Seat</th></tr>
<%AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
 Set<TravelData> allDetails=dao.getAllFlight();
	for(TravelData detail:allDetails)	
{%>
<tr><td><%=detail.getId() %></td><td><%=detail.getAirlines() %></td><td><%=detail.getDateOfTravel() %></td><td><%=detail.getSource() %></td><td><%=detail.getDestination() %></td><td><%=detail.getNoOfPerson() %></td><td><%=detail.getCostPerPerson() %></td></tr>
<%} %>
</table>
</body>
</html>