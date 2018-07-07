package Selenium;

import java.util.concurrent.SynchronousQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://127.0.0.1/login.do;jsessionid=14qhamul4bn0g");
        // identify the element for un edit box
       WebElement wbe= driver.findElement(By.name("username"));
       // enter data in edit box
       wbe.sendKeys("admin");
       // identify the element for password editbox
       WebElement wbe1= driver.findElement(By.name("pwd"));
       //enter data in pwd edit box
       wbe1.sendKeys("manager");
       //idetify loginbuttonx
       WebElement wbe2= driver.findElement(By.id("loginButton"));
       //clik on login button
       wbe2.click();
      Thread.sleep(2000);
       String actName = driver.findElement(By.linkText("Administrator System")).getText();
       System.out.println(actName);
       String expName ="Administrator System";
       if(actName.equals(expName))
       {
    	   System.out.println("Homepage is displayed  testCase == pass");
       }
       
       // idenditify logoutbut
       WebElement wbe3= driver.findElement(By.xpath("//a[@class='logout']"));
       // click on logout buttton
       wbe3.click();
       driver.close();       
       
       
       
      
	}

	
	}
