package com.Practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoDispatcher
 */
@WebServlet("/demoDispatcher")
public class DemoDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoDispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("I am get Method.....");
    	
    }
    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String myEmail = request.getParameter("email");
	       String myPass = request.getParameter("pass1");
	       System.out.println(myEmail);
	       if(myEmail.equals("deepa@gmail.com")&& myPass.equals("deepa123")) {
	    	RequestDispatcher requestDispatcher =   request.getRequestDispatcher("Welcome.html");
	    	requestDispatcher.forward(request, response);
	    	   
	       }else {
	    	 RequestDispatcher a =  request.getRequestDispatcher("Error.html");
	    	 a.forward(request, response);
	       } 
	}
}
