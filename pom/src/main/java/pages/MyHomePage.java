package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{


public MyHomePage(ChromeDriver driver) {
		
	this.driver = driver;
	}



public MyLeadsPage clickLeads() {
	driver.findElement(By.linkText("Leads")).click();
    return new MyLeadsPage(driver);
	}


}
