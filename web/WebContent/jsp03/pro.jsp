<%@page import="web.jsp03.test.FormVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pro page</title>
</head>
<body>
<%
	/*
	// #1. 자바 형태
	// 파라미터 꺼내기 전에 인코딩 처리(post방식)
	request.setCharacterEncoding("UTF-8");

	// 넘어오는 파라미터의 값은 모두 String 타입으로 넘어온다.
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	FormVO vo = new FormVO();
	vo.setId(id);
	vo.setPw(pw);
	vo.setName(name);
	vo.setAge(age);	
	*/
%>
<%--#2. 액션태그 사용 --%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="vo" class="web.jsp03.test.FormVO"/>
<%--VO를 이용한 값 대입 --%>
<%--<jsp:setProperty property="id" name="vo"/>
<jsp:setProperty property="pw" name="vo"/>
<jsp:setProperty property="name" name="vo"/>
<jsp:setProperty property="age" name="vo"/>

 --%>
<jsp:setProperty property="*" name="vo"/>
id : <jsp:getProperty property="id" name="vo"/>
pw : <jsp:getProperty property="pw" name="vo"/>
age : <jsp:getProperty property="age" name="vo"/>
name : <jsp:getProperty property="name" name="vo"/>
</body>
</html>