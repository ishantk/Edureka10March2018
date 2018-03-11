import java.util.Scanner;

public class Methods {

	/*int area(int side){
		int a = side * side;
		return a;
	}*/
	
	static int area(int side){
		int a = side * side;
		return a;
	}
	
	public static void main(String[] args) {
		
		//Methods mRef = new Methods();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Side of Square:");
		int side = scanner.nextInt();
		
		
		//int result = mRef.area(side);
		int result = Methods.area(side);
		System.out.println("Area of Square with side "+side+" is: "+result);
		
		
		scanner.close();
		
		//result = mRef.area(10);
		//System.out.println("Area of Square with side 10 is: "+result);

	}

}
