//In this code we are trying to perform navigation. 
// Steps to perform
// 1. setup the property of chromedriver to perform "navigate" through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page https://www.facebook.com/
// 4. In the print line we are uing getTitle method .This will give the title of current page
// 5. In next line we are using getCurrentUrl method .This will give the current url of the webpage
// 6. Using the navigate method we move to next webite http://www.instagram.com/
// 7. In the print line we are using getTitle method .This will give the title of current page
// 8. In next line we are using getCurrentUrl method .This will give the current url of the webpage
// 9. Using navigate method we again move to next website http://www.twitter.com/
// 10. Now we use back method along with navigate method to get back to the last visited website that is "http://www.instagram.com/"
// 11. Now we use back method again to navigate back to the first website that is "https://www.facebook.com/"
// 12. Now we use forward method to to move forward direction that is to "http://www.instagram.com"
// 13. Close the browser

package SeleniumRiteshPrPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver.exe");
		WebDriver OpenBrowser = new ChromeDriver();
		OpenBrowser.get("https://www.facebook.com/");
		System.out.println("This is " + OpenBrowser . getTitle()+  " website ");
		System.out.println("url is: " + OpenBrowser.getCurrentUrl());
		
		OpenBrowser.navigate().to("http://www.instagram.com/");
		System.out.println("This is " + OpenBrowser . getTitle()+  " website ");
		System.out.println("url is: " + OpenBrowser.getCurrentUrl());
		
		OpenBrowser.navigate().to("http://www.twitter.com/");
		System.out.println("This is " + OpenBrowser . getTitle()+  " website ");
		System.out.println("url is: " + OpenBrowser.getCurrentUrl());
		
		OpenBrowser.navigate().back();
		System.out.println("This is " + OpenBrowser . getTitle()+  " website ");
		System.out.println("url is: " + OpenBrowser.getCurrentUrl());
		
		OpenBrowser.navigate().back();
		System.out.println("This is " + OpenBrowser . getTitle()+  " website ");
		System.out.println("url is: " + OpenBrowser.getCurrentUrl());
		
		OpenBrowser.navigate().forward();
		System.out.println("This is " + OpenBrowser . getTitle()+  " website ");
		System.out.println("url is: " + OpenBrowser.getCurrentUrl());
	}

}


//2. there is incomplete print for' This is  website 
//                                 url is: https://twitter.com/'

