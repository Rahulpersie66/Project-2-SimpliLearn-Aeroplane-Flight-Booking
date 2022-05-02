<%@page import="com.simplilearn.aeroplane.dto.TravelData"%>
<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.aeroplane.dao.AeroplaneDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airline list</title>
</head>
<body>
<h2>Here is the list of the Flights:</h2></br>
<table border="1" cellpadding="1"><tr><th><h3><b>Flight name:</b></h3></th></tr>
<%AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
Set<TravelData> allFlights=dao.getAllFlight();
HttpSession ses=request.getSession();
ses.setAttribute("allFlights", allFlights);


for(TravelData flight:allFlights)
{%>
<tr><td> <%=flight.getAirlines() %> </td></tr>
<%} %>
</table>
</br>
<form action="AdminWork.jsp" >
Add Airline name: <input type="text" name="Airline"/></br>
<input type="submit" value="Add"/>
<input type="submit" formaction="AdminWork.jsp" value="Back"/>
</form>

</body>
</html>