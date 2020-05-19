package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("ctx.xml");

		ctx.refresh();

		MemberAll mem_all = ctx.getBean("mem_all", MemberAll.class);

		MedicalRecord mem_re1 = ctx.getBean("mem_re1", MedicalRecord.class);

		ArrayList<Member> memAll = mem_all.getList();
		
		for (int i = 0; i < memAll.size(); i++) {

			Member m1 = memAll.get(i);

			if (mem_re1.num == m1.num) {

				System.out.println(m1.name);
				System.out.println(m1.tel);
				System.out.println(m1.address);
				System.out.println(m1.age);
				System.out.println(m1.gender);
				System.out.println(mem_re1.cure);
				System.out.println(mem_re1.date);
				System.out.println(mem_re1.doctor);
				System.out.println(mem_re1.nurse);
				System.out.println(mem_re1.reservation);

			}

		} //for
		
		ctx.close();
		
	}

}
