package com;

import org.testng.annotations.Test;

public class NewTest4 {
  @Test
  public void testCase1() {
	  long id=Thread.currentThread().getId();
	  System.out.println("testcase1 is successful-thread id is:" +id);
  }
  @Test
  public void testCase2() {
	  long id=Thread.currentThread().getId();
	  System.out.println("testcase2 is successful-thread id is:" +id);
  }
  @Test
  public void testCase3() {
	  long id=Thread.currentThread().getId();
	  System.out.println("testcase3 is successful-thread id is:" +id);
  }
}
