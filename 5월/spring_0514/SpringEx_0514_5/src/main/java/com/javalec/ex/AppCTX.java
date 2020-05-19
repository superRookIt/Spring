package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCTX {

	@Bean
	public Student student1() {

		Student st1 = new Student(1, "홍길동", 100, 90, 60);

		return st1;

	}

	@Bean
	public Student student2() {

		Student st2 = new Student();
		
		st2.setHak(2);
		st2.setName("claaa");
		st2.setEng(100);
		st2.setKor(50);
		st2.setMath(60);
		
		return st2;

	}

}
