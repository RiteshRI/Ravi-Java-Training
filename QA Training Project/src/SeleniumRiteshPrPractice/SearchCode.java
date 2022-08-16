// In this selenium script, search text in google search 
// Perform the steps
// 1. setup the property of WebDriver to perform google search through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page www.google.com
// 4. Locate the search bar element and send values using sendkeys
// 5. Locate the search button and perform click
// 6. close the browser

package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("https://www.google.com/");
		OpenBrowser.findElement(By.name("q")).sendKeys("Selenium python");
		OpenBrowser.findElement(By.name("btnk")).submit();
		

	}

}

//1. findElement(By.name("btnk")).submit(); could not locate on webpage.