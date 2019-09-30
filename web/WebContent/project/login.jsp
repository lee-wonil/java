<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 페이지</h3>
	<div>
	<form action="loginPro.jsp" method="post">
		아이디<br>
		<input type="text" name = "id"/><br/>
		비밀번호<br>
		<input type="password" name ="pw"/><br>
		<input type ="submit" value="로그인" />
		<input type ="button" onclick="window.location.href='signupForm.jsp'" value = "회원가입"/>
	</form>	
	
	</div>
	
</body>
</html>