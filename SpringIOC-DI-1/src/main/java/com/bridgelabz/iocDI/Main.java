package com.bridgelabz.iocDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)  {
		
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	Triangle t= (Triangle)context.getBean("triangle");
	t.show();
	//((AbstractApplicationContext) context).close();
		
	}

}
