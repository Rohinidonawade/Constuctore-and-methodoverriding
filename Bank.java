package com.vstl.methodOverriding;

public class Bank {
	
	//Method overriding:-Same method is present in parent and Child class with same name and same number of parameter.
    //Run time environment.
	public void getMoneyCredits() {
		System.out.println("Amount get credited");
	}

	public void getMin_Balance(int intNum) {
		System.out.println("In Account Minimum balance :" +intNum);
	}
	
	public void getWithDrow(int intMin_Amount, int intMax_Amount) {
		System.out.println("Minimum withdrow amount :" +intMin_Amount);
		System.out.println("Maximum withdrow amount :" +intMax_Amount);
	}
}
