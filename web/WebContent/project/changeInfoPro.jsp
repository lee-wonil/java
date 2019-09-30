<%@page import="web.jsp.project.DataDAO"%>
<%@page import="web.jsp.project.DataDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정 완료 페이지</title>
</head>
<%
	String id = null;
	Cookie [] coo = request.getCookies();
	for(Cookie c : coo){
		if(c.getName().equals("cookieId")){
			id = c.getValue();
		}
	}
	DataDAO dao = new DataDAO();
	DataDTO dto = dao.getInfo(id);
	String email = request.getParameter("email");
	String pw = request.getParameter("pw");
	dto.setEmail(email);
	dto.setPw(pw);
	dao.changeInfo(dto);
	response.sendRedirect("userInfo.jsp");

%>
<body>

</body>
</html>