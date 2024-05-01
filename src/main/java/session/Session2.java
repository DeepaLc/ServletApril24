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
 * Servlet implementation class Session2
 */
@WebServlet("/session2")
public class Session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
      PrintWriter pw = response.getWriter();
		
//		HttpSession session = request.getSession();
//		session.setAttribute("userName", uName);
//		String uName2 = request.getParameter("uName2");
		pw.println("<html><body>");
		pw.println("<head><title>JAVA class </title></head>");
		pw.println("<body bgcolor='magenta'>");
		pw.println("<marquee>Session2 Servlet</marquee>");
		pw.println("<br> Current time :- "+LocalDateTime.now().toString());
//		pw.println("Input from first page : "+session.getAttribute("userName"));
		pw.println("<a href='Session3' > click me for next </a>");
		
		pw.println("</body></html>");
		
	}
	

}
