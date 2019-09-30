<%@page import="web.jsp.project.DataDTO"%>
<%@page import="web.jsp.project.DataDAO"%>
<%@page import="web.jsp.project.ArticleDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>
<%
	Cookie[] coo = request.getCookies();
	String id = null;
	for(Cookie c : coo){
		if(c.getName().equals("cookieId")){
			id=c.getValue();			
		}		
	}
	DataDAO dao = new DataDAO();
	DataDTO dto = dao.getInfo(id);
%>

<body>
<form action="createArticlePro.jsp" method="post">
제목 : <br/>
<input type="text" name = "title" /> <br/>
본문 : <br/>
<textarea rows="20" cols="30" name="body"></textarea><br/>
<input type="submit" value="저장">
<input type="reset" value="초기화">
</form>



</body>
</html>