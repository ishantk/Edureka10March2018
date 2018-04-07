package co.edureka.main;

import co.edureka.model.Employee;

public class Client {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		emp.setEid(1);
		emp.setName("John");
		emp.setSalary(50000);
		emp.setEmail("john@example.com");
		emp.setAddress("Redwood Shores");
		
		// If we wish to store the data in DB ,we can use JDBC and write a JDBCHelper kind of class
		// Here we wont use JDBC. No to SQL. We will use Hibernate
		
		//Use hiberante API's to insert/update/retrieve and delete...
	}

}
