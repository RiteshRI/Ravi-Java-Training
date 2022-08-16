
// In this selenium code ,we will perform click on radiobutton and send the radio value.
// Steps to perform in case of radio button
// 1. setup the property of chromedriver because we will perform "radio button" testing through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
 // 4. Locate the female radio button using xpath and store the value in  reference created that is radioButtonFemale.
// 5. Locate the male radio button using xpath and store the value in  reference created that is radioButtonMale
// 6. Locate the other radio button using xpath and store the value in reference created that is radioButtonOther
// 7. Locate the send radio button using xpath and store the value in reference created that is submitButton
// 8. Perform click on female button 
// 9. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 10. Perform click on male button 
//11. Perform click on send button
//Note - In case of radio button the last clicked button value will pass.

 package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

 public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("http://training.qaonlinetraining.com/testPage.php");
		WebElement radioButtonFemale = OpenBrowser.findElement(By.xpath("//input[@value='female']"));
		WebElement radioButtonMale = OpenBrowser.findElement(By.xpath("//input[@value='male']"));
		WebElement radioButtonOther = OpenBrowser.findElement(By.xpath("//input[@value='Other']"));
		WebElement submitButton = OpenBrowser.findElement(By.xpath("//input[@value='Send']"));
		
		radioButtonFemale.click();
	    Thread.sleep (3000);
		radioButtonMale.click();
		Thread.sleep(3000);
		radioButtonOther.click();
		submitButton.click();
		

	}

}
