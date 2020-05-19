package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {

	@Pointcut("within(com.javalec.ex.*)")
	private void pointcutMethod() {

	}

	@Around("within(com.javalec.ex.Student)")
	// @Around("pointcutMethod()")
	public Object logger(ProceedingJoinPoint joinpoint) throws Throwable {
		long start = System.currentTimeMillis();
		System.out.println("around 시작시간 : " + start);

		try {

			return joinpoint.proceed();

		}

		finally {
			long end = System.currentTimeMillis();
			System.out.println("소요시간 : " + (end - start));

		}

	}

	@Before("within(com.javalec.ex.Worker)")
	public void beforeAdvice() {

		System.out.println("before 시작시간 : " + System.currentTimeMillis());

	}

	public void afterAdvice() {

		System.out.println("after 종료시간 : " + System.currentTimeMillis());

	}

}
