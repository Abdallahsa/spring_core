package com.spring.di;

public class user implements userInterface {
private personInterface person;
private String email;
private String team;

	public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

	public void start() {
	System.out.println("I am user");
	}
	
	public void getperson() {
		this.person.begin();
	}
	
	@Override
	public void setperson(personInterface person) {
		 this.person=person;
		
	}
	public void starts() {
		System.out.println("start");
	}
	public void end() {
		System.out.println("end");
	}
}
