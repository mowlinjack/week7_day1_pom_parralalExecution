package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import baseClass.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public String text;
	public String leadID;
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}


	public ViewLeadPage verifyLeadCreated() {
		driver.findElement(By.xpath("(//div[contains(text(),'Lead')])[2]")).isDisplayed();
		return this;
	}
	
	
	public ViewLeadPage verifyLeadUpdated() {
		text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		Assert.assertEquals(text.contains("TCS"), true);  
		System.out.println(" Lead Updated successfully");
		return this;
	}
	
	
	
	
	public EditLeadPage clickEditViewLeads() throws Exception {
	driver.findElement(By.linkText("Edit")).click();
	return new EditLeadPage(driver);
	}
	
	
	public MyLeadsPage clickDeleteViewLeads() throws Exception {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);
    }
	
	

    
    
    
	
	
	
	

//


	

//
//driver.findElement(By.name("submitButton")).click();
	

}
