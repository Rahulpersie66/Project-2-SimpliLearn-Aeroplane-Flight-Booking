<%@page import="com.simplilearn.aeroplane.dto.TravelData"%>
<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.aeroplane.dao.AeroplaneDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Here is the list of the Source & Destination:</h2></br>
<table border="1" cellpadding="2">
<tr><th><b>Source:</b></th><th><b>Destination:</b></th></tr>
<%AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
Set<TravelData> allFlights=dao.getAllFlight();

for(TravelData flight:allFlights)
{%>
<tr><td> <%=flight.getSource() %> </td><td><%=flight.getDestination() %></td></tr>
<%} %>
</table>
</br>
<form action="AdminWork.jsp" >
Add Source: <input type="text" name="src"/></br>
Add destination:<input type="text" name="dest"/></br>
<input type="submit" value="Add"/>
<input type="submit" formaction="AdminWork.jsp" value="Back"/>
</form>

</body>
</html>