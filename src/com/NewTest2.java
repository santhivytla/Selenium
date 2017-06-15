package com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
	/*@BeforeClass
	public void login()
	{
		System.out.println("login successful");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("logout successful");
	}*/
	@Test
	public void deleteVendor()
	{
		System.out.println("deletevendor successful");
	}
	@Test
	public void deleteProduct()
	{
		System.out.println("deleteproduct successful");
	}
	@Test
	public void deleteCurrency()
	{
		System.out.println("deletecurrency successful");
	}

	}




