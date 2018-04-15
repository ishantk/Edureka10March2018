package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object arg3) throws Throwable {
		
		System.out.println("****after executed****");
		
		System.out.println("Method Details: "+method.getName()+" "+method.getParameterCount());
		
		System.out.println("Inputs/Parameters");
		for(Object o : inputs){
			System.out.println(o);
		}
		
		System.out.println("arg0 : "+arg0); 
		System.out.println("arg3 : "+arg3); 
		System.out.println("***********************");
		
	}

}
