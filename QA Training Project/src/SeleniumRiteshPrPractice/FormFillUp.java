// In this selenium code ,pass value to input text field and send the values.
// Steps to perform in form 
//1. setup the property of chromedriver to pass value to form input box through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
// 4. Locate Name section using name locator and send values using sendkeys
// 5. Locate email section using name locator and send values using sendkeys
// 6. Locate website section using name locator and send values using sendkeys
// 7. Locate comment section using name locator and send values using sendkeys
// 8. Locate the submit button and perform click
// 9. Close the browser


package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFillUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("https://www.training.qaonlinetraining.com/testPage.php");
		
		OpenBrowser.findElement(By.name("name")).sendKeys("Ritesh Mathur");
		OpenBrowser.findElement(By.name("email")).sendKeys("ritesh.mathur@live.com");
		OpenBrowser.findElement(By.name("website")).sendKeys("www.Arravalis");
		OpenBrowser.findElement(By.name("comment")).sendKeys("Student");
		
		OpenBrowser.findElement(By.name("submit")).click();
		
		Thread.sleep(6000);
		
		OpenBrowser.close();		

	}
}

//import org.openqa.selenium.support.ui.Select; it is on Jay Excel but did not got on my sheet.
