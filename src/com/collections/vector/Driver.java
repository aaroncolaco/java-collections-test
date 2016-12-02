package com.collections.vector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	
	public static void main(String[] args) throws IOException {
		
		Driver driver = new Driver();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String choice = "";
		
		// rough test
		/*driver.addName(new Name("John", "Doe"));
		driver.addName(new Name("Jane", "Doe"));
		
		driver.addName(new Name("John", "Smith"));
		driver.addName(new Name("Jane", "Smith"));
		
		System.out.println("Name count: " + driver.getNameCount());
		
		driver.printNames();*/
		
		do {
			System.out.println("Press");
			System.out.println(" 1. To enter name");
			System.out.println(" 2. To display name count");
			System.out.println(" 3. To quit");
			choice = br.readLine();
			
			switch (choice) {
			case "1":
				System.out.println("Enter name: ");
				String[] nameStrings = br.readLine().trim().split(" ");
				Name name = new Name(nameStrings[0], nameStrings[1]);
				driver.addName(name);
				System.out.println("Added name\n");
				System.out.println();
				break;

			case "2":
				System.out.println("Name count: " + driver.getNameCount());
				System.out.println();
				break;
				
			case "3":
				System.out.println("Goodbye . . .");
				break;
			}
			
		} while (!choice.trim().equalsIgnoreCase("3"));
	}

}
