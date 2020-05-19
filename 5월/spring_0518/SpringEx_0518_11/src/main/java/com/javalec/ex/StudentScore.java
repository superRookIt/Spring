package com.javalec.ex;

public class StudentScore {

	int hak;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	public int getHak() {
		return hak;
	}

	public void setHak(int hak) {
		this.hak = hak;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void printScore() {

		System.out.println(getAvg());
		System.out.println(getEng());
		System.out.println(getHak());
		System.out.println(getKor());
		System.out.println(getMath());
		System.out.println(getTotal());

	}

}
