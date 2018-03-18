class Parent{
	
	Parent(){
		System.out.println("Parent Object Constructed...");
	}
	
	// Non Private, shall be inherited
	public void purchaseBike(){
		System.out.println("Lets buy Bajaj Pulsar...");
	}
	
	static public void purchaseCar(){
		System.out.println("Lets buy Honda...");
	}
}

class Child extends Parent{
	
	Child(){
		System.out.println("Child Object Constructed...");
	}
	
	// Method Overriding
	public void purchaseBike(){ // Redefining method of parent
		//super.purchaseBike(); // Access Parent's Methods or Attributes
		System.out.println("Lets buy Royal Enfield...");
	}
	
	void fun(){
		System.out.println("This is fun");
	}
	
	// Method Hiding
	static public void purchaseCar(){
		//Parent.purchaseCar(); // Access Parent's Methods or Attributes
		System.out.println("Lets buy Audi...");
	}
}

public class Overriding {

	public static void main(String[] args) {

		Child ch = new Child();
		ch.purchaseBike();
		
		Child.purchaseCar();
	}

}
