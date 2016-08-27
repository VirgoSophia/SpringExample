package com.tutorialspoint;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static Logger logger = Logger.getLogger(MainApp.class);
	public static void main(String[] args){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		logger.info("Going to create HelloWorld obj");
		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		logger.info("Exiting the program");
	}
}
