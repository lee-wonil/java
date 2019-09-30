<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="date" class="java.util.Date" />

	<%
		/*
			Date date1 = (Date)request.getAttribute("date");
			if(date1==null){
				date1= new Date();
				request.setAttribute("date", date1);
			}
			*/
		out.println("오늘 날짜는 :");
	%>
	<%=date%>
</body>
</html>