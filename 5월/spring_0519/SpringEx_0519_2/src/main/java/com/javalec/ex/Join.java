package com.javalec.ex;

public class Join {

	int m_num;
	String id;
	String pw;
	String name;
	String j_date;
	
	public void j_print() {
		
		System.out.println(m_num+" "+id+" "+pw+" "+name+" "+j_date);
		
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJ_date() {
		return j_date;
	}

	public void setJ_date(String j_date) {
		this.j_date = j_date;
	}

}
