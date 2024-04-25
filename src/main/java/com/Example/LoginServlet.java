package com.Example;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
  //      System.out.println("Do post called");
		
//		ServletConfig servletConfig = getServletConfig();
//		String filePath = servletConfig.getInitParameter("filePath");
//		System.out.println("filePath "+filePath);
//		
//		String count = servletConfig.getInitParameter("count");
//		System.out.println("count "+count);
//		
//		ServletContext servletContext= servletConfig.getServletContext();
//		String dbURL= servletContext.getInitParameter("dbUrl");
//		System.out.println(" dbURL  "+dbURL);
		
		String uName= request.getParameter("userName");
	    String password = request.getParameter("password");
	    RequestDispatcher reqDspWel=request.getRequestDispatcher("Welcome.html");
	    RequestDispatcher reqDspLogin=request.getRequestDispatcher("Error.html");
	    if("JAVA".equals(uName) && "JAVA1234".equals(password)) {
	      System.out.println("LOGIN");
	      reqDspWel.forward(request, response);
	    } else {
	      System.out.println("ERROR");
	      reqDspLogin.forward(request, response);
	//      reqDspLogin.include(request, response);
	    }
		
	}

}
