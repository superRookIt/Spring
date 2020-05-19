    

     /*
	 * 1. appCTX.xml 
	 * 2. <bean id="" class=""> 
	 * 3. <constructor-arg value=""> 
	 * 4. <property name="" value="">
	 */

package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppCTX {


	
	@Bean
	public Student student1() {

		ArrayList<String> hobbys = new ArrayList<String>();

		hobbys.add("웹툰");
		hobbys.add("게임");
		hobbys.add("독서");

		Student stu1 = new Student("홍길동", 30, hobbys);
		
		stu1.setHeight(194);
		stu1.setWeight(80);

		return stu1;

	}
	
	
	
	@Bean
	public Student student2() {

		ArrayList<String> hobbys = new ArrayList<String>();

		hobbys.add("자전거");
		hobbys.add("수영");
		hobbys.add("산책");

		Student stu2 = new Student("김유신", 33, hobbys);
		
		stu2.setHeight(184);
		stu2.setWeight(70);

		return stu2;

	}
	
	
	
	

}
