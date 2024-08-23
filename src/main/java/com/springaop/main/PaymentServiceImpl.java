package com.springaop.main;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService{

	public void makePayment(int a) {
	System.out.println("amount debited " + a);
	
	System.out.println("amount credited");
	}

}
