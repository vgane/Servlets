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


@WebServlet("/Form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		
		/*adding cookies
		Cookie c1 =new Cookie("name",s1);
		Cookie c2 =new Cookie("age",s2);
		Cookie c3 =new Cookie("addr",s3);
		
		c1.setMaxAge(60*60*24*180);
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		*/
		
		HttpSession session=request.getSession();
		session.setAttribute("name", s1);
		session.setAttribute("age", s2);
		session.setAttribute("address", s3);
		
		out.println("<body bgcolor=cyan>");
		out.println("<h2>"+session.getId()+" - "+session.isNew()+"</h2><hr>");
		out.println("<form action=Form3> <h2>");
		out.println("Years of experience <input type=text name=t4 size=30><br>");
		out.println("CS languages known <input type=text name=t5 size=30><br>");
	
		
		/*
		 * using hidden fields
		out.println("<input type=hidden name=t1 value=\"" +s1+"\">");
		out.println("<input type=hidden name=t2 value=\"" +s2+"\">");
		out.println("<input type=hidden name=t3 value=\"" +s3+"\">");
		*/
		out.println("<input type=submit value=SUBMIT>");
		out.println("</form></html>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
