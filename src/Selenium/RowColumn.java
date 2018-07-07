package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RowColumn {
	@Test
	public void countrowcolumn(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://stackoverflow.com/questions/14831041/how-to-count-no-of-rows-"
				+ "in-table-from-web-application-using-selenium-python-webd");
	
		int rowCount=driver.findElements(By.tagName("tr")).size();

		int columnCount=driver.findElements(By.tagName("td")).size();  /////div[@class="form-item"]/table/tbody/tr find specific row n column 
		System.out.println(rowCount+"          "+columnCount);
	}

}
