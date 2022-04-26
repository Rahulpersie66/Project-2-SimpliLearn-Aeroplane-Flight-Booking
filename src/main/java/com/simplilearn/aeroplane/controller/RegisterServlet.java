package com.simplilearn.aeroplane.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.aeroplane.dao.AeroplaneDaoImpl;
import com.simplilearn.aeroplane.dto.RegisterUser;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("sname");
		String name=fname+" "+lname;
		int age=Integer.parseInt(request.getParameter("age"));
		String rpassword=request.getParameter("password");
		String cpassword=request.getParameter("cpassword");
		String password="";
		RequestDispatcher requestDispatcher;
		AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
//		RegisterUser n_user=new RegisterUser(fname,lname,name,age,rpassword);
//		DaoImpl dao=new DaoImpl();
//		Integer seqNo=dao.addRegisteredUser(n_user);
		
//		PrintWriter writer=response.getWriter();
//		if(seqNo>0)
//			writer.println("data enetered");
//		else
//			writer.println("no user added to record at the database");
		
		boolean isUsernameUsed=dao.checkUsernameAvailable(username);
		if(isUsernameUsed)
		{
			requestDispatcher=request.getRequestDispatcher("UsernameUsed.jsp");
			requestDispatcher.forward(request, response);
					
			
		}
		else {
		if(rpassword.equals(cpassword))
			{
				password+=rpassword;
				RegisterUser n_user=new RegisterUser(username,fname,lname,name,age,password);
				
				Integer seqNo=dao.addRegisteredUser(n_user);
				
				if(seqNo>0) 
				{
				requestDispatcher=	request.getRequestDispatcher("login.jsp");
				requestDispatcher.forward(request, response);
				}
				else
				{
					requestDispatcher=request.getRequestDispatcher("Register.jsp");
					requestDispatcher.forward(request, response);
					System.out.println("password missmatch");
				}
			}
		else
			{requestDispatcher=request.getRequestDispatcher("passwordMismatch.jsp");
				requestDispatcher.forward(request, response);
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
