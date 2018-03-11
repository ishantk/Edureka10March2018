
public class ArraysWithDimens {

	public static void main(String[] args) {
		
		int[] popPunjab = {1031,1234,5671,2345,9012};
		int[] popKarnataka = {3451,1031,1234,5671,2345,9012};
		int[] popMaharashtra = {1278,3451,1031,1234,5671,2345,9012};
		
		// Array of Arrays
		int[][] popIndia =  {
								{1031,1234,5671,2345,9012},				// 0
								{3451,1031,1234,5671,2345,9012},		// 1
								{1278,3451,1031,1234,5671,2345,9012}	// 2
							};
		
		System.out.println("popIndia Length is: "+popIndia.length); // ? 3
		
		System.out.println("popIndia[0] is: "+popIndia[0]); // ?
		System.out.println("popIndia[1] is: "+popIndia[1]); // ?
		System.out.println("popIndia[2] is: "+popIndia[2]); // ?
		System.out.println("popIndia is: "+popIndia); // ?
		
		System.out.println("popIndia[0] Length is: "+popIndia[0].length); // ?
		System.out.println("popIndia[0][0] "+popIndia[0][0]); // ?
		System.out.println("popIndia[0][3] "+popIndia[0][popIndia.length]); // ?
		
		
		
		/*for(int i=0;i<popIndia[0].length;i++){
			System.out.print(popIndia[0][i]+"  ");
		}
		
		System.out.println();
		
		for(int i=0;i<popIndia[1].length;i++){
			System.out.print(popIndia[1][i]+"  ");
		}
		System.out.println();
		
		for(int i=0;i<popIndia[2].length;i++){
			System.out.print(popIndia[2][i]+"  ");
		}*/
		
		
		/*for(int i=0;i<popIndia.length;i++){ // 3 times 0 1 and 2
			
			for(int j=0;j<popIndia[i].length;j++){
				System.out.print(popIndia[i][j]+"  ");
			}
			
			System.out.println();
		}*/
		
		
		System.out.println("====================");
		
		// Enhanced For Loop
		for(int[] arr : popIndia){
			for(int elm : arr){
				System.out.print(elm+"  ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		// Array of Array of Arrays | 3 Dimension
		int[][][] arr = {
								{
									{1031,1234,5671,2345,9012},				// 0
									{3451,1031,1234,5671,2345,9012},		// 1 			0
									{1278,3451,1031,1234,5671,2345,9012}	// 2
								},
								{
									{1031,1234,5671,2345,9012},				// 0
									{3451,1031,1234,5671,2345,9012},		// 1			1
									{1278,3451,1031,1234,5671,2345,9012}	// 2
								}
						};
		
		System.out.println("arr is: "+arr);
		System.out.println("arr.length is: "+arr.length);
		
		System.out.println("arr[0] is: "+arr[0]);
		System.out.println("arr[0].length is: "+arr[0].length);
		
		System.out.println("arr[0][0] is: "+arr[0][0]);
		System.out.println("arr[0][0][0] is: "+arr[0][0][0]);
		
		int[][] arr2D1 = new int[3][3]; // 3 1D Arrays with each Array Having 3 elements. All Elements are 0;
		
		int[][] arr2D2 = new int[3][];
		arr2D2[0] = new int[5]; // 0th Array will have 5 elements
		arr2D2[1] = new int[15];
		arr2D2[2] = new int[25]; // 2nd Array will have 25 elements
		
		
		// N-Dim Array is a Collection of N-1 Dim Arrays

	}

}
