package ex07_jdbc.sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex07_jdbc.DBconn;

public class SalesDAO {
	
	//일일 상품 판매 리스트
	List<Map<String, Object>> dayItemSalesList(){
		List<Map<String,Object>> list = new ArrayList<>();
		
		//Connection객체생성
		Connection conn=DBconn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALEDATE,S.SEQ,S.ITEMCODE, I.ITEMNAME,S.QTY,S.AMOUNT ");
		sb.append("FROM ITEM I INNER JOIN SALES S ON(I.ITEMCODE = S.ITEMCODE) ");
		sb.append("ORDER BY S.SALEDATE,S.SEQ ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String saledate = rs.getString("saledate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				System.out.println(saledate+" "+itemcode+" "+itemname+" "+qty+" "+amount);
				//매출한건데이터 저장
				Map<String,Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
		//일일 상품별 집계
//	List<Map<String, Object>>dayItemSalesTotal(String saledate){
//		List<Map<String, Object>> list = new ArrayList<>();
//		Connection conn = DBconn.getConn();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		StringBuffer sb = new StringBuffer();
//		sb.append("SELECT I.*,NVL(SA.AMOUNT,0) AMOUNT ");
//		sb.append("FROM ITEM I LEFT JOIN ");
//		sb.append("(SELECT ITEMCODE, SUM(AMOUNT)AMOUNT ");
//		sb.append("FROM SALES ");
//		sb.append("WHERE SALEDATE = '2021-04-29' ");
//		sb.append("GROUP BY ITEMCODE)SA ");
//		sb.append("ON I.ITEMCODE = SA.ITEMCODE ");
//		sb.append("ORDER BY I.ITEMCODE ");
//		
//		
//		
//		try {
//			pstmt=conn.prepareStatement(sb.toString());
//			pstmt.setString(1, saledate);
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				Map<String, Object> map = new HashMap<>(); 
//				map.put("itemcode", rs.getString("itemcode"));
//				map.put("itemname", rs.getString("itemname"));
//				map.put("price", rs.getInt("price"));
//				map.put("bigo", rs.getString("bigo"));
//				map.put("regdate", rs.getString("regdate"));
//				list.add(map);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	
//	}
//
//	//VIEW를 이용해서 상품별 판매 조회
//	List<Map<String, Object>>dayItemSalesTotal(String saledate){
//		List<Map<String, Object>> list = new ArrayList<>();
//		Connection conn = DBconn.getConn();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		StringBuffer sb = new StringBuffer();
//		sb.append("SELECT * FROM SALES_VIEW ");
//		sb.append("WHERE SALEDATE =? ");
//		
//		
//		
//		try {
//			pstmt=conn.prepareStatement(sb.toString());
//			pstmt.setString(1, saledate);
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				Map<String, Object> map = new HashMap<>(); 
//				map.put("itemcode", rs.getString("itemcode"));
//				map.put("itemname", rs.getString("itemname"));
//				map.put("price", rs.getInt("price"));
//				map.put("bigo", rs.getString("bigo"));
//				map.put("regdate", rs.getString("regdate"));
//				list.add(map);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	
//	}

	
	
	
		
	
}

