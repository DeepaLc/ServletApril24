package com.Assignment;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class RegistrationClass
 */
@WebServlet("/registrationClass")
public class RegistrationClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationClass() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uNmae= request.getParameter("userName");
		String password = request.getParameter("password");
		String address=request.getParameter("Address");
		String country = request.getParameter("Country");
		String email = request.getParameter("Email");
		
		//DB Connection
		
		 String url = "jdbc:mysql://localhost:3306/assignment";
	     String userName = "root";
	     String passWord = "D2023@khatri#";
	     
	     try {
	            //load and register the driver for mysql
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            //Creating connection with database
	            Connection connection = DriverManager.getConnection(url, userName, passWord);
	            System.out.println("connection successful....");
	            Statement statement = connection.createStatement();
	            String query1 ="insert into registration values ('"+userName+"', '"+password+"', '"+address+"','"+country+"', '"+email+"')";

	            
	            
	            
	            
	}catch(Exception e) {
		System.err.println(e.getMessage());
		
	}
	}
}
