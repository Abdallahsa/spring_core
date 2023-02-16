package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("master")
public class master implements masterInterface {
	@Autowired
    @Qualifier("cleint")
 private Company comp;





	@Override
	public void name() {
		this.comp.start();
		
	}




	@Override
	public void callMySport() {
		// TODO Auto-generated method stub
		
	}

	

}
