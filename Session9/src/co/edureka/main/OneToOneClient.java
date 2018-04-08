package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("John");
		person.setAge(30);
		person.setEmail("john@example.com");
		
		Address address = new Address();
		address.setAdrsLine("ABC Road");
		address.setCity("Benagulru");
		address.setState("Karnataka");
		address.setZipCode(520001);
		
		person.setAddress(address); // HAS-A Relation
		address.setPerson(person);  // HAS-A Relation
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction txn = null;
		
		try{
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			 
			session = factory.openSession(); 
			
			session.save(person); // saves address along with person due to cascading
			
			txn = session.beginTransaction();
			
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
