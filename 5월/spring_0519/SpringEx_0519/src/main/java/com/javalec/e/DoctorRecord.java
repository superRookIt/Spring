package com.javalec.e;

public class DoctorRecord {

	int member_num;

	String mem_name;

	String doctor;

	String date;

	public void doctor_print() {

		System.out.println("환자회원정보 : " + getMember_num() + "/" + getMem_name() + "/" + getDoctor());

	}

	public int getMember_num() {
		return member_num;
	}

	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
