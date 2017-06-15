package com;

import org.testng.annotations.Test;

public class NewTest6 {
	@Test
	  public void testCase6() {
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase6 is successful-thread id is:" +id);
	  }
	  @Test
	  public void testCase7() {
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase7 is successful-thread id is:" +id);
	  }
	  @Test
	  public void testCase8() {
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase8 is successful-thread id is:" +id);
	  }

}
