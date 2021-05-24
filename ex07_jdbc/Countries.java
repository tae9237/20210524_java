package ex07_jdbc;

//dto 클래스
public class Countries {
	private String Country_id;
	private String country_name;
	private int region_id;
	
	Countries(){}
	public Countries(String country_id, String country_name, int region_id) {
		Country_id = country_id;
		this.country_name = country_name;
		this.region_id = region_id;
	}
	public String getCountry_id() {
		return Country_id;
	}
	public void setCountry_id(String country_id) {
		Country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	@Override
	public String toString() {
		return "Countries [Country_id=" + Country_id + ", country_name=" + country_name + ", region_id=" + region_id
				+ "]";
	}
	
	
	
	
	
	
	
	
}
