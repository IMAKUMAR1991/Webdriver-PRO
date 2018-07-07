package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Interview {
	@Test
	public void check(){
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	    driver.findElement(By.cssSelector("input#identifierId")).sendKeys("ANANDALTRANICSIT1991",Keys.ENTER);
	    driver.findElement(By.cssSelector(".aCsJod.oJeWuf")).sendKeys("7631883767");
	    driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}
}
