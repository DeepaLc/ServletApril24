package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session4
 */
@WebServlet("/session4")
public class Session4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session4() {
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
		pw.println("<marquee>Session4 Servlet</marquee>");
		
		
		
		session.invalidate();
//		pw.println("Input from first page : "+session.getAttribute("userName"));
		pw.println("<a href='Session2' > Go to Session2 java</a>");
		pw.println("</body></html>");
		
	}

}
