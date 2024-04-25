package com.Exam21.file;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Exam21.Employee;

/**
 * Servlet implementation class LoginExamServlet
 */
@WebServlet("/loginExamServlet")
public class LoginExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginExamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uName= request.getParameter("userName");
		String password= request.getParameter("password");
		System.out.println(uName+" "+password);
		
		
		
		//get all the data from file
		
		ArrayList<Employee> empList = ReadFileData.readFile();
		
		//validate input data(uName + Pass)from file
		Employee emp = empList.get(0); // select * from emp where email ='' and password =''
		if(uName.equals(emp.getEmail())&& password.equals(emp.getPassword())) {
			System.out.println("Valid details go to welcome page..");
			response.sendRedirect("Welcome1.html");
		}else {
			System.out.println("Invalid details go to welcome page..");
			response.sendRedirect("Error.html");
		}
		
		
	}

}
