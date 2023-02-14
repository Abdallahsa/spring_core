package com.sports.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
		
        Sport s2=cont.getBean("mysport",Sport.class);
        s2.start();
        cont.close();

}
	
}
