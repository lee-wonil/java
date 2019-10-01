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
	Cookie[] coo = request.getCookies();
	for(Cookie c : coo){
		if(c.getName().equals("cookieId")){
			c.setMaxAge(0);
			response.addCookie(c);
		}
		if(c.getName().equals("cookiePw")){
			c.setMaxAge(0);
			response.addCookie(c);
		}		
	}
	session.removeAttribute("sid");
	session.removeAttribute("spw");
	session.invalidate();
	response.sendRedirect("main.jsp");


%>
</body>
</html>