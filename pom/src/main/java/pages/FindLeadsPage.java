package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import baseClass.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	
	public FindLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public static String leadID;

	public FindLeadsPage clickPhoneTabFindLeads() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
    }
	
	public FindLeadsPage enterPhoneNumberFindLeads() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
    }
	
	
	public FindLeadsPage enterLeadID() throws Exception {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	
	public FindLeadsPage clickFindLeadsButtons() throws Exception {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	
	
	public ViewLeadPage selectFirstList() throws Exception {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}
	
	
	public FindLeadsPage GetLeadIDFirstList() throws Exception {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		return this;
	}
	
	
	public FindLeadsPage VerifyLeadDeletedFindLead() throws Exception {
		String text = driver.findElement(By.className("x-paging-info")).getText();
	Assert.assertEquals(text.equals("No records to display"), true);
	return this;	
 	}
	
	
	
}
