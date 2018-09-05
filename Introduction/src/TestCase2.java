import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Selenium Code:
		
		// Create Driver Object for Firefox
		// invoke .exe file
		System.setProperty("webdriver.gecko.driver", "/Users/JuanCMontoya/Desktop/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
//		driver.quit();
	}

}
