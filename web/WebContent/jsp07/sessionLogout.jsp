<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>log out</title>
</head>
<body>
<%
	// 로그아웃 -> 세션삭제
	//#1. 해당 세션 삭제
	session.removeAttribute("sid");
	session.removeAttribute("spw");

	session.invalidate();
	response.sendRedirect("sessionMain.jsp");

%>
</body>
</html>