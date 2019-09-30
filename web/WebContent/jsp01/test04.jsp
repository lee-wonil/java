<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--선언부 : 클래스 영역 --%>
<%!
	static int num=5;
	int num2= 10;
	public int mutiply(int a,int b){
		int c = a*b;
		return c;
	}
			
%>

<%--출력문 : 세미콜론 없이 사용--%>
<%= mutiply(20,10) %>
<%--스크립트릿 : 메서드 영역--%>
<%
	for(int i=0;i<num;i++){
		
		out.print("java server pages"+i+"<br/>");
	}
	String col = "red";

%>
<body bgcolor="<%=col %>">
</body>
<%--out.print(); 페이지 안에 출력이 된다  --%>