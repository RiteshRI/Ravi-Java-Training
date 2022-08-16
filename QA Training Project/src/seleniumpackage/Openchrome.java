package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the path of driver 
		  System.setProperty("webdriver.chrome.driver", "C:\\Programfiles\\chromedriver.exe" );
		// Create the object of the chromedriver browser 
	        ChromeDriver driver = new ChromeDriver();
		// pass the link of website in get method 
	        driver.get("https://www.artfulhome.com/");
	}

}
