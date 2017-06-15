package com;

import org.openqa.jetty.servlet.Forward;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handler1 {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.navigate().to("http://yahoo.co.in");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);

		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String htmlpagesource=driver.getPageSource();
		//System.out.println(htmlpagesource);
		
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		
		driver.close();
		
		
	}

}
