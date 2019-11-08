package com.bridgelabz.iocusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.iocusingxml.Employee;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		context.close();

	}

}
