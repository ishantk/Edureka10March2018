<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<%@ page errorPage="error.jsp" %>
<%@ page isThreadSafe="true" %> 

<%@ include file="header.jsp" %> 



  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	<b>This is HTML in JSP</b>
	<br/>
	
	<!-- <h3>Scriptlet Demo</h3> -->
	
	<%
		int a = 10;
		int b = 20;
		int c = a+b;
		out.print("c is: "+c);
		
		out.print("<br/>");
		int num = 5;
		out.print("<br/>Table of "+num+"<br/>");
		
		for(int i=1;i<=10;i++){
			out.print(num+" "+i+"'s are "+(num*i)+"<br/>");
		}
	%>
	
	<h3>Value of pi is: <%  out.print(pi); %></h3>
	
	
	<h3>Value of a is: <%  out.print(a); %></h3>
	
	<!-- <h3>Declarative Demo</h3> -->
	<%!
		double pi = 3.14;
			
		int squareOfNum(int num){
			return num*num;
		}
	%>
	
	<h3>Square of 7 is: <%  out.print(squareOfNum(7)); %></h3>
	<h3>Square of 9 is: <%= squareOfNum(9) %> </h3>
	
	<%
		int[] arr = {10,20,30,40,50};
		//try{
			out.print("arr[2] is: "+arr[2]);
		//}catch(Exception e){
		//	out.print("Some Exception: "+e);
		//}
	%>
	<br/>
	JSTL Demo
	<br/>
	<b>
	<c:forEach var="num" begin="1" end="10">
		  <c:out value="${ num }"/> <br/>
	</c:forEach>
	</b>
	
	<c:set var="age" value="20"/>
	Age is: <c:out value="${age}"/>
	
</body>
</html>