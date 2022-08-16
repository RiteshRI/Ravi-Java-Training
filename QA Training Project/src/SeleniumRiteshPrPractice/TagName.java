
// In this script we are fetching all the links from webpage
// steps to perform
//1. setup the property of chromedriver to fetch the link on webpage through chrome web browser
//2. Initializing the Webdriver object through ChromeDriver class
//3. Open Website link https://www.itlearn360.com/.
//4. Intialize value to variable to keep count of number of links in webpage 
//5. List is applied on WebElement to collect all the <a> tag in alllinks reference
//6. Now pass the alllinks values to link reference and for loop is applied on link reference to fetch value one by one using getAttribute method.
//7. Calculate number of links and print in all.
//8. Closing the driver using close method

package SeleniumRiteshPrPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("https://www.itlearn360.com/");
		int count = 0;
		List<WebElement> allLinks = browserObject.findElements(By.tagName("a"));
		for (WebElement link : allLinks) {
			System.out.println(link.getAttribute("href"));
			count ++;
		}
	    
		System.out.println("total number of links present:" +count);
		
		browserObject.close();
		
		
			
		}

	}


