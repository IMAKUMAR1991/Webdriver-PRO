package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=14qhamul4bn0g");
		// identify the element for un edit box
		WebElement wbe = driver.findElement(By.name("username"));
		// enter data in edit box
		wbe.sendKeys("admin");
		// identify the element for password editbox
		WebElement wbe1 = driver.findElement(By.name("pwd"));
		// enter data in pwd edit box and click Enterkey
		wbe1.sendKeys("manager", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> lst1 = driver.findElements(By.xpath("//a"));
		System.out.println(lst1.size());
		String s2 = driver.findElement(By.xpath("//td[@class='listtblcolheader_submit_tt'][1]")).getText();
		System.out.println("******************************************************" + s2);
		// display link name
		for (int i = 0; i < lst1.size(); i++) {
			System.out.println(lst1.get(i).getText());
		}
		List<WebElement> lst2 = driver.findElements(By.xpath("//select"));
		{
			System.out.println("size of DROPDOWN " + "  " + lst2.size());
			for (int j = 0; j < lst2.size(); j++) {
				System.out.println(lst1.get(j).getText());
			}
			List<WebElement> lst3 = driver.findElements(By.xpath("//option"));
			System.out.println("SIZE OF DROPDOWN 2" + "    " + lst3.size());
			{
				for (int j = 0; j < lst2.size(); j++) {
					System.out.println(lst1.get(j).getText());
				}
				List<WebElement> lst4 = driver.findElements(By.tagName("input"));
				System.out.println("SIZE OF tagname" + "    " + lst4.size());
				{
					for (int j = 0; j < lst4.size(); j++) {
						System.out.println(lst4.get(j).getText());
					}
					List<WebElement> lst5 = driver.findElements(By.tagName("input"));
					System.out.println("SIZE OF tagname" + "    " + lst4.size());
					{
						for (int j = 0; j < lst5.size(); j++) {
							System.out.println(lst4.get(j).getAttribute("value"));
							System.out.println(lst4.get(j).getAttribute("a"));
							driver.close();
						}
					}
				}
			}
		}
	}
}