<%@page import="com.simplilearn.aeroplane.dto.TravelData"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% Set<TravelData> confirmData=(Set<TravelData>)session.getAttribute("BookData");
	int nop=(int)session.getAttribute("seatRequired");
	if(nop==0|| confirmData.equals(null))
		throw new RuntimeException("Wrong exception");
	for(TravelData data:confirmData)
	{%>
	<h2>Booking for flight:-</h2></br>
You are booking for the flight with Flight: <b><i><%=data.getAirlines() %></i></b> and Flight Id: <b><i><%=data.getId() %></i></b></br>
<body>
<h4>Details of Flights:</h4>
<b>Flight Id </b>: <%=data.getId() %></br>
<b>Airline     </b>    :<%=data.getAirlines() %></br>
<b>Date of Flight</b>  : <%=data.getDateOfTravel() %></br>
<b>Flight from   </b>  : <%=data.getSource() %></br>
<b>Flight to    </b>   : <%=data.getDestination() %></br>
<b>Total seats booking:</b> <%=nop %></br>
<b>Total Amount : <i><%=data.getCostPerPerson()*nop %></i></b>

<%} %>
<%HttpSession ses=request.getSession(); 
String name=request.getParameter("name");
long  adhaar=Long.parseLong(request.getParameter("adhaar"));
long  phone=Long.parseLong(request.getParameter("phn"));
String address=request.getParameter("address");
String email=request.getParameter("email");
String uname=request.getParameter("uname");
int age=Integer.parseInt(request.getParameter("age"));
ses.setAttribute("name",name);
ses.setAttribute("adhaar", adhaar);
ses.setAttribute("phone", phone);
ses.setAttribute("address", address);
ses.setAttribute("email", email);
ses.setAttribute("uname", uname);
ses.setAttribute("age",age);%>

<form action="goToPayment.jsp" method="post">
</br>
<input type="submit" value="GO To Payment"/>
</form>
</body>
</html>