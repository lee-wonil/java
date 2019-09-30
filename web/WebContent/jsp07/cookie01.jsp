<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<%
	// 쿠키 객체 설정
	Cookie cookie = new Cookie("id","java");
	// 유효 기간 설정
	cookie.setMaxAge(60);
	// 클라이언트에게 쿠키 전달
	response.addCookie(cookie);
	Cookie coo = new Cookie("name",URLEncoder.encode("피카츄","utf-8"));
	coo.setMaxAge(60);
	response.addCookie(coo);


%>

<%=cookie.getName() %> / <%=cookie.getValue() %>

<body>

</body>
</html>