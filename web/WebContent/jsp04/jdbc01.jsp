<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
//#1 : JDBC 드라이버 로딩
	Class.forName("oracle.jdbc.driver.OracleDriver");
//#2 : Connection 객체 생성
	String user = "git08",pw="git08";
	String url = "jdbc:oracle:thin:@nullmaster.iptime.org:1521:XE";
	// JDBC URL : jdbc:oracle:thin:@[아이피]:[port]:SID
	//	thin, OCI
	//	String url = "jdbc:oracle:thin:서버아이피:1521:XE";

	Connection conn = DriverManager.getConnection(url, user, pw);
//#3 : 쿼리 문 작성, Statement 객체 생성
	String sql = "select * from test01";	// sql 쿼리문 작성
	PreparedStatement pstmt = conn.prepareStatement(sql);	// pstmt에 쿼리문 전달해서 연결
	//PreparedStatement 동적 쿼리, Statement 정적쿼리
//#4 : 쿼리 실행
	ResultSet rs = pstmt.executeQuery();
//#5 : 결과값 사용
	while(rs.next()){
		String id = rs.getString("id");
		String passw = rs.getString("pw");
		int age = rs.getInt("age");
		Timestamp reg = rs.getTimestamp("reg");%>
		id: <%=id %> / pw : <%=passw %>/ age : <%=age %>/ reg: <%=reg %><br/>
	<% 	}
//#6 : Statement, ResultSet 등 사용한 객체 종료
	rs.close();
	pstmt.close();
//#7 : 커넥션 종료
	conn.close();
%>
</body>
</html>