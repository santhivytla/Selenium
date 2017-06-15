package com;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest3 {
	@BeforeGroups(groups={"sanity","regression"})
	  public void login() {
		  System.out.println("login successful");
	  }
  @Test(groups={"sanity"},priority=3)
  public void fundTransfer() {
	  System.out.println("fund transfer successful");
  }
  @Test(groups={"sanity"},priority=2)
  public void search() {
	  System.out.println("search successful");
  }
  @Test(groups={"regression"},priority=2)
  public void advancedSearch() {
	  System.out.println("advanced search successful");
  }
  @Test(groups={"regression"},priority=3)
  public void prePaidRecharge() {
	  System.out.println("prepaid recharge successful");
  }
  @Test(groups={"regression"},priority=4)
  public void billPayments() {
	  System.out.println("bill payments successful");
  }
  @AfterGroups(groups={"sanity","regression"})
  public void logOut() {
	  System.out.println("logOut successful");
  }
}
