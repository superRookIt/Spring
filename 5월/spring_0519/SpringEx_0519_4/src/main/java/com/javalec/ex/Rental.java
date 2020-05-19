package com.javalec.ex;

public class Rental {

	int num;
	String name;
	String book;
	String back;
	String tel;

	public void r_print() {

		System.out.println("대출 정보 : " + num + "/" + name + "/" + book + "/" + back + "/" + tel);

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getBack() {
		return back;
	}

	public void setBack(String back) {
		this.back = back;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
