package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ex07_jdbc.DBconn;

public class GuestDAOImpl  implements GuestDAO{
	

	@Override
	public int insert(GuestDTO gdto) {
		//추가
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		int cnt = 0;
		String sql = "INSERT INTO GUEST(SEQ,NAME,EMAIL,PASSWD,CONTENT)\r\n" + 
				"VALUES(GUEST_SEQ.NEXTVAL,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			cnt = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int update(GuestDTO gdto) {
		//수정
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt=null;
		int cnt=0;
		String sql = "UPDATE GUEST " + 
				"SET NAME = ?,  " + 
				"	EMAIL = ?, "+ 
				"	PASSWD = ?, " + 
				"	CONTENT = ? " + 
				"WHERE SEQ = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			pstmt.setInt(5, gdto.getSeq());
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return cnt;
	}

	@Override
	public int delete(int seq) {
		//삭제
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt=null;
		int cnt = 0;
		String sql ="DELETE FROM GUEST " + 
				"WHERE SEQ=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public GuestDTO selectOne(int seq) {
		//한건조회
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		GuestDTO gdto =null;
		String sql ="SELECT* FROM GUEST " + 
				"WHERE SEQ =?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				gdto = new GuestDTO();
				gdto.setSeq(seq);
				gdto.setName(rs.getString("name"));
				gdto.setEmail(rs.getString("email"));
				gdto.setPasswd(rs.getString("passwd"));
				gdto.setContent(rs.getString("content"));
				gdto.setRegdate(rs.getString("regdate"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
		return gdto;
	}

	@Override
	public List<GuestDTO> selectList() {
		//전체조회
		List<GuestDTO> glist = new ArrayList<>();
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt=null;
		GuestDTO gdto =null;
		ResultSet rs = null;
		String sql="SELECT* FROM GUEST " + 
				"ORDER BY SEQ DESC ";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				gdto = new GuestDTO();
				gdto.setSeq(rs.getInt("seq"));
				gdto.setName(rs.getString("name"));
				gdto.setEmail(rs.getString("email"));
				gdto.setPasswd(rs.getString("passwd"));
				gdto.setContent(rs.getString("content"));
				gdto.setRegdate(rs.getString("regdate"));
				glist.add(gdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return glist;
	}
	
}
