package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session3
 */
@WebServlet("/session3")
public class Session3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		pw.println("<html><body>");
		pw.println("<head><title>JAVA class </title></head>");
		pw.println("<body bgcolor='green'>");
		pw.println("<marquee>Session3 Servlet</marquee>");
		pw.println("<br> Current time :- "+LocalDateTime.now().toString());
		pw.println("Input from first page : "+session.getAttribute("userName"));
		pw.println("<a href='Session4' > Logout now </a>");
		pw.println("<a href='Session2' > Logout now </a>");
		pw.println("</body></html>");
		
		
	}

}
