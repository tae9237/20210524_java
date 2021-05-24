package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_4_delete {

	public static void main(String[] args) {
		// 데이터삭제
		
		Connection conn = DBconn.getConn();
		PreparedStatement ptmt=null;
		
		String itemcode="8802";
		
		String sql ="DELETE FROM ITEM\r\n" + 
				"WHERE ITEMCODE=?";
		
		try {
			
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, itemcode);
			int cnt = ptmt.executeUpdate();
			System.out.println(cnt+"건 삭제");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
