package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
@Scope("prototype")
@Component
public class Admin  implements Person {

	@Override
	public void name() {
		System.out.println("I am Admin");
		
	}
	@PostConstruct
	public void start() {
		System.out.println("start now");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("End now");
	}

}
