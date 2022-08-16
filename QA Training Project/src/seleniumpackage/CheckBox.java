package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// In this code we are trying to perform click on checkbox button in form
// Locate the checkbox buttons
// Perform click on buttons and submit
public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// Set the path of chromeDriver browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// Intialize value to the chromeDriver browser
	        WebDriver browserDriver = new ChromeDriver();
			
		// pass the link of website
		browserDriver.get("http://training.qaonlinetraining.com/testPage.php");
			
		// now we will save the locator of element in WebElement object 
		WebElement checkboxBoat = browserDriver.findElement(By.xpath("//input[@value='boat']"));
		//  checkbox bike
	      WebElement checkboxBike = browserDriver.findElement(By.xpath("//input[@value='Bike']"));
	       //    checkbox car
	      WebElement checkboxCar = browserDriver.findElement(By.xpath("//input[@value='car']")); // selected by-default
	      // checkbox horse
	      WebElement checkboxHorse = browserDriver.findElement(By.xpath("//input[@value='horse']"));
	      // submit button
	      WebElement submitButton = browserDriver.findElement(By.xpath("//input[@value='Send']"));
	      // selecting all options except car- selected by-default .The car element is clicked by default and value .So no need to perform click on the car element 
	      checkboxBoat.click();
	      checkboxBike.click();
	      checkboxHorse.click();
	      System.out.println("wait 3 seconds and submit and close");
	      submitButton.click();
		
	      //Thread is a class in java used to hold a part of code for some given time using sleep method.
	      Thread.sleep(3000);
	     // browserDriver.close();
		
	      }

	}


