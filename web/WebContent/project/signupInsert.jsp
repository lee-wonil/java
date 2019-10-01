<%@page import="web.jsp.project.DataDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료 페이지</title>
</head>

<%
request.setCharacterEncoding("UTF-8"); 
%>
<jsp:useBean id="info" class="web.jsp.project.DataDTO"></jsp:useBean>
<jsp:setProperty property="*" name="info"/>
<%
	DataDAO dao = new DataDAO();
	dao.insert(info);
%>

<body>
<h2>가입완료</h2>	
<jsp:include page="login.jsp">
<jsp:param value="<%=info.getId() %>" name="id"/>
</jsp:include>
</body>
</html>