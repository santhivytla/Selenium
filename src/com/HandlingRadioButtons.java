package com;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingRadioButtons {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php?");
		Select dropdown=new Select(driver.findElement(By.name("country")));
		//dropdown.selectByIndex(7);
		dropdown.selectByVisibleText("India");
		List<WebElement> e=dropdown.getOptions();
		System.out.println("list" +e);
		int count=e.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(e.get(i));
		}
		
		
	}

}
