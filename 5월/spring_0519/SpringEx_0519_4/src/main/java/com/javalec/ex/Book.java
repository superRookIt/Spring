package com.javalec.ex;

public class Book {

	int num;
	String title;
	String kind;
	String author;

	public void b_print() {

		System.out.println("책 정보 : " + num + "/" + title + "/" + kind + "/" + author);

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
