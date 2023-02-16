package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class master implements masterInterface {
 private SportInterface sport;
 @Autowired
	public master(SportInterface sport) {
	this.sport = sport;
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
