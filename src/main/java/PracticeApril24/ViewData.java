package PracticeApril24;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewData
 */
@WebServlet("/ViewData")
public class ViewData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<br><hr><br><table><thead><th> S.No</th><th>Name</th><th>Email</th><th>Gender</th><th>City</th><th>Action</th></thead>");
		out.println("<tbody>");

		// DB Connection
		String url = "jdbc:mysql://localhost:3306/assignment";
		String userName = "root";
		String passWord = "D2023@khatri#";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, userName, passWord);

			PreparedStatement ps = con.prepareStatement("select * from register");
			int count =1;
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>");				
				out.println(count++);
				out.println("</td>");
				out.println("<td>");				
				out.println(rs.getString("name"));
				out.println("</td>");
				out.println("<td>");				
				out.println(rs.getString("email"));
				out.println("</td>");
				out.println("<td>");				
				out.println(rs.getString("gender"));
				out.println("</td>");
				out.println("<td>");				
				out.println(rs.getString("city"));
				out.println("</td>");
				out.print("<td><a href='delete?email=");
				out.print(rs.getString("email"));
				out.print("'> Delete </a>");				
				
				out.println("</td>");
				out.println("</tr>");
			}
		} catch (Exception e) {

		}
		out.println("</tbody></table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
