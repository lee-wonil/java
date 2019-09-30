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

public class DataDAO {
	private Connection conn = null;
	private ResultSet result =null;
	private PreparedStatement pstmt=null;
	private Connection getConnection() throws Exception {
		Context ctv = new InitialContext();
		Context env = (Context)ctv.lookup("java:comp/env");
		DataSource ds= (DataSource)env.lookup("jdbc/xe");
		return ds.getConnection();

	}
	public List selectAll() {
		List list =null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from data");
			result = pstmt.executeQuery();
			list = new ArrayList();
			while(result.next()) {
				DataDTO dto= new DataDTO();
				dto.setId(result.getString("id"));
				dto.setPw(result.getString("pw"));
				dto.setName(result.getString("name"));
				dto.setEmail(result.getString("email"));
				dto.setJob(result.getString("job"));
				dto.setGender(result.getString("gender"));
				String hobby = result.getString("hobby");
				if(hobby!=null) {
					String[] hobbys =hobby.split(" ");
					dto.setHobby(hobbys);
				}
				else {
					dto.setHobby(null);
				}
				dto.setIntroduce(result.getString("introduce"));
				list.add(dto);
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(result!=null) {try{result.close();}catch(SQLException s){s.printStackTrace();}}
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}
		return list;
	}
	public void insert(DataDTO DTO) {
		try {
			conn = getConnection();
			String sql = "insert into data values(?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, DTO.getId());
			pstmt.setString(2, DTO.getPw());
			pstmt.setString(3, DTO.getName());
			pstmt.setString(4, DTO.getEmail());
			pstmt.setString(5, DTO.getGender());
			pstmt.setString(6, DTO.getJob());
			String hobby="";
			String hobbys[] = DTO.getHobby();
			if(hobbys!=null) {
				for(int i=0;i<hobbys.length;i++) {
					hobby+=hobbys[i]+" ";
				}
			}
			pstmt.setString(7, hobby);
			pstmt.setString(8, DTO.getIntroduce());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(result!=null) {try{result.close();}catch(SQLException s){s.printStackTrace();}}
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}
	}
	public void changeInfo(DataDTO dto) {
		try {
			conn = getConnection();
			String sql = "update data set pw=?, email=? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPw() );
			pstmt.setString(2,dto.getEmail());
			pstmt.setString(3, dto.getId());
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
	public DataDTO getInfo(String id) {
		DataDTO dto=new DataDTO();
		try {
			conn = getConnection();
			String sql = "select * from data where id=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeQuery();
			while(result.next()) {
				dto.setId(id);
				dto.setPw(result.getString("pw"));
				dto.setName(result.getString("name"));
				dto.setEmail(result.getString("email"));
				dto.setGender(result.getString("Gender"));
				dto.setJob(result.getString("job"));
				String hobby = result.getString("hobby");
				if(hobby!=null) {
					String[] hobbys =hobby.split(" ");
					dto.setHobby(hobbys);
				}
				else {
					dto.setHobby(null);
				}
				dto.setIntroduce(result.getString("introduce"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(result!=null) {try{result.close();}catch(SQLException s){s.printStackTrace();}}
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}
		return dto;

	}
	public boolean login(String id, String pw) {
		try{
			conn = getConnection();
			String sql = "select id,pw from data where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeQuery();
			if(result.next()) {
				if(pw.equals(result.getString("pw"))) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;

			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(result!=null) {try{result.close();}catch(SQLException s){s.printStackTrace();}}
			if(pstmt!=null) {try{pstmt.close();}catch(SQLException s){s.printStackTrace();}}
			if(conn!=null) {try{conn.close();}catch(SQLException s){s.printStackTrace();}}
		}
		return false;
	}
}
