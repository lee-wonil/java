<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료 페이지</title>
</head>

<%
request.setCharacterEncoding("UTF-8"); 
%>
<jsp:useBean id="info" class="web.jsp03.test.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="info"/>
<%
String hobby[]= info.getHobby();
String hobbys="";
if(hobby!=null){
	for(int i=0;i<hobby.length;i++){
		hobbys+=hobby[i]+" ";
	}
}
Class.forName("oracle.jdbc.driver.OracleDriver");

String user = "git08",password = "git08";
String url ="jdbc:oracle:thin:@nullmaster.iptime.org:1521:XE";
Connection conn = DriverManager.getConnection(url, user, password);
String sql = "insert into data values(?,?,?,?,?,?,?,?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, info.getId());
pstmt.setString(2, info.getPw());
pstmt.setString(3, info.getName());
pstmt.setString(4, info.getEmail());
pstmt.setString(5, info.getJob());
pstmt.setString(6, info.getGender());
pstmt.setString(7, hobbys);
pstmt.setString(8, info.getIntroduce());


pstmt.executeUpdate();
pstmt.close();
conn.close();
%>
<body>
<h2>가입완료</h2>	
</body>
</html>