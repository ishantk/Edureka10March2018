package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] inputs, Object ref) throws Throwable {
			// method : Reference to the business method in execution
			// inputs : inputs to the method
			// ref    : reference to the bean(object)
		
			System.out.println("****before executed****");
			
			System.out.println("Method Details: "+method.getName()+" "+method.getParameterCount());
			
			System.out.println("Inputs/Parameters");
			for(Object o : inputs){
				System.out.println(o);
			}
			
			System.out.println("ref : "+ref); // gonna call toString() for the object
			
			Employee emp = (Employee)ref; // Downcast to get an Employee Object
			if(emp.eid >100){
				emp.salary = 97900;
			}
			
			System.out.println("***********************");
	}

}
