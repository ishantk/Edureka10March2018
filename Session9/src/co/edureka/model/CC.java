package co.edureka.model;

public class CC extends CB{

	Integer c;
	
	public CC(){
		
	}
	
	public CC(Integer c) {
		this.c = c;
	}
	
	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "CC[ id: "+id+"a: "+a+" b: "+b+" c: "+c+" ]";
	}
	
	
}
