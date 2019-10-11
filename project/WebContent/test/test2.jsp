<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h2>통로설정</h2>
<form action="test3.jsp">
<table>
	<%
	String rol= request.getParameter("low");
	String col = request.getParameter("col");
	int rol1 = Integer.parseInt(rol);
	int col1 = Integer.parseInt(col);
	int i=0;
	int j=0;
	for(i=0;i<=col1;i++){%>
	<tr>
		<%for(j=0;j<=rol1;j++){
			if(j==0&&i==0){%>
			<td></td>
			<% }else if(j==0||i==0){%>
			<td><input type="checkbox" name="test"value="<%=i*100+j%>"></td>
			<%}
			else{%>
			<td>O</td>
			<%}
		}%>
	</tr>
	<%}%>
</table>
<input type="hidden" name="col" value="<%=col%>"/>
<input type="hidden" name="row" value="<%=rol%>"/>
<input type="submit" value="전송">
</form>