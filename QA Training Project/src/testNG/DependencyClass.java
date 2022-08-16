// In this code we set the order of execution of test case using dependency 
// Perform the steps 
// 1. The @Test will generate report for the method 
// 2. setup the property of WebDriver to set the dependency of method through chrome web browser.
// 3. Initialize WebDriver object through ChromeDriver class.
// 4. Open the web page http://www.amazon.com/ in first test case 
// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 6. close the browser
// 7. In next method to set the dependency use dependOMethods and pass the method name depended to.
// 8. In next method to set the dependency use dependsOnMethods and pass the method name depend to.


package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClass {
  @Test
  public void openingAmazonSite() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		System.out.println("Open /close  amazon.com in chrome browser");
		OpenBrowser.get("http://www.amazon.com/");
		
		Thread.sleep(2000);
		
		OpenBrowser.close();
  }
  @Test(dependsOnMethods ="openingAmazonSite")
  public void openingCNBCSite() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		System.out.println("Open /close  CNBC.com in chrome browser");
		OpenBrowser.get("http://www.CNBC.com/");
		
		Thread.sleep(2000);
		
		OpenBrowser.close();
  }
  @Test(dependsOnMethods ="openingCNBCSite")
  public void openingYahooSite() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		System.out.println("Open /close  Yahoo.com in chrome browser");
		OpenBrowser.get("http://www.Yahoo.com/");
		
		Thread.sleep(2000);
		
		OpenBrowser.close();
  }
}

// Did not understand what is the meaning of dependency how it is different then last one. 
// I did not use 'WebDriver OpenBrowser;' even then everything was fine

