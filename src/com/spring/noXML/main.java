package com.spring.noXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.userInterface;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(javaConfige.class);
		
        masterInterface s2=cont.getBean("myMaster",masterInterface.class);
        s2.name();
        s2.getSport();
        cont.close();

	}
	
}
