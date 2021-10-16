package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
	
	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}


	


	public EditLeadPage updateCompanyNameEditLeadPage() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}
	
	
	public ViewLeadPage clickUpdateButtonEditLeadPage() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	

}
