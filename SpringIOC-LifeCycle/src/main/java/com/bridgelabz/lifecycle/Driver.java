package com.bridgelabz.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	Employee emp = (Employee)context.getBean("employee");
	System.out.println(emp);
	context.close();
	
	}
	
}
