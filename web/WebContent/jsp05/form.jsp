<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
	function check(){
		var user = eval("document.inputform");
		if(!user.id.value){
			alert("id를 입력하세요");
			return false;
		}
		if(!user.pw.value){
			alert("pw를 입력하세요");
			return false;
		}
		if(!user.age.value){
			alert("age를 입력하세요");
			return false;
		}
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="pro.jsp" name=inputform method="post" onsubmit="return check()">
		id: <input type="text" name="id"/>
		pw: <input type="password" name="pw"/>
		age: <input type ="age" name="age" />
		<input type="submit" value="가입"/>
	
	</form>
	<%--
		1.pro.jsp 페이지에서 회원가입 시키기 ( +버튼만들어서 show.jsp로 가기)
		2.DAO,DTO 사용하여 회원 가입
		3.show.jsp 페이지에 전체 회원 출력해보기
	
	
	 --%>
	
</body>
</html>