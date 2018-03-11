
public class Choices {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a>b){
			System.out.println(a+" is greater than "+b);
		}else{
			System.out.println(b+" is greater than "+a);
		}
	
		byte age = 10;
		
		if(age>=18){
			System.out.println("You can Vote");
		}else{
			System.out.println("You cannot Vote");
		}
		
		boolean isInternetConnected = false;
		boolean isGPSEnabled = false;
		
		/*if(isInternetConnected && isGPSEnabled){
			System.out.println("You can use Google Maps to Navigate");
		}else{
			System.out.println("Please Sure Connectivity and Location Settings");
		}*/
		
		// Nested If/Else
		if(isInternetConnected){
			
			if(isGPSEnabled){
				System.out.println("You can use Google Maps to Navigate");
			}else{
				System.out.println("Please Ensure Location Settings");
			}
			
		}else{
			System.out.println("Please Ensure Internet Connectivity Settings");
		}
		
		
		
		int ph = 80;
		int mt = 90;
		int ch = 90;
		
		int avg = (ph+mt+ch) / 3;
		
		// Ladder if/else
		if(avg>=80){
			System.out.println("Grade A is Awarded");
		}else if(avg>=70 && avg <80){
			System.out.println("Grade B is Awarded");
		}else if(avg>=60 && avg <70){
			System.out.println("Grade C is Awarded");
		}else{
			System.out.println("Grade D is Awarded");
		}

	}

}
