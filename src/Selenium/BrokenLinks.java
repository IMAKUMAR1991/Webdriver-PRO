package Selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		String url;
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/selenium-webdriver/implicit-explicit-n-fluent-wait/");
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		System.out.println(tag.size());
		Iterator<WebElement> it = tag.iterator();
		while (it.hasNext()) {
			url = it.next().getAttribute("href");
			URL link;
			try {
				link = new URL(url);

				HttpURLConnection htp = (HttpURLConnection) link.openConnection();
				htp.setConnectTimeout(2000);
				// htp.setRequestMethod("HEAD");
				htp.connect();
				int resopnseCode = htp.getResponseCode();
				if (resopnseCode >= 400) {
					System.out.println(url + "  broken links" + htp.getResponseMessage());

				} else {
					System.out.println(url + "valid link" + htp.getResponseMessage());
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}

		}

	}
}
