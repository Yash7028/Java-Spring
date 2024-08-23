package com.springaop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/main/config.xml");
    	 PaymentService paymentService = context.getBean("paymentService", PaymentService.class);
         paymentService.makePayment();
    }
}
