package Selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selecta {
	@Test
	public void dropdown(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=1npnq0om7owzv");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.linkText("Administrator System")).click();
		WebElement drop=driver.findElement(By.id("timeZoneName"));
		Select sal= new Select(drop);
        ArrayList<WebElement>lst= new ArrayList<>();
        lst.addAll(sal.getOptions());
        System.out.println(lst.size());
	 for(int i =0; i<lst.size();i++)      
	    {
	    	System.out.println(lst.get(i).getText());
	    }    		
	}
	/*
	    ArrayList lst= new ArrayList<>();
        lst.addAll(sal.getOptions());
        System.out.println(lst.size());
	    for(int i =0; i<lst.size();i++)      
	    {
	    	System.out.println(((WebElement) lst.get(i)).getText());
	    }    		
	 */
}
