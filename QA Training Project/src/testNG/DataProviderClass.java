// In this testng code, we are trying to pass mutiple login data using DataProviders 
// Steps to perform 
// 1. Create a dataProvider method. In dataProvider method the return time of the method is array and values are returned in form of array.
 // 2.Return values of email,password and message mutiple times using array.So everytime you are calling the dp method it will return all value one
// by one .That means this code will rum 3 times
// 3. Add @DataProvider to the method 
// 4. Now in method checking the @Test is passed along with the dataProvider keyword and the dataprovider method name dp
// 5. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
// 6. Get reference of Email input box by locate the id method.
// 7. Get reference of Password input box by locate the id method.
// 8. Get reference of login button by locate the classname method.
// 9. Clear the Email input box.
// 10. Provide/Enter the correct email to email input box through reference.
// 11. Clear the Password input box.
// 12. Provide/Enter the correct password to password input box through reference.
// 13. Click Submit the button.

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

  @Test(dataProvider = "dp")
  public void checking(String userName,String passWord, String msg) throws InterruptedException {
	  System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	  WebDriver OpenBrowser = new ChromeDriver();
	  OpenBrowser.get("https://admin-demo.nopcommerce.com/login");
	  WebElement username = OpenBrowser.findElement(By.name("Email"));
	  WebElement password = OpenBrowser.findElement(By.name("Password"));
	  WebElement submitBtn = OpenBrowser.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	  username.clear();
	  username.sendKeys(userName);
	  password.clear();
	  password.sendKeys(passWord);
	  submitBtn.click();
	  Thread.sleep(4000);
	  
  }
	  
   @DataProvider
   public Object[][] dp() {
	   return new Object[][] {
			  	   new Object[] {"admin","admin132", "Wrong Credentials"},
			  	   new Object[] {"admin","adminhhj", "Wrong Credentials"},
			   	   new Object[] {"admin@yourstore.com","admin", "Test Passed"},
   	  
  };
}
}
// there is no opening of any website or browser, last test supposed to pass but there is 0 pass result.
