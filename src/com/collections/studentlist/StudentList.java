package com.collections.studentlist;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	private List<String> studentList = new ArrayList<>();

	public void addStudent(String name) {
		studentList.add(name);
	}

	public boolean searchStudent(String name) {
		if (studentList.contains(name)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		
		for (int i = 0; i < 10; i++) {
			studentList.addStudent("Student : " + i);
		}
		
		for (int i = 0; i < 15; i++) {
			System.out.println(studentList.searchStudent("Student : " + i)); // last 5 should be false
		}
	}

}
