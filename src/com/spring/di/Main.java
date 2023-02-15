package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sports.ioc.Sport;

public class Main {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
			
	        userInterface s2=cont.getBean("user",userInterface.class);
	        userInterface s1=cont.getBean("user",userInterface.class);
	        System.out.println(s1);
	        System.out.println(s2);
	        System.out.println(s1==s2);
	        s2.start();
	        s2.getperson();
	        System.out.print(s2.getEmail()+" "+s2.getTeam());
	        cont.close();

	}

}
