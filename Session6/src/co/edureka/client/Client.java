package co.edureka.client;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Student;

public class Client {

	public static void main(String[] args) {
		
		Student s1 = new Student(0,"Riya",27,"riya@example.com","Southern Shores");
		
		//Student s2 = new Student(0,"Kim",22,"kim@example.com","Eastern Shores");
		//System.out.println("s1 is: "+s1);
		
		// Persistance - Storing the data of an Object somewhere permanently.
		// 1. Plain File
		// 2. XML 
		// 3. Database
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		
		//helper.insertStudent(s1);
		//helper.insertStudent(s2);
		
		//helper.updateStudent(s1);
		
		//helper.deleteStudent(4);
		
		/*ArrayList<Student> stuList = helper.retrieveStudents();
		
		if(stuList!=null && stuList.size()>0){
			for(Student s : stuList){
				System.out.println(s); // System.out.println(s.toString());
			}
		}*/
		
		//helper.executeProcedure(s1);
		
		helper.processBatch();
		
		helper.closeConnection();
	}

}
