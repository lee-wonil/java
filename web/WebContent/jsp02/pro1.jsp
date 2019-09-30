<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	//get : IE 한글보냈을때, 400 에러
	//Invalid character found in the request target. 
	//The valid characters are defined in RFC 7230 and RFC 3986
	request.setCharacterEncoding("UTF-8");
	String username = request.getParameter("username");
	String pw = request.getParameter("pw");
	String test = request.getParameter("test");
%>
<body>
	UserName = <%=username %>
	password = <%=pw %>
	test= <%=test %> 
</body>
</html>