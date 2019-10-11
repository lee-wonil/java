<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String[] values = request.getParameterValues("test");
	String rol = request.getParameter("row");
	String col = request.getParameter("col");
	int[] a = new int[values.length];
	ArrayList<Integer> listX = new ArrayList<>();
	ArrayList<Integer> listY = new ArrayList<>();
	for (int i = 0; i < values.length; i++) {
		a[i] = Integer.parseInt(values[i]);
		if (a[i] % 100 == 0) {
			listX.add(a[i]/100);
		} else {
			listY.add(a[i]);
		}
	}
	Iterator<Integer> itx = listX.iterator();
	Iterator<Integer> ity= listY.iterator();
	int col1=Integer.parseInt(col);
	int rol1=Integer.parseInt(rol);
	int i=0;
	int j=0;
	int x=0;
	int y=0;
	if(itx.hasNext()){
		x=itx.next();
	}
	if(ity.hasNext()){
		y=ity.next();
	}
	
	%>
<table>
	<% for(i=1;i<=col1;i++){%>
	<tr>
		<%if(x==i){
			for(j=1;j<=rol1;j++){%>
		<td>X</td>
		<%}
			if(itx.hasNext())
				x=itx.next();
		}
		else{
			for(j=1;j<=rol1;j++){
				if(y==j){%>
					<td>X</td>
					<% 
					if(ity.hasNext()){
						y=ity.next();
					}
					else{
						ity=listY.iterator();
						y=ity.next();
					}
				}else{%>
				<td>O</td>
				<%}
			}
		}%>
	</tr>
	<%}%>
</table>


