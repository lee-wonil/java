package web.jsp07.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TestDAO {
	private Connection conn=null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private Connection getConnection() throws Exception {
		Context con = new InitialContext();
		Context env = (Context)con.lookup("java:comp/env");
		DataSource ds=(DataSource)env.lookup("jdbc/xe");
		return ds.getConnection();
	}
	public boolean loginCheck(String id,String pw) {
		boolean result = false;
		try {
		conn=getConnection();
		pstmt = conn.prepareStatement("select * from test01 where id=? and pw=?");
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		rs = pstmt.executeQuery();
		if(rs.next())
			result= true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {try{rs.close();}catch(SQLException s){s.printStackTrace();}}
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}
		return result;
	}




}
