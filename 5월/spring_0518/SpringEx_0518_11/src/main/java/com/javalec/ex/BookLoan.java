package com.javalec.ex;

public class BookLoan {

	private int hak;
	private String book;
	private String title;
	private String kind;
	private String start_date;
	private String end_date;
	private String overdue;

	public int getHak() {
		return hak;
	}

	public void setHak(int hak) {
		this.hak = hak;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
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

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getOverdue() {
		return overdue;
	}

	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}

	public void printBook() {

		System.out.println(getBook());
		System.out.println(getEnd_date());
		System.out.println(getHak());
		System.out.println(getKind());
		System.out.println(getOverdue());
		System.out.println(getStart_date());
		System.out.println(getTitle());

	}

}
