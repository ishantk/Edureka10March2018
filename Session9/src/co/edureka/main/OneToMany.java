package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Certificate;
import co.edureka.model.Manager;

public class OneToMany {

	public static void main(String[] args) {
		
		
		Certificate c1 = new Certificate();
		c1.setCname("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setCname("AWS");
		
		Certificate c3 = new Certificate();
		c3.setCname("CCNA");
		
		List<Certificate> list = new ArrayList<Certificate>();
		list.add(c1);
		//list.add(c2);
		list.add(c3);
		
		
		Manager manager = new Manager();
		manager.setName("Jennie");
		manager.setSalary(67000);
		manager.setCertificates(list); // One to Many
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction txn = null;
		
		try{
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			 
			session = factory.openSession(); 
			
			//session.save(manager);
			
			Manager mRef = (Manager)session.get(Manager.class, 1);
			System.out.println(mRef);
			
			System.out.println("============================");
			List<Certificate> cList = mRef.getCertificates();
			for(Certificate c : cList){
				System.out.println(c);
				System.out.println("******************");
			}
			
			System.out.println("============================");
			
			
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
