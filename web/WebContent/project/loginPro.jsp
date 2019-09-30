<%@page import="web.jsp.project.DataDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>login 페이지</h3>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		DataDAO dao = new DataDAO();
		if(dao.login(id, pw)){
			Cookie coid = new Cookie("cookieId",id);
			Cookie copw = new Cookie("cookiePw",pw);
			coid.setMaxAge(60*60*24);
			copw.setMaxAge(60*60*24);
			response.addCookie(coid);
			response.addCookie(copw);
			response.sendRedirect("main.jsp");
		}
		else{%>
			<script>
				alert("로그인 정보를 확인하세요");
				history.go(-1);
			</script>
		<%}
		
	
	%>
</body>
</html>