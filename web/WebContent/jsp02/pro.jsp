<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Pro page</h2>
	<%
		//post 방식 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String pw = request.getParameter("pw");
		//String pet =request.getParameter("pet");
		String [] pets = request.getParameterValues("pet");
		out.println("id :"+id+"<br/>");
		out.println("pw :"+pw+"<br/>");
		if(pets!=null){
			for(int i=0;i<pets.length;i++){
				out.println("pet :" + pets[i]+"<br/>");
			}
		}
	
	%>
	<table>
		<tr>
			<td>id</td>
			<td><%=id %></td>
		</tr>
		<tr>
			<td>pw</td>
			<td><%=pw %></td>
		</tr>
		<tr>
			<td>pet</td>
			<td><input type="checkbox" name="pet" value="dog"
			<% if(pets!=null){for(String s:pets){if(s.equals("dog")){%>checked<%}}}%>> 강아지
			 <input type="checkbox" name="pet" value="cat"
			 <% if(pets!=null){for(String s:pets){if(s.equals("cat")){%>checked<%}}}%>> 고양이 
			 <input	type="checkbox" name="pet" value="tiger"> 호랑이</td>
		</tr>



	</table>
</body>
</html>