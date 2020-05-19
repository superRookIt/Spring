package com.javalec.ex;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		StudentInfo stuinfo = ctx.getBean("studentinfo",StudentInfo.class);
		
		// 생성자를 통한 데이터 주입->출력
		stuinfo.getStudentInfo();
		
		
		// -----------------------
		
		
		// Student student2 = ctx.getBean("student2",Student.class);
		stuinfo.setStudent(ctx.getBean("student2",Student.class));
		
		
		stuinfo.getStudentInfo();
		
		
		ctx.close();

	}
	

}
