package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
    driver.findElement(By.linkText("Administrator System")).click();
	Thread.sleep(2000);
    
    // identify the Drodown
	WebElement wbe1 = driver.findElement(By.id("timeZoneName"));
    Select sel = new Select(wbe1);
    List<WebElement> lst= sel.getOptions(); // collection method
    System.out.println(lst.size());
    //display all the content from the dropdown
    System.out.println(lst.get(0).getText());
    for(int i =0; i<lst.size(); i++)
    {
    	System.out.println(lst.get(i).getText());
    }
}
}
