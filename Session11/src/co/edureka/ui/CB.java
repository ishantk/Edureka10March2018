package co.edureka.ui;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {

	CA caRef; // HAS-A Relation

	public CA getCaRef() {
		return caRef;
	}

	@Autowired
	public void setCaRef(CA caRef) {
		this.caRef = caRef;
	}
	
	public void show(){
		caRef.showDate();
	}
	
}
