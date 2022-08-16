// In this testng code, perform TimeOut 
// Steps to perform 
// 1. Create a method waitFor2Seconds.
// 2. Add @Test and TimeOut to method .This means timeout is applied to this method and this method should exceute in given time.
// 3. Thread is applied and the time passed is gerater than the timeOut time.
// In this case the test will failed as the time taking is greater that the timeout time.
// 4. Create another method and pass the @Test and timeOut and because here no thread is applied so the test will pass as we get output in timeOut period.

package testNG;

import org.testng.annotations.Test;

public class TimeOutClass {
  @Test (timeOut = 5000)
  public void waitfor5seconds() throws InterruptedException {
	  System.out.println("waiting for 5 seconds, will be printed out, but fail this result eventually");
	  
	  Thread.sleep(5000);
	  
  }
  
  @Test(timeOut = 2000)
  public void simplePrint() {
	  System.out.println("Printing is successful");
  
  }
}

// how it is fail?("waiting for 5 seconds, will be printed out, but fail this result eventually")
