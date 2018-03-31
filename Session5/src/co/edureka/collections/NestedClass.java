package co.edureka.collections;

class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Nested or Inner Class
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
	
	private class A{
		
	}

	protected class B{
		
	}
	
	static class C{
		
	}
	
	public class D{
		
	}
}


/*private class A{
	
}

protected class B{
	
}*/

public class NestedClass {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef  = oRef.new Inner(); // Inner Object will be constructed in the Outer Object pointed by iRef
		iRef.show();
		
	}
}
