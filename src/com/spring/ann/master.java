package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class master implements masterInterface {
	@Autowired

 private Company comp;




	public Company getComp() {
		return comp;
	}



@Autowired
	public void setComp(Company comp) {
		this.comp = comp;
	}




	@Override
	public void name() {
		this.comp.start();
		
	}




	@Override
	public void callMySport() {
		// TODO Auto-generated method stub
		
	}

	

}
