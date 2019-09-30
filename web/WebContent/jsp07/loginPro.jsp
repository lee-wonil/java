<%@page import="web.jsp07.model.TestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	TestDAO dao = new TestDAO();
	boolean result = dao.loginCheck(id, pw);
	if(result){ 
		Cookie c1 = new Cookie("cookieId",id);
		Cookie c2 = new Cookie("cookiePw",pw);
		c1.setMaxAge(60*60*24);
		c2.setMaxAge(60*60*24);
		response.addCookie(c1);
		response.addCookie(c2);
		response.sendRedirect("main.jsp");
	 }
	else{ %>
		<script>
		alert("로그인 실패");
		history.go(-1);
		</script>
	<%} 
	// DB 접속해서 id pw 맞는지 확인
	
	// id, pw 일치하면 로그인 잘됐다~~
	// 일치하지 않으면 메세지 확인 ~ 메세지 띄워주고 form으로 돌아가기.




%>
</body>
</html>