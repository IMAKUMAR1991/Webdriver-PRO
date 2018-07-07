package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class $Before {
	WebDriver driver;
	@BeforeClass
	public void startbrowser(){
		 driver = new FirefoxDriver();
	}
	@AfterClass
	public void closebrowser(){
		driver.close();
	}
	

}
