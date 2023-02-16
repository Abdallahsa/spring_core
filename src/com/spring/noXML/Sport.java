package com.spring.noXML;

import org.springframework.stereotype.Component;

@Component
public class Sport implements SportInterface{

	@Override
	public void name() {
	System.out.println("I am sport");
		
	}

}
