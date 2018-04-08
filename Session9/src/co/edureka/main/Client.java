package co.edureka.main;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

public class Client {

	public static void main(String[] args) {
	
		/*Employee emp1 = new Employee();
		//emp1.setEid(1);
		emp1.setName("George");
		emp1.setSalary(60000);
		emp1.setEmail("george@example.com");
		emp1.setAddress("Redwood Shores");
		
		Employee emp2 = new Employee(null, "Fionna", 65000, "fionna@example.com", "Country Homes");*/
		
		//System.out.println("emp1 is: "+emp1);
		//System.out.println("emp2 is: "+emp2);
		
		// If we wish to store the data in DB ,we can use JDBC and write a JDBCHelper kind of class
		// Here we wont use JDBC. No to SQL. We will use Hibernate
		
		//Use hiberante API's to insert/update/retrieve and delete...
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction txn = null;
		
		try{
			//1. 
			config = new Configuration();
			config.configure(); // Parsing the XML File i.e. hibernate.cfg.xml
			//config.configure("anyanme.xml"); // Parsing the XML File i.e. anyname.xml having hibernate configuration
			
			//2. 
			factory = config.buildSessionFactory();
			
			//3. 
			session = factory.openSession(); // Create a Connection with DB
			
			//4.
			txn = session.beginTransaction();
			
			// Inserting the data in database
			//session.save(emp1);
			//session.save(emp2);
			
			// Retrieve Operation
			//Employee eRef = (Employee)session.get(Employee.class, 2);
			//System.out.println("eRef is: "+eRef);
			
			//Update Operation
			//Employee emp = (Employee)session.get(Employee.class, 4);
			//emp.setName("Fionna Watson");
			//emp.setEmail("fionna.w@example.com");
			
			//Employee emp = new Employee(4, "Fionna Watson", 67500, "fionna.w@example.com", "Country Homes North");
			
			//session.update(emp);
			
			// Delete Operation
			//Employee emp = new Employee();
			//emp.setEid(3);
			
			//session.delete(emp);
			
			// Retrieve All
			//1. HQL | Hibernate Query Language
			//String hql = "From Employee where eid > 1";
			//String sql = "Select name From Employee";
			
			/*List<Employee> empList = session.createQuery(hql).list();
			for(Employee emp : empList){
				System.out.println(emp);
				System.out.println("------------------------------------------------------------------");
			}*/
			
			//2. Criteria API
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("eid", 1));
			
			List<Employee> empList = criteria.list();
			for(Employee emp : empList){
				System.out.println(emp);
				System.out.println("------------------------------------------------------------------");
			}
			
			
			txn.commit();
			
			System.out.println("==Transaction Committed==");
			
		}catch(Exception e){
			System.out.println("Some Exception !! "+e);
			txn.rollback();
		}finally {
			session.close();
		}
		
		
		
	}

}
