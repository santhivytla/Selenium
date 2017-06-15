package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlebutton {
	public static void main(String[] args)
	{
		//handle button
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.co.in");
		System.out.println(driver.findElement(By.id("next")).isEnabled());
		driver.findElement(By.id("next")).click();
		System.out.println(driver.findElement(By.id("next")).isDisplayed());
		System.out.println(driver.findElement(By.id("next")).isEnabled());
		System.out.println(driver.findElement(By.id("next")).getAttribute("type"));
		System.out.println(driver.findElement(By.id("next")).getAttribute("name"));
		System.out.println(driver.findElement(By.id("next")).getAttribute("value"));
		driver.navigate().to("http://www.google.com");
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElements(By.partialLinkText("Gma"));
		
		
		
	}

}
