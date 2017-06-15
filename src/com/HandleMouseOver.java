package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class HandleMouseOver {
public static void main(String[] args)
{
	WebDriver driver=new FirefoxDriver();
	/*driver.get("http://www.carmax.com/");
	//create Action builder instance by passing driver instance
	Actions builder=new Actions(driver);
	WebElement element=driver.findElement(By.linkText("Sell Us Your Car"));
	builder.moveToElement(element).build().perform();//build() is used to switch the focus from main item to sub item
	driver.findElement(By.linkText("What to Bring With You")).click();*/
	
	driver.get("http://www.macys.com/?&cm_mmc=GOOGLE_Trademark-_-Trademark_Exact_Google_Macy%27s-_-83921708960_Exact-_-macys_mkwid_sY5u1SEjM|dc_83921708960|-|Y5u1SEjM&gclid=CI24o_LWrcwCFZSGfgodDt8GmQ");
	driver.findElement(By.id("globalSearchInputField")).sendKeys("calvin");
	
	//Actions builder=new Actions(driver);
	//WebElement element=driver.findElement(By.linkText("MEN"));
	//builder.moveToElement(element).build().perform();
	//driver.findElement(By.linkText("Sneakers")).click();
	
	
}
}
