package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Explicitprog {
	@Test
			public void rune(){
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.amazon.in");
				driver.findElement(By.linkText("Today's Deals")).click();
				ExplicitWAit l1= new ExplicitWAit();
				WebElement wbe1=driver.findElement(By.xpath("Customer Service"));
				l1.waitForElementPresent(wbe1);
			}
		}