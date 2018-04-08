package co.edureka.model;

public class CB extends CA{ // Parent Child Relationship

	Integer b;

	public CB(){
		
	}
	
	public CB(Integer b) {
		this.b = b;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "CB [b=" + b + "]\n"+super.toString();
	}
	
}
