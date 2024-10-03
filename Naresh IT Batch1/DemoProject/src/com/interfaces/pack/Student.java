package com.interfaces.pack;

public class Student 
{
	private int rollNumber;
	private String name;
	private boolean isAttended;
	
	public Student(int rollNumber) {
		super();
		this.rollNumber = rollNumber;
	}

	public boolean getAttended() {
		System.out.println("Teacher accessed student attendance ");
		return isAttended;
	}

	public void setAttended(boolean flag) {
		if(!isAttended)
		this.isAttended = flag;
		System.out.println("Teacher assigned attendance to student");
	}
	
	
	

}
