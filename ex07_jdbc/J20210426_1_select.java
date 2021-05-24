package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_1_select {
	static Connection conn; //필드:자동초기화
	public static void main(String[] args) {
		//오라클 db연결
		//Connection conn = null; //지역변수 반드시 초기화 필요
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			//오라클 접속
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");
			System.out.println("접속성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 존재하지 않습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속실패");
			e.printStackTrace();
		}
		
		if(conn==null) return; //컨넥션 실패시 종료
		
		
		//db 정보 select
		List<Countries> list = new ArrayList<>();
		ResultSet rs=null;
		Statement stmt=null;
		try {//sql문을 전달하고 결과값을 받아올 객체생성
			stmt = conn.createStatement();
			String sql = "SELECT*FROM COUNTRIES";
			 rs =stmt.executeQuery(sql);//조회
			System.out.println(rs);
			while(rs.next()) {
				String country_id = rs.getString("country_id");
				String country_name = rs.getString("country_name");
				int region_id = rs.getInt("region_id");
				Countries cot = new Countries(country_id,country_name,region_id);
				list.add(cot);
				
			}
			
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}finally {//예외가 발생 하던지 안하던지 무조건 실행
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//출력
		System.out.println(list);
		System.out.println("-------------------------");
		//foreach문
	for(Countries s:list) {
			System.out.println(s.getCountry_id()+" "+s.getCountry_name()+" "+s.getRegion_id());
			
		}
		System.out.println("-------------------------");
		//for문
		for(int i=0;i<list.size();i++) {
			Countries c = list.get(i);
			System.out.println(c.getCountry_id()+" "+c.getCountry_name()+" "+c.getRegion_id());
		}
	}


}
