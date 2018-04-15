package co.edureka.main;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Employee;

public class Client {

	public static void main(String[] args) {
		
		//ProxyFactoryBean | API
		
		ApplicationContext context = new ClassPathXmlApplicationContext("myapplication.xml");
		
		// emp is a reference variable pointing to the object
		//Employee emp = context.getBean("eRef",Employee.class);
		Employee emp = context.getBean("empProxy",Employee.class);
		
		//System.out.println(emp);

		emp.allocateDeptToEmployee("HR", 9);
		
	}

}
