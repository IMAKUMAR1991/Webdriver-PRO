package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google_ {
	@Test
	public void Anand(){
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("nokia");
		driver.findElement(By.className("sbqs_c")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @name='btnK']")).click();
}

}
