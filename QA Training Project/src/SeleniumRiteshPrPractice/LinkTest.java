//In this Selenium code,we are trying to check the text is link or not.
// Steps to perform 
// 1. setup the property of WebDriver to perform "linktext" through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page https://www.google.com/
// 4. The value of text link is stored in bloglink reference . Here TextLink is a locator that checks wether a text is link or not. 
// 5. If the text is form of link then its displayed or else will not display
// 6. Close the browser

package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("https://www.google.com/");
		
		WebElement blogLink = OpenBrowser.findElement(By.linkText("Gmail"));
		
		if (blogLink.isDisplayed()) {
			System.out.println("Gmail link displayed usingLinkText");}
		else {
			System.out.println("Unable to Find Gmail");
		}

	}

}

// Did not understand if just open Google.com?
