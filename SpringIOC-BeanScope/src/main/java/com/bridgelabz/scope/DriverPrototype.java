package com.bridgelabz.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverPrototype {


	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		
		Employee emp1 = (Employee)context.getBean("emp");
		emp1.setId(111);
		emp1.setName("Ramesh");
	
		System.out.println(emp1.getId()+ " " + emp1.getName());
		
		Employee emp2 = (Employee)context.getBean("emp");
		emp2.setId(222);
		emp2.setName("Ramu");
	  
	    System.out.println(emp2.getId()+" "+emp2.getName());
	    ((AbstractApplicationContext) context).close();
	
	}
	
}
