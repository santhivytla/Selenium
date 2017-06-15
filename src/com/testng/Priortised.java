package com.testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Priortised {
	@Test(priority=1,enabled =true)
	public void testA()
	{
		Assert.assertEquals("Gmail", "Gmail");
	}
	@Test(dependsOnMethods={"testA"})
	public void testC()
	{
		Assert.assertEquals("Yahoo", "Yahoo");
	}
	@Test(priority=3)
	public void testB()
	{
		Assert.assertEquals("Facebook", "Facebook");
	}

}

