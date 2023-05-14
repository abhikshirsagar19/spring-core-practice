package com.abhishek.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configproduct.xml");
		Product product = (Product) ctx.getBean("product");
		System.out.println("\n Product Name :  " + product.getProduct_name());
		System.out.println("\n Product Id   :  " + product.getProduct_id());
	}

}
