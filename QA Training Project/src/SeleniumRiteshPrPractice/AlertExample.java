
// In this selenium code ,we will perform different types of alert .
// Steps to perform different types of alert. 
// 1. setup the property of chromedriver because we will perform Alert testing through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
// 4. Locate the alert button and perform click 
// 5. Initialize Alert object using switchTo and alert method
// 6. getText method is used to get the text from alert box 
// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 8. Switch the browserdriver control to alert box and accept the alert uing accept method
// 9. Switch the browserdriver control to alert box and cancel the alert using dismiss method 
// 10. Switch the browserdriver control to alert box and send value to the alert box using sendkeys method
// 11. After the value is send accept the alert using accept method.
// 11. Close the web browser
package SeleniumRiteshPrPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("http://training.qaonlinetraining.com/testPage.php");
		
		OpenBrowser.findElement(By.id("alert")).click();
		Alert alert = OpenBrowser.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		//Example 2
		OpenBrowser.findElement(By.id("prompt")).click();
		Alert alert2 = OpenBrowser.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(3000);
		alert2.sendKeys("Mr.Bond");
		alert2.accept();
		
		OpenBrowser.close();
		
		
	}

}
