<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<h1>Main 페이지</h1>
	<%
		Cookie[] co = request.getCookies();
		String cookieId = null, cookiePw = null;
		if (co != null) {
			for (Cookie c : co) {
				//out.println(c.getName() + " = " +c.getValue() );
				// 쿠키 저장소에서 꺼내온 모든 쿠키중에서		
				if (c.getName().equals("cookieId")) { // cookieId라고 이름붙힌 쿠키라면
					cookieId = c.getValue(); // 그 값을 변수에 저장
				}
				if (c.getName().equals("cookiePw")) {
					cookiePw = c.getValue();
				}
				//---> 쿠키에서 id, pw 꺼내서 변수에 담는 일을 함
			}
			// id pw 있는지 확인 --> 로그인 상태인지		

		}
		if (cookieId != null) {
	%>
	<h2><%=cookieId%>님 로그인 환영합니다.
	</h2>
	<button onclick="window.location.href='logout.jsp'">로그아웃</button>

	<%
		} else {
	%>
	<h3>로그인을 원하시면 버튼을 눌러주세요</h3>
	<button onclick="window.location.href='form.jsp'">로그인</button>
	<%
		}
	%>


</body>
</html>