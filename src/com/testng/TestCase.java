package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {
	public WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
		
	}
	@Test
	public void verifyPageTitle()
	{
		driver.get("http://google.com");
		String title=driver.getTitle();
		Assert.assertEquals("Google", title);
		
		
	}
	@Test
	public void verifyPageTitle1()
	{
		driver.navigate().to("http:/yahoo.com");
		String title=driver.getTitle();
		Assert.assertEquals("Yahoo", title);
		
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}
}
