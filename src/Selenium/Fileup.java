package Selenium;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class fileup(){
	
}

public class Fileup {
	public void static main(String[] args) throws AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://my.naukri.com/account/createaccount");
		driver.findElement(By.xpath("//button[@class='action-btn fresh']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Robot robot = new Robot();
		for(int i=0; i>=5;i++){
		    robot.keyPress(KeyEvent.VK_TAB);
		}
		
	}

}
