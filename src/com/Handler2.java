package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handler2 {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
		//driver.findElement(By.id("login-signin")).click();
	String errormsg=driver.findElement(By.id("mbr-login-error")).getText();
		//String error=errormsg.getText();
		System.out.println(errormsg);
		
		//WebElement element=driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1"));//return rext area-
		//String s=element.getText();
		//driver.manage().window().maximize();
		//driver.findElement(By.id("next")).click();
		//WebElement errormsg=driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']"));
		//String error=errormsg.getText();
		
		//System.out.println(s);
		
		/*driver.get("http://www.google.co.in");
		WebElement google=driver.findElement(By.id("lst-ib"));
		String google1=driver.findElement(By.id("lst-ib")).getTagName();
		System.out.println(google1);
		System.out.println(google.getAttribute("type"));
		System.out.println(google.isDisplayed());
		System.out.println(google.isEnabled());*/
	
		
		

}
}