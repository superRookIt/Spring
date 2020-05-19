package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;


//import 할때는 @Configuration 하면 에러 남 

@ImportResource("classpath:ctx.xml")
public class ConfigCTX {
	

	@Bean
	public Student student1() {

		ArrayList<String> hobbys = new ArrayList<String>();

		hobbys.add("수영");
		hobbys.add("조깅");
		hobbys.add("등산");

		Student stu1 = new Student("김유신", 33, hobbys);

		stu1.setHeight(180);
		stu1.setWeight(70);

		return stu1;

	}

}
