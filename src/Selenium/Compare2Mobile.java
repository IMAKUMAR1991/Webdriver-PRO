package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Compare2Mobile {

	public static void main(String[] args) {
	WebDriver driver =new FirefoxDriver();
	driver.get("https://flipkart.com");
	driver.findElement(By.className("LM6RPg")).sendKeys("nokia lumia 520",Keys.ENTER);
	driver.findElement(By.xpath())

	}

}
