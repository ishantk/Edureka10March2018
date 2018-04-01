package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/HomeServlet", "/Home", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//String email = request.getParameter("txtEmail");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		/*String email = "";
		
		Cookie[] ckArr = request.getCookies();
		
		for(Cookie ck : ckArr){
			
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
			
			if(ck.getName().equals("keyEmail")){
				email = ck.getValue();
			}
		}*/
		
		
		
		/*String email = request.getParameter("email");
		String name = request.getParameter("name");
		String age = request.getParameter("age");*/
		
		HttpSession session = request.getSession();
		
		String email = (String)session.getAttribute("keyEmail");
		String name = (String)session.getAttribute("keyName");
		Integer age = (Integer)session.getAttribute("keyAge");
		
		out.print(name+" - "+age+"<br/>");
	
		//session.invalidate(); | Kind of Logout
		
		
		out.print("Welcome Home, "+email+"<br/>Today is: "+new Date()); // Response from HomeServlet
		
	}

}
