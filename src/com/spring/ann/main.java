package com.spring.ann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.userInterface;

public class main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
		
        masterInterface s2=cont.getBean("master",masterInterface.class);
        
        s2.name();
        cont.close();

	}

}
