<%@page import="web.jsp05.model.TestDTO"%>
<%@page import="java.util.List"%>
<%@page import="web.jsp05.model.TestDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	TestDAO dao = new TestDAO();
	List list = dao.selectAll();
	for(int i=0;i<list.size();i++){
		TestDTO dto = (TestDTO)list.get(i);%>
		<%=dto.getId() %> / <%=dto.getPw() %> / <%=dto.getAge() %> / <%=dto.getReg() %> <br/>
	<% }


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>