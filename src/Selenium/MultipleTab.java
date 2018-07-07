package Selenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleTab {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.co.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone7",Keys.ENTER);
		driver.findElement(By.xpath("//h2[text()='Apple iPhone 7 (Black, 32GB)']")).click();
		Set<String> s= driver.getWindowHandles();
	    Iterator<String> it = s.iterator();
	    String parent_id = it.next();
	    String child_id = it.next();
	    driver.switchTo().window(child_id);
	    driver.findElement(By.id("add-to-cart-button")).click();
	    driver.switchTo().window(parent_id);
	    driver.findElement(By.xpath("//h2[text()='Apple iPhone 7 (Jet Black, 128GB)']")).click();

	}

}
