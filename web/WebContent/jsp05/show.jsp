<%@page import="web.jsp05.model.TestDTO"%>
<%@page import="java.util.List"%>
<%@page import="web.jsp05.model.TestDAO1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체회원 출력 페이지</title>
</head>
<body>
<%
	TestDAO1 dao = new TestDAO1();
	List list = dao.selectAll(); %>
	<table>
		<thead>
			<tr>
				<td>id</td>
				<td>pw</td>
				<td>age</td>
				<td>reg</td>				
			</tr>
		</thead>
		<% for(int i=0;i<list.size();i++){
		TestDTO dto = (TestDTO)list.get(i);%>
		<tr>
			<td><%=dto.getId()%> </td>
			<td><%=dto.getPw()%> </td>
			<td><%=dto.getAge()%> </td>
			<td><%=dto.getReg()%> </td>
		</tr>
		<% }

%>
	</table>
	
	
	
	
</body>
</html>