package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire {
	public static void main(String[] agrs) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		//login the amazon
		driver.get("https://amazon.com");
	driver.findElement(By.id("nav-your-amazon")).click();
	driver.findElementById("ap_email").sendKeys("imanandkumar9891@gmail.com");
	driver.findElementById("ap_password").sendKeys("7631883767");
	driver.findElementById("signInSubmit").click();
	Thread.sleep(2000);

	//varifying userhomepage
	String expPage="amazon" ;
	String actTitle=driver.getTitle();
	System.out.println(actTitle); 
	if(actTitle.contains(expPage))
	{
		System.out.println("Page is varified==pass");
	}
	else
		System.out.println("page is not varified==fail");
	}
	}
