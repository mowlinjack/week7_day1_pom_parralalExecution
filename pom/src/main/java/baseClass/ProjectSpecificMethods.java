package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	
 public ChromeDriver driver;
	
	

 
 @BeforeMethod
	public void launchChrome() {
    WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	System.out.println(driver);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 }
 
 
 
 @AfterMethod
	public void CloseDriver() {
    
	 driver.close();
 }
 
 
 
 
}
