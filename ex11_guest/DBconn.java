package ex11_guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
	//싱글톤 패턴:인스턴스를 하나만 생성해서 재사용
	private static Connection conn=null;
	
	public static Connection getConn() {
		//컨넥션을 리턴하는 메소드
	
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
	
		try {
			//만약 컨넥션 객체가 널이거나 컨넥션이 끊어졌
			if(conn==null) {
			//드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//컨넥션 객체 생성
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("db연결 성공");
				}
			}catch (ClassNotFoundException e) {
				System.out.println("드라이버 로딩실패");
				e.printStackTrace();
			}catch (SQLException e) {
				System.out.println("컨넥션객체 생성 실패");
				e.printStackTrace();
			}
				
		return conn;
	}
	
	//접속해제 메소드
	public static void dbClose() {
		try {
			if(conn!=null && conn.isClosed()) {
				conn.close();
				System.out.println("db연결 해제");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
