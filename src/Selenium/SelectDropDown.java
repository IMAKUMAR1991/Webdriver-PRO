package Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
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
	    Select sel = new Select(driver.findElement(By.id("timeZoneName")));
	    ArrayList a1= new ArrayList();
        a1.add(sel.getOptions().get(0).getText());
	    a1.add(sel.getOptions().get(1).getText());
	    a1.add(sel.getOptions().get(2).getText());
	    a1.add(sel.getOptions().get(3).getText());
	    System.out.println(a1.get(0));
	    /*    ArrayList<WebElement>lst=(ArrayList<WebElement>) sel.getOptions();   /*
	    for(int i =0; i<lst.size();i++)      
	    {
	    	System.out.println(lst.get(i).getText());
	    }    */
	    driver.close();

}
}
