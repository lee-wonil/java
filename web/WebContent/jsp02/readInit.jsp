<%@page import = "java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>초기화 파라미터 목록</h2>
	<%
		Enumeration <String> initParams = application.getInitParameterNames();
		while(initParams.hasMoreElements()){
			String paramName= initParams.nextElement();
			%>
			
			<%= paramName%><br/>
			 <%=application.getInitParameter(paramName)%>	<br/>
			 <%=application.getServerInfo() %>		 
		<% }%>
	
	
</body>
</html>