<%@page import="web.jsp.project.DataDTO"%>
<%@page import="web.jsp.project.DataDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정페이지</title>
<%
	request.setCharacterEncoding("UTF-8");
	String id = null;
	Cookie[] coo = request.getCookies();
	if(coo!=null){
		for(Cookie c : coo){
			if(c.getName().equals("cookieId")){
				id = c.getValue();				
			}
		}
	}
	else{
		response.sendRedirect("dataAll.jsp");
	}
	DataDAO dao = new DataDAO();
	DataDTO dto = dao.getInfo(id);
	
%>
</head>
<body>
	<h3>회원 수정</h3>
	<form action="changeInfoPro.jsp" method="post">
		<table>
			<tr>
				<td>아이디 :</td>
				<td><%=dto.getId()%></td>
			</tr>
			<tr>
				<td>비밀번호 :</td>
				<td><input type="password" name="pw" value="<%=dto.getPw()%>" /></td>
			</tr>
			<tr>
				<td>이메일 :</td>
				<td><input type="text" name="email" value="<%=dto.getEmail()%>" /></td>
			</tr>			
		</table>
		<input type="submit" value="완료" /> 
		<input type="button" onclick="window.location.href='main.jsp'" value="취소" />


	</form>
</body>
</html>