package com.simplilearn.aeroplane.controller;

import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.aeroplane.dao.AeroplaneDaoImpl;
import com.simplilearn.aeroplane.dto.SeatBooked;
import com.simplilearn.aeroplane.dto.TravelData;

@WebServlet("/paymentSuccesfulServlet")
public class paymentSuccesfulServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int nop=(int)session.getAttribute("seatRequired");
		int seatsLeft=0;
		int Aid=0;String Airlines=null;String dot=null;String dest=null;String src=null;double tcost=0.0;
		Set<TravelData> detailsForBooking=(Set<TravelData>)session.getAttribute("BookData");
		for(TravelData data:detailsForBooking)
		{
			Aid=data.getId();
			Airlines=data.getAirlines();
			dot=data.getDateOfTravel();
			dest=data.getDestination();
			src=data.getSource();
			tcost=data.getCostPerPerson()*nop;
			
		}
		String name=null;String email=null;long phone=0;long adhaar=0;String address=null;String uname=null;int age=10;
		name=(String)session.getAttribute("name");
		email=(String)session.getAttribute("email");
		phone=(long)session.getAttribute("phone");
		adhaar=(long)session.getAttribute("adhaar");
		address=(String)session.getAttribute("address");
		uname=(String)session.getAttribute("uname");
		age=(int)session.getAttribute("age");
		AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
		seatsLeft=dao.getAvailableSeatsFlight(dot, src, dest);
		seatsLeft-=nop;
		
		SeatBooked seatBooked=new SeatBooked(name,uname,age,email,address,phone,Airlines,Aid,dot,src,dest,tcost,adhaar);
		int bid=dao.addSeatBookedData(seatBooked);
		
		if(bid>0)
		{	dao.updateSeats(Aid, seatsLeft);
		
			Set<TravelData> allData;
			allData=dao.getAllTravelConfirmDetails(Aid);
			session.setAttribute("details", allData);
			
			RequestDispatcher dis=request.getRequestDispatcher("paymentSuccessful.jsp");
			dis.forward(request, response);
		}
		
		else		
		{
			RequestDispatcher dis=request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
		}
		System.out.println("i am here");
		System.out.println(seatsLeft);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
