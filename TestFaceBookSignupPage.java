package com.vstl.assignment;

public class TestFaceBookSignupPage extends UtilitiesFunctions{

	public static void main(String[] args) {
		
		FaceBookSignupPage objFaceBookSignupPage = new FaceBookSignupPage();
		
		objFaceBookSignupPage.FaceBookSignupPage("https://www.facebook.com/r.php?locale=en_GB");
		
		objFaceBookSignupPage.setFirstName(getFirstName());
		
		objFaceBookSignupPage.setLastName(getLastName());
 
		objFaceBookSignupPage.setMobileNumber(getMobileNumber());
		
		objFaceBookSignupPage.setPassword("xyz123");
		
		objFaceBookSignupPage.setDateOfBirth(getDateOfBirth());
		
		objFaceBookSignupPage.getGender(getGender());
			
		objFaceBookSignupPage.closingBrowser();
	

	}

}
