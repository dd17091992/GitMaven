package com.test.JenkinsProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GitProject 
{
  WebDriver driver;
  @Test
  public void f() 
  {
	  System.out.println("Git Jenkins Project");
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://dev.tracko.co.in/");
	  
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() 
  {
	 driver.quit(); 
  }

}
