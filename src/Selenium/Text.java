package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text {
	
public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("http://127.0.0.1/login.do");
WebElement wbe= driver.findElement(By.xpath("//table[@class='firs"
		+ "tLoginTooltip']/tbody/tr[3]/td[2][@class='i']"));
System.out.println(wbe.getText());

	}

}
