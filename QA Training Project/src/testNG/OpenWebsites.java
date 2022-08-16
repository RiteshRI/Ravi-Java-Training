// In this TestNg code, we are trying to execute mutiple test case and get the test report.
// Perform the steps
// 1. The @Test will generate the test report of each method used
// 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
// 3. Initialize WebDriver object through ChromeDriver class.
// 4. Open the web page http://www.amazon.com/ in first test case 
// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 6. close the browse

package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenWebsites {
	
   @Test
  public void openingAmazonSite() throws InterruptedException {
	   
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		System.out.println("Open /close  amazon.com in chrome browser");
		OpenBrowser.get("http://www.amazon.com/");
		
		Thread.sleep(2000);
		
		OpenBrowser.close();
		
  }
   
   @Test
   public void openingCnbcSite() throws InterruptedException {
	 
       System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	   WebDriver OpenBrowser = new ChromeDriver();
       System.out.println("Open /close  cnn.com in chrome browser");	 
       OpenBrowser.get("https://www.cnbc.com/");
	 
       Thread.sleep(2000);
       
       OpenBrowser.close();
   }
   
   @Test
   public void openingYahooSite() throws InterruptedException {
	 
       System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	   WebDriver OpenBrowser = new ChromeDriver();
       System.out.println("Open /close  cnn.com in chrome browser");	 
       OpenBrowser.get("http://www.yahoo.com/");
	 
       Thread.sleep(2000);
       
       OpenBrowser.close();
       
   }
       
   @Test
   public void openingArtfulHome() throws InterruptedException {
	  
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
	   WebDriver OpenBrowser = new ChromeDriver();
	   System.out.println("Open /Close ArtfulHome.com in Chrome Driver");
	   OpenBrowser.get("http://www.artfulhome.com");
	   
	   Thread.sleep(6000);
	   
	   OpenBrowser.close();
	   
	   
	   
	   
   }
}
