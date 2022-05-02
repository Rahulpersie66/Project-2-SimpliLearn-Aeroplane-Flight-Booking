<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Search Homepage</h2>
<h3><i>Travel Details</i></h3>
<body>
<form action="HomepageServlet" method="post">
	Date of travel:<input type="date" name=dateOfTravel min="2022-04-25"/>
	Source:<input type="text" name="source"/>
	Destination:<input type="text" name="destination"/>
	Number of person:<input type="number" name="noOfPerson" min="1"/>
	</br></br>
	<input type="submit" value="Book Flight"/>
	
</form>
</body>
</html>