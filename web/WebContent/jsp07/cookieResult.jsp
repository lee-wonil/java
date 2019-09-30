<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키결과</title>
</head>
<%
	Cookie[] cookie = request.getCookies();
	if (cookie != null) {
		for (Cookie c : cookie) {
			out.print(c.getName() + "=" + URLDecoder.decode(c.getValue(), "UTF-8") + "<br/>");
		}
	}
	/*	
	id=java
	name=피카츄
	JSESSIONID=F0CA98AB9715519AD878F868E8B152BE
		: 톰캣 컨테이너에서 세션을 유지하기 위해 발급하는 키
		   상태 저장을 위해 톰캣은 JSESSIONID 쿠키를 클라이언트에게 발급해주고
		   이 값을 통해 톰캣 세션을 유지할 수 있도록 한다.		
	*/
%>
<body>

</body>
</html>