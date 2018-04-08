package co.edureka.model;

public class Employee {

	// Attributes of Object as references | Purely OOPS
	Integer eid;
	String name;
	Integer salary;
	String email;
	String address;
	
	public Employee(){
		
	}
	
	public Employee(Integer eid, String name, Integer salary, String email, String address) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", email=" + email + ", address="
				+ address + "]";
	}

}
