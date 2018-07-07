package Selenium;

import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class City {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		System.out.println(driver.getClass().getName());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
		List<WebElement> lst = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div/p"));
		String aspMsg = "Ahmed23abad"; int count = 0;
		for (int i = 0; i < lst.size(); i++) {
			String s1 = lst.get(i).getText();
			System.out.println(s1);
		}
		for (int j = 0; j < lst.size(); j++) {
			String s2 = lst.get(j).getText();
			//System.out.println(s2);
			if(s2.contains(aspMsg)){
				System.out.println("===============the value    "+s2);
				break;
				}
			count++;
			if(count==lst.size())
			{
				System.out.println("value is not found");
			}
		}
		System.out.println(count);

		driver.close();
	}

}
