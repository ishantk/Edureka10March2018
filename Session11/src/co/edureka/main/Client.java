package co.edureka.main;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.format.number.PercentFormatter;

import co.edureka.ui.Address;
import co.edureka.ui.Button;
import co.edureka.ui.CB;
import co.edureka.ui.Father;
import co.edureka.ui.Manager;
import co.edureka.ui.Person;
import co.edureka.ui.Son;

public class Client {

	public static void main(String[] args) {
		
		// Traditionally
		/*Button btn = new Button();
		btn.setWidth(100);
		btn.setHeight(50);
		btn.setBackgroundColor("#FF0000");
		btn.setTextColor("#FFFFFF");
		btn.setText("Submit");
		
		System.out.println(btn);*/
		
		 
		// 1. IOC Container - BeanFactory
		//Resource resource = new ClassPathResource("application.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		// BeanFactory will create/construct Objects only when you call getBean method
		
		//Button btnCancel = (Button)factory.getBean("btn1");
		//Button btnLogin = factory.getBean("btn2",Button.class);
		
		//System.out.println(btnCancel);
		//System.out.println(btnLogin);
		
		// 2. IOC Container - ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("myapplication.xml");
		
		// ApplicationContext will create/construct Objects automatically even when you dont request for them
		
		//Button btnCancel1 = (Button)context.getBean("btn1");
		//Button btnCancel2 = (Button)context.getBean("btn1");
		//Button btnLogin = context.getBean("btn2",Button.class);
		
		//System.out.println(btnCancel1);
		//System.out.println(btnCancel2);
		//System.out.println(btnLogin);
		
		//Father f = context.getBean("fRef",Father.class);
		//Son s = context.getBean("sRef",Son.class);
		
		//System.out.println(f);
		//System.out.println(s);
		
		/*Person pRef = context.getBean("pers",Person.class);
		System.out.println(pRef);
		
		Address aRef = pRef.getAdrs();
		System.out.println(aRef);*/
		
		//Manager mRef = context.getBean("mgr",Manager.class);
		//System.out.println(mRef);
		
		CB cb = context.getBean("cbRef",CB.class);
		cb.show();
		
		/*List<Address> adrsList = mRef.getAddresses();
		for(Address adrs : adrsList){
			System.out.println(adrs);
		}*/
		
		//ClassPathXmlApplicationContext cp = (ClassPathXmlApplicationContext)context;
		//cp.close(); // Close the Application Context
		
	}

}
