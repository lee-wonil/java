<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료 페이지</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	<jsp:useBean id="info" class="web.jsp03.test.MemberDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="info" />	
	<% if(!info.cheaknull()){
		response.sendRedirect("signupForm.jsp");
	}%>
	<table>
	<tr><td>아이디 : <jsp:getProperty property="id" name="info" /></td></tr>
	<tr><td>비밀번호 : <jsp:getProperty property="pw" name="info" /></td></tr>
	<tr><td>이름 : <jsp:getProperty property="name" name="info" /></td></tr>
	
	<tr><td>이메일 : <jsp:getProperty property="email" name="info" /></td></tr>
	<tr><td>성별 : <jsp:getProperty property="gender" name="info" /></td></tr>
	<tr><td>직업 : <jsp:getProperty property="job" name="info" /></td></tr>
	<tr><td>취미 : 
	<% String hobby[] = info.getHobby();
		if(hobby!=null){
		for(int i=0;i<hobby.length;i++){
			out.print(hobby[i]+" ");
		}}%> 
	</td></tr>
	<tr><td>자기소개 :<jsp:getProperty property="introduce" name="info" />
	</td></tr>
	</table>
</body>
</html>