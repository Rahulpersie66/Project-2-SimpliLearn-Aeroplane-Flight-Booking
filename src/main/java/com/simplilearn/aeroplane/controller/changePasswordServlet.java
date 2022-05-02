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

@WebServlet("/changePasswordServlet")
public class changePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("Welcome to Change password of user");
		
		String username=request.getParameter("uname");
		String n_password=request.getParameter("password");
		
		AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
		dao.getUserPass(username, n_password);
		dao.updatePasswordAdmin(username, n_password);
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("ReChangePassword.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
