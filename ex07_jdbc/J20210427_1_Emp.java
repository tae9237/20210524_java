package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210427_1_Emp {

	public static void main(String[] args) {
		//사원테이블에서 연봉이 10000이상인 사원의
		//employee_id,first_name,salary 조회
		//연봉의 내림차순으로 정렬
		Connection conn = DBconn.getConn();
		List<EmployeesDTO> list = new ArrayList<>();
		
		try {
			
			String sql = "SELECT EMPLOYEE_ID,FIRST_NAME,HIRE_DATE,SALARY\r\n"+
					"FROM EMPLOYEES\r\n" +
					"WHERE SALARY >=10000\r\n"+
					"ORDER BY SALARY DESC";
			Statement stmt =conn.createStatement();
			ResultSet rs =stmt.executeQuery(sql);
			while(rs.next()) {
				int employee_id = rs.getInt("emplpyee_id");
				String first_name = rs.getString("first_name");
				String hire_data = rs.getString("hire_data");
				int salary = rs.getInt("salary");
				
				EmployeesDTO edto = new EmployeesDTO(employee_id,first_name,hire_data,salary);
				list.add(edto);
			}
			
		
		} catch (SQLException e) {
			System.out.println("sql예외");
			e.printStackTrace();
		}
		
		for(EmployeesDTO e:list) {
			System.out.println(e.getEmployee_id()+" "+e.getFirst_name()+" "+e.getHire_data());
		}
		
		
	}

}
