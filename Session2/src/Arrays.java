
public class Arrays {

	public static void main(String[] args) {
		
		int a = 10; // Single Value Container
		
		/*int demArz = 126;
		int demFlr = 52;
		
		int rpArz = 152;
		int rpFlr = 85;*/
		
		// Multi Value Container
		// Array | Fixed Size and Homogenous in nature
		int[] demVotes = {126,52,230,21,200};
					    // 0   1  2   3  4
		
		int[] rpVotes = {152,85,121,215,13};
	    			   // 0   1  2   3  4
		
		// demVotes and rpVotes are reference variables
		// Array is created within the Heap area of RAM
		
		
		
		// What is the output below ?
		System.out.println("a is: "+a);
		System.out.println("demVotes is: "+demVotes);
		System.out.println("rpVotes is: "+rpVotes);
		
		
		// Implicit Syntax
		int[] a1 = {10,20,30,40,50}; // Compiler will later translate it into int[] a1 = new int[]{10,20,30,40,50}; 
		
		// Explicit Syntax
		int[] a2 = new int[]{10,20,30,40,50};
		
		// Cannot mention any size int int[5] -> error
		//int[] a3 = new int[5]{10,20,30,40,50}; -> error
		
		// Mention Size of Array. But all elements shall be ZERO
		int[] a4 = new int[5];
		a4[0] = 123;
		
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		System.out.println(a4[0]);
		
		int a5[] = {10,20,30,40,50};
		int a6[] = new int[]{10,20,30,40,50};
		int a7[] = new int[5];
	
		int a8[],a9[],a10[];
		int[] a11,a12,a13;
		
		a8 = new int[3];
		a11 = new int[10];
		
		char[] chArr = new char[5]; // if size is 5, elements shall be stored from 0 to 4. Their is no such index called 5
		chArr[0] = 'A';
		chArr[1] = 'B';
		chArr[2] = 'C';
		chArr[3] = 'D';
		chArr[4] = 'E';
		
		System.out.println("chArr[4] is: "+chArr[4]);
		
		// Arrays Are Created Dynamically i.e. at Run Time and hence memory associated is HEAP.
		// If we access anything out of bound compiler will not give error, error will be thrown at run time by JVM.
		System.out.println("chArr[5] is: "+chArr[5]);

	}

}
