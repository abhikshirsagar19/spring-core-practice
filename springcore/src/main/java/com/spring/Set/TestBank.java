package com.spring.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configbank.xml");
		Bank bank = (Bank) ctx.getBean("bank");
		System.out.println("\nBank Name :  " + bank.getName());
		System.out.println("Account Types  : " + bank.getAccountTypes());
	}

}
