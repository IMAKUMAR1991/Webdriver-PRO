package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Cruser_Move {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=14qhamul4bn0g");
		WebElement wbe = driver.findElement(By.name("username"));
		wbe.sendKeys("admin");
		WebElement wbe1 = driver.findElement(By.name("pwd"));
		wbe1.sendKeys("manager", Keys.ENTER);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement wbe2 = driver.findElement(By.xpath("//div[@class='navBg']/table/tbody/tr[1]/td[9]"));
		wbe2.click();
		Thread.sleep(2000);
		WebElement wbe3=driver.findElement(By.xpath("//input[@value='Create New User']"));
		//wbe3.click();
		act.click(wbe3);
		List<WebElement> lst1 =driver.findElements(By.xpath("//a"));
		{
			System.out.println("size of DROPDOWN " + "  " + lst1.size());
			for (int j = 0; j < lst1.size(); j++) {
				System.out.println(lst1.get(j).getText());
			}
	
	}
}
}
