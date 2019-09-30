package web.jsp.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ArticleDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Connection getConnection() throws Exception{
		Context ctv = new InitialContext();
		Context env = (Context)ctv.lookup("java:comp/env");
		DataSource ds = (DataSource)env.lookup("jdbc/xe");
		return ds.getConnection();
	}
	public List selectAll() {
		List list=null;
		try {
			conn= getConnection();
			String sql = "select * from article order by adate desc";
			pstmt = conn.prepareStatement(sql);
			list = new ArrayList();
			rs = pstmt.executeQuery();
			while(rs.next()){
				ArticleDTO dto = new ArticleDTO();
				dto.setId(rs.getString("id"));
				dto.setTitle(rs.getString("title"));
				dto.setAdate(rs.getTimestamp("Adate"));
				dto.setUserid(rs.getString("userid"));
				list.add(dto);
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
	public void insertArticle(ArticleDTO dto) {
		try {
			conn = getConnection();
			String sql = "insert into article values(article_seq.nextval,?,sysdate,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getBody());
			pstmt.setString(3, dto.getUserid());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {try{rs.close();}catch(SQLException s){s.printStackTrace();}}
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}
	}

}
