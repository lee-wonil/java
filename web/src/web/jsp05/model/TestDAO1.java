package web.jsp05.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TestDAO1 {
	private Connection conn=null;
	private ResultSet rs =null;
	private PreparedStatement pstmt = null;
	public Connection getConnection() throws Exception{
		Context ctv = new InitialContext();
		Context env = (Context)ctv.lookup("java:comp/env");
		DataSource ds = (DataSource)env.lookup("jdbc/xe");
		return ds.getConnection();
	}
	public List selectAll() {
		List list =null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from test01");
			rs = pstmt.executeQuery();
			list = new ArrayList();
			while(rs.next()) {
				TestDTO dto = new TestDTO();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setAge(rs.getInt("age"));
				dto.setReg(rs.getTimestamp("reg"));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {try{rs.close();}catch(SQLException s){s.printStackTrace();}}
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}
		return list;
	}
	public void insertUser(TestDTO dto) {
		try {
			conn= getConnection();
			String sql = "insert into test01 values(?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setInt(3, dto.getAge());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}
	}
	// 회원가입
	public boolean insertId(String id) {
		try {
			conn =getConnection();
			pstmt = conn.prepareStatement("select * from test01 where id =?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				conn.close();
				pstmt.close();
				rs.close();
				return false;
			}
			else {
				conn.close();
				pstmt.close();
				rs.close();
				return true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
