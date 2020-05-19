package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:app.xml");

		// stuInfo -> Arraylist(Student) list

		StuInfo stuinfo = ctx.getBean("stuinfo", StuInfo.class);

		ArrayList<Student> list = stuinfo.getList();

		StuScore stuscore = ctx.getBean("stu_score3", StuScore.class);

		for (int i = 0; i < list.size(); i++) {

			Student stu = list.get(i);

			if (stuscore.hak == stu.hak) {

				System.out.println("<< " + stu.name + " 학생 성적 출력 >>");
				System.out.print(stu.hak + " ");
				System.out.print(stu.name + " ");
				System.out.print(stu.major + " ");
				System.out.print(stu.address + " ");
				System.out.print(stu.phone + " ");
				System.out.print(stuscore.math + " ");
				System.out.print(stuscore.kor + " ");
				System.out.print(stuscore.eng + " ");
				System.out.print(stuscore.total + " ");
				System.out.print(stuscore.avg + " ");
			}

		}

	}

}
