// In this code of selenium, perform implicit wait on webpage 
// Steps to perform 
// 1. setup the property of WebDriver to perform "implicit wait" through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Apply implict wait to webpage .The implicitlyWait method  holds the webdriver for a certain amount of time before throwing "No Such Element Exception"
// In this given time the wait will  locate the element. 
// 4. Intialize the value of title.
// 5. Open the web page https://www.google.com/
// 6. maximaize the browser window
// 7. Get the title of webpage 
// 8. Compare the actual element and expected element 
// 9. close the web browser

package SeleniumRiteshPrPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String eTitle = "Google";
		OpenBrowser.get("https://www.google.com/");
		OpenBrowser.manage().window().maximize() ;
		String aTitle = OpenBrowser.getTitle();
		
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		// 9. close the web browser
		
		Thread.sleep(6000);
		OpenBrowser.close();
	}

}

// 1. What we did in this class, Please expalin once again



