package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Member implements InitializingBean, DisposableBean{

	int num;
	String name;
	int age;
	String gender;
	String tel;
	String address;

	public Member() {
	}

	public Member(int num, String name, int age, String gender, String tel, String address) {

		this.num = num;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tel = tel;
		this.address = address;

	}

	public void destroy() throws Exception {
		
		System.out.println("Member destroy() 실행");
		
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Member afterPropertiesSet() 실행");
		
	}

}
