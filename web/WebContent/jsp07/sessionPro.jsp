<%@page import="web.jsp07.model.TestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>session pro</title>
</head>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// id, pw 체크
	TestDAO dao = new TestDAO();
	boolean result = dao.loginCheck(id, pw);
	
	if(result){	// 로그인이 잘 된 시점
		//로그인 유지하기 위한 세션만들기
		session.setAttribute("sid", id);
		session.setAttribute("spw", pw);
	
		response.sendRedirect("sessionMain.jsp");
%>
<body>

<% 	}else{	// id,pw 가 일치하지 않을 경우%>
		<script>
			alert("id,pw 불일치. 다시 시도하세요. ");
			history.go(-1);
		</script>
<%	} %>
</body>
</html>