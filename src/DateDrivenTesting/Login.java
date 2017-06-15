package DateDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	 WebDriver driver;
	 
	@Test(dataProvider="datalist")
	public void loginForm(String username,String password)
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php/");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
		
		
	}
	  @AfterMethod
	  public void close()
	  {
		  driver.quit();
	  }
	@DataProvider(name="datalist")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="admin";
		
		data[1][0]="admin";
		data[1][1]="demo123";
		
		data[2][0]="admin";
		data[2][1]="admin123";
		
		return data;
		
	}

}
