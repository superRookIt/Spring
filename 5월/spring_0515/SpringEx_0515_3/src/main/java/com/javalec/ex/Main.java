package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:ctx.xml");

		ctx.refresh();

		Student stu1 = ctx.getBean("student", Student.class);

		Student stu2 = ctx.getBean("student", Student.class);

		System.out.println("student1 학생 이름 : " + stu1.getName());
		System.out.println("student1 학생 나이 : " + stu1.getAge());

		System.out.println("-----------------------------------");

		stu2.setName("김유신");
		stu2.setAge(30);

		System.out.println("student2 학생 이름 : " + stu2.getName());
		System.out.println("student2 학생 나이 : " + stu2.getAge());

		System.out.println("-----------------------------------");

		System.out.println("student1 학생 이름 : " + stu1.getName());
		System.out.println("student1 학생 나이 : " + stu1.getAge());
		
		System.out.println("-----------------------------------");

		if (stu1.equals(stu2)) {
			System.out.println("student1 == student2");
		} else {
			System.out.println("student1 != student2");
		}

		ctx.close();
		
	}

}
