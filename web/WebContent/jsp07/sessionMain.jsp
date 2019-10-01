<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>main page</title>
</head>
<%

	// 로그인 됐는지 확인 (session)
	// 세션 꺼내오기
	String id = (String)session.getAttribute("sid");
	String pw = (String)session.getAttribute("spw");
	
	// 세션 여러개 꺼내기 
	Enumeration enu = session.getAttributeNames();
	while(enu.hasMoreElements()){
		String name = enu.nextElement().toString(); // String 으로 바로 변환해서 대입
		String value = session.getAttribute(name).toString();
		out.println(name + "=" + value);
	}
	
	if(id != null) { // 값이 있으면 -> 로그인된상태
%>
<body>
	<h1> 메인 페이지 </h1>
	<h3> <%=id %>님 환영합니다. </h3>
	<button onclick="window.location.href='sessionLogout.jsp'">로그아웃</button>
	
<%	}else{ 
		// 날짜.시간 꺼내올때 원하는 포맷으로 보여주기 위해
		Date time = new Date();	// Date객체 생성 -> sdf에 인자로 넣어줄 객체 타입
		// 날짜,시간을 우리가 원하는 형태(포맷)로 보여주기위해 사용하는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

%>
	<h4> 로그인을 원하시면 아래 '로그인' 버튼을 눌러주세요. </h4>
	<button onclick="window.location.href='sessionForm.jsp'">로그인</button>
	
	<%--세션 기능 --%> 
	세션 ID : <%= session.getId() %>
	
	<% time.setTime(session.getCreationTime()); // time객체에 세션생성시간 넣어주기%>
	세션 생성기간 : <%= sdf.format(time) %>		<%--포맷에 맞게 출력 --%>
	
	<% time.setTime(session.getLastAccessedTime());%>
	최근 접근시간 : <%= sdf.format(time) %>
	
	
	
	
	
<%	} %>
</body>
</html>