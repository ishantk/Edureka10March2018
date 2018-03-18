class Parent{
	
	// Attributes | Non static | Property of Object
	String fname;
	String lname;
	int money;
	
	// Attributes | static | Property of Class
	static String homeName;

	// Methods | Non static
	Parent(){
		System.out.println("Parent Object Constructed");
		fname = "John";
		lname = "Watson";
		money = 100000;
	}

	// Methods | Non static | Property of Object
	void showDetails(){
		System.out.println("Details: "+fname+" "+lname+" has \u20b9"+money);
	}
	
	// Methods | static | Property of Class
	static void showHome(){
		System.out.println("Beautiful Home is named as "+homeName);
	}
	
}

// Everything as in attribute and method shall be inherited. Only Constructors and private things cannot be inherited
class Child extends Parent{
	
	int vehicles;
	
	Child(){
		System.out.println("Child Object Constructed");
		vehicles = 3;
	}
	
	void showChildData(){
		System.out.println(fname+" "+lname +" has "+vehicles+" vehicles and a total wealth of \u20b9"+money);
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		//Parent pRef = new Parent();
		//pRef.showDetails();
		
		// We requested for the child Object. But RTE i.e. JVM will create the parent object first and then will create the child object
		Child cRef = new Child();
		
		System.out.println("cRef is: "+cRef);
		
		cRef.fname = "Jennie";
		cRef.vehicles = 4;
		
		//cRef.showDetails();
		cRef.showChildData();
		
		Child.homeName = "Jennie Watson's Abode";
		Child.showHome();
	}

}
