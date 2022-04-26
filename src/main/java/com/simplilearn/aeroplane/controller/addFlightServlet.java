package com.simplilearn.aeroplane.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.aeroplane.dao.AeroplaneDaoImpl;
import com.simplilearn.aeroplane.dto.TravelData;

@WebServlet("/addFlightServlet")
public class addFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		writer.println("Welcome to add Flight servlet details");
		String airline=request.getParameter("airline");
		String dateOfTravel=request.getParameter("dateOfTravel");
		String source=request.getParameter("source");
		String destination=request.getParameter("destination");
		int noOfPerson=Integer.parseInt(request.getParameter("noOfPerson"));
		double costPerPerson=Double.parseDouble(request.getParameter("costPerPerson"));
		
		TravelData travelData=new TravelData(airline,dateOfTravel,source,destination,noOfPerson,costPerPerson);
		
		AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
		int id=dao.addTravelData(travelData);
		if(id>0)
		{	
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("ReAddFlight.jsp");
			requestDispatcher.forward(request, response);
		}
		else
		{
			writer.println("not added!!!");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
