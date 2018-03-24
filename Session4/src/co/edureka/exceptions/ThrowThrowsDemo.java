package co.edureka.exceptions;

import java.io.IOException;

// User Defined - UnChecked Exception
class BankingException extends RuntimeException{
	BankingException(String message){
		super(message);
	}
}

//User Defined - Checked Exception
class MyBankingException extends Exception{
	MyBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int accBalance = 10000;
	int minBalance = 2000;
	
	int attempts = 0;
	
	void withdraw(int amt){ //throws IOException{
		
		accBalance = accBalance - amt;
		
		if(accBalance<=minBalance){
			attempts++;
			accBalance = accBalance + amt; // Rolling Back
			System.out.println("Withdrawl of \u20b9"+amt+" unsuccessful. Balance is Low. Account Balance is: \u20b9"+accBalance);
		}else{
			System.out.println("Withdrawl of \u20b9"+amt+" successful. Account Balance is: \u20b9"+accBalance);
		}
		
		// Throwing an UnChecked Exception
		if(attempts == 3){
			//NullPointerException npe = new NullPointerException("Illegal Attempts !!");
			//throw npe; // We are explicitly throwing an Exception
			
			// User Defined - UnChecked Exception
			BankingException bRef = new BankingException("Illegal Attaempts !!");
			throw bRef;
		}
		
		// Throwing a Checked Exception
		/*if(attempts == 3){
			IOException io = new IOException("Illegal Attempts !!");
			throw io; // We are explicitly throwing an Exception
		}*/
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		System.out.println("Banking Started..");
		
		Banking bRef = new Banking();
		
		//try{
			for(int i=1;i<=100;i++){
				bRef.withdraw(3000);
			}
	//	}catch(Exception e){
		//	System.out.println("Some Exception : "+e);
	//	}
		
		System.out.println("Banking Finished..");
	}

}
