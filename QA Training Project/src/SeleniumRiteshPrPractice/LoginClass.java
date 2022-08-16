// By the selenium script, we will test the login process of e-commerce site. we will provide email and password to login
// here are the steps to perform the login process
//1. set up the property of chromedriver because we will perform testing of login process through web Chrome browser.
//2. Initialize webdriver object through chromedriver class
//3. Open login page of https://admin-demo.nopcommerce.com/login
//4. Get reference of email input box by locate the ID method
//5. Clear the email input box
//6. Get reference of password input box by locate the Id method
//7. Clear the password input box.
//8. Provide/Enter the correct email to eamil input box through refernce
//9. Provide/Enter the correct password to password input box through reference
//10. Get reference of login button by locate the classname method.
//11. Submit the button
//12. Close the web browser

package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver browserDriver = new ChromeDriver();
		browserDriver.get("https://admin-demo.nopcommerce.com/login");
		WebElement email=browserDriver.findElement(By.id("Email"));
		email.clear();
		WebElement password=browserDriver.findElement(By.id("Password"));
		password.clear();
		email.sendKeys("admin@yourstore.com");
		password.sendKeys("admin");
		WebElement button=browserDriver.findElement(By.className("button-1"));
		button.submit();
		browserDriver.close();		

	}

}

