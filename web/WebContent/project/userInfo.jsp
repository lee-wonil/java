<%@page import="web.jsp.project.DataDTO"%>
<%@page import="web.jsp.project.DataDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie coo[] = request.getCookies();
		String id = null;
		if (coo != null) {
			for (Cookie c : coo) {
				if (c.getName().equals("cookieId")) {
					id = c.getValue();
				}
			}
		} else {
	%>
	<script>
		alert("로그인이 필요합니다.");
		window.location.href = "login.jsp";
	</script>
	<%
		}
		DataDAO dao = new DataDAO();
		DataDTO dto = dao.getInfo(id);
	%>
	<div class=container>
		<table>
			<tr>
				<td>아이디 : <%=dto.getId()%>
			</tr>
			<tr>
				<td>이메일 : <%=dto.getEmail()%>
			</tr>
			<tr>
				<td>이름 : <%=dto.getName()%>
			</tr>
			<tr>
				<td>직업 : <%=dto.getJob()%>
			</tr>
			<tr>
				<td>성별 : <%=dto.getGender()%>
			</tr>
		</table>
		<button onclick="window.location.href='changeInfo.jsp'">회원정보 수정</button>
		<button onclick="window.location.href='main.jsp'">메인페이지로</button>
	</div>

</body>
</html>