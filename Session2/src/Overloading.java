
public class Overloading {

	void add(int a, int b){
		int c = a+b;
		System.out.println("addition of "+a+" and "+b+" is "+c);
	}
	
	void add(double a, double b){
		double c = a+b;
		System.out.println("addition of "+a+" and "+b+" is "+c);
	}
	
	void add(int a, double b){
		double c = a+b;
		System.out.println("addition of "+a+" and "+b+" is "+c);
	}
	
	void add(double a, int b){
		double c = a+b;
		System.out.println("addition of "+a+" and "+b+" is "+c);
	}
	
	/*double add(double a, int b){
		double c = a+b;
		System.out.println("addition of "+a+" and "+b+" is "+c);
		return c;
	}*/
	
	int add(int num){
		num += num;
		return num;
	}
	
	
	void add(int a, int b, int c){
		int d = a+b+c;
		System.out.println("addition of "+a+", "+b+" and "+c+" is "+d);
	}
	
	
	
	// Rules of Overloading
	// 1. Function Name should be Same
	// 2. Inputs Should be different i.e. Unique always
		// 2.1 Number of Inputs
		// 2.2 Type of Inputs
		// 2.3 Sequence of Inputs
	// 3. Return Type i.e. Ack has no Role to Play
	
	public static void main(String[] args) {
		
		Overloading oRef = new Overloading();
		oRef.add(10, 20);
		oRef.add(10.1234, 20.8765);
		oRef.add(10, 20.123);
		oRef.add(10.567, 20);
		oRef.add(10, 20, 30);
		
		int r = oRef.add(5);
		System.out.println("Result is: "+r);

	}

}
