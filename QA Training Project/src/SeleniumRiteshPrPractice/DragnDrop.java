

// In this selenium code we will perform drag and drop action.
// Steps to perform in case of drag and drop. 
// 1. setup the property of chromedriver to perform drag and drop operation through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page http://jqueryui.com/droppable/
// 4. In this case we switch the focus to frame 
// 5. Get the reference of source element using xpath.
// 6. Get the reference of target element using xpath.
// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 8. In case of dropdown we use Actions class.Create reference and pass the driver to the reference
// 9. Using the action reference call the dragAndDrop method and pass the source and target element
// 10. Close the browser
package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("http://jqueryui.com/droppable/");
		
		OpenBrowser.switchTo().frame(0);
		
		WebElement source = OpenBrowser.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = OpenBrowser.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(3000);
		
		Actions act = new Actions(OpenBrowser);
		
		act.dragAndDrop(source,target).build().perform();
		
		Thread.sleep(3000);
		
		OpenBrowser.close();
		

	}

}
