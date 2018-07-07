package Selenium;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail_Dropdown {

    public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.google.com/SignUp?serv"
				+ "ice=mail&continue=https%3A%2F%2Fmail"
				+ ".google.com%2Fmail%2F&ltmpl=default");
		WebElement wbe=  driver.findElement(By.xpath("//select[@id='lang-chooser']"));
		Select sel = new Select(wbe);
		List<WebElement> lst = sel.getOptions();
		System.out.println("total no of options   "+lst.size());
		sel.selectByIndex(5);
		for(int i =0; i<lst.size(); i++)
		{
			System.out.println(lst.get(i).getText());
		}
	}
	}
