package co.edureka;

interface State{
	String showState();
}

class Ordered implements State{
	public String showState(){
		return "Ordered State";
	}
}

class Shipment implements State{
	public String showState(){
		return "Shipment State";
	}
}

class Delivered implements State{
	public String showState(){
		return "Delivered State";
	}
}

class Product{
	
	State state;
	
	void setState(State s){
		state = s;
	}
	
	State getState(){
		return state;
	}
	
}

public class StateDemo {

	public static void main(String[] args) {

		Product product = new Product();
		
		Ordered oState = new Ordered();
		product.setState(oState);
		
		System.out.println("Product is in "+product.getState().showState());
		
		Delivered dState = new Delivered();
		product.setState(dState);
		
		System.out.println("Product is in "+product.getState().showState());
	}

}
