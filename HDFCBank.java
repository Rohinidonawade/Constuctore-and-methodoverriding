package com.vstl.methodOverriding;

public class HDFCBank extends Bank{
	
	@Override
	//The method name and parameter is same but having different behavior.
	public void getMoneyCredits() {
		System.out.println("500 Amount get credited");
	}
	
	public void getMin_Balance(int intNum) {
		System.out.println("My Account Minimum balance is :" +intNum);
	}
	
	public void getWithDrow(int intMin_Amount, int intMax_Amount) {
		System.out.println("I can Withdro minimum amount is :" +intMin_Amount);
		System.out.println("I can Withdro maximum amount is :" +intMax_Amount);
	}
}
