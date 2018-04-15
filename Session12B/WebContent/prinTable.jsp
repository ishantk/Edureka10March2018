<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String number = request.getParameter("number");
	int num = 0;
	
	try{
		num = Integer.parseInt(number);
		
		for(int i=1;i<=10;i++){
			out.print(num+" "+i+"'s are "+(num*i)+"<br/>");
		}
		
	}catch(Exception e){
		out.print("Please Enter Correct Data...");
	}
	
	// JDBC or Hibernate and do filteration in DB
	// nm -> comes from the request 
	// Select * from TableName where name like nm%
	// response will be sent back to the client

%>