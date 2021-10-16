package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	 public LoginPage(ChromeDriver driver) {
			this.driver = driver;
			
		}
	
	public LoginPage enterUsername() {
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");	
    return this;
	}
	
	
	public LoginPage enterPassword() {
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
	    return this;
		}
	
	
	
	public HomePage ClickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new HomePage(driver);
	    
		}
	
	
	
	
	
	

}
