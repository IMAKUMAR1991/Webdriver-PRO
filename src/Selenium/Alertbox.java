package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertbox {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https:/irctc.co.in");
		driver.findElement(By.id("usernameId")).sendKeys("gfsghdhjfh",Keys.ENTER);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.findElement(By.id("usernameId")).sendKeys("gfsghdhjfh");
		driver.findElement(By.name("j_password")).sendKeys("lshfashsakn",Keys.ENTER);
		Alert alt2=driver.switchTo().alert();
		System.out.println(alt2.getText());
		
		
		
			}

}
