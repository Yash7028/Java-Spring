package com.springaop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
public class MyAspect {

	@Before("execution(* com.springaop.main.PaymentService.makePayment(..))")
	public void printBefore() {
		System.out.println("payment start");
	}
	
	@After("execution(* com.springaop.main.PaymentService.makePayment(..))")
	public void printAfter() {
		System.out.println("payment done");
	}
}
