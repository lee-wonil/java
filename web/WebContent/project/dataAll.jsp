<%@page import="web.jsp.project.DataDTO"%>
<%@page import="java.util.List"%>
<%@page import="web.jsp.project.DataDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script> 
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>데이터 전체 조회</title>
</head>
<body>
<table class="table table-bordered table-condensed">
<thead>
	<tr>
		<td>id</td>
		<td>PW</td>
		<td>name</td>
		<td>email</td>
		<td>Gender</td>
		<td>Job</td>
		<td>hobby</td>
		<td>introduce</td>
	</tr>


</thead>
<%
	String id = request.getParameter("id");
	DataDAO dao = new DataDAO();
	List list = dao.selectAll();
	
	for(int i=0;i<list.size();i++){
		DataDTO dto= (DataDTO)list.get(i);
	
		if(dto.getId().equals(id)){%>
			<tr class = "bg-info">
		<%}
		else{%>
			<tr>
		<%} %>		
		
			<td><%=dto.getId() %></td>
			<td><%=dto.getPw() %></td>
			<td><%=dto.getName() %></td>
			<td><%=dto.getEmail() %></td>
			<td><%=dto.getGender() %></td>
			<td><%=dto.getJob() %></td>
			<td><%
			String [] hobbys=dto.getHobby();
			if(hobbys!=null){
			for(int j=0;j<hobbys.length;j++){%>
				<%=hobbys[j] %>
			<%}
			}
			
			 %></td>
			<td><%=dto.getIntroduce() %></td>
			<td><button onclick="window.location.href='changeInfo.jsp?id=<%=dto.getId()%>'">개인정보 수정</button></td>
		</tr>	
					
		
	<% }


%>
</table>
</body>
</html>