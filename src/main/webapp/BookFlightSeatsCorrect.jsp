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
<%Set<TravelData> seats=(Set<TravelData>)session.getAttribute("seatsAvailable");
for (TravelData seat:seats){%>
<h1>Your required seats are not avaiable in this flight.</h1>
<h3>You can book maximum <%=
							seat.getNoOfPerson()	%><% } %> seats of this flight.</h3>
<%@ include file="BookFlight.jsp" %>
<body>

</body>
</html>