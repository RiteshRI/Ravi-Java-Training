
// In this selenium code ,we will select value from dropdown and send selected value.
// Steps to perform in case of dropdown. 
// 1. setup the property of chromedriver to perform Dropdown testing through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
// 4. Select class is used in case of Dropdown. Select class object countrySelect specifies the webElement location. 
// 5. Using the object of Select class call the selectByVisibleText method and select text in dropdown
// 6. Locate the send button and perform click
// 7. Close the web browser

package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("http://training.qaonlinetraining.com/testPage.php");
		Select CountrySelect = new Select(OpenBrowser.findElement(By.name("country")));
		CountrySelect.selectByVisibleText("USA");
		CountrySelect.selectByVisibleText("France");
		
		Select skillSelect = new Select(OpenBrowser.findElement(By.name("skill")));
		skillSelect.selectByVisibleText("Programming");
		skillSelect.selectByVisibleText("Database");
		
		System.out.println("selctByVisibleText(\"Dtabase");
		
		OpenBrowser.findElement(By.name("submit")).click();
		System.out.println("Form Fill-up Succesfull");
		
		Thread.sleep(3000);
		OpenBrowser.close();
		
	}

}
