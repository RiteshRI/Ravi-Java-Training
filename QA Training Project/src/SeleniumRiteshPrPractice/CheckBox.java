// In this selenium code ,we will perform click on the checkbox and send the checkbox value.
// Steps to perform in case of checkbox
// 1. setup the property of chromedriver to perform "checkbox testing" through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
// 4. Locate the boat checkbox button using xpath and store the value in  reference created that is checkboxBoat.
// 5. Locate the bike checkbox button using xpath and store the value in  reference created that is checkboxBike. 
// 6. Locate the car checkbox button using xpath and store the value in  reference created that is checkboxCar. 
 // 7. Locate the horse checkbox button using xpath and store the value in  reference created that is checkboxHorse.
// 8. Locate the submit checkbox button using xpath and store the value in  reference created that is submitButton.
// 9. Perform click on boat button 
// 10. Perform click on bike button
// 11. Perform click on horse button 
// 12. Perform click on send button
// 13. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 14. Close the web browser

package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
	WebDriver OpenBrowser = new ChromeDriver();
	OpenBrowser.get("http://training.qaonlinetraining.com/testPage.php");
	WebElement checkboxboat = OpenBrowser.findElement(By.name("boat']"));
	WebElement checkboxBike = OpenBrowser.findElement(By.xpath("//input[@value='Bike']"));
	WebElement checkboxcar = OpenBrowser.findElement(By.xpath("//input[@value='car']"));
	WebElement checkboxhorse = OpenBrowser.findElement(By.xpath("//input[@value='horse']"));
	WebElement submitButton = OpenBrowser.findElement(By.xpath("//input[@value='Send']"));
	
	checkboxboat.click();
	checkboxBike.click();
	checkboxhorse.click();
	System.out.println("wait 3 second and subit and close");
	submitButton.click();
	Thread.sleep(3000);
	OpenBrowser.close();	
	
	
	}

}
