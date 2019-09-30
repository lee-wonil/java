<%@page import="java.util.List"%>
<%@page import="web.jsp05.model.TestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//회원 id만 가져오기
	//DB 접근을 위해 DAO 객체 생성
	TestDAO dao = new TestDAO();
	List list = dao.getMemberId();
	for(int i=0;i<list.size();i++){	%>
		<h3><%=list.get(i) %></h3>
		<% 
	}
	
%>

	<h3></h3>	
</body>
</html>