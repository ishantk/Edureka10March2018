<%@page import="co.edureka.db.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>
</head>
<body>
	
	<%
		
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		

		User user = new User(1, name, password, email);
		
		if(email.isEmpty()){
			response.sendRedirect("https://www.google.co.in");
			return;
		}
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		int i = helper.registerUser(user);
		if(i>0){
			
			// Session Tracking
			
			//1. Cookies
			/*Cookie ck1 = new Cookie("keyName",name);
			Cookie ck2 = new Cookie("keyEmail",email);
			
			response.addCookie(ck1);
			response.addCookie(ck2);*/
			
			//2. HttpSession
			session.setAttribute("keyName", name);
			session.setAttribute("keyEmail", email);
			
			//3. Page Context
			pageContext.setAttribute("keyName", name, PageContext.SESSION_SCOPE);
			//pageContext.setAttribute("keyName", name, PageContext.APPLICATION_SCOPE);
			
	%>			
		<h3>User Registered Successfully !!</h3>	
		<a href="welcome.jsp">Enter Home</a>
		<br/>
	<%		
		}else{
	%>		
		<h3>User Registration Failed !!</h3>		
	<%	
		}
	
	%>
	
	<%-- <h3>Name is: <%= name %></h3>
	<h3>Email is: <%= email %></h3>
	<h3>Password is: <%= password %></h3> --%>
	
</body>
</html>