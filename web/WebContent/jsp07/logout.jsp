<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<%
	// 로그아웃 == 쿠키삭제
	// 전체 쿠키 가져와서
	Cookie [] coo = request.getCookies();
	for(Cookie c : coo){
		// cookId라는 이름의 쿠키가 있을 경우
		if(c.getName().equals("cookieId")){
			// 쿠키삭제 : 유효시간 0으로 바꿔서, response에 적용
			c.setMaxAge(0);
			response.addCookie(c);
		}
		if(c.getName().equals("cookiePw")){
			c.setMaxAge(0);
			response.addCookie(c);
		}
	}
	response.sendRedirect("main.jsp");
	
	
%>
<body>

</body>
</html>