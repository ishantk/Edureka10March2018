
public class Loops {

	public static void main(String[] args) {
		
		int num = 5;
		int i = 1;
		
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		// loop
		
		System.out.println("=========While Loop========");
		
		while(i <= 10){ // entry point condition checking
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++; // i = i+1;
		}
		
		System.out.println("===========================");
		
		System.out.println("=========do While Loop========");
		
		num = 7;
		i = 1;
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++; // i = i+1;
		}while(i <= 10); // exit point condition checking
		
		System.out.println("===========================");
		
		System.out.println("=========For Loop========");
		
		num = 9;
		for(int j=1;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}
		
		System.out.println("===========================");

	}

}
