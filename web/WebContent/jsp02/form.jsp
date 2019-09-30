<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form page</title>
</head>
<body>
	<form action="pro.jsp" method="POST">
		id : <input type="text" name="id"><br> 
		pw : <input	type="password" name="pw"><br> 
		좋아하는 동물 : <input type="checkbox" name="pet" value="dog"> 강아지 
		<input type="checkbox" name="pet" value="cat"> 고양이 
		<input type="checkbox" name="pet" value="tiger"> 호랑이 
		<input type="submit" value="전송">
	</form>
</body>
</html>