<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>time Viewer</title>
</head>
<%
	Calendar cal =(Calendar)request.getAttribute("time");

%>
<body>
	현재 시간 : <%=cal.get(Calendar.HOUR) %> 시
			<%=cal.get(Calendar.MINUTE) %> 분
			<%=cal.get(Calendar.SECOND) %>초
</body>
</html>