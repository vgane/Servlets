package edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Form3
 */
@WebServlet("/Form3")
public class Form3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		/*using hidden fields
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3"); 
		*/
		
		String s4=request.getParameter("t4");
		String s5=request.getParameter("t5");
		
		/*
		Cookie c1 =new Cookie("exp",s4);
		Cookie c2 =new Cookie("lang",s5);
		
		c1.setMaxAge(60*60*24*180);
		
		response.addCookie(c1);
		response.addCookie(c2);
		*/
		
		HttpSession session=request.getSession();
		session.setAttribute("exp", s4);
		session.setAttribute("lang", s5);
		
		out.println("<body bgcolor=cyan>");
		out.println("<form action=Form4> <h2>");
		
		out.println("Expected salary<input type=text name=t6 size=30><br>");
		
		/*out.println("<input type=hidden name=t1 value=\"" +s1+"\">");
		out.println("<input type=hidden name=t2 value=\"" +s2+"\">");
		out.println("<input type=hidden name=t3 value=\"" +s3+"\">"); */
		
		out.println("<input type=hidden name=t4 value=\"" +s4+"\">");
		out.println("<input type=hidden name=t5 value=\"" +s5+"\">");
		
		out.println("<input type=submit value=SUBMIT>");
		out.println("</form></html>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
