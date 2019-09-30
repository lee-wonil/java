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

public class TestDAO {
	// 자주 사용하는 클래스 3개 레퍼런스 인스턴스 변수로 선언하기
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs =null;
	private Connection getConnection() throws Exception {
		Context ctx = new InitialContext();
		Context env = (Context)ctx.lookup("java:comp/env");
		DataSource ds = (DataSource)env.lookup("jdbc/xe");
		return ds.getConnection();
	}
	// 회원정보 가져오기
	public List selectAll() {
		List list =null;
		try{
			conn= getConnection();
			// 쿼리문 준비, 실행
			pstmt = conn.prepareStatement("select * from test01");
			rs = pstmt.executeQuery();  // 실행 결과
			list = new ArrayList();//결과 담을 list 객체 생성
			while(rs.next()) {
				TestDTO test = new TestDTO();
				test.setId(rs.getString("id"));
				test.setPw(rs.getString("pw"));
				test.setAge(rs.getInt("age"));
				test.setReg(rs.getTimestamp("reg"));
				list.add(test);
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {try{rs.close();}catch(SQLException s){s.printStackTrace();}}
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}

		return list;
	}
	public List getMemberId() {
		List list = null;
		try {
			conn= getConnection();
			pstmt = conn.prepareStatement("select id from test01");
			rs = pstmt.executeQuery();  // 실행 결과
			list = new ArrayList();
			while(rs.next()) {
				list.add(rs.getString("id"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {try{rs.close();}catch(SQLException s){s.printStackTrace();}}
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}
		return list;
	}
}
