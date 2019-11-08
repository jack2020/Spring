package com.bridgelabz.autowiringbyname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Object bean = context.getBean("emp");
        System.out.println(bean);
	}

}
