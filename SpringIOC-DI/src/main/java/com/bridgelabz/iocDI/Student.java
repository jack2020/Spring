package com.bridgelabz.iocDI;

public class Student {
	
	private int id;
	
	
	private String studentName ;
 
	public void displayName()
	{
		System.out.println("Student Name "+ studentName + " Roll NO ====" + id);
	}

	

	public Student(int id) {
		this.id = id;
	}



	public Student(int id, String studentName) {
		
		this.id = id;
		this.studentName = studentName;
	}

}
