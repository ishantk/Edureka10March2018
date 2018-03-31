package co.edureka.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UtilDemo {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter num1");
		num1 = scanner.nextInt();
		
		System.out.println("Enter num2");
		num2 = scanner.nextInt();
		
		System.out.println("Sum of "+num1+" and "+num2+" is "+(num1+num2));

		
		Date date = new Date();
		System.out.println("Today is "+date.toString());
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		String todaysDate = sdf.format(date);
		System.out.println("Todays date is "+todaysDate);
	}

}
