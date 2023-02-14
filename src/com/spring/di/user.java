package com.spring.di;

public class user implements userInterface {
private personInterface person;
 public user(personInterface person) {
	 this.person=person;
 }
	public void start() {
	System.out.println("I am user");
	}
	
	public void getperson() {
		this.person.begin();
	}
}
