//In this code we are trying to perform navigation on different icons in webpage. 
// Steps to perform
// 1. setup the property of WebDriver to perform navigate on icons through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page https://www.itlearn360.com/
// 4. Locate facebook icons using className locator and perform click
// 5. Navigate back on main page using navigate and back method 
// 6. Locate twitter icons using className locator and perform click
// 7. Navigate back on main page using navigate and back method
// 8. Locate instagram icons using className locator and perform click
// 9. Navigate back on main page using navigate and back method
// 10. Locate youtube icons using className locator and perform click
// 11. Navigate back on main page using navigate and back method
// 12. Locate linkedIn icons using className locator and perform click
// 13. Navigate back on main page using navigate and back method
// 14. Close the browser

package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMedia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("https://www.itlearn360.com/");
		OpenBrowser.findElement(By.className("fa-facebook")).click();
		OpenBrowser.navigate().back();
		OpenBrowser.findElement(By.className("fa-twitter")).click();
		OpenBrowser.navigate().back();
		OpenBrowser.findElement(By.className("fa-instagram")).click();
		OpenBrowser.navigate().back();
		OpenBrowser.findElement(By.className("fa-youtube")).click();
		OpenBrowser.navigate().back();
		OpenBrowser.findElement(By.className("fa-linkedin")).click();
		OpenBrowser.navigate().back();
		
		
		
		

	}

}
