package Interview;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;



public class Fluientw {
	@Test
	public void test(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement wbe= driver.findElement(By.linkText("Today's Deals"));
		wbe.click();
		String s2="//span[contains(text(),'JBL C100SI In-Ear Headphones with Mic (Black')]";
		WebElement wbe2= driver.findElement(By.xpath(s2));
		Wait wait = new FluentWait(driver)
				 
			  .withTimeout(10, TimeUnit.SECONDS)
			 
			    .pollingEvery(5, TimeUnit.SECONDS)
			 
			    .ignoring(NoSuchElementException.class);
		 WebElement foo = wait.until(new Function() {

			    public WebElement apply(WebDriver driver) {

			    return driver.findElement(By.id("foo"));

			    }

			   });
		 
		
		
		}
	}

