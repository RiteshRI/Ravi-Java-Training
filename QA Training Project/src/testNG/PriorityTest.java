// In this testng code,we are trying to set the sequence of test execution using priority
// Steps to perform 
// 1. The @Test is used along with priority and based on priority the method will exceute. The piority is set as 1 .So this will exceute first.
// 2. setup the property of Webdriver to perform mutiple test case through chrome web browser.
// 3. Initialize WebDriver object through ChromeDriver class.
// 4. Open the web page http://www.amazon.com/ in first test case 
// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 6. close the browser

package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTest {
	WebDriver OpenBrowser;
  @Test( priority=3)
  public void openingAmazonSite() throws InterruptedException {

      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	   WebDriver OpenBrowser = new ChromeDriver();
      System.out.println("Open /close  amazon.com in chrome browser");	 
      OpenBrowser.get("http://www.amazon.com/");
	 
      Thread.sleep(2000);
      
      OpenBrowser.close();
  }
  @Test( priority=2)
  public void openingCNBCSite() throws InterruptedException {

      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	   WebDriver OpenBrowser = new ChromeDriver();
      System.out.println("Open /close  CNBC.com in chrome browser");	 
      OpenBrowser.get("http://www.CNBC.com/");
	 
      Thread.sleep(2000);
      
      OpenBrowser.close();
  }
  @Test( priority=1)
  public void openingYahooSite() throws InterruptedException {

      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	   WebDriver OpenBrowser = new ChromeDriver();
      System.out.println("Open /close  yahoo.com in chrome browser");	 
      OpenBrowser.get("http://www.yahoo.com/");
	 
      Thread.sleep(2000);
      
      OpenBrowser.close();
  }
  
}
// Please explain how import works why we need it
// what is the difference between Test Run and Default suite


