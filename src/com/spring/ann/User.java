package com.spring.ann;

import org.springframework.stereotype.Component;

@Component
public class User implements Company {

	@Override
	public void start() {
		System.out.println("I am User");
		
	}

}
