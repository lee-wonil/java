<%@page import="web.jsp.project.ArticleDTO"%>
<%@page import="java.util.List"%>
<%@page import="web.jsp.project.ArticleDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<%

	ArticleDAO dao = new ArticleDAO();
	List list = dao.selectAll();


%>
<body>
	<div class="container">
		<h2>게시판</h2>
		<table class="table table-striped">
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
			</tr>			
			<%
			for(int i=0;i<list.size();i++){
				ArticleDTO dto=(ArticleDTO)list.get(i);	%>
			<tr>
					<td><%=dto.getId() %></td>
					<td><%=dto.getTitle() %></td>
					<td><%=dto.getUserid() %></td>
					<td><%=dto.getAdate() %></td>
			</tr>
			<%}%>	
			
		</table>
		<button onclick ="window.location.href='createArticle.jsp'">작성하기</button>
	</div>
</body>
</html>