import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Selenium Code:
		
		// Create Driver Object for Chrome
		// invoke .exe file
		System.setProperty("webdriver.chrome.driver", "/Users/JuanCMontoya/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		// Validate if your page title is correct
		System.out.println(driver.getTitle()); 
		
		// Validate if you landed on correct URL
		System.out.println(driver.getCurrentUrl());
		
		// Print page source
		System.out.println(driver.getPageSource());
		
		// Go to Yahoo!
		driver.get("https://www.yahoo.com");
		
		// Go back to Google's homepage
		driver.navigate().back();
		
		// Navigate forward
//			driver.navigate().forward();
		
		// Close the current browser
		driver.close();
		
		// Close all browsers selenium has opened
		driver.quit();
	}

}
