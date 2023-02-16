package com.spring.noXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.userInterface;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(javaConfige.class);
		
        Manger s2=cont.getBean("manger",Manger.class);
      System.out.println(s2.getEmail());
      System.out.println(s2.getTeam11());
        cont.close();

	}
	
}
