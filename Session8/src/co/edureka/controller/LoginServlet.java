package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("--doGet Executed--");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		System.out.println("--doPost Executed--");
		
		// Reading the data from client request
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		String name = "John Watson";
		int age = 30;
		
		// send back the response to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
				
		// sending response back as a html
		
		if(email.equals("admin@example.com") && password.equals("password123")){
			
			// Session Tracking
			// 1. Cookies
			
			/*Cookie ck1 = new Cookie("keyEmail", email);
			Cookie ck2 = new Cookie("keyName", name);
			Cookie ck3 = new Cookie("keyAge", String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);*/
			
			
			//out.print("<html><body>");
			//out.print("<h3>Login Success</h3>");
			//out.print("<a href='Welcome'>Enter Home</a>");
			
			//2. URL ReWriting | Append the data in the URL the way get method did
			//out.print("<a href='Welcome?email="+email+"&name="+name+"&age="+age+"'>Enter Home</a>");
			//out.print("</body></html>");
			// Response from LoginServlet
			
			
			//3. Hidden Form Fields
			/*String htmlResponse = "<html><body>"
					+ "<form action='Welcome' method='post'>"
					+ "<input type='hidden' name='email' value='"+email+"'/>"
					+ "<input type='hidden' name='name' value='"+name+"'/>"
					+ "<input type='hidden' name='age' value='"+age+"'/>"
					+ "<input type='submit' value='Enter Home'/>"
					+ "</body></html>";
			
			out.print(htmlResponse);*/
			
			//4. HttpSession
			
			HttpSession session = request.getSession();
			session.setAttribute("keyEmail", email);
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age);
			
			out.print("<html><body>");
			out.print("<h3>Login Success</h3>");
			out.print("<a href='Welcome'>Enter Home</a>");
			out.print("</body></html>");
			//RequestDispatcher dispatcher = request.getRequestDispatcher("Welcome"); // URL Pattern of Servlet
			//dispatcher.forward(request, response);
			
		}else{
			out.print("<html><body><h3>Login Failure</h3></body></html>");
			
			//RequestDispatcher dispatcher = request.getRequestDispatcher("login.html"); 
			//dispatcher.include(request, response);
			
			//response.sendRedirect("https://google.co.in");
		}
		
				
	}

}
