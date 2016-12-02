package com.collections.vector;

import java.util.Vector;

public class Driver {
	private Vector<Name> nameVector = new Vector<>();
	
	public void addName(Name name) {
		nameVector.addElement(name);
	}
	
	public int getNameCount() {
		return nameVector.size();
	}
	
	public void printNames() {
		for (Name name : nameVector) {
			System.out.println("First Name: " + name.getFirstName() + ", Surname: " + name.getSurname());
		}
	}
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		driver.addName(new Name("John", "Doe"));
		driver.addName(new Name("Jane", "Doe"));
		
		driver.addName(new Name("John", "Smith"));
		driver.addName(new Name("Jane", "Smith"));
		
		System.out.println("Name count: " + driver.getNameCount());
		
		driver.printNames();
	}

}
