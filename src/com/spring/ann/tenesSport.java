package com.spring.ann;

import org.springframework.stereotype.Component;

@Component("te")
public class tenesSport implements SportInterface {

	@Override
	public void mysport() {
		System.out.print("tens");
		
	}

}
