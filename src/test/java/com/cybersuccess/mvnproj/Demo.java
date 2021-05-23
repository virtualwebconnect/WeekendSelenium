package com.cybersuccess.mvnproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void mavenOne() throws InterruptedException
  {	WebDriver driver=new ChromeDriver();
  	driver.get("http://facebook.com");
  	Thread.sleep(3000);
  	driver.quit();
	  
  }
}
