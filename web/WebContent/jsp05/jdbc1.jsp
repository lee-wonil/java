<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커넥션풀</title>
</head>
<body>
<%
	//context.xml에 접근하기 위한 선언
	Context ctx = new InitialContext();		
	// 자바 컴포넌트로 만든 환경 설정 정보만 찾아줌
	Context env = (Context)ctx.lookup("java:comp/env");
	// jdbc/xe라고 이름을 지어준 데이터 소스 찾아줌.
	DataSource ds = (DataSource)env.lookup("jdbc/xe");
	// 찾은 리소스 정보로 커넥션 객체 생성 : DB 연결함
	Connection conn= ds.getConnection();
	String sql = "select * from test01";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs =pstmt.executeQuery();
	while(rs.next()){
		String id = rs.getString("id");
		String pw = rs.getString("pw");
		int age = rs.getInt("age");
		Timestamp reg = rs.getTimestamp("reg");%>
		<%=id%>/<%=pw%>/ <%=age%>/ <%=reg%><br/>
<% 	}
	rs.close();
	pstmt.close();
	conn.close();
%>

</body>
</html>