package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://freejobalert.com/bank-jobs/");
		//driver.switchTo().alert().dismiss();
		driver.switchTo().frame("fb_xdm_frame_http");
		WebElement wbe=driver.findElement(By.className("img_ad"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		
		
	  
		

}
}