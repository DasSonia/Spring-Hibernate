package com.lve2code.springdemo;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
	//Triangle triangle = new Triangle();
		
	BeanFactory factory = (BeanFactory) (new ClassPathXmlApplicationContext(new String[] {"file:src/com/lve2code/springdemo/spring.xml"}));
	HelloWorld objA = (HelloWorld)factory.getBean("helloWorld");
	
    objA.getMessage();
    objA.setMessage("I'm object A");
    objA.getMessage();
    HelloWorld objB = (HelloWorld)factory.getBean("helloWorld");

    objB.getMessage();
		
	}

}
