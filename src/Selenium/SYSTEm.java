package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SYSTEm {
	@Test
	public void OpenBrowser(){
	  System.setProperty("webdriver.chrome.driver", ".\\WebDriver\\DRIVER\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	}
}