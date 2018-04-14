package co.edureka.ui;

public class Father {
	
	String fname;
	String lname;
	int money;
	
	public Father(){
		
	}
	
	public Father(String fname, String lname, int money) {
		this.fname = fname;
		this.lname = lname;
		this.money = money;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "Father [fname=" + fname + ", lname=" + lname + ", money=" + money + "]";
	}
}
