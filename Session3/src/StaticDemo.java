class Student{
	
	// Attributes | Property of an Object
	// Non Static
	int roll;
	String name;
	String address;
	int std;
	
	// Attributes  | Property of class
	// Static
	static String schoolName;
	
	// Methods
	// Non Static Method - Property of Object
	// Property of object can access the property of Class
	void showStudentDetails(){
		System.out.println(name+" has a roll number: "+roll+" and studies in "+std+" std of school "+schoolName);
	}
	
	// Static Method - Property of Class
	// Property of class cannot access the property of Object
	static void showSchoolDetails(){
		System.out.println("School Details: "+schoolName);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.roll = 101;
		s1.name = "John";
		s1.address = "Redwood Shores";
		s1.std = 5;
		
		s2.roll = 33;
		s2.name = "Jennie";
		s2.address = "Country Homes North";
		s2.std = 8;
		
		Student.schoolName = "ABC International School";
		
		s1.showStudentDetails();
		s2.showStudentDetails();
		
		Student.showSchoolDetails();
		// Student.showStudentDetails(); err
		
		// s1.showSchoolDetails(); possible
		
		
	}

}
