package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CHROME {
	@Test
	public void Chrome() throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "E:\\My Programs\\lpg\\WebDriver\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
	}
}
