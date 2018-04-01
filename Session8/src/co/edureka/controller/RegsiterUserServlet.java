package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;

@WebServlet({ "/RegsiterUserServlet", "/Register", "/Awesome" })
public class RegsiterUserServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("--init executed--");
	}

	public void destroy() {
		System.out.println("--destroy executed--");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--service executed--");
	
		User user = new User();
		
		// Reading the data from client request
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// Business Logic
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		helper.registerUser(user);
		helper.closeConnection();
		
		// send back the response to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// sending response back as a text
		out.print("Dear, "+user.name+"!! Registration Successfully Done at: "+new Date());
		
	}

}
