package com.javalec.ex;

public class Student {

	public Student() {

	}

	
	//xml에서 property로 하면 total이랑 avg 자동 계산 X
	//객체생성으로 해줘야 자동계산 O
	public Student(int hak_num, String name, int kor, int eng, int math) {

		this.hak_num = hak_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = total / 3;

	}

	int hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	public void print() {


		System.out.println(

				"학생번호 " + hak_num + " " + name + "의 국어점수 " + kor + " 영어점수 " + eng + " 수학점수 " + math + " 평균 : " + avg);

	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getHak_num() {
		return hak_num;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total;
	}

	public void setHak_num(int hak_num) {
		this.hak_num = hak_num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

}
