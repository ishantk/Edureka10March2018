package co.edureka.ui;

import java.util.List;

public class Manager {
	
	String name;
	String email;
	int salary;
	List<String> certificates; // HAS-A Relation (1 to many)
	List<Address> addresses;
	
	public Manager(){
		
	}
	
	

	public Manager(String name, String email, int salary, List<String> certificates, List<Address> addresses) {
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.certificates = certificates;
		this.addresses = addresses;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
	
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}



	@Override
	public String toString() {
		return "Manager [name=" + name + ", email=" + email + ", salary=" + salary + ", certificates=" + certificates
				+ "]";
	}

}
