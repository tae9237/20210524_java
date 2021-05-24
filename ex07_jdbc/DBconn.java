package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
	
	public static Connection getConn() {
		//컨넥션을 리턴하는 메소드
		Connection conn=null;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		try {
			//드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("로딩완료");
			//컨넥션 객체 생성
			try {
			conn=DriverManager.getConnection(url,user,password);
				//System.out.println("접속성공");
			} catch (SQLException e) {
				System.out.println("접속실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("로딩실패");
			e.printStackTrace();
		}
	
		
		
		
		return conn;
	}
}
