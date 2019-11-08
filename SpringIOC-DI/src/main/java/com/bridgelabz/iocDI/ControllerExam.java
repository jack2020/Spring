package com.bridgelabz.iocDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ControllerExam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student stu = context.getBean("student",Student.class);
		stu.displayName();
		
		Student stu1 = context.getBean("dilip",Student.class);
		stu1.displayName();
		
	}
} 
