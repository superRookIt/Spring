package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCtx {

	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();

		hobbys.add("웹툰");
		hobbys.add("게임");
		hobbys.add("독서");
		
		Student stu1 = new Student("홍길동", 30, hobbys);
		
		stu1.setHeight(180);
		stu1.setWeight(80);
		
		return stu1;
		
	}
	
	
}
