package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.User;

@WebServlet({ "/HibernateRegister", "/Hibernate" })
public class HibernateRegister extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Hibernate Code
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction txn = null;
		
		try{
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			 
			session = factory.openSession(); 
			
			session.save(user);
			
			txn = session.beginTransaction();
			
			txn.commit();
			
			out.print("Transaction Committed.. "+user.name+" Registered!!");
			
		}catch(Exception e){
			System.out.println("Some Exception !! "+e);
			txn.rollback();
		}finally {
			session.close();
		}
		
	}

}
