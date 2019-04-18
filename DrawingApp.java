package com.lve2code.springdemo;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
	//Triangle triangle = new Triangle();
		
	BeanFactory factory = (BeanFactory) (new ClassPathXmlApplicationContext(new String[] {"file:src/com/lve2code/springdemo/spring.xml"}));
	Triangle triangle = (Triangle)factory.getBean("triangle");
		
	triangle.draw();
	}

}
