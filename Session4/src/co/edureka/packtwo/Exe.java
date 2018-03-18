package co.edureka.packtwo;

import co.edureka.packone.One;
//import co.edureka.packone.Two; // default not accessible outside the package

// Package Level Inheritance
class Three extends One{ 
	
	// private and default shall not be inherited
	// protected and public shall be inherited
	
	// protected is inheritable outside the package, default is NOT
	// protected once inherited behaves like private
	
	void fun(){
		protShow();
		//pvtShow(); err
		//defShow(); err
	}
}

public class Exe {

	public static void main(String[] args) {
		
		//One oRef = new One();
		//oRef.pvtShow(); // error
		//oRef.defShow();   // error
		//oRef.protShow(); // error
		//oRef.pubShow();
		
		Three tRef = new Three();
		//tRef.protShow(); // Its behaving as private after inheritance
		tRef.pubShow();
		tRef.fun();
	}

}
