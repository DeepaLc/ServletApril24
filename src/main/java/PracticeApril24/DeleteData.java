package PracticeApril24;

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
 * Servlet implementation class DeleteData
 */
@WebServlet("/delete")
public class DeleteData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Find Delete message .....");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		// DB Connection
		String url = "jdbc:mysql://localhost:3306/assignment";
		String userName = "root";
		String passWord = "D2023@khatri#";
		
		String myemail = request.getParameter("email");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, userName, passWord);
			
			String sql ="delete from register where email='" +myemail+ "'";
			Statement stm = con.createStatement();
			stm.execute(sql);
			 
			out.print("Your Requested Data is Deleted...!");
		
			con.close();
			
	
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
