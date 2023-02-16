package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.userInterface;

public class main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
			
	        Person s2=cont.getBean("admin",Person.class);
	        Person s1=cont.getBean("admin",Person.class);
	      System.out.print(s1==s2);
	        cont.close();

	}

}
