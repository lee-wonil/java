<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Param 01 page</h1>
	<jsp:include page="param02.jsp" flush="false">
		<jsp:param value="<%=new java.util.Date()%>" name="date"/>
	</jsp:include>
</body>
</html>