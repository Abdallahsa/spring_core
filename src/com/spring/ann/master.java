package com.spring.ann;

import org.springframework.stereotype.Component;

@Component("master")
public class master implements masterInterface {

	@Override
	public void start() {
		System.out.print("hhh");
		
	}

}
