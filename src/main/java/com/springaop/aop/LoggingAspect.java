package com.springaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.springaop.main.PaymentService.makePayment(..))")
    public void logBefore() {
        System.out.println("Before making payment - logging aspect");
    }

    @After("execution(* com.springaop.main.PaymentService.makePayment(..))")
    public void logAfter() {
        System.out.println("After making payment - logging aspect");
    }

    @Around("execution(* com.springaop.main.PaymentService.makePayment(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around before making payment - logging aspect");
        Object result = joinPoint.proceed(); // Continue the method execution
        System.out.println("Around after making payment - logging aspect");
        return result;
    }

    @AfterReturning(pointcut = "execution(* com.springaop.main.PaymentService.makePayment(..))", returning = "result")
    public void logAfterReturning(Object result) {
        System.out.println("After returning from payment - logging aspect");
    }

    @AfterThrowing(pointcut = "execution(* com.springaop.main.PaymentService.makePayment(..))", throwing = "error")
    public void logAfterThrowing(Throwable error) {
        System.out.println("After throwing an exception in payment - logging aspect");
        System.out.println("Exception: " + error.getMessage());
    }
}
