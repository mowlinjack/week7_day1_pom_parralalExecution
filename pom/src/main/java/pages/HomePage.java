package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	
	
	
 public HomePage(ChromeDriver driver) {
			this.driver = driver;
			
		}

public MyHomePage ClickCRM() {
		
	driver.findElement(By.linkText("CRM/SFA")).click();
	
    return new MyHomePage(driver);
	
}

}
