package Selenium;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://sarkarinaukriblog.com/");
		//driver.switchTo().alert().dismiss();
		driver.switchTo().frame("google_ads_frame1");
		driver.findElement(By.id("ala1")).click();
	}
}
