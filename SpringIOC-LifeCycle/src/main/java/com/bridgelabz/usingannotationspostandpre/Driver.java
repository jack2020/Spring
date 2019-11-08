package com.bridgelabz.usingannotationspostandpre;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		context.close();

	}
}
