package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.sun.jna.platform.FileUtils;

public class  Screenshot {
        {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.id("identifierId")).sendKeys("anandaltranicsit1991");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
        File srcfile= edriver.getScreenshotAs(OutputType.FILE);
        File dstfile = new File("WebDriver/test-output");
        try {
			org.apache.commons.io.FileUtils.copyFile(srcfile, dstfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}

