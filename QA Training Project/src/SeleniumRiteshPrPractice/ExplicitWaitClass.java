// In this selenium code, explicit wait is applied to a element.
// Steps to perform 
// 1. setup the property of WebDriver to perform "Explicit Wait" through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. In Explicit Wait we will use WebDriverWait class .This class object is created and the the browserObject and time is intialized to the object
// Explicit Wait is applied to element in the webpage.
// 4.  Open the web page https://www.google.com/
// 5. Locate the gmail element and apply the wait and until method to the element.
// 6. close the browser

package SeleniumRiteshPrPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(OpenBrowser, 10);
		OpenBrowser.get("https://www.google.com/");

		 WebElement gmailLink;
		 gmailLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmail')]")));
	      gmailLink.click();
	      
	      OpenBrowser.quit();
	      
	}

}

//1. there is error, solved , Jay File there is no import for 'WebDriver'
//2. quit and close are the same?
//3. How you get values 'xpath'in this case
