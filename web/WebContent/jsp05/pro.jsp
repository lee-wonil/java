<%@page import="web.jsp05.model.TestDAO1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료 페이지</title>

</head>

<body>
<h2>회원가입완료</h2>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="dto" class="web.jsp05.model.TestDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%	
	TestDAO1 dao = new TestDAO1();
	if(dao.insertId(dto.getId())&&dto.getId()!=null){
		dao.insertUser(dto);
	}
	else{
		%>
		<script>
			alert("이미 아이디가 중복됩니다.");
			history.go(-1);
		</script>
	<%}
%>
<form action ="show.jsp">
	<input type="submit" value="회원조회"/>

</form>
</body>
</html>