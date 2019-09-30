<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>time Maker</title>
</head>
<%
// 객체 생성
	Calendar cal = Calendar.getInstance();
// request를  사용해 객체 전달
	request.setAttribute("time", cal);

%>

<body>
	<jsp:forward page="timeViewer.jsp"></jsp:forward>
</body>
</html>