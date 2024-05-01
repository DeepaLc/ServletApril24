package examApril28;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calculatorSer")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
	        try (PrintWriter out = response.getWriter()) {
	           
	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Servlet Calculator</title>");            
	            out.println("</head>");
	            out.println("<body>");
	          
	            double n1=Double.parseDouble(request.getParameter("txtN1"));
	            double n2=Double.parseDouble(request.getParameter("txtN2"));
	            double result=0;
	            String opr=request.getParameter("opr");
	            if(opr.equals("+")) result=n1+n2;
	            
	            if(opr.equals("-")) result=n1-n2;
	            if(opr.equals("*")) result=n1*n2;
	            if(opr.equals("/")) result=n1/n2;
	            out.println("<h1> Result="+result+"</h1>");
	            out.println("</body>");
	            out.println("</html>");
	        }catch(Exception e ) {
	        	

	        }
	    }
	
}
	
