package com.collections.vector;

public class Name {
	private String firstName, surname;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Name(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}

	public Name() {
		this.firstName = this.surname = "";
	}
}
