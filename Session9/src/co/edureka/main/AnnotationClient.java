package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import co.edureka.model.Customer;

public class AnnotationClient {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(null,"Kim",23,"kim@exmaple.com","Redwood Shores");
		Customer c2 = new Customer(null,"Leo",37,"leo@exmaple.com","Country Homes");
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction txn = null;
		
		try{
			config = new AnnotationConfiguration();
			config.configure(); 
			
			factory = config.buildSessionFactory();
			 
			session = factory.openSession(); // Create a Connection with DB
			
			txn = session.beginTransaction();
			
			//session.save(c1);
			//session.save(c2);
			
			// Batch Processing
			for(int i=1;i<=100;i++){
				Customer c = new Customer(null, "Customer"+i, i, "customer"+i+"@example.com", "customer"+i+" address");
				session.save(c);
			}
			
			
			//...
			//...
			
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
