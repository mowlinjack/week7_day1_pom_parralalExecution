package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}



	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	    return new CreateLeadPage(driver);
		}	
	
	
	
	public FindLeadsPage clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	    return new FindLeadsPage(driver);
		}	
	
	
	

}
