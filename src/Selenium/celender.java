package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class celender {
@Test
public void calender() throws Throwable{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.makemytrip.com/flights?cmp=SEM|D|DF|G|Brand"
			+ "|B_M_Makemytrip_Variants|Brand-Terms_Exact|169825637432&s_kwcid=AL!1631!3!"
			+ "169825637432!e!!g!!make%2520a%2520my%2520trip&"
			+ "ef_id=WZSyqgAAABTbRQGI%3A20180311083918%3As");
	driver.findElement(By.id("hp-widget__depart")).click();
	WebElement date=driver.findElement(By.xpath("//td[@data-year='2018' and @data-month='3']/a[text()='20']"));
	int monthcount=0;
	while(monthcount<24){
		try {
			date.click();
			break;
			
		} catch (Exception e) {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			monthcount++;
			}
		}
	if(monthcount==24){
		System.out.println("invalid date");
	}
	}
}
