package com.spring.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configcollege.xml");
		College college = (College) ctx.getBean("college");

		System.out.println("\nCollege Name   :  " + college.getName());
		System.out.println("Department List  :  " + college.getDepartments());
		System.out.println(college.getClass());
	}

}
