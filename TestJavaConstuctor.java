package com.vstl.Constructor;

public class TestJavaConstuctor {

	public static void main(String[] args) {
		
		JavaConstructor objJavaConstructor = new JavaConstructor();
		//default parameter
		System.out.println(objJavaConstructor.strName);
		
		//no parameter
		objJavaConstructor.JavaConstructor();	

		//one parameter
		objJavaConstructor.JavaConstructor(60);	
		
		//two parameter
		objJavaConstructor.JavaConstructor("Shivanand",'B');	

		
	}

}
