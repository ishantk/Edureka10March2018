
public class StringDemo {

	public static void main(String[] args) {
		
		char ch = 'A';
		ch = 'B';
		
		//ch = 'This is a great day'; // error
		
		String str1 = "This is a great day";		// Interned Way
		
		System.out.println("ch is: "+ch);
		System.out.println("str1 is: "+str1);
		
		String str2 = new String("Happy Coding!!"); // Object Way
		System.out.println("str2 is: "+str2);
		
		String saluation = "Mr. ";
		String fname = "John ";
		String lname = "Watson";
		
		String john = saluation+fname+lname; // Concatenation
		System.out.println(john);
				

	}

}
