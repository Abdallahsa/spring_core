package com.spring.ann;

import org.springframework.stereotype.Component;

@Component
public class Cleint implements Company {

	@Override
	public void start() {
		System.out.println("I am Cleint");
		
	}

}
