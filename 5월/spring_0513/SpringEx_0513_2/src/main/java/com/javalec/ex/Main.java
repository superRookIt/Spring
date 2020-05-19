package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String configLocation = "classpath:applicationCTX.xml";

		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

		Stu_Score ss = ctx.getBean("student", Stu_Score.class);
		
		System.out.println(ss.stu_num);
		System.out.println(ss.stu_name);

		ss.rank();

	}

}
