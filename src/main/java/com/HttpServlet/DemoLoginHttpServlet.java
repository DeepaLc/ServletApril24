package com.HttpServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoLoginHttpServlet
 */
@WebServlet("/loginHttpServlet")
public class DemoLoginHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post called");
		
		String email= request.getParameter("Email");
	    String password = request.getParameter("password");
	    System.out.println("email "+email +" password "+password);
	    
	    request.setAttribute("Age","30");
	    request.setAttribute("mobileNumber", "2559688050");
	    request.setAttribute("Name", "Sarina");
	  	
	}

}
