package com.Example;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServletConfig
 */
@WebServlet("/demoServletConfig")
public class DemoServletConfig implements Servlet {
	private static final long serialVersionUID = 1L;
	
	
	ServletConfig config;
	
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletConfig servletConfig = getServletConfig();
		String filepath = servletConfig.getInitParameter("filePath");
		System.out.println("filePath "+filepath);
		
//		ServletContext servletContext= servletConfig.getServletContext();
//		String dbURL= servletContext.getInitParameter("dbUrl");
//		System.out.println(" dbURL  "+dbURL);
		
		
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
       
   
}
