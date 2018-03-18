package co.edureka.packone;

public class Exe {

	public static void main(String[] args) {

		One oRef = new One();
		Two tRef = new Two();
		
		//oRef.pvtShow(); //error, private is not accessible outside
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println("---------------");
		
		//tRef.pvtShow(); //error, private is not accessible outside
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();	
	}

}
