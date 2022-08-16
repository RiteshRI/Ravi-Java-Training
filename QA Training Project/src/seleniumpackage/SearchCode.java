package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set the path of driver 
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			ChromeDriver browserDriver = new ChromeDriver();
			browserDriver.get("https://www.google.com/");			
			// pass the value to search in search button
			browserDriver.findElement(By.name("q")).sendKeys("Selenium python");
			browserDriver.findElement(By.name("btnK")).submit();
	}

}
