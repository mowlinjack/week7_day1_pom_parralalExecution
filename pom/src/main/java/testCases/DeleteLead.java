package testCases;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLead extends ProjectSpecificMethods {
	
	 
	
	

	@Test()
	public void editLead() throws Exception {
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.ClickLoginButton()
		.ClickCRM()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTabFindLeads()
		.enterPhoneNumberFindLeads()
		.clickFindLeadsButtons()
		.GetLeadIDFirstList().
		selectFirstList().
		clickDeleteViewLeads().
		clickFindLeads().
		enterLeadID().
		clickFindLeadsButtons().
		VerifyLeadDeletedFindLead();
		
		
     }
	
	
	
	

}
