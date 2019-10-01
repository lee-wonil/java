<%@page import="web.jsp.project.ArticleDTO"%>
<%@page import="web.jsp.project.ArticleDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 상세 조회</title>
</head>
<body>
<%
	ArticleDAO dao = new ArticleDAO();
	String id = request.getParameter("id");
	ArticleDTO dto = dao.getArticle(id);


%>
<table>
	<tr>
		<td>제목</td>
		<td><%=dto.getTitle() %></td>
	</tr>
	<tr>
		<td>작성id</td>
		<td><%=dto.getUserid() %></td>
	</tr>
	<tr>
		<td>작성일</td>
		<td><%=dto.getAdate() %></td>		
	</tr>
	<tr>
		<td>본문</td>
		<td><%=dto.getBody() %></td>
	</tr>


</table>

</body>
</html>