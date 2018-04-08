package co.edureka.model;

import java.util.List;

public class Manager {
	
	Integer mid;
	String name;
	Integer salary;
	
	List<Certificate> certificates; // One to Many Relation (HAS-A)

	public Manager(){
		
	}
	
	public Manager(Integer mid, String name, Integer salary, List<Certificate> certificates) {
		this.mid = mid;
		this.name = name;
		this.salary = salary;
		this.certificates = certificates;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
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

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", salary=" + salary + ", certificates=" + certificates + "]";
	}

}
