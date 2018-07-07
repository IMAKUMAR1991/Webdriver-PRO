package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handles_multipleWindow {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://irctc.co.in");
		driver.findElement(By.xpath("//span[text()='Cab / Bus']")).click();
		driver.findElement(By.linkText("Flight Tickets")).click();
		driver.findElement(By.linkText("IRCTC eWallet")).click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String IRCTC = "IRCTC, Flight Ticket, Air Ticket, Cheap Flight, Low Fare Flight";
		System.out.println("the size ofnew tab" + set.size());
		int count = 0;
		int flag = 0;
		for (int i = 0; i < set.size(); i++) {
			driver.switchTo().window(it.next());
			String actTitle = driver.getTitle();
			System.out.println(driver.getTitle());
			if (IRCTC.equals(actTitle)) {
				System.out.println("test case is pass");
				break;
			}
			count++;
			System.out.println("under for loop   " + count);
		}
		System.out.println("outside for loop   " + count);
	}

}
