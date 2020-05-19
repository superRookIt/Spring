package com.javalec.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aop {

	public Object logger(ProceedingJoinPoint joinpoint) throws Throwable {

		System.out.println("joinpoint 실행합니다 ^^");
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String str = dayTime.format(new Date(startTime));
		System.out.println(str);

		try {

			return joinpoint.proceed();

		}

		finally {

			long endTime = System.currentTimeMillis();
			System.out.println(endTime);
			System.out.println("joinpoint 완료합니다. ㅠㅠ");
			System.out.println("------------------");
		}

	}

}
