package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JAVasce {
@Test
 public static void scroll(){
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
   	driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubta"
   			+ "g=dea1dda7-088e-4b2d-9be9-19dca0393c9c&ie=UTF8");
	WebElement wbe = driver.findElement(By.id("twotabsearchtextbox"));
	wbe.sendKeys("nokia", Keys.ENTER);
	
	WebElement wbe2=driver.findElement(By.xpath("//h2[text()='Nokia 105 (Dual SIM, White)']"));
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",wbe2);
	
	System.out.println(wbe2.getText());
	
    //  js.executeScript("window.scrollBy(0,1000)");  
	
	
    //  js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //Bottom to the page

	 
	// js.executeScript("arguments[0].scrollIntoView();", Element); horizontall scroll untill element is found.
	}
}
