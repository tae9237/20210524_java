package ex07_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J20210427_5_selectOne {

	public static void main(String[] args) {
		// 한건만 조회
		Connection conn = DBconn.getConn();
		PreparedStatement ptmt = null;
		ResultSet rs=null;
		ItemDTO idto=null;
		
		String itemcode="8801";
		String sql="SELECT*FROM ITEM\r\n" + 
				"WHERE ITEMCODE =?";
		
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, itemcode);
			rs =ptmt.executeQuery();
			if(rs.next()) {//데이터가 있다면
				String itemname=rs.getString("itemname");
				int price = rs.getInt("price");
				String bigo = rs.getString("bigo");
				Date regdate = rs.getDate("regdate");
				
				idto = new ItemDTO(itemcode,itemname,price,bigo,regdate);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(idto);

	}

}
