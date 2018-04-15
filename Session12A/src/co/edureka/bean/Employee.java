package co.edureka.bean;

import java.util.Date;

public class Employee {

	int eid;
	String name;
	int salary;
	
	public Employee() {
	
	}

	public Employee(int eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// Business Method in Bean
	public void allocateDeptToEmployee(String dept, int floor){
		//...
		System.out.println(name+" has been allocated "+dept+" department on "+floor+" floor");
		System.out.println(name+" withdraws "+salary+" amount from Company");
		System.out.println("Allocated on "+new Date());
		//...
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]\n"+super.toString();
	}
	
}
