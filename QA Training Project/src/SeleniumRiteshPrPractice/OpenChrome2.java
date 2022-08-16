package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome2 {

	public static void main(String[] args) {
	    //1. set path for the ChromeDriver	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver.exe");
		// 2. Create the Object of ChromeDriver Browser
		ChromeDriver driver = new ChromeDriver();
		//3.  Pass the link of the website to get a method
		driver.get("www.training.qaonlinetraining.com/testPage.php");
		//4. Finding element and sending text
		
		
		

	}

}
