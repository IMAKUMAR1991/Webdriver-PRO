package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;////span[@class='a-button-inner']/a[@id='a-autoid-1-announce']
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amazon {
@Test
public void run(){
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
    driver.get("https://www.amazon.in/gp/goldbox/ref=nav_cs_gb");
  
    
	WebElement wbe=driver.findElement(By.linkText("Today's Deals"));
	wbe.click();
	 String s1= "//span[contains(text(),'349') and @class='a-size-medium a-color-base inlineBlock unitLineHeight']/../../following-sibling::div[5]";
	    WebElement wbe2= driver.findElement(By.xpath("s1"));
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",wbe2);
	wbe2.click();
	driver.close();
	
}
}