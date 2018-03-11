
public class ArrayOperations {

	public static void main(String[] args) {
		
		int[] a1 = {10,20,30,40,50};
		
		int[] a2 = new int[5];
		
		// 1. Read the Element of an Array
		System.out.println(a1[3]);
		System.out.println(a2[3]);
		
		// 2.Write the Element of an Array
		a1[3] = 121;
		a2[3] = 323;
		
		System.out.println("------");
		
		System.out.println(a1[3]);
		System.out.println(a2[3]);
		
		// 3. Length of an Array
		System.out.println("a1 length is: "+a1.length);
		System.out.println("a2 length is: "+a2.length);
		
		System.out.println("-----------------");
		
		// 4. Read Entire Array
		// 4.1 for loop
		
		for(int i=0;i<a1.length;i++){ // i=0;i<5;i++
			System.out.print(a1[i]+"  ");
		}
		
		System.out.println();
		
		for(int i=0;i<a1.length;i++){ // i=0;i<5;i++
			System.out.print(a2[i]+"  ");
		}
		
		System.out.println();
		
		System.out.println("-----------------");
		
		// 4.2 Enhanced For Loop |  Works as of now only with Arrays
		for(int anyVarName : a2){
			System.out.print(anyVarName+" | ");
		}
		
		int i = 10;
		int j = i; // Value Copy
		
		int[] a3 = {12,13,21,67,54,12,23};
		int[] a4 = a3; // Reference Copy
		
		
		// PRIMITIVE TYPES ARE SVC i.e. THEY WILL HOLD VALUE
		// REFERENCE TYPES ARE MVC i.e. THEY WILL HOLD ADDRESS
		
		System.out.println();
		System.out.println("==============");
		
		
		System.out.println("i is: "+i);
		System.out.println("j is: "+j);
		
		System.out.println("a3 is: "+a3);
		System.out.println("a4 is: "+a4);
		
		System.out.println(a3[3]);
		System.out.println(a4[3]);
		
		a4[3] = 100;
		
		System.out.println(a3[3]);
		System.out.println(a4[3]);
		
	}

}
