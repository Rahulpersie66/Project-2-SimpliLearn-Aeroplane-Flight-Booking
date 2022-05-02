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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		String n_user,n_pass;
		PrintWriter writer=response.getWriter();
		AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
		dao.getUserPass(username, password);
		n_user=dao.getUser();
		n_pass=dao.getPassword();
		if(username.equals("admin")&&password.equals("admin123"))
		{
			writer.println("You're welcome ADMIN..go to admin page ");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("AdminWork.jsp");
			requestDispatcher.forward(request, response);
		}
			else if(dao.checkAlreadyRegistered(username, password))
		{
			writer.println("Register user booking section");
			writer.println("Book a FLIGHT!!");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("BookFlight.jsp");
			requestDispatcher.forward(request, response);
		}
		else
			{
				writer.println("Go to Register page newspage");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("ReRegister.jsp");
				requestDispatcher.forward(request, response);
			}
		writer.println("user is "+n_user+" Password "+n_pass);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
