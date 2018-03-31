package co.edureka.collections;

// Example : Excel  : sr, name, age, address
//ArrayList<Student> studentList = new ArrayList<Student>();
class Student{
	int sr;
	String name;
	int age;
	String address;
}

public class Employee {
	int id;
	String name;
	
	Employee(){
		
	}
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void showEmployee(){
		System.out.println(id+" belongs to "+name);
	}
}
