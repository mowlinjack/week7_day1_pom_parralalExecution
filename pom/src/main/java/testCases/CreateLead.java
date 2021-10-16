package testCases;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	
	
	
	
	
	
	
	
	@Test()
	public void createLead() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.ClickLoginButton()
		.ClickCRM()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enetrPhoneNumber()
		.clickSubmit()
		.verifyLeadCreated();
     }
	
	
	
	
	
	
	
	

}
