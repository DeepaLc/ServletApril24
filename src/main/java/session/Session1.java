package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Session1
 */
@WebServlet("/session1")
public class Session1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("<head><tittle> JAVA Class </tittle></head>");
		pw.println("<body bgcolor='cyan'>");
		pw.println("<marquee>Zorba Java Class</marquee>");
		pw.println("<br> <form method='post'>");
		pw.println("Your Name <input type='text' name='uName'>");
		pw.println("<input type='submit' value='ClickMe'>");
		pw.println("</form>");
		
		pw.println("</body></html>");
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("<head><tittle> JAVA Class </tittle></head>");
		pw.println("<body bgcolor='yellow'>");
		pw.println("<marquee>Welcome to Zorba Java Class</marquee>");
		
		String uName = request.getParameter("uName");
		pw.println("<br> Value retrieve :- "+uName);
		
		
				
		
		
		
		
		
		
		
		
		
	}

}
