/*class Cab{
	
	Cab(){
		System.out.println("Cab Object Constructed");
	}
	
	void bookCab(){
		System.out.println("Booking a Cab");
	}
}*/

// Refined the RTP
// User cannot Create Objects
// Methods have no definitions

/*abstract class Cab{ // For Which You cannot create Objects. it cannot be Instantiated
	
	Cab(){
		System.out.println("Cab Object Constructed");
	}
	
	abstract void bookCab(); // abstract method has no definition. Its a Rule Created by Parent which must be defined by Child
	//abstract void fun();
	
	void funAgain(){
		System.out.println("This is fun again");
	}
}*/

// interface cannot have constructor
// It means we cannot create Objects and even the RTE i.e. JVM cannot create the objects

// Refined the RTP
// User cannot Create Objects, RTE cannot create Objects
// Methods have no definitions

interface Cab{
	
	// error
	/*Cab(){
		System.out.println("Cab Object Constructed");
	}*/
	
	// Rule or Protocol by Cab Interface
	void bookCab(); // public abstract void bookCab();
	
}

class MicroCab implements Cab{ // extends Cab{ // MiniCab IS A Cab
	
	MicroCab(){
		System.out.println("MicroCab Object Constructed");
	}
	
	public void bookCab(){
		System.out.println("Booking a MicroCab");
	}
}

class MiniCab implements Cab{ // extends Cab{
	
	MiniCab(){
		System.out.println("MiniCab Object Constructed");
	}
	
	public void bookCab(){
		System.out.println("Booking a MiniCab");
	}
}

class LuxuryCab implements Cab{ // extends Cab{
	
	LuxuryCab(){
		System.out.println("LuxuryCab Object Constructed");
	}
	
	public void bookCab(){
		System.out.println("Booking a LuxuryCab");
	}
	
	void show(){
		System.out.println("This is show");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		/*Cab c;
		c = new Cab();
		c.bookCab();*/
		
		
		
		/*MiniCab mc;
		mc = new MiniCab();
		
		mc.bookCab();*/
		
		
		// Run Time Polymorphism
		
		Cab cRef; // cRef is reference variable of Parent i.e. Cab
		cRef = new MiniCab(); // Object of MiniCab // Parent's Reference Variable can point to the Object of Child | Polymorphic Statement
		cRef.bookCab(); // Even Ref Var belongs to the Parent, but overriding shall be impactful and definition of Child will be executed 
		
		System.out.println("---------------");
		
		cRef = new MicroCab(); // Object of MicroCab
		cRef.bookCab();
				
		System.out.println("---------------");
		
		cRef = new LuxuryCab(); // Object of LuxuryCab
		cRef.bookCab();
		//cRef.show(); // error
		
		System.out.println("---------------");
		
		/*cRef = new Cab(); // Object of Cab // Error if Cab is abstract
		cRef.bookCab();*/
		

	}

}
