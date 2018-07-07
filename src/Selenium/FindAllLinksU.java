package Selenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinksU {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://amazon.com");
	String X="//div[text()='Make Money with Us']/Following-sibling::ul[*]/li/a";
	java.util.List<WebElement> lst1= driver.findElements(By.xpath(X));
	}

}
