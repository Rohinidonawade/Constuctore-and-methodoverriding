package com.vstl.assignment;

import java.util.GregorianCalendar;
import java.util.Random;

public class UtilitiesFunctions {

	      //FirstName
	public static String getFirstName() {
	String strFirstName = " ";
		String strArray[] = {"Rohini","Sanjay","Rohan","Rina","Seema","Anand","Priya","Chaitali"};
		strFirstName = strArray[new Random().nextInt(strArray.length)];
		return strFirstName;		
	}
	
	      //LastName
	public static String getLastName() {
		String strLastName = " ";
		String strArray[] = {"Donawade","Patil","Salagare","Tendulkar","Hajare","Khot","Mutnale","Bhuvi"};
		strLastName = strArray[new Random().nextInt(strArray.length)];
		return strLastName;		
	}

         //MobileNumber
	public static String  getMobileNumber() {
		Random rd=new Random();
		String strMobileNumber=" ";
		
		int intMobileNo;
		String str[]=new String[10];
		
		for(int intNum=0;intNum<10;intNum++) {
			intMobileNo= rd.nextInt(10);
			
			 str[intNum]=Integer.toString(intMobileNo);
			}		
		return strMobileNumber = str[0]+str[1]+str[2]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9];		
		}
	
	      //DateOfBirth
	public static String getDateOfBirth() {
		GregorianCalendar objGregorianCalendar = new GregorianCalendar();
       int intYear = randBetween(1970,2004);
       objGregorianCalendar.set(objGregorianCalendar.YEAR, intYear);
       
       int intDayOfYear =randBetween(1,objGregorianCalendar.getActualMaximum(objGregorianCalendar.DAY_OF_MONTH));
       objGregorianCalendar.set(objGregorianCalendar.DAY_OF_MONTH, intDayOfYear);  
       
  String strDateOfYear =(objGregorianCalendar.get(objGregorianCalendar.YEAR) +"-"+(objGregorianCalendar.get(objGregorianCalendar.MONTH)+1)+"-"+objGregorianCalendar.get(objGregorianCalendar.DAY_OF_MONTH));
       System.out.println(strDateOfYear);
       return strDateOfYear;
	}
	
          private static int randBetween(int start, int end) {			
			return start + (int)Math.round(Math.random() * (end - start));
		}
		
		//Gender
	public static String getGender() {
		String strGender = "Male";
		if(strGender.equals("Male")) {
		System.out.println("Person is Male");
		}
		else {
			System.out.println("Person is Female");
		}
		return strGender;
    }
}

   
