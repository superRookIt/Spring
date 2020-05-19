package com.javalec.ex;

public class Temperature {
	
	String nav;
	double temp;
	Calculator cal;
	
	
	public void setNav(String nav) {
		this.nav = nav;
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	
	
	public void result() {
		
		double f = cal.result_temp(temp);
		System.out.println("섭씨 : "+temp+"-->"+"화씨 : "+f);
		
	}
	
	

}
