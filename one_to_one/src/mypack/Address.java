package mypack;

public class Address {
	private int id;
	private String city,state,country;
	private Employee employee;
	//one-to-one
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; 
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
