package com.spring.noXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Master implements masterInterface  {
	@Autowired
//	@Qualifier("football")
	private SportInterface sport;

	
	@Override
	public void name() {
		System.out.println("I am master");
		
	}

	@Override
	public void getSport() {
		this.sport.name();
	}

}
