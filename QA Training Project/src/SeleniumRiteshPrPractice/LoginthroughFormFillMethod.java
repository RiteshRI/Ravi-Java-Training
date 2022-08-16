package SeleniumRiteshPrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginthroughFormFillMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("https://admin-demo.nopcommerce.com/login");
		OpenBrowser.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		OpenBrowser.findElement(By.id("Password")).sendKeys("admin");
		OpenBrowser.findElement(By.className("button-1")).click();
		WebElement button = OpenBrowser.findElement(By.className("button-1"));
		button.submit();
		
		

	}

}
