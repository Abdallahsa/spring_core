package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.userInterface;

public class main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
			
	        Person s2=cont.getBean("admin",Person.class);
	        s2.name();
	        cont.close();

	}

}
