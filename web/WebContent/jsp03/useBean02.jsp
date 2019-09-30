<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- #1. 객체 생성  --%>
	<jsp:useBean id="person" class="web.jsp03.test.Bean"/>
<%-- #2. 객체 저장  --%>
	<%
		person.setId("test");
		person.setPw("1234");
	%>
<%-- #1. 출력 --%>
	아이디: <%=person.getId() %>
	비밀번호 : <%=person.getPw() %>
</body>
</html>