package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignIn {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login-username")).sendKeys("santhivytla@yahoo.com");
		
	driver.findElement(By.xpath("html/body/div[1]/main/div/div[1]/div[1]/div[1]/div[2]/fieldset/form/div[3]/button")).click();
	driver.findElement(By.xpath("html/body/div[1]/main/div/div[1]/div[1]/div[1]/div[2]/fieldset/form/div[1]/div[4]/input")).sendKeys("poimnb@2016");

driver.findElement(By.xpath("html/body/div[1]/main/div/div[1]/div[1]/div[1]/div[2]/fieldset/form/div[3]/button")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[2]/div/input[1]")).click();
		//System.out.println(driver.findElement(By.name("Email")).getAttribute("value"));
		
	}

}
