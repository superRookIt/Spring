package com.javalec.e;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");

		Student student = ctx.getBean("student", Student.class);
		
		student.Stu_print();

		Score score = ctx.getBean("score", Score.class);
		
		score.score_print();
		
		DoctorRecord doctor = ctx.getBean("doctor", DoctorRecord.class);
		
		doctor.doctor_print();

	}

}
