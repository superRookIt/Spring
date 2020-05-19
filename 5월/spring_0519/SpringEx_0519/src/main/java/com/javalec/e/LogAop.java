package com.javalec.e;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop { //공통적으로 적용할 메소드들을 설정하는 클래스

	// around
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {

		// 시작 전 실행
		System.out.println("around 메소드 시작 시간 : " + System.currentTimeMillis());

		try {

			return joinpoint.proceed(); // 실행메소드 호출

		} finally {

			System.out.println("메소드 종료시간 : " + System.currentTimeMillis());
			System.out.println("---------------------------");

		}

	}

	// before
	public void beforeAdvice() {

		System.out.println("before 메소드 시작시간 : " + System.currentTimeMillis());
		System.out.println("---------------------------");

	}

}
