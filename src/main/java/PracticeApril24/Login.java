package PracticeApril24;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/loginForm")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String myemail = request.getParameter("email1");
		String mypass = request.getParameter("pass1");
		
		//DB Connection
		 String url = "jdbc:mysql://localhost:3306/assignment";
	     String userName = "root";
	     String passWord = "D2023@khatri#";
		
		try {
			  //load and register the driver for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, userName, passWord);
            
            PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
            ps.setString(1, myemail);
            ps.setString(2, mypass);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
            	
            	HttpSession session = request.getSession();
            	session.setAttribute("session_name", rs.getString("name"));
            	response.sendRedirect("ViewData");
            	
//            	RequestDispatcher rd = request.getRequestDispatcher("/profile.html");
//            	rd.include(request, response);
            	
            	
            }else {
            	out.print("<h3 style='color:red'> Email id and password didn't matched </h3>");
            	
            	RequestDispatcher rd = request.getRequestDispatcher("/LoginP.html");
            	rd.include(request, response);
            }
			
		}catch(Exception e) {
			e.printStackTrace();
			
        	out.print("<h3> style='color:red'> "+e.getMessage()+" </h3>");
        	
        	RequestDispatcher rd = request.getRequestDispatcher("/LoginP.html");
        	rd.include(request, response);
		}
		
	}

}
