package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J20210427_2_insert {

	public static void main(String[] args) {
		//오라클에 데이터추가:insert
		Connection conn = DBconn.getConn();
	//	Statement stmt=null;
		//sql문을 간결하게, 보안에 우수
		PreparedStatement pstmt=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품코드?");
		String itemcode=sc.next();
		sc.nextLine();//엔터값처리
		System.out.print("상품명?");
		String itemname=sc.nextLine();
		System.out.print("가격?");
		int price=sc.nextInt();
		
//		String sql = "INSERT INTO ITEM (ITMECODE,ITEMNAME,PRICE)VALUES('"
//					+itemcode+"','"+itemname+"',"+1000+")";
		
		
		String sql = "INSERT INTO ITEM (ITEMCODE,ITEMNAME,PRICE)VALUES(?,?,?)";
		System.out.println(sql);
		
		try {
			 pstmt = conn.prepareStatement(sql);
			//sql문의 ?에 값 대치
			pstmt.setString(1,itemcode);
			pstmt.setString(2,itemname);
			pstmt.setInt(3,price);

			int cnt = pstmt.executeUpdate(); //적용된 건수
			System.out.println(cnt+"건");
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}
		
		System.out.println("프로그램종료");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
