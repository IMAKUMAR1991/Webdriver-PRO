package Selenium;

import java.util.Iterator;
import java.util.Set;

import javax.swing.SpringLayout.Constraints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Window {
@Test
public void irctc(){
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	driver.findElement(By.linkText("Alerts & Updates")).click();
	WebElement ale=driver.findElement(By.xpath("//*[text()='Alerts & Updates']"));
	Actions act = new Actions(driver);
	act.moveToElement(ale).click();
	Set<String> page=driver.getWindowHandles();
	Iterator<String> it= page.iterator();
	while(it.hasNext()){
		WebDriver want =driver.switchTo().window(it.next());
		String real=want.getTitle();
		System.out.println(real);
		if(real.contains("Flight")){
			System.out.println(real);
			break;
		}
	}
}
}
