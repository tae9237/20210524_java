package ex07_jdbc;

public class EmployeesDTO {
	private int employee_id;
	private String first_name;
	private String hire_data;
	private int salary;
	
	public EmployeesDTO() {}
	public EmployeesDTO(int employee_id, String first_name, String hire_data, int salary) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.hire_data = hire_data;
		this.salary = salary;
	}
	
	


	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getHire_data() {
		return hire_data;
	}
	public void setHire_data(String hire_data) {
		this.hire_data = hire_data;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
	

	}

}
