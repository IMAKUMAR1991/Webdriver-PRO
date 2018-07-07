package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleNegativeAmazon {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 3; i++) {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://amazon.com/");
			driver.findElementByLinkText("Your Amazon.com").click();
			Thread.sleep(2000);
			WebElement wbe1 = driver.findElementById("ap_email");
			WebElement wbe2 = driver.findElementById("ap_password");
			WebElement wbe3 = driver.findElementById("signInSubmit");

			if (i == 1) {// negative test case for wrong password
				wbe1.sendKeys("imanandkumar9891@gmail.com");
				wbe2.sendKeys("74212912381");
				wbe3.click();
			}

			else if (i == 2) {// negative test case for wrong username
				wbe1.sendKeys("imanandkumar@gmail.com");
				wbe2.sendKeys("74212912381");
				wbe3.click();
			}

			else if (i == 3) {// negative test case for wrong username and wrong
								// password
				wbe1.sendKeys("imanand9891@gmail.com");
				wbe2.sendKeys("as74212912381As");
				wbe3.click(); 
			}

			String actName = driver.findElementByXPath("//span[@class='a-list-item']").getText();
			//System.out.println(actName);
			String expName1 = "To better protect your account, please re-enter your password and then enter the characters as they are shown in the image below.";

			String expName2 = "Your password is incorrect";
			String expName3 = "We cannot find an account with that email address";

			if (expName1.equals(actName) || expName2.equals(actName) || expName3.equals(actName)) {
				System.out.println(actName);
				System.out.println("Your password is incorrect ==pass");
			} else {
				System.out.println("Testcase==fail");
			}
			driver.close();
		}
	}
}

	
