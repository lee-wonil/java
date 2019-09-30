<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입완료페이지</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script>
	
</script>
<style>
table {
	width: 500px;
}
</style>
</head>
<%
	request.setCharacterEncoding("UTF-8");
	String[] hobby = request.getParameterValues("hobby");
%>
<body>
	<div class="container">
		<form action="#">
			<h2>Pro Page</h2>
			<table>
				<tr>
					<td>아이디</td>
					<td><%=request.getParameter("id")%></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><%=request.getParameter("pw")%></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><%=request.getParameter("name")%></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><%=request.getParameter("email")%></td>
				</tr>
				<tr>
					<td>성별</td>
					<td><%=request.getParameter("gender")%></td>
				</tr>
				<tr>
					<td>직업</td>
					<td><%=request.getParameter("job")%></td>
				</tr>
				<tr>
					<td>취미</td>
					<td>
						<%
							for (int i = 0; i < hobby.length; i++) {
								out.println(hobby[i] + " ");
							}
						%>
					</td>
				</tr>
				<tr>
					<td>자기소개글</td>
					<td><textarea><%=request.getParameter("introduce")%></textarea></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>