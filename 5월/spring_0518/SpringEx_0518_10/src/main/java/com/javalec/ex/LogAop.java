package com.javalec.ex;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	// 대행클래스 1번째 메소드 (처음과 마지막에 실행되는 메소드)
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("조인포인트 실행");

		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

		try {

			return joinPoint.proceed();

		} finally {

			long endTime = System.currentTimeMillis();
			System.out.println(endTime);
			System.out.println("-----------------------");

		}

	}
	

	public void beforeAdvice(Joinpoint joinpoint) {

		System.out.println("처음 실행되는 log");
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

	}

	public void afterAdvice() {

		System.out.println("마지막에 실행되는 log");

	}

}
