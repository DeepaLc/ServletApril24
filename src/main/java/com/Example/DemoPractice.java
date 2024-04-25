package com.Example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class DemoPractice
 */
@WebServlet("/demoPractice")
public class DemoPractice extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public DemoPractice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		System.out.println("Sign Up fields");
//		
	       response.setContentType("text/html");
			
			PrintWriter writer = response.getWriter();
			
			writer.println("Hello World .............. !");
			writer.println("This is generic Servlet ........");
			
			writer.close();
	}

}
