package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class master implements masterInterface {
	@Autowired

 private SportInterface sport;


	public SportInterface getSport() {
	return sport;
}

	@Override
	public void start() {
		System.out.print("hhh");
		
	}

	@Override
	public void callMySport() {
		sport.mysport();
		
	}

}
