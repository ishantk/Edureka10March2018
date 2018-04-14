package co.edureka.ui;

public class Person {
	
	String name;
	String email;
	int age;
	Address adrs; // HAS-A relation
	
	public Person(){
		
	}
			
	// Constructor to Solve Dependency Issue -> Constructor Based Dependency Injection
	public Person(Address adrs){
		System.out.println("Constructr Executed");
		this.adrs = adrs;
	}
	
	public Person(String name, String email, int age, Address adrs) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.adrs = adrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAdrs() {
		return adrs;
	}

	// Setter to Solve Dependency Issue -> Setter Based Dependency Injection
	public void setAdrs(Address adrs) {
		System.out.println("Setter Executed");
		this.adrs = adrs;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", adrs=" + adrs + "]";
	}
	
}
