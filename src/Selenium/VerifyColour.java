package Selenium;

 import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyColour {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver = new FirefoxDriver();
	
	//maximize windows size
	driver.manage().window().maximize();
	
	// get size in 2 ways
	System.out.println(driver.manage().window().getSize());
	Dimension dem2 = driver.manage().window().getSize();
	System.out.println(dem2);
	
	// set dimension its minimum vale is(316,143)
	Dimension dem = new Dimension(1,1);
	driver.manage().window().setSize(dem);
	System.out.println(driver.manage().window().getSize());
	driver.manage().window().maximize();
	
	//navigate browser with history
	driver.navigate().to("http://127.0.0.1/login.do;jsessionid=7abtkhf8e90ec");
	//verify editbox default value  //to get default attribute
	WebElement wbe5= 	driver.findElement(By.name("username"));
	 String actValue = wbe5.getAttribute("area-label");
		System.out.println("the default attribute value"+" == "+actValue);
		//get location
		Point p = wbe5.getLocation();
		System.out.println("X value=="+p.getX()+"  "+"Y value=="+p.getY());
		Dimension d = wbe5.getSize();
		System.out.println("Height=="+d.getHeight()+"  "+"Width=="+d.getWidth());
    wbe5.sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
	
	// Navigate checkbox
	WebElement wbe2 = driver.findElement(By.id("keepLoggedInCheckBox"));
	
	// to check checkbox is slected or not
	boolean b1=wbe2.isSelected();
	System.out.println(b1);
	
	//to check checkbox is slected or not after clicking
	wbe2.click();
	System.out.println(wbe2.isSelected());
	WebElement wbe1 = driver.findElement(By.xpath("//a[@id='loginButton']"));
	//Verification of login button
	String acTcolour = wbe1.getCssValue("background-color");
	System.out.println("login Button  Color"+" " +acTcolour);
	
	//Thread.sleep(2000);
	wbe1.click();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Administrator System")).click();
	
	driver.navigate().back();
	
	// refresh button
	driver.navigate().refresh();
	
	//delete all the browser cookies and history
	driver.manage().deleteAllCookies();
	
	//close browser
	driver.close();
	System.out.println("firefox closed");
	
	}
}
