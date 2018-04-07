<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>  
<%@ page errorPage="error.jsp" %>   
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	
	<%
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print("<b>"+ck.getName()+" - "+ck.getValue()+"<br/></b>");
		}*/
		
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		
		String name1 = (String)pageContext.getAttribute("keyName",PageContext.SESSION_SCOPE);
	
	%>
	
	<h3>Welcome Dear <%= name %></h3>
	Its <%= new Date() %>

</body>
</html>