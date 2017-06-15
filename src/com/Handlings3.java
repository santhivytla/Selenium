package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlings3 {
	public static void main(String[] args)
	{
		//handling window popup 
		WebDriver driver=new FirefoxDriver();
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		String emsg=alert.getText();//returns error msg
		System.out.println(emsg);
		alert.accept();//ok
		driver.findElement(By.id("login1")).sendKeys("seer");
		

}
}