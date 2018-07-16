package edureka;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Form4
 */
@WebServlet("/Form4")
public class Form4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		out.println("<body bgcolor=cyan>");
		
		/*out.println("T1-"+request.getParameter("t1")+"<br>");
		out.println("T2-"+request.getParameter("t2")+"<br>");
		out.println("T3-"+request.getParameter("t3")+"<br>");
		out.println("T4-"+request.getParameter("t4")+"<br>");
		out.println("T5-"+request.getParameter("t5")+"<br>");*/
		
		/*Cookie[] cookies=request.getCookies();
		for(Cookie cookie:cookies) {
			String cname=cookie.getName();
			String  cval=cookie.getValue();
			out.println(cname+" - "+cval+"<br>");
		
		
		}	*/
		
		Enumeration<String> names=session.getAttributeNames();
		while(names.hasMoreElements()) {
			String name=names.nextElement();
			String value=session.getAttribute(name).toString();
			out.println(name+" - "+value+"<br>");
		}
		
		out.println("T6-"+request.getParameter("t6")+"<br>");
		
		out.println("</html>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
