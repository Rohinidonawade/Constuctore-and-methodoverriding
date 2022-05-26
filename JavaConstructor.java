package com.vstl.Constructor;

public class JavaConstructor {

	        // Default Constructor:-which is not having any body once the object will create it can be used with veriables.
	
	String strName;
	int intAge;
	public char[] strFirstName;
	
	         //No parameter:- which name is same as class name and not having any parameters.
	public void JavaConstructor() {	
		String strFirstName ="Rani";
		String strLastName ="Patil";
	   System.out.println("First name is: " +strFirstName);
	   System.out.println("Last name is: " +strLastName);
	}
	
	        // Parameterized Constructor:-A constructor which has a specific number of parameters
	        //one parameter
	public void JavaConstructor(int intRollNumber) {
		System.out.println("Student Roll number :" +intRollNumber);		
	}
	
	       //Two parameter
	public void JavaConstructor(String strCollageName, char charGrade) {
		System.out.println("Collage name :" +strCollageName);	
		System.out.println("Collage Grade :" +charGrade);		
	}
}
