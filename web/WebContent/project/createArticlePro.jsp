<%@page import="web.jsp.project.ArticleDTO"%>
<%@page import="web.jsp.project.ArticleDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성완료</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		Cookie[] coo = request.getCookies();
		String id = null;
		for (Cookie c : coo) {
			if (c.getName().equals("cookieId")) {
				id = c.getValue();
			}
		}
		ArticleDAO dao = new ArticleDAO();
		ArticleDTO dto = new ArticleDTO();
		dto.setUserid(id);
		String body = request.getParameter("body");
		String title = request.getParameter("title");
		dto.setBody(body);
		dto.setTitle(title);
		dao.insertArticle(dto);
		response.sendRedirect("main.jsp");
	%>
</body>
</html>