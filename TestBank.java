package com.vstl.methodOverriding;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank objHDFCBank = new HDFCBank();
		objHDFCBank.getMoneyCredits();
		
		objHDFCBank.getMin_Balance(1000);
		
		objHDFCBank.getWithDrow(500, 50000);
				
	}
}
