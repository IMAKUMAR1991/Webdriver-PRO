package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

		public static void main(String[] args) {
			 WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			
			 driver.navigate().to("https://google.com");
			 driver.findElement(By.id("lst-ib")).sendKeys("face");
			 driver.findElement(By.xpath("//ul[ @class='sbsb_b']")).click();
	}
}
