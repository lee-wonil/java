<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입 완료 페이지</title>
</head>
<%
	// 회원가입 ---> DB에 회원 정보 저장
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	int age = Integer.parseInt(request.getParameter("age"));
	
	//#1. 드라이버 로딩
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//#2. 커넥션 객체 생성
	String user = "git08",password="git08";
	String url ="jdbc:oracle:thin:@nullmaster.iptime.org:1521:XE";
	Connection conn = DriverManager.getConnection(url, user, password);
	//#3. SQL 작성, PreparedStatement 객체 생성
	//String sql = "insert into test01 value("+id+","+pw+","+age+", sysdate)";// SQL injection
	String sql = "insert into test01 values(?,?,?,sysdate)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	pstmt.setInt(3, age); 	// 물음표 갯수가 다르면 실행 불가	
	//#4. 쿼리 실행
	pstmt.executeUpdate();	// 만약 primarykey가 같은 데이터를 삽입 할 경우에는 500 에러 발생
	//#5.결과(패스)
	//#6.객체 반환
	pstmt.cancel();
	conn.close();


%>


<body>
	<h3>회원가입 완료</h3>
</body>
</html>