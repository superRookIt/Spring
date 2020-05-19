package com.javalec.ex;

public class Student {

	int hak;
	String name;
	String major;
	String address;
	String phone;

	public Student() {
	}

	public Student(int hak, String name, String major, String address, String phone) {

		this.hak = hak;
		this.name = name;
		this.major = major;
		this.address = address;
		this.phone = phone;

	}

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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
