package com.simplilearn.aeroplane.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.aeroplane.dao.AeroplaneDaoImpl;
import com.simplilearn.aeroplane.dto.TravelData;


@WebServlet("/HomepageServlet")
public class HomepageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date=request.getParameter("dateOfTravel");
		String source=request.getParameter("source");
		String destination=request.getParameter("destination");
		int noOfPerson=Integer.parseInt(request.getParameter("noOfPerson"));
		
		PrintWriter writer=response.getWriter();

		AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
		Set<TravelData> allData;
		allData=dao.getAllTravelDetails(date, source, destination);
		HttpSession session=request.getSession();
		
		session.setAttribute("seatRequired", noOfPerson);
		int seatsAvail=dao.getAvailableSeatsFlight(date, source, destination);
		
		//No of  person
		Set<TravelData> seats;
		seats=dao.getAvailableSeats(date, source, destination);
		if(seats.size()>0)
			session.setAttribute("seatsAvailable", seats);
		else
			{session.setAttribute("msg1", "No seats available");
			RequestDispatcher dis=request.getRequestDispatcher("RightDetailBookFlight.jsp");
			dis.forward(request, response);
			}
		if(allData.size()>0)
		{
			session.setAttribute("travelDetails", allData);
			
		}
		else
		{
			session.setAttribute("msg", "No Filght there for this date.");
			RequestDispatcher dis=request.getRequestDispatcher("RightDetailBookFlight.jsp");
			dis.forward(request, response);
			
		}
		
		
		if(noOfPerson<=seatsAvail)		
			{	RequestDispatcher dis=request.getRequestDispatcher("ShowFlight.jsp");
				dis.forward(request, response);
				//writer.println("Number of Person:"+noOfPerson);
			}
		else 
		{
			RequestDispatcher dis=request.getRequestDispatcher("BookFlightSeatsCorrect.jsp");
			dis.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
