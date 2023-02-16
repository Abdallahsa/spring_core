package com.spring.noXML;

import org.springframework.stereotype.Component;

@Component
public class Football implements SportInterface {

	@Override
	public void name() {
	System.out.println("I am football");
		
	}

}
