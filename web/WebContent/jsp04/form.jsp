<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h2>회원가입</h2>
	<form action="insert.jsp" method="post">
		id : <input type="text" name="id">
		pw : <input type="password" name="pw">
		age : <input type="text" name="age">
		<input type="submit" value="가입">
	</form>
</body>
</html>