package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandeFrames {
	public static void main(String[] args) throws InterruptedException
	{
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame("classFrame");
		//driver.switchTo().frame(2);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();*/
		
		WebDriver driver=new FirefoxDriver();
		//now we r in top window
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		//switch to 3rd frame
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(4000);
		//switch from 3rd frame to top window
		driver.switchTo().defaultContent();
		//switch to 1st frame
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium.htmlunit")).click();
		
		
		
		
		
	}

}
