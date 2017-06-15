package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gmail {

	public WebDriver driver;
	@Test
	public void login()
	{
	driver=new FirefoxDriver();
	//driver.get("http://www.gmail.com");
	driver.get("http://www.gcrit.com/build3/admin");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	driver.findElement(By.id("tdb1")).click();
	Assert.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl());
	driver.close();
	}
	@Test
	public void addition() throws IOException
	
	{
		int sum=0;
	FileReader f=new FileReader("C:/Users/ashokvytla/Desktop/Add.txt");
	BufferedReader bu=new BufferedReader(f);
	String str=bu.readLine();
	if(str != null)
	{
		System.out.println(str);
		String[] str1=str.split(",");
		for(int i=0;i<str1.length;i++)
		{
			
			System.out.println(str1[i]);
			int s1=Integer.parseInt(str1[i]);
			int s2=sum+s1;
			/*int s1=Integer.parseInt(sum+str1[i]);
			int s2=Integer.parseInt(sum+str1[i+1]);
			int s3=s1+s2;*/
			System.out.println("sum" +s2);
			
			
			
			
		}
	
		
	}
	
	
	
	}

}
