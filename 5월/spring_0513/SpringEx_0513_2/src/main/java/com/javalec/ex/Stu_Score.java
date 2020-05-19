package com.javalec.ex;

public class Stu_Score {
	
	int stu_num;
	String stu_name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	Score_Process ss;
	
	//setter만.. getter는 안하는 듯 
	
	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}


	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
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


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public void setSs(Score_Process ss) {
		this.ss = ss;
	}

	
	
	public void rank() {
		
		avg = ss.process(kor, eng, math);
		
		ss.rank(avg);
		
	}
	

}
