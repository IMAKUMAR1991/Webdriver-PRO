package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Geth {
	@Test
	public void run(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//driver.findElement(By.xpath("//a[text()='Flights']")).click();
		driver.findElement(By.linkText("Alerts & Updates")).click();
		String s1= driver.getWindowHandle();
		System.out.println(s1);
		driver.switchTo().window(s1);	
	}
}
