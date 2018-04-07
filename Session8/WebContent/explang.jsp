<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Expression Language</title>
</head>
<body>

	<jsp:include page="header.jsp"/>
	

	<h3>Name is: ${param.txtName}</h3>
	<h3>Email is: ${param.txtEmail}</h3>
	<h3>Password is: ${param.txtPassword}</h3>

	<%-- <jsp:forward page="welcome.jsp"/> --%>
	
	<br/>
	Java Object Usage
	<br/>
	
	<%
		User user = new User();
		user.setName("John");
		user.setEmail("john@example.com");
		user.setPassword("password123");
	%>
	
	<h3>User's Name is: <%= user.getName()%></h3>
	
	
	<br/>
	Java Object Usage with Action Tags
	<br/>
	
	<jsp:useBean id="uRef" class="co.edureka.model.User"/>
	<jsp:setProperty property="name" name="uRef" value="Fionna"/>
	<jsp:setProperty property="email" name="uRef" value="fionna@example.com"/>
	<jsp:setProperty property="password" name="uRef" value="Fionna123"/>
	
	<h3>User's Name is: <jsp:getProperty property="name" name="uRef"/></h3>
	
</body>
</html>