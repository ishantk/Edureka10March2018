// Drawing(Textual Representation) of User Object : Class
// Class Represents Object
class User{
	
	// Attributes | Belongs to object NOT to class | Property of object and not of class
	String name;		// non private
	String email;       // non private
	char gender;		// non private
	private int age;	// private
	String address;		// non private
	
	// Special Method - Constructor
	// No Return Type, Name is same as that of Class
	// Default Constructor
	User(){
		// Default Values for the Attributes of an Object
		name = "NA";
		email = "No Email";
		gender = 'U';
		age = 0;
		address = "NA";
	}
	
	// Paramterized Constructor
	User(String nm, String em, char g, int a, String ad){
		// Default Values for the Attributes of an Object
		name = nm;
		email = em;
		gender = g;
		age = a;
		address = ad;
	}	
	
	User(String nm, String em){
		name = nm;
		email = em;
	}
	
	
	// Methods  | Belongs to object NOT to class | Property of object and not of class
	void setAge(int a){ // non private
		if(a>18){
			age = a;
		}else{
			age = 0;
			System.out.println("Sorry !! Its an Ivalid Input");
		}
	}
	
	int getAge(){       // non private
		return age;
	}
	
	// Method : Process the Data
	void showUserDetails(){
		System.out.println("===============================================");
		System.out.println(name+" is "+age+" years old and lives in "+address+"\n"+name+" can be emailed at "+email);
	}
	
}


public class ObjectDemo {

	public static void main(String[] args) {
	
		// Write the Object Construction Statement
		User uRef1 = new User();
		User uRef2 = new User();
		// uRef1 is a Reference Variable, NOT an Object
		// new is an operator which will create an object dynamically i.e. at Run Time in the heap and will return the address of the object
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		
		int iVar = 10;
		
		int jVar = iVar; // Value Copy
		
		User uRef3 = uRef1; // Reference Copy
		
		System.out.println("uRef3 is: "+uRef3);
		
		// Access the Attribute in an Object
		
		// 1. Write Operation
		
		uRef1.name = "John";
		uRef1.email = "john@example.com";
		uRef3.gender = 'M';
		//uRef3.age = 26;
		uRef3.setAge(12);
		uRef1.address = "Country Homes";

		uRef2.name = "Jennie";
		uRef2.email = "jennie@example.com";
		uRef2.gender = 'F';
		//uRef2.age = 22;
		uRef2.setAge(22);
		uRef2.address = "Redwood Shores";
		
		// 2. Read Operation
		
		//System.out.println(uRef1.name+" is "+uRef1.age+" years old and lives in "+uRef3.address);
		//System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		
		//System.out.println(uRef1.name+" is "+uRef1.getAge()+" years old and lives in "+uRef3.address);
		//System.out.println(uRef2.name+" is "+uRef2.getAge()+" years old and lives in "+uRef2.address);
		
		uRef1.showUserDetails();
		uRef2.showUserDetails();
		
		User uRef4 = new User();
		User uRef5 = new User("George","g.w@example.com",'M',30,"Country Homes North"); 
		User uRef6 = new User("Fionna","f.w@example.com");
		
		// Without writing any data we are trying to see whats in the object
		uRef4.showUserDetails();
		uRef5.showUserDetails();
		uRef6.showUserDetails();
	}

}
