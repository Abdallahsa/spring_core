package com.spring.noXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manger {

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam11() {
		return team11;
	}
	public void setTeam11(String team11) {
		this.team11 = team11;
	}
	@Value("${user.email}")
	private String email;
	@Value("${user.team}")
	private String team11;
	
	
}
