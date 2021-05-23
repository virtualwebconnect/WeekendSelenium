package com.cybersuccess.mvnproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void mavenTwo() throws InterruptedException
	{	WebDriver driver=new FirefoxDriver();
  		driver.get("http://gmail.com");
  		Thread.sleep(3000);
  		driver.quit();
	}
}
