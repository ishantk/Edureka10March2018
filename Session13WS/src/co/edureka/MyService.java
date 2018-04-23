package co.edureka;

import java.util.Date;

// Web Service
public class MyService {
	
	// Web Methods | Must be public and must have return types
	public int mtrsToCms(int mtrs){
		int cms = mtrs * 100;
		return cms;
	}
	
	public int feetToInches(int feet){
		int inches = feet * 12;
		return inches;
	}
	
	public String bookACab(String source, String destinition){
		
		Date date = new Date();
		String res = "Cab booked from "+source+" to "+destinition+" at "+date;
		return res;
	}
	
}
