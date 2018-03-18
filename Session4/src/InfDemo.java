
class P{
	
	P(){
		System.out.println("P Object Constrcuted");
	}
	
	void show(){
		System.out.println("This is show");
	}
}

class R{
	
}

interface Inf1{
	int i = 10;  // public static final int i = 10;
	void show(); // public abstract void show();
}

interface Inf2{
	void fun();
}

interface Inf3 extends Inf1,Inf2{ // Multiple extension allowed on Interfaces but not on classes
	
}

class Q implements Inf3{ //Inf1,Inf2{ //extends P{ //,R{ // Multiple Extension not allowed, Multiple Implementation is Allowed
	
	Q(){
		System.out.println("Q Object Constrcuted");
	}
	
	public void show(){
		System.out.println("This is show of Q and i is: "+Inf1.i);
	}
	
	public void fun(){
		System.out.println("This is fun");
	}
	
	void foo(){
		System.out.println("This is from Q");
	}
}

public class InfDemo {

	public static void main(String[] args) {
		
		// Ref Var of Parent is Pointing to the Object of Child
		// pRef is holding the address of Q Object
		//P pRef = new Q(); // Parent Child Relation
		//pRef.show();
		
		
		// Ref Var i1 of Interface is Pointing to the Object which implements it
		// i1 is holding the address of Q Object
		/*Inf1 i1 = new Q();
		i1.show();
		
		Inf2 i2 = new Q();
		i2.fun();*/
		
		Inf3 i3 = new Q(); // i3 is containing the address of Q Object
		i3.fun();
		i3.show();
		
		//i3.foo(); // error
		
		System.out.println("------------");
		
		//Q q = new Q(); // q is containing the address of Q Object
		Q q = (Q)i3;  // Down Casting
		q.show();
		q.fun();
		q.foo();
	}

}
