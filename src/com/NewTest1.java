package com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
@BeforeTest
public void login()
{
	System.out.println("login successful");
}
@AfterTest
public void logout()
{
	System.out.println("logout successful");
}
@Test
public void addVendor()
{
	System.out.println("addvendor successful");
}
@Test
public void addProduct()
{
	System.out.println("addproduct successful");
}
@Test
public void addCurrency()
{
	System.out.println("addcurrency successful");
}

}

