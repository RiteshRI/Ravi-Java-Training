// In this selenium code ,handle the alert in case the username and password section is left blank.
// Steps to handle blank alert. 
// 1. setup the property of chromedriver to perform blank alert through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open the form page https://mail.rediff.com/cgi-bin/login.cgi
// 4. Locate the signIn button without passing the value to username and password in input box and perform click.
// 5. Intialize Alert object using switchTo and alert method.
// 6. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 7 . The getText method will give the text in alert box.
// 8 . To move to next step accept the alert
// 9. Close the web browser

package SeleniumRiteshPrPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlankAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("http://training.qaonlinetraining.com/testPage.php");
		
		OpenBrowser.findElement(By.name("proceed")).click();
		Alert alert = OpenBrowser.switchTo().alert();
		
		Thread.sleep(3000);
		
		System.out.println(alert.getText());
		
		alert.accept();

	}

}
// what is the meaning of this Blank alert