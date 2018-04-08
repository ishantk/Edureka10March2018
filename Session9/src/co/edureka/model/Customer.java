package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	@Id @GeneratedValue
	@Column(name = "CID")
	Integer cid;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "AGE")
	Integer age;
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "ADDRESS")
	String address;
	
	public Customer(){
		
	}
	
	public Customer(Integer cid, String name, Integer age, String email, String address) {
		this.cid = cid;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address
				+ "]";
	}

}
