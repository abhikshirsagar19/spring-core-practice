package com.abhishek.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println("\n EMP_ID  : " + employee.getEmp_id());
		System.out.println("\n EMP_Name  : " + employee.getEmp_name());
		System.out.println("\n EMP_SALARY  : " + employee.getEmp_salary());
	}
}
