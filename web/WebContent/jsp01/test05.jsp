<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int count = 0;
	int a =10;
	int b =20;
	int c = 30;		

%>
count : <%= ++count%> <br/>
date : <%= new java.util.Date()%><br/>
total : <%= a+b+c %>

<%-- JSP주석   --%>

<!-- HTML 주석   -->