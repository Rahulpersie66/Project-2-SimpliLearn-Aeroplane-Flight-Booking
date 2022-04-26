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


@WebServlet("/PersonalDetailsBookingServlet")
public class PersonalDetailsBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("print_id"));
		PrintWriter writer=response.getWriter();
		AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
		Set<TravelData> confirmData=dao.getConfirmDetails(id);
		
		HttpSession session=request.getSession();
		session.setAttribute("BookData", confirmData);
		
		RequestDispatcher dis=request.getRequestDispatcher("PersonalDetailsBooking.jsp");
		dis.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
