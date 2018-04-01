package co.edureka.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(urlPatterns = { "/LoginFilter" })
public class LoginFilter implements Filter {

    
	public void destroy() {
		System.out.println("--filter destroy executed--");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		/*
		// Pre Processing
		System.out.println("--doFilter before executed--");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		// Post Processing
		System.out.println("--doFilter after executed--");
		*/
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(email.isEmpty() && password.isEmpty()){
			out.print("Please Enter Correct Details First !! Email or Password Empty!!");
		}else{
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("--filter init executed--");
	}

}
