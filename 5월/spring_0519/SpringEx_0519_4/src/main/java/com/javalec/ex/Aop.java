package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class Aop {

	
	
	@Pointcut("within(com.javalec.ex.*)")
	public void pointcut() {
		

	}

	
	
	@Around("within(com.javalec.ex.Book)")
	public Object logger(ProceedingJoinPoint joinpoint) throws Throwable {

		System.out.println("around 시작");

		try {

			return joinpoint.proceed();

		} finally {

			System.out.println("around 종료");

		}

	}

	
	
	
	@After("within(com.javalec.ex.Rental)")
	public void after() {

		System.out.println("after 입니다 ^^");

	}

}
