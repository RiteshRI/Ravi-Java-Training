// In this selenium code we will perform Mouse Over action.
// Steps to perform in case of Mouse Over . 
// 1. setup the property of chromedriver because we will perform testing of Mouse Over operation through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page https://www.amazon.com/
// 4. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 5. Locate the element using the xpath and store in the reference SiginInelement 
 // 6. In case of RightClick we use Actions class.Create object and pass the driver to the reference
// 7. Using the action object call the moveToElement method and pass  SigiInelement reference to this method and perform mouseOver
// 8. Select a element from the pop up box and perform click
// 9. Close the browser

package SeleniumRiteshPrPractice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		WebElement element = OpenBrowser.findElement(By.xpath("//span[cantains(text(),'Hello, Sign in')]"));
		
		Actions action = new Actions(OpenBrowser);		
		System.out.println("Mouse is over the - HELLO, SIGN IN - Option");
		
		action.moveToElement(element).build().perform();
		
		Thread.sleep(3000);
		OpenBrowser.findElement(By.xpath("//span[[contains(text(),'Create a list')]")).click();

	}

}
