package co.edureka.ui;

public class Son extends Father{

	int vehicles;

	public Son(){
		
	}
	
	public Son(int vehicles) {
		this.vehicles = vehicles;
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Son [fname=" + fname + ", lname=" + lname + ", money=" + money + ", vehicles=" + vehicles + "]";
	}

}
