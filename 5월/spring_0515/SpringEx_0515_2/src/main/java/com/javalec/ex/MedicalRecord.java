package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MedicalRecord implements InitializingBean, DisposableBean {

	int num;
	String date;
	String doctor;
	String nurse;
	String cure;
	String reservation;

	public MedicalRecord() {

	}

	public MedicalRecord(int num, String date, String doctor, String nurse, String cure, String reservation) {

		this.num = num;
		this.date = date;
		this.doctor = doctor;
		this.nurse = nurse;
		this.cure = cure;
		this.reservation = reservation;

	}

	public void destroy() throws Exception {

		System.out.println("MedicalRecord destroy() 실행");

	}

	public void afterPropertiesSet() throws Exception {

		System.out.println("MedicalRecord afterPropertiesSet() 실행");

	}

}
