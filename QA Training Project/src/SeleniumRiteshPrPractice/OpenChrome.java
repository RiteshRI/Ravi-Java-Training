package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//In this code we are trying open a google chrome website in chromedriver browser

public class OpenChrome {

	public static void main(String[] args) {
		    //1. set the path of driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			//2. create the object of the chromedriver browser
		ChromeDriver Driver = new ChromeDriver();
		   //3.  Pass the link of website in get method
		Driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		   //4. Locate name section using name locator and send values using sendkys
		Driver.findElement(By.name("name")).sendKeys("DemoName");
		//5. locate email section using name locator and send values using sendkeys
		Driver. findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
		//6. Locate website section using name locator and send values using sendkeys
		Driver. findElement(By.name("website")).sendKeys("Demowebsite");
		//7. Locate Comment section using name locator and send values using sendkeys
		Driver. findElement(By.name("comment")). sendKeys("Demo Comment");
		//8. Locate the submit button and perform click
		Driver.findElement(By.name("submit")).click();
		
		
		
	}

}


