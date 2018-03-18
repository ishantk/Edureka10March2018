package co.edureka.exceptions;

public class ExcDemo {

	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		int[] arr = {10,20,30,40,50};
		
		try{
			System.out.println("arr[30] is: "+arr[30]);
			
			// Nested try catch Block
			/*try{
				int a=10,b=0,c=0;
				c = a/b;
				System.out.println("c is: "+c);
			}catch(ArithmeticException aRef){
				System.out.println("OOPS! Some Error Occurred!!");
				System.out.println(aRef);
			}*/
			
			int a=10,b=0,c=0;
			c = a/b;
			System.out.println("c is: "+c);
			
			//System.out.println("Some important Statement");
			
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("OOPS! Some Error Occurred!!");
			System.out.println(aRef);
			aRef.printStackTrace();
		}catch(ArithmeticException aRef){
			System.out.println("OOPS! Some Error Occurred!!");
			System.out.println(aRef);
			aRef.printStackTrace();
		}*/catch(Exception e){
			System.out.println("OOPS! Some Error Occurred!!");
			System.out.println(e);
			e.printStackTrace();
		}finally{
			System.out.println("Some important Statement");
		}

		for(int i=1;i<=10;i++){
			System.out.println(5+" "+i+"'s are "+(5*i));
		}
		
		System.out.println("==App Finished==");
		
	}

}
