<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<nav>
		<%
			Cookie[] coo = request.getCookies();
			String id = null;
			for (Cookie c : coo) {
				if (c.getName().equals("cookieId")) {
					id = c.getValue();
				}
			}
			if (id != null) {
		%>
		<div align="right">
			<%=id%>님 환영합니다.
			<button onclick="location.href='logout.jsp'">로그아웃</button>
			<button onclick="location.href='userInfo.jsp'">회원정보 수정</button>
		</div>

		<%
			} else {
		%>
		<div align="right">
			<button onclick="location.href='login.jsp'">로그인</button>
		</div>
		<%
			}
		%>

	</nav>
</body>
</html>