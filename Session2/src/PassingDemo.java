
public class PassingDemo {
	
	void areaCircle(double radius){
		
		double area = 3.14 * radius * radius;
		
		System.out.println("Area of Circle with Radius "+radius+" is "+area);
		
	}
	
	void countVotes(int[] votes){
		
		int count = 0;
		
		for(int elm : votes){
			count = count + elm;
		}
		
		votes[2] = 1000;
		
		System.out.println("Vote Count is: "+count);
		System.out.println("votes is: "+votes);
	}

	public static void main(String[] args) {
		
		PassingDemo pRef = new PassingDemo();
		
		double rad = 2.2;
		
		pRef.areaCircle(rad);     // Value Copy | Passing the Value
		
		int[] dmVotes = {102,234,567,432,908};
		
		pRef.countVotes(dmVotes); // Reference Copy | Passing the Reference
		System.out.println("dmVotes is: "+dmVotes);
		
		System.out.println("dmVotes[2] is: "+dmVotes[2]);
	}

}
