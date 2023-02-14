package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sports.ioc.Sport;

public class Main {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
			
	        userInterface s2=cont.getBean("user",userInterface.class);
	        s2.start();
	        s2.getperson();
	        cont.close();

	}

}
