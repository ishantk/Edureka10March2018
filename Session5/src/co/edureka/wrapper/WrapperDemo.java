package co.edureka.wrapper;

class MyInteger{
	
	int j;
	
	MyInteger(int k){
		j = k;
	}
	
	int intValue(){
		return j;
	}
}

public class WrapperDemo {

	public static void main(String[] args) {
		
		//int i = 10; // Convert primitive to an Object
		
		// We Boxed the data of i in object of MyInteger
		MyInteger miRef = new MyInteger(10); // Representing MyInteger as an Object | Converted primitive data to an object
		
		// We UnBoxed the data of object into l
		int l = miRef.intValue();  //Extraccted data out of object into primitive
		
		
		// Built-In Wrapper Classes from java.lang package
		
		// Explict
		int p = 10;
		Integer pRef = new Integer(p); // BOXING
		
		int q = pRef.intValue(); // UN BOXING
		
		char ch1 = 'A';
		Character cRef = new Character(ch1); // BOXING
		char ch2 = cRef.charValue(); // UN BOXING
		
		float f = 2.2f;
		Float fRef = new Float(f); // BOXING
		float g = fRef.floatValue();// UN BOXING
		
		// Implict
		int x = 10;
		Integer xRef = x; // AUTO - BOXING | Integer xRef = new Integer(x); 
		
		int y = xRef; // AUTO - UN BOXING  | int y = xRef.intValue();
		
	}

}
