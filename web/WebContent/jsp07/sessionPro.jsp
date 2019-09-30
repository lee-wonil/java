<%@page import="web.jsp07.model.TestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session Pro</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");

// id pw 체크
TestDAO dao = new TestDAO();
boolean result = dao.loginCheck(id, pw);
if(result){	// 로그인 성공
	// 로그인 세션만들기
	session.setAttribute("sid", id);
	session.setAttribute("spw", pw);
	response.sendRedirect("sessionMain.jsp");
	
%>
	<h2>로그인 완료</h2>
<%}else{%>
	<script>
		alert("id,pw 불일치 다시 시도하세요");
		history.go(-1);
	</script>
<% }%>
</body>
</html>