package SeleniumRiteshPrPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseAmazon {

	public static void main(String[] args) {
		 // set the path of driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// Create the reference of the chromedriver browser
		ChromeDriver browserDriver = new ChromeDriver();
		//get the method that helps to load the web page on browser that we pass in a given parameter
		browserDriver.get ("http://www.amazon.com/");
		// close method is used to close chromedriver browser
		browserDriver.close();
	}

}
