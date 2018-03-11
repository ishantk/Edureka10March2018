
public class HelloWorld {

	public static void main(String[] args) {

		// how to give output to the user
		System.out.println("Hello All, Welcome to Java World!!");
		
		// int is a data type
		// i is a single value container (also known as variable)
		// 10 is literal i.e. a value
		int i = 10;
		
		System.out.println("i is: "+i);
		
		i = 100; // value can be modified, but container remains same
		
		System.out.println("i now is: "+i);
		
		int n1 = 10;
		int n2 = 20;
		
		int n3 = n1+n2;
		
		// Fill in the blanks
		//System.out.println(n1+" and "+n2+" addition is: "+n3);
		System.out.println("addition of "+n1+" and "+n2+" is "+n3);
		
		char ch = 'A';
		System.out.println("ch is "+ch);
		
		char ch1 = 67; // ASCII Code -> C
		System.out.println("ch1 is "+ch1);
		
		char ch2 = '\u0958'; // Unicode
		System.out.println("ch2 is "+ch2);
		
		int num1 = 100;
		num1 += 100; // num1 = num1 + 100;
		
		System.out.println("num1 is: "+num1);
		
		num1++; // num1 = num1 + 1;

		System.out.println("num1 now is: "+num1);
		
		int iVar = 256;	   	     // 4 bytes storage
		
		byte bVar = (byte)iVar;  // 1 byte  storage | Down Casting
		
		//-128 to 0 to 127
		
		System.out.println("bVar is: "+bVar);
		
		long lVar = bVar; 
		
		
	}

}
