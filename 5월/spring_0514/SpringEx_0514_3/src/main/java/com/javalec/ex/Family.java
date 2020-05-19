package com.javalec.ex;

public class Family {

	String father;
	String mother;
	String sister;
	String brother;

	//생성자
	public Family() {

	}

	public Family(String father, String mother) {

		this.father = father;
		this.mother = mother;

	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	
	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	
	public String getSister() {
		return sister;
	}
	

	public void setSister(String sister) {
		this.sister = sister;
	}
	

	public String getBrother() {
		return brother;
	}

	public void setBrother(String brother) {
		this.brother = brother;
	}

}
