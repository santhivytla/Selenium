package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleDuplicateObjects {
public static void main(String[] args)
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://gcrit.com/build3/admin/");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	WebElement login=driver.findElement(By.id("tdb1"));
	login.click();
	driver.findElement(By.linkText("Online Catalog")).click();
	System.out.println(driver.getCurrentUrl()
			);
}
	
}
