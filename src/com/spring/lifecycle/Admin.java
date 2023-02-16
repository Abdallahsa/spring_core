package com.spring.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Admin  implements Person {

	@Override
	public void name() {
		System.out.println("I am Admin");
		
	}

}
