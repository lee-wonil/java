<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 확인</title>
</head>
<body>
	<%
		//post 방식 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String [] hobby = request.getParameterValues("interest");
		String job = request.getParameter("job");
		String cv = request.getParameter("cv");		
	
	%>
	<table>
		<tr>
			<td>id <br/>
			<%=id %>
			</td>
		</tr>
		<tr>
			<td>pw<br/>
			<%=pw %>
			</td>
		</tr>
		<tr>
			<td>name<br/>
			<%=name %>
			</td>
		</tr>
		<tr>
			<td>email<br/>
			<%=email %>
			</td>
		</tr>
		<tr>
			<td>gender<br/>
			<%=gender %>
			</td>
		</tr>
		<tr>
			<td>job<br/>
			<%=job %>
			</td>
		</tr>
		<tr>
			<td>cv<br/>
			<textarea name="cv" cols="20" rows="10"><%=cv %></textarea>			
			</td>			
		</tr>
		<tr>
			<td>취미<br/>
			<% for(int i=0;i<hobby.length;i++){
				out.println(hobby[i]);
			}%>
			</td>
		</tr>




	</table>
</body>
</html>