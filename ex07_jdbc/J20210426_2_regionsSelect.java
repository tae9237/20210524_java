package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_2_regionsSelect {

	public static void main(String[] args) {
		//컨넥션 객체 얻기
		Connection con =DBconn.getConn();
		List<RegionsDTO> list = new ArrayList<>();
		try {
			String sql="SELECT*FROM REGIONS ORDER BY REGION_ID";
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int region_id = rs.getInt("region_id");
				String region_name = rs.getString("region_name");
				RegionsDTO rdto = new RegionsDTO();
				rdto.setRegion_id(region_id);
				rdto.setRegion_name(region_name);
				list.add(rdto);
				
			}
		} catch (SQLException e) {
			System.out.println("sql예외");
			e.printStackTrace();
		}
		
		System.out.println(list);
		
		for(RegionsDTO r:list) {
			System.out.println(r.getRegion_id()+" "+r.getRegion_name());
		}
		
		for(int i=0;i<list.size();i++) {
			RegionsDTO re= list.get(i);
			System.out.println(re.getRegion_id()+" "+re.getRegion_name());
		}
		
	}

}
