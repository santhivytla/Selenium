package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SimpleTesstNG {
	public static void main(String[] args[])
	{
		
		
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.indeed.com");
	driver.findElement(By.id("what")).sendKeys("QA Testings");
	//driver.findElement(By.id("Passwd")).sendKeys("anitha");
	//driver.findElement(By.id("signIn")).click();
	
	
//driver.findElement(By.id("gm")).sendKeys("santhi");
}
}