// In this testng code, Using @BeforeTest and @AfterTest perform login
// 1. Use @BeforeTest to execute the part of method before the test method. 
// 2. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
// 3. Initialize Webdriver object through ChromeDriver class.
// 4. Use @Test to generate the test report
// 5. Open login page of https://admin-demo.nopcommerce.com/login
// 6. Get reference of Email input box by locate the id method.
// 7. Get reference of Password input box by locate the id method.
// 8. Get reference of login button by locate the classname method.
// 9. Clear the Email input box.
// 10. Provide/Enter the correct email to email input box through reference.
// 11. Clear the Password input box.
// 12. Provide/Enter the correct password to password input box through reference.
// 13. Submit the button.
// 14. @AfterTest is used to excute the test case after the test is exceuted
// 15. Close the web browser.

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	WebDriver OpenBrowser;
  @Test
  public void performloginf() throws InterruptedException {
	  System.out.println("performing login and wait for 2 seconds");
	  OpenBrowser.get("https://admin-demo.nopcommerce.com/login");
	  WebElement username = OpenBrowser.findElement(By.name("Email"));
	  WebElement password = OpenBrowser.findElement(By.name("Password"));
	  WebElement submitBtn = OpenBrowser.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	  username.clear();
	  username.sendKeys("admin@yourstore.com");
	  password.clear();
	  password.sendKeys("admin");
	  submitBtn.click();
	  System.out.println("End Result: Form Submitted");
	  Thread.sleep(2000);
  }
	  
 @BeforeTest
 public void beforeTest() {
      System.out.println("--@beforeTest, set the browser,maxmise the window");
	  System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	  OpenBrowser = new ChromeDriver();
	  OpenBrowser.manage().window().maximize();
	  
 }
	 
  @AfterTest
  public void afterTest() {
	  System.out.println("--@afterTest,closing the browser window");
	  OpenBrowser.close();
  		  
  }
}
// is this a different method to create object/class 'WebDriver OpenBrowser;'
// could not find (By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
//why 'OpenBrowser.get("https://admin-demo.nopcommerce.com/login");' not opened?
