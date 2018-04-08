package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.CA;
import co.edureka.model.CB;
import co.edureka.model.CC;

public class InheritanceClient {

	public static void main(String[] args) {
		
		CA ca = new CA();
		ca.setA(10);
		
		CB cb = new CB();
		cb.setA(100);
		cb.setB(200);
		
		CC cc = new CC();
		cc.setA(1000);
		cc.setB(2000);
		cc.setC(3000);
		
		//Account -> SavingsAccount
		
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Session session1 = null;
		Transaction txn = null;
		
		try{
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			 
			session = factory.openSession(); 
			session1 = factory.openSession();
			
			//session.save(ca);
			//session.save(cb);
			//session.save(cc);
			
			CA cRef1 = (CA)session.get(CA.class, 1);
			CC cRef2 = (CC)session.get(CC.class, 3);
			CC cRef3 = (CC)session.get(CC.class, 3);
			
			System.out.println(cRef1);
			System.out.println(cRef2);
			System.out.println("*********");
			System.out.println(cRef3);
			
			txn = session.beginTransaction();
			
			txn.commit();
			
			System.out.println("==Transaction Committed==");
			
		}catch(Exception e){
			System.out.println("Some Exception !! "+e);
			txn.rollback();
		}finally {
			session.close();
			factory.close();
		}

	}

}
