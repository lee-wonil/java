<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BBBBBB</h1>
	<%
		System.out.println("BBBBB");
		
		//response.sendRedirect("c.jsp");
	
	
	%>
	<%-- 	 <jsp:forward page="c.jsp"/> 파라미터 없이 보낼 경우에 홑태그로 보내서 사용한다  --%>
	 <jsp:forward page="c.jsp">
	 	<jsp:param value="testID" name="ID"/>
	 </jsp:forward>
	<%-- 파라미터 있이 보낼경우 쌍태그를 사용해서 보낸다.   --%>
</body>
</html>