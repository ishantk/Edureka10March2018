
public class Functions {

	void addNums(){
		//1
		int a = 10;
		//2
		int b = 20;
		//3
		int c = a+b;
		//4
		System.out.println("c is: "+c);
	}
	
	void addNumsAgain(int a, int b){
		int c = a+b;
		System.out.println("c is: "+c);
	}
	
	int addNumsOnceAgain(int a, int b){
		int c = a+b;
		
		return c; // return the same type as mentioned and should be the last statement
	}
	
	// Non-Static Method | They are executed with an object
	void sayHello(){
		System.out.println("Hello from sayHello");
	}
	
	// Static Method   | They are executed with the class
	static void sayHelloAgain(){
		System.out.println("Hello from sayHelloAgain");
	}
	
	public static void main(String[] args) {
		
		Functions.sayHelloAgain(); // Execute Static Methods with Class Name
		//Functions.sayHello(); // error | sayHello is non static
		
		// Execution of Non Static Methods
		Functions fRef = new Functions(); // Object Construction Statement
		System.out.println("fRef is: "+fRef); // fRef is not an Object. Its a Reference Variable
		
		fRef.addNums();
		fRef.addNumsAgain(100,200);
		fRef.addNumsAgain(12,13);
		fRef.sayHello();

		int result = fRef.addNumsOnceAgain(17, 19);
		System.out.println("Result is: "+result);
		
	}

}
