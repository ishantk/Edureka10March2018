package co.edureka.model;

public class User {
	
	// Attributes
	public Integer uid;
	public String name;
	public String password;
	public String email;

	public User(){
		
	}
	
	public User(Integer uid, String name, String password, String email) {
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
