<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>log out</title>
</head>
<%
	// 로그아웃 -> 세션 삭제
	// #1. 해당 세션 삭제
	session.removeAttribute("sid");
	session.removeAttribute("spw");
	
	// #2. 세션 모두 삭제
	session.invalidate();
	
	response.sendRedirect("sessionMain.jsp");
	
%>

<body>

</body>
</html>