class WhatsApp{
	
	String title; 				// Object
	static String groupName; 	// Class
	
	void showDetails(){         // Object
		System.out.println("Title is: "+title+" and groupName is: "+groupName);
	}
	
}


public class StaticDemoAgain {

	public static void main(String[] args) {
		
		WhatsApp user1 = new WhatsApp();
		user1.title = "Be Exceptional!!";
		
		WhatsApp user2 = new WhatsApp();
		user2.title = "Work Hard!!";
		
		WhatsApp user3 = new WhatsApp();
		user3.title = "Have a Vision";
		
		WhatsApp.groupName = "Edureka";
		
		//...
		
		user1.showDetails();
		user2.showDetails();
		user3.showDetails();
		
		///....
		
		user2.groupName = "Edureka Java"; // groupName is the property of class, which is modified by user2 reference variable
		
		System.out.println("====================");
		
		user1.showDetails();
		user2.showDetails();
		user3.showDetails();
		
	}

}
