package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fileupload {
	public static WebDriver driver;
	  @Test
	  public void upload(){
		  driver= new FirefoxDriver();
		  driver.get("https://my.naukri.com/account/createaccount");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//button[@class='action-btn fresh']")).click();
			WebElement wbe=driver.findElement(By.xpath("//input[@type='file']"));
		  }
	  }

