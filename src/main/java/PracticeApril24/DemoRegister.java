package PracticeApril24;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoRegister
 */
@WebServlet("/registerForm")
public class DemoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
	String myname =	request.getParameter("name1");
	String myemail =	request.getParameter("email1");
	String mypass =	request.getParameter("pass1");
	String mygender =	request.getParameter("gender1");	
	String mycity =	request.getParameter("city1");
	
	//DB Connection
	
	String url = "jdbc:mysql://localhost:3306/assignment";
    String userName = "root";
    String passWord = "D2023@khatri#";
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, passWord);
		
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, myname);
		ps.setString(2, myemail);
		ps.setString(3, mypass);
		ps.setString(4, mygender);
		ps.setString(5, mycity);
		
		int count = ps.executeUpdate();
		if(count > 0) {
			response.setContentType("text/html");
			out.print("<h3 style='color:green'> User Register Successfully </h3>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/Register.html");
			rd.include(request, response);
			
			
		}else {
			response.setContentType("text/html");
			out.print("<h3 style='color:red'> User not Register due to some error </h3>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/Register.html");
			rd.include(request, response);
			
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		response.setContentType("text/html");
		out.print("<h3 style='color:red'> User not Register due to some error </h3>");
		
		RequestDispatcher rd = request.getRequestDispatcher("/Register.html");
		rd.include(request, response);
	}
	
	}
}
