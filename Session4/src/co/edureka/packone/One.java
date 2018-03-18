package co.edureka.packone;

// One is public
public class One {
	
	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		pvtShow();
		System.out.println("This is public show of One");
	}
}

// Two is default. can have n number of default classes
class Two{
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
}

// Source file can have only one public class. Because name of source file is same as of public class in java
/*public class Three{
	
}*/

//private class Four{ // error | private class cannot be created
	
//}

//protected class Five{ // // error | protected class cannot be created
	
//}