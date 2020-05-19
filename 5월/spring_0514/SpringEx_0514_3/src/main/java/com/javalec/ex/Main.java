package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String config1 = "classpath:ctx.xml";
		String config2 = "classpath:ctx2.xml";

		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config1, config2);
		Student stu1 = ctx.getBean("student1", Student.class);

		System.out.println("이름: " + stu1.getName());
		System.out.println("취미: " + stu1.getHobbys());

		Student_Info stu_info = ctx.getBean("student_info", Student_Info.class);
		Student stu2 = stu_info.getStudent();

		System.out.println("Info 이름: " + stu2.getName());
		System.out.println("Info 취미: " + stu2.getHobbys());

		if (stu1.equals(stu2)) {
			System.out.println("1,2는 같은 객체입니다");
		} else {
			System.out.println("1,2는 다른 객체입니다");
		}

		Student stu3 = ctx.getBean("student3", Student.class);

		System.out.println(stu3.getName());
		
		
		Family family = ctx.getBean("family",Family.class);
		
		
		System.out.println("아버지 이름 : "+family.getFather());
		System.out.println("어머니 이름 : "+family.getMother());
		System.out.println("여동생 이름 : "+family.getSister());
		System.out.println("남동생 이름 : "+family.getBrother());
		
		

	}

}
