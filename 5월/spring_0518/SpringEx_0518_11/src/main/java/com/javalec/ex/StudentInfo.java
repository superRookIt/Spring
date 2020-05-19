package com.javalec.ex;

public class StudentInfo {
	
	private int hak;
	private String name;
	private String grade;
	private String address;
	private String tel;
	
	public int getHak() {
		return hak;
	}
	public void setHak(int hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	public void printInfo() {
		
		System.out.println(getHak());
		System.out.println(getName());
		System.out.println(getTel());
		System.out.println(getAddress());
		System.out.println(getGrade());
		
	}
	
	
	
	

}
