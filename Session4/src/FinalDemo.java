final class A{ // final class cannot be extended
	
	final void show(){ // final methods cannot be overrided in children
		
	}
}

class B{ // extends A { // error
	
	/*void show(){
		
	}*/
}

class X{
	
}

final class Y extends X{
	
}

class Z { //extends Y{
	
}


public class FinalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100;
		
		final int j = 10; // Constant
		//j = 100; // error

	}

}
