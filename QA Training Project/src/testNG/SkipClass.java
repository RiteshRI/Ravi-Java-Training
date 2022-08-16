// In this testng script, we will perform differnt test scenario 
// Steps to perform
//1. In first test case we will pass the test case 
// 2. In second case we skip the test case using SkipException
// 3. In third  case we fail the test case passing the unequal value.
// 4. In fourth case the test is skipped but  not mentioned in test report

package testNG;

import static org.testng.Assert.assertEquals;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipClass {
  @Test
  public void test1() {
	  System.out.println("I am test 1 I will pass");
  }
  @Test
  public void test2() {
	  System.out.println("I am test 2 I will skip");
	  throw new SkipException("I am skipping");
	    }
  @Test
  public void test3() {
	  System.out.println("I am test 3 I will fail");
	  	  assertEquals(true, false);
  }
  @Test(enabled = false)
  public void bar() {
      System.out.println("This will be skipped");
  }
}
// with out last one'@Test(enabled = false)' the results were same

