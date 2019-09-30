<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	//로그인 확인

	String id = (String)session.getAttribute("sid");
	String pw = (String)session.getAttribute("spw");
	
	// 
	Enumeration enu = session.getAttributeNames();
	while(enu.hasMoreElements()){
		String name = enu.nextElement().toString();//String 으로 발로 변환해서 대입 시킨다.
		String value = session.getAttribute(name).toString();
		out.println(name+" = "+ value);
	}
	
	if(id!=null){ // 로그인 된 상태%>
		
		



<body>
	<h1> 메인 페이지 </h1>
	<h3><%=id %>님 환영합니다.</h3>
	<button onclick = "window.location.href='sessionLogout.jsp'">로그아웃</button>
<% }
	else{
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	%>		
	<h4>로그인을 원하시면 아래 '로그인 버튼을 눌러주세요'</h4>
	<button onclick = "window.location.href='sessionForm.jsp'">로그인</button>
	<%} %>
	
</body>
</html>